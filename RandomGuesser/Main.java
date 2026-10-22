public static void main(String[] args) {
    
    boolean isRunning = true;
    int i = (int)(Math.random() * 100) + 1;
    Scanner scan = new Scanner(System.in);
    System.out.println("******************************");
    System.out.println("WELCOME TO GUESS THE NUMBER!!!");
    System.out.println("******************************");
    System.out.println("Guess a number from 1-100: ");
    System.out.println("");
    int guesses = 0;
    while(isRunning)
    {
    int num = 0;
    
    try {
         num = scan.nextInt();
    } 
    
    catch (Exception e) {
        System.out.println("ERROR... Type an integer number from 1-100!");
        scan.nextLine();
        continue;
    }

    if(num < 1 || num > 100)
    {
        System.out.println("ERROR... Pick a number in the range of 1-100!");
        continue;
    }

    guesses++; 

    if(num == i)
    {
        System.out.println("*******************************************");
        System.out.println("Correct, that matches the number. GOOD JOB!");
        System.out.println("You guessed the number in " + guesses + " tries!");
        System.out.println("*******************************************");
        isRunning = false;
    }

    else if(num > i)
    {
        System.out.println("Lower...");
        System.out.println("Guess Again!");
        
    }

    else 
    {
        System.out.println("Higher...");
        System.out.println("Guess Again!");
        
    }
}
scan.close();
}