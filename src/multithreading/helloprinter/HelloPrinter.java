package multithreading.helloprinter;

public class HelloPrinter implements Runnable {

    void doSomething() {
        System.out.println("This is the task run in thread ");


    }
    @Override
    public void run() {
        System.out.println("Hello This will run in Thread "+Thread.currentThread().getName());
    }


}

