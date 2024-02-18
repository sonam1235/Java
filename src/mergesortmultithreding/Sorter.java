package mergesortmultithreding;

import java.util.concurrent.Callable;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService es;
    public Sorter(List<Integer> arrayToSort, ExecutorService es)
    {
        this.arrayToSort = arrayToSort;
        this.es = es;
    }
    @Override
    public List<Integer> call() throws Exception{
        if(arrayToSort.size()<=1) return arrayToSort;
        if (arrayToSort.size() <= 2000) {
            // non multithread
        }
        int mid = arrayToSort.size()/2;
        List<Integer> leftArrayToSort = new ArrayList<>();
        List<Integer> rightArrayToSort = new ArrayList<>();
        for(int i=0; i<mid; i++)
        {
            leftArrayToSort.add(arrayToSort.get(i));
        }
        for(int i=mid; i<arrayToSort.size();i++)
        {
            rightArrayToSort.add(arrayToSort.get(i));
        }
        Sorter leftArraySorter = new Sorter(leftArrayToSort, es);
        Future<List<Integer>> sortedLeftArray = es.submit(leftArraySorter);
        Sorter rightArraySorter = new Sorter(rightArrayToSort, es);
        Future<List<Integer>> sortedRightArray = es.submit(rightArraySorter);
        List<Integer> finalLeft = sortedLeftArray.get();
        List<Integer> finalRight = sortedRightArray.get();
        List<Integer> sortedArray = new ArrayList<>();
        int i=0, j=0;
        while(i<finalLeft.size() && j<finalRight.size())
        {
            if(finalLeft.get(i)<=finalRight.get(j))
            {
                sortedArray.add(finalLeft.get(i));
                i++;
            }
            else {
                sortedArray.add(finalRight.get(j));
                j++;
            }
        }
        while(i<finalLeft.size())
        {
            sortedArray.add(finalLeft.get(i));
            i++;
        }
        while(j<finalRight.size())
        {
            sortedArray.add(finalRight.get(j));
            j++;
        }
        return sortedArray;
    }

}
