import java.util.Scanner;

public class test_scannerclass {
    public static void main(String a[])
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter your input");
        int a1= scr.nextInt();
        String s= scr.nextLine();
        System.out.println(a1+" "+s);
    }
}
