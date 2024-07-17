import java.util.Scanner;
public class FindLarge
{
    public static void main(String []str)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter 3 digit number");
        num = sc.nextInt();
        if(num >= 100 && num <=999)
        {
            int h = num / 100;
            int t = (num/10)%10;
            int o = num%10;
            System.out.println(h+" "+t+" "+o);
            if(h>t && h>o)
            {
                System.out.println("largest digit"+" "+h);
            }
            else if(t>h && t>o)
            {
                System.out.println("largest digit"+" "+t);
            }
            else
            {
                System.out.println("largest digit"+" "+o);
            }
        }
        else
        {
            System.out.println("Invalid 3 digit number");
        }

    }
}
