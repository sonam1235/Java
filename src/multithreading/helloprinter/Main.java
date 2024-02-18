package multithreading.helloprinter;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the main thread "+Thread.currentThread().getName());
        HelloPrinter hp = new HelloPrinter();
        Thread t = new Thread(hp);
        t.start();
        System.out.println("Hello ji1");
        System.out.println("Hello ji2");
        System.out.println("Hello ji3");
        System.out.println("Hello ji4");
        for(int i=0; i<10; i++)
        {
            System.out.println("Hello ji1");
            System.out.println("Hello ji2");
            System.out.println("Hello ji3");
            System.out.println("Hello ji4");
        }

    }
}
