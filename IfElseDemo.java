import java.util.Scanner;
public class IfElseDemo {
public static void main(String[] str)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character : ");
    char ch = sc.next().charAt(0);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
        System.out.println("character is vowel");
    }
    else
    {
        System.out.println("character is not a vowel");
    }
}
}
 