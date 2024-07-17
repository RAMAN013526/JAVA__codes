/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raman raj
 */
public class triangleStar {
public static void main(String []str)
{
    int n=6;
    for (int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(int j=i;j<n;j++)
        {
            System.out.print("* ");

        }
        System.out.println();
    }
}
}
