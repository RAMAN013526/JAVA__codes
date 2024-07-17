import javax.swing.JOptionPane;
public class Array_2D_exp1 {
public static void main(String []str)
{
   int [][]arr=new int[3][3];
   int rows = arr.length;
   int cols = arr[0].length;

   //Reading array element
   for(int i=0;i<rows;i++ )
   {
       for(int j=0;j<cols;j++)
       {
           arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter Array Element"));
       }
   }
  for(int i=0;i<rows;i++)
{
    for(int pass = 1;pass<cols;pass++)    //bubble sort
    {
        for(int j=0;j<cols-pass;j++)
        {
            if(arr[i][j]>arr[i][j+1])
            {
                int temp = arr[i][j];
                arr[i][j]=arr[i][j+1];
                arr[i][j+1]=temp;
            }
        }
    }
  }
   for(int i=0;i<rows;i++)
   {
       for(int j=0;j<cols;j++)
       {
           System.out.print(arr[i][j]+" ");
       }
       System.out.println();
   }
}
}
