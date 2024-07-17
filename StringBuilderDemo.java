
import javax.swing.JOptionPane;


public class StringBuilderDemo {
    public static void main(String []str)
    {
        String ch = "y";
        StringBuilder sb = new StringBuilder();  //mutable class
        while(ch.equals("y"))
        {
            sb.append(JOptionPane.showInputDialog("Enter your name")+"\n");
            sb.append(JOptionPane.showInputDialog("Enter your address")+"\n");
            sb.append(JOptionPane.showInputDialog("Enter your email")+"\n");
            ch =JOptionPane.showInputDialog("Do you want to continue(y/n)");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
