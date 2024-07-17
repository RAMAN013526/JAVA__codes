import java.util.Scanner;
public class ReverseThreeDigitNo
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

            o = o *100;
            o = o /100;
            h = h %100;
            System.out.print(o+""+t+""+h);

         }
    }
}

