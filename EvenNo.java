import java.util.Scanner;
public class EvenNo {
    public static void main(String []str)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to find even number");
        a = sc.nextInt();
        System.out.println("Enter a no.");
       
        for(int i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                System.out.println("EVEN NO." +i);
            }
           
        }
        
    }
}
