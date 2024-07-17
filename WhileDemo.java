import java.util.Scanner;
import javax.swing.JOptionPane;
public class WhileDemo {
public void feb()
{
    Scanner sc = new Scanner(System.in);
   // int ctr = 0;
    int a = 0;
    int b = 1;
    String ch = "y";
   // while(ch.equals("y"))//variable
    while(true)
    {
        a = a+b;
        b = a-b;
        if(a>=100)
            break;
        System.out.println(a);
       // System.out.println("Do you want to continue(y/n)");
       // ch = sc.next();
        //ch = JOptionPane.showInputDialog("Do u want to continue(y/n)");
    }
    JOptionPane.showMessageDialog(null,"value can't be >= 100");
}
public static void main(String []str)
{
    WhileDemo obj = new WhileDemo();
    obj.feb();
}
}
