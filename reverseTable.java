import java.util.Scanner;
public class reverseTable {
    Scanner sc = new Scanner(System.in);
    public void genTable(int n)
    {
        int sum = 0;
        for(int i=1;i<=10;i++)
        {
            sum = sum + i*n;
            System.out.print(i*n+"\t");
        }
        System.out.println();
        System.out.println("table reverse order");
        for(int j=10;j>=1;j--)
        {
            System.out.print(j*n+"\t");
        }
        System.out.println();
        System.out.println("Sum of table value:"+"\t"+sum);
    }
    public void getString()
    {
        for(int i=1;i<5;i++)
        {
        System.out.println("Enter a string");
        String message = sc.nextLine();
        if(message.length()>=5)
        {
            System.out.println("Message:"+i+"\t"+message);
        }
        else
        {
            System.out.println("Message is not correct");
        }
        }
    }
    public static void main(String []str)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        reverseTable obj = new reverseTable();
        obj.genTable(i);
        obj.getString();
    }
}
