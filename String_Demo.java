public class String_Demo {
    public static void main(String []str)
    {
        //String is immutable class
        String message = "Hello";
        System.out.println(message);
       message =  message.concat("World");
        System.out.println(message);
        if(message.contains("W"))
        {
            System.out.println("Word exists in String");
        }
        else if(message.endsWith("ld"))
        {
            System.out.println("String exists in string");
        }
        else
        {
            System.out.println("Word doesn't exists");
        }
        System.out.println(message.charAt(5));
    }
}
