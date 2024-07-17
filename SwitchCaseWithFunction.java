import java.util.Scanner;
public class SwitchCaseWithFunction {
    int a,b;
    Scanner sc = new Scanner(System.in);
    public void INPUT()
    {
        System.out.println("Enter two no.");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    public void ADD()
    {
       System.out.println("SUM of two no. is"+" "+(a+b));
    }
    public void SUB()
    {
       System.out.println("SUB of two no. is"+" "+(a-b));
    }
    public void MULT()
    {
       System.out.println("MULT of two no. is"+" "+(a*b));
    }
    public static void main(String []str)
    {
        SwitchCaseWithFunction obj = new SwitchCaseWithFunction();
        obj.INPUT();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your choice(1-3)");
       System.out.println("1 for ADD");
        System.out.println("2 for SUB");
         System.out.println("3 for MULT");
         int choice = sc.nextInt();
         switch(choice)
         {
             case 1:
                 obj.ADD();
                 break;
             case 2:
                 obj.SUB();
                 break;
             case 3:
                 obj.MULT();
                 break;
             default:
                 System.out.println("DEFAULT CHOICE");
         }

    }
}
