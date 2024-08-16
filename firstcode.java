class firstclass
{
    int var1;
    String var2;
}

class first
{
    public static void main(String[] args) {
        int [] arr = new int[5];
        for (int i=0;i<arr.length;i++)
        {
        System.out.println("hello"+" "+"this is first java code");
        }
        firstclass ob1= new firstclass();
        ob1.var1=44;
        ob1.var2="surya";
        System.out.println(ob1.var1+" "+ob1.var2);
    }
}