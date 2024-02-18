package numberprinter;

public class NumberPrinter implements Runnable {

    private int num;
    NumberPrinter(int n)
    {
        this.num=n;
    }
    public void run()
    {
        System.out.println(num+" "+Thread.currentThread().getName());
    }
}
