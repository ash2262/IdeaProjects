package Practice;

import java.util.Random;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Thread name: "+Thread.currentThread().getName());
        //HelloWorldPrinter hwp=new HelloWorldPrinter();
        ExecutorService executor= Executors.newFixedThreadPool(10);
        //for (int i = 0; i < 100; i++) {
        //    NumberPrinter print=new NumberPrinter(i);
            //Thread thread=new Thread(print);
            //thread.start();
         //   executor.execute(print);
       // }
        Random r=new Random();
        Greetings greetings=new Greetings(r);
        for (int i = 0; i < 100; i++) {
            Future<String> greetingFuture=executor.submit(greetings);
            System.out.println(greetingFuture.get());
        }
        executor.shutdown();
        //hwp.run();
    }
}
