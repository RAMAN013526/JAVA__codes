import java.util.Scanner;
public class forExample {
    public void genTable(int n)
    {
        int sum = 0;
        for(int i=1;i<=10;i++)
        {
            sum = sum + i*n;
            System.out.println(i*n);
        }
        System.out.println("Sum of table value:"+"\t"+sum);
    }
    public static void main(String []str)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        forExample obj = new forExample();
        obj.genTable(i);
    }
}
