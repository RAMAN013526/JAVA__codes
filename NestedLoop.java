
public class NestedLoop {

    void print()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(i+" "+j);

            }
            System.out.println();
        }
    }
    public static void main(String []str)
    {
        NestedLoop obj= new NestedLoop();
        obj.print();
    }
}
