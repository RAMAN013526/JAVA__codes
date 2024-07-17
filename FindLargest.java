import java.util.Scanner;
public class FindLargest {
    public static void main(String []str){
    System.out.println("Enter 1st no.");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Enter 2nd no.");
    int b = sc.nextInt();
    System.out.println("Enter 3rd no.");
    int c = sc.nextInt();
     if(a>b && a>c)
     {
         System.out.println("A is greater");
     }
     else if(b>a && b>c)
     {
         System.out.println("B is greater");
     }
     else
     {
        System.out.println("C is greater");
     }
    }
}
