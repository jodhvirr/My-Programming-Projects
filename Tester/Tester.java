import java.io.*;
public class Tester{
    public static void main(String[]args) throws IOException
    {
       String test = "Hello123";
       String pattern = "^[A-Z].*\\d$";

       if(test.matches(pattern))
       {
        System.out.println("Yes it matches!");
       }
       else
       {
        System.out.println("No it doesn't match!");
    }
       



    }
}