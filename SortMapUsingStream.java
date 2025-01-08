package java8;

import java.util.*;

public class SortMapUsingStream {

    public static void main(String[] args) {
        Map<String,Integer> mpp = new HashMap<>();
        mpp.put("Gurmeet" , 5);
        mpp.put("Guri", 2);
        mpp.put("Ashish", 4);
        mpp.put("Surbhi", 1);

        /**
         * sort only accepts list. So we will have to get the list from map.
         * we can get it in following way and then pass it to the sort
         *
         */

        //List<Map.Entry<String,Integer>> entryList = new ArrayList<>(mpp.entrySet());

        /**
         * below method is sorting the map in traditional way.
         */

//        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        });

        /**
         * Since comparator is a functional interface and compare is it's method.
         * we can definitely use lambda expression
         * below method is sorting the map using lambda expression
         */

//        Collections.sort(entryList,(o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//
//        System.out.println("Printing after sorting using traditional way ");
//        for(Map.Entry entry: entryList){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

        /**
         * now we will sort the map using stream api
         *
         */

//        System.out.println("Sorting wrt to key");
//
//        mpp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//
//        System.out.println("Sorting wrt to value");
//
//        mpp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        /**
         * For sorting the map in reverse order of key and value
         */

//        System.out.println("Sorting wrt to key");
//
//        mpp.entrySet().stream().sorted((Comparator<? super Map.Entry<String, Integer>>) Map.Entry.comparingByKey().reversed()).forEach(System.out::println);
//
//        System.out.println("Sorting wrt to value");
//
//        mpp.entrySet().stream().sorted((Comparator<? super Map.Entry<String, Integer>>) Map.Entry.comparingByValue().reversed()).forEach(System.out::println);


        /**
         * using custom class in the map as key. We will store Employee class as
         * key of the TreeMap and will perform above operations
         */

        Map<Employee,Integer> empMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary()-o1.getSalary();
            }
        });
        empMap.put(new Employee(170,"Gurmeet", 9000),170);
        empMap.put(new Employee(190,"Guri",9500),150);
        empMap.put(new Employee(150,"Surbhi",7000),190);
        empMap.put(new Employee(180,"Ashish",7500),200);
        empMap.put(new Employee(160,"Subham",8000),176);



        /**
         * Sorting the treemap having Employee class as key using stream api
         */
        empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
        /**
         * sorting the treemap having Employee class as key in reverse order using stream api
         */
        empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);

        /**
         * in treemap we cannot sort here with value cause it's primitive integer.
         */
        //empMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);

    }

}
