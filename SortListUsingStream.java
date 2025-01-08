package java8;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class  empComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()-o2.getSalary(); //ascending
    }
}
public class SortListUsingStream {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDatabase.getEmployees();

        //Collections.sort(employeeList,new empComparator());
        /**
         * we don't need to create our own custom comparator
         * since comparator is functional interface and compare is a generic method inside it
         * we can write or use compare method as lambda function and pass it as comparator.
         */

        //Collections.sort(employeeList, (o1,o2) -> o1.getSalary()-o2.getSalary());

        /**
         * now we will do sorting based on stream api
         */

        //System.out.println("Sorting using stream api");
        employeeList.stream().sorted((o1,o2) -> o1.getSalary()-o2.getSalary()).forEach(obj-> System.out.println(obj.getName()+" "+obj.getSalary()));
        /**
         * we can use one custom comparator called comparing like below to sort
         */
        employeeList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(obj-> System.out.println(obj.getName()+" "+obj.getSalary()));
        /**
         * passing method reference in comparing
         *
         */
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(obj-> System.out.println(obj.getName()+" "+obj.getSalary()));
        System.out.println("After Sorting");
        for(Employee emp: employeeList){
            System.out.println(emp.getName()+" "+emp.getSalary());
        }
    }
}
