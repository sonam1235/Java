package array;
import java.util.*;
public class Array {


    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=20;
        arr[1]=10;
        arr[2]=40;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int val: arr)
        {
            System.out.print(val+" ");
        }
        String[] str = new String[5];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<str.length;i++)
        {
            str[i] = in.next();

        }
        for(String s: str)
        {
            System.out.print(s+" ");
        }

    }

}
