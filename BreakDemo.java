import java.util.Scanner;
public class BreakDemo {
 public  void gen_feb()
    {
        int a = 0;
        int b = 1;
        for(int i=0;i<=10;i++)
        {
           
            a = a+b;
            b = a-b;
             if(a==21)
              break;
            System.out.println(a);
        }
        System.out.println("Process over");
    }
 //1+2+3+4+5
 public void CreateSum(int n)
 {
    int sum = 0;
     for(int i=1;i<=n;i++)
     {
         sum += i;


     }
     System.out.println(sum);
 }
 public static void main(String []str)
 {
       BreakDemo obj = new BreakDemo();
     obj.gen_feb();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a no.");
      int x = sc.nextInt();
      obj.CreateSum(x);
 }
}
