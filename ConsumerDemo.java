package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


    public static void main(String[] args) {
      Consumer<Integer> cobj  = (it) ->
            System.out.println("Value is "+ it);


      //cobj.accept(10);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(cobj);

    }
}
