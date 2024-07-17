import java.util.Scanner;
public class SwitchCaseDemo {
    public static void main(String []str)
    {
        int choice,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice(1-3)");
        System.out.println("1 for ADD)");
        System.out.println("2 for SUB");
        System.out.println("3 for MULT");
        choice = sc.nextInt();
           System.out.println("Enter two no.");
                a = sc.nextInt();
                b = sc.nextInt();

        switch(choice)
        {
            case 1:
                  System.out.println("SUM of two no. is "+" "+(a+b));
                  break;
            case 2:
                  System.out.println("SUB of two no. is "+" "+(a-b));
                  break;
            case 3:
                  System.out.println("MULT of two no. is "+" "+(a*b));
                  break;
            default:
                System.out.println("INVALID CHOICE");
        }
    }
}
