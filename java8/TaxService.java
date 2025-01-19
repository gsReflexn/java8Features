package java8;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> getTaxxedUsers() {
        return EmployeeDatabase.getEmployees().stream().filter(obj -> obj.getSalary() > 5000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> taxxedUserList = getTaxxedUsers();
        for(Employee emp: taxxedUserList){
            System.out.println(emp.getName()+" "+emp.getSalary());
        }
    }
}
