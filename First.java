import java.util.Scanner;

class firstclass
{
    int var1;
    String var2;
}


public class First
{
    public static void main(String[] args) {
        firstclass arr[] ;
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        arr= new firstclass[n];
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = new firstclass();
            arr[i].var1=33;
            arr[i].var2="ddbsdj";
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].var1+" "+arr[i].var2);
        }
        // firstclass ob1= new firstclass();
        // ob1.var1=44;
        // ob1.var2="surya";
        // System.out.println(ob1.var1+" "+ob1.var2);
    }
}