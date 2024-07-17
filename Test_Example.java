import java.util.Scanner;
public class Test_Example
{
    public static void main(String []str)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
       /* int age = sc.nextInt();
        if(age >=0 && age <=100)
        {
            System.out.println("Valid age group");
        }
        else
        {
            System.out.println("Invalid age group");
        }
        */

        int num = sc.nextInt();

      /*  if(num>0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
       */

        if(num % 2 ==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

    }
}
