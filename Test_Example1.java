import java.util.Scanner;
public class Test_Example1 {
    public static void main(String[] str)
    {
        int x = 10;
        int y = x++;                 //postfix
        System.out.println(y);       //10
        System.out.println(x++);     //11
        System.out.println(x);       //12


        int z = 20;
        int n = ++z;                 //prefix
        System.out.println(n);       //21
        System.out.println(z);       //21
        System.out.println(++z);
        System.out.println(z++);

        //System.out.println(5++);   error

        char str1 = 'B';
        System.out.println(++str1);

        byte b1 = 10;
        byte b2 = ++b1;
        System.out.println(++b1 *2);
        System.out.println(b2);

    }
}
