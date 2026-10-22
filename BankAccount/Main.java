public class Main{

    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount("Steve Jobs", 150.00, 123456);

        System.out.println(acc);
        acc.deposit(250);
        acc.withdraw(100);
        System.out.println(acc);
    }
}


