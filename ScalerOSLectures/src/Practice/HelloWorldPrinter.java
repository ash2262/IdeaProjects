package Practice;

public class HelloWorldPrinter implements Runnable {

    public static void doSometing(){
        System.out.println("Doing something, thread name:"+Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Run by thread name: "+Thread.currentThread().getName());
        doSometing();
    }
}
