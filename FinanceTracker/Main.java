import java.util.*;

public class Main{

public static void main(String []args)
{
    boolean running = true;
    double balance = 0;
    ArrayList<String> transactions = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    while(running)
    {

    IO.println("Welcome to the Finance Tracker!");
    IO.println("*******************************");
    IO.println("You will choose one of the 4 options");
    IO.println(" 1. Add transaction\n 2. View Transactions\n 3. Show Balance\n 4. Exit");
    IO.println("*******************************");
    IO.println("Choose a number from the options: ");
    int num = scan.nextInt();
    scan.nextLine();
    
    switch(num)
    {
        case 1:
            
            IO.println("Is this an income or expense?");
            String s = scan.nextLine();
            if(s.equalsIgnoreCase("income"))
            {
                IO.println("Name?");
                String name = scan.nextLine();
                IO.println("Amount?");
                double amount = scan.nextDouble();
                scan.nextLine();
                balance += amount;
                transactions.add("Income: " + name + " +$" + amount);
                IO.println("Press enter to continue...");
                scan.nextLine();
                break;
            }
            else if(s.equalsIgnoreCase("expense"))
            {
                IO.println("Name?");
                String name = scan.nextLine();
                IO.println("Amount?");
                double amount = scan.nextDouble();
                scan.nextLine();
                balance -= amount;
                transactions.add("Expense: " + name + " -$" + amount);
                IO.println("Press enter to continue...");
                scan.nextLine();
                break;
            }
            else
            {
                IO.println("Invalid Transaction");
                IO.println("Press enter to continue...");
                scan.nextLine();
            }
        
        case 2:
            {
                IO.println("Your transactions: ");
                
                for(String t: transactions)
                {
                    IO.println(t);
                }
                IO.println("Press enter to continue...");
                scan.nextLine();
                break;
            }
        
        case 3:
            {
                System.out.printf("Your current BALANCE is: %.2f\n", balance);
                IO.println("Press enter to continue...");
                scan.nextLine();
                break;
            }
        
        case 4:
            {
                running = false;
                break;
            }
        default:
            {
            IO.println("Choose an option from 1-4.");
            break;
            }

    
    
        }
    }
    scan.close();
}
}