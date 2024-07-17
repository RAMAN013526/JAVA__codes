import javax.swing.JOptionPane;
public class Array_1D {
    public static void main(String []str)
    {

        int temp=0;
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter Array Size"));
         int []arr = new int [size];
         int n = arr.length;

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<(n-i)-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   //swap elements

                temp = arr[j];
               arr[j]=arr[j+1];
               arr[j+1]= temp;
               }
           }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+"\t");
        }
        System.out.println();
    }
}
