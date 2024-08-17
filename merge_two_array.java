public class merge_two_array {
    public static void main(String a[])
    {
    int[]arr1=new int[]{ 1, 3, 4, 5};
    int[]arr2=new int[]{2, 4, 6, 8};
    int[]arr3=new int[(arr1.length+arr2.length)];
    for(int i=0; i<arr3.length; i++)
    {
        if(i<arr1.length)
        {
            arr3[i]=arr1[i];
        }
        else
        {
            arr3[i]=arr2[i-arr1.length];
        }
    }
    for(int i=0; i<arr3.length; i++)
    {
        System.out.println(arr3[i]);
    }
}
}
