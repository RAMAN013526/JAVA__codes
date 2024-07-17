import java.util.Scanner;
public class Array2d {
public static void main(String []str)
{
    int [][]arr = {{3,2,8,1,6},{6,3,5,2,1},{1,2,3,4,5}};
    System.out.println(arr[1][2]);
    System.out.println(arr.length);
    int sum =0;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print(arr[i][j]+" ");
             sum +=arr[i][j];
        }
        System.out.println();
         System.out.println("sum of"+" "+(i+1)+"row"+" "+sum);
    }
    System.out.println("Total sum"+"\t"+sum);
}
}
