import java.util.*;
public class Main{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while(running)
        {
            System.out.println("\n");
            System.out.println("-----Calculator-----");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply ");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Choose an option:");
            int choice = scan.nextInt();

            if(choice == 5)
            {
                running = false;
                System.out.println("Goodbye");
                break;
            }
            
            System.out.println("Enter your first number: ");
            int a = scan.nextInt();

            System.out.println("Enter your second number: ");
            int b = scan.nextInt();
            
            double result = 0;
            switch(choice) {
            case 1:
                result = calc.add(a,b);
                break;

            case 2:
                result = calc.subtract(a,b);
                break;

            case 3:
                result = calc.multiply(a,b);
                break;

            case 4:
                result = calc.divide(a,b);
                break;

            default:
                System.out.println("Invalid Choice");
                continue;

            }
            System.out.println("Result: " + result);
        }
        scan.close();
    }
}