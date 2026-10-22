public class BankAccount {

    private String owner;
    private double balance;
    private int accountNum;
    private static int totalAccounts;
    public BankAccount(String owner, double balance, int accountNum)
    {
        this.owner = owner;
        this.balance = balance;
        this.accountNum = accountNum;
        totalAccounts++;
    }

    public void deposit(double num)
    {
        if(balance + num >= 0)
        {
        balance += num;
        }
    }
    
    public void withdraw(double num) 
    {
        if(balance - num >= 0)
        {
        balance -= num;
        }
    }

    public String toString()
    {
       return "Owner: " + owner + "\n" + "Balance: " + balance + "\n" + "Account Number: " + accountNum + "\n" + "Total Accounts: " + totalAccounts;
    }

}