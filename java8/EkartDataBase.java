package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<java8.Customer> getAll() {
        return Stream.of(
                new java8.Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new java8.Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new java8.Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new java8.Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
}
