package numberprinter;

public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++)
        {
            NumberPrinter n = new NumberPrinter(i);
            Thread t = new Thread(n);
            t.start();
        }
    }
}
