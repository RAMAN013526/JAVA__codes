import java.util.Scanner;
public class NestedIfElse {
    public static void main(String []str)
    {
        Scanner sc = new Scanner(System.in);
        String product,category;
        int price;
        System.out.println("Enter product  name");
        product = sc.next();
        System.out.println("Enter product  category(clothing,furniture)");
        category = sc.next();
        System.out.println("Enter product  price");
        price = sc.nextInt();
        if(product.equals("T-shirt")&& category.equals("clothing"))
        {
            if(price >= 100 && price <=999)
            {
                System.out.println("You can purchase T-shirt");
            }
        }
        else if(product.equals("table")&& category.equals("furniture"))
        {
            System .out.println("You can purchase table");
        }
        else
        {
            System.out.println("Invalid product or category");
        }
        }
}
