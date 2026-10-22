public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter");
        Book b2 = new Book("Percy Jackson");

        // try borrowing books
        System.out.println(b1.borrowBook("Alex"));
        System.out.println(b1.borrowBook("Sam"));

        System.out.println(b2.borrowBook("Jordan"));

        // check status
        b1.printStatus();
        b2.printStatus();

        // return and test again
        b1.returnBook();

        b1.printStatus();
    }
}