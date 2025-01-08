package java8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100,"Ramesh", 5000));
        employeeList.add(new Employee(101,"Suresh",8000));
        employeeList.add(new Employee(103,"Munna",10000));
        employeeList.add(new Employee(104,"abhi",4000));
        employeeList.add(new Employee(105,"Anand",3000));
        return employeeList;
    }


}
