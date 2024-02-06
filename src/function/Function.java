package function;
import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
       sum();
       sum(2, 3);
       sum(2, 3, 4);
    }
    static void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = in.nextInt();
        System.out.print("Enter the value of b: ");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("The sun is "+ sum);
    }
    static void sum(int a, int b)
    {
        int sum = a+b;
        System.out.println("The sum is "+sum);
    }
    //variable length argument
    static void sum(int ...a)
    {
        System.out.println("This is taking variable length argument");
    }
}
