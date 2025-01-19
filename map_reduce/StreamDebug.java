package map_reduce;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDebug {
    public static void main(String[] args) {
        List<String> namesList = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getSalary() > 50000)
                .map(Employee::getName)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        for(String s: namesList){
            System.out.println(s);
        }
    }
}
