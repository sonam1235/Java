
package numberprinter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String[] args) {
        ExecutorService executerService = Executors.newFixedThreadPool(10);
        for(int i=1; i<=100; i++)
        {
            NumberPrinter n = new NumberPrinter(i);
            //Thread t = new Thread(n);
           // t.start();
            executerService.execute(n);
        }
    }
}
