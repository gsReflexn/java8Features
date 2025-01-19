package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;


//Traditional way
/*public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "Hello this is Demo";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierDemo();
        System.out.println(supplier.get());
    }
}*/

//Lambda expression

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "This is supplier demo";

        //System.out.println(supplier.get());

        List<String> list = Arrays.asList("a","b","c");
        List<String> list1 = Arrays.asList();

        System.out.println(list.stream().findAny().orElseGet(supplier));
        System.out.println(list1.stream().findAny().orElseGet(supplier));

    }
}
