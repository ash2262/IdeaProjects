package Asgn2;

public class HelloWorldPrinter implements  Runnable{
    static  void  doSomething(){
        System.out.println("Doing something, printed by: "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello world, printed by: "+Thread.currentThread().getName() );
        doSomething();
    }
}
