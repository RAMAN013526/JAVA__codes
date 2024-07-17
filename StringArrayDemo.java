
import javax.swing.JOptionPane;

public class StringArrayDemo {
    public static void main(String []str)
    {
        String []name = new String[5];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<name.length;i++)
        {
            name[i] = JOptionPane.showInputDialog("Enter your name");
        }
         for(int i=0;i<name.length;i++)
        {
           sb.append(name[i]+"\n");
        }
        JOptionPane.showMessageDialog(null,sb);
}
}