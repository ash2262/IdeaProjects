package Asgn2;

public class Client {
    public static void main(String[] args) {
        System.out.println("hello world, printed by :"+Thread.currentThread().getName());
    HelloWorldPrinter hwp=new HelloWorldPrinter();
    Thread t=new Thread(hwp);
    t.start();
    }
}
