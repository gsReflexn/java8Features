package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Gurmeet");
        names.add("Ashish");
        names.add("Amit");
        names.add("Saurabh");
        System.out.println("For each in List");
        names.stream().forEach(t-> System.out.println(t));
        System.out.println("Filter in map");
        names.stream().filter(t->t.startsWith("A")).forEach(obj-> System.out.println(obj));


        Map<Integer, String> mpp = new HashMap<>();
        mpp.put(1,"MI");
        mpp.put(2,"RCB");
        mpp.put(3,"PCB");
        mpp.put(4,"DC");

        System.out.println("For each in map");
        mpp.entrySet().stream().forEach(obj-> System.out.println(obj));
        System.out.println("Filter condition in map");
        mpp.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));

    }




}
