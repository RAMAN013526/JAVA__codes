import java.util.Scanner;
public class NestedLoop1 {
void print()
{
    System.out.println("Enter a no.");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int k=0;k<3;k++)
    {
    for(int i=0;i<=n;i++)
    {
        for(int j=i;j<n;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}
}
public static void main(String []str)
{
    NestedLoop1 obj = new NestedLoop1();
    obj.print();
}
}
