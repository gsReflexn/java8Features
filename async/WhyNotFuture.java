package async;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class WhyNotFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future1 = service.submit(()-> {
            //if you are doing some api call here then your main task will not be completed.
            //until api call is finished and you do not have any other way to manually complete this call.
            System.out.println("Thread: " + Thread.currentThread().getName());
            return Arrays.asList(1,2,3,4);
        });

//        Future<List<Integer>> future2 = service.submit(()-> {
//            //if you are doing some api call here then your main task will not be completed.
//            //until api call is finished and you do not have any other way to manually complete this call.
//            System.out.println("Thread: " + Thread.currentThread().getName());
//            return Arrays.asList(1,2,3,4);
//        });
//
//        Future<List<Integer>> future3 = service.submit(()-> {
//            //if you are doing some api call here then your main task will not be completed.
//            //until api call is finished and you do not have any other way to manually complete this call.
//            System.out.println("Thread: " + Thread.currentThread().getName());
//            return Arrays.asList(1,2,3,4);
//        });

        List<Integer> list = future1.get();

        /**
         * You cannot join above three future threads simultaneously
         * like you cannot join future1, future2,future3
         */
        System.out.println(list);


        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.get(); //if you apply get here and the thread is taking longer to result then you can use complete
                                // and return some dummy data.

        completableFuture.complete("return some dummy value");
    }
}
