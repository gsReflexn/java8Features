package com.javatechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class QA {
    public static void main(String[] args) {

        Map<String,Integer> mpp = new HashMap<>();
        mpp.put("Anil",1000);
        mpp.put("Bhavna",1300);
        mpp.put("Micheal", 1500);
        mpp.put("Tom",1600);
        mpp.put("Ankit",1200);
        mpp.put("Daniel",1700);
        mpp.put("James", 1400);

        int num = 3;
        System.out.println(getNthHighSalary(mpp,num));
    }
    private static int getNthHighSalary(Map<String,Integer> mpp, int num){
        return mpp.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num-1).getValue();
    }

    //but above approach will fail if one or more employees have same salary

    
}
