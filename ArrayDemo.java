import java.util.Scanner;
public class ArrayDemo {
public static void main(String []str)
{
    int []arr;  //declare array
    int n;        //array size
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    n = sc.nextInt();
    arr = new int[n];  //array allocation
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter"+" "+(i+1)+" "+"element");
        arr[i]=sc.nextInt();    //store element in array
    }
    System.out.println("Array Element");
    for(int j=0;j<n;j++)
    {
        System.out.print(arr[j]+"\t");
    }
    System.out.println();
    //to search element in array
    System.out.println("Enter number want to search in Array");
    int search = sc.nextInt();
    for(int k=0;k<n;k++)
    {
        if(arr[k]==search)
        {
            System.out.println("Array element found at"+" "+(k+1));
        }
    }
    //to reverse an array
    for(int ctr=n-1;ctr>=0;ctr--)
    {
        System.out.print(arr[ctr]+"\t");
    }
    System.out.println();
}
}
