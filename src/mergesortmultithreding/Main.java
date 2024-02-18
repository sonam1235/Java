package mergesortmultithreding;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
public class Main {
    public static void main(String[] args) throws Exception{
        List<Integer> arrayToSort = List.of(
                8, 2, 4, 1, 9, 6, 0, 7
        );
        ExecutorService es = Executors.newFixedThreadPool(5);
        Sorter sorter = new Sorter(arrayToSort, es);
        List<Integer> arrayf = sorter.call();
        for(Integer i: arrayf)
        {
            System.out.println(i + " ");
        }

    }
}
