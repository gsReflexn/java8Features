package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


//Traditional way
/*public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if(integer%2==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Predicate predicate = new PredicateDemo();
        System.out.println(predicate.test(7));
    }
}*/

public class PredicateDemo {
    public static void main(String[] args) {
        Consumer<Integer> cobj  = (it) ->
                System.out.println("Even Value is "+ it);
        Predicate<Integer> predicate = (t)->{
            if(t%2==0) return true;
            else return  false;
        };
        //System.out.println(predicate.test(4));
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //list.stream().filter(predicate).forEach((t)-> System.out.println("Even value is "+ t));

        list.stream().filter(predicate).forEach(cobj);

    }
}

//Lambda expression


