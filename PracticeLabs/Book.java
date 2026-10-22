public class Book {

    private String title;
    private String borrower;
    private boolean isBorrowed;

    public Book(String title) {
        // initialize fields (think: starting state of a new book)
        this.title = title;
        borrower = null;
        isBorrowed = false;
    }

    public boolean borrowBook(String name) {
        // check if book is available, then update state + return result
        
        if(!isBorrowed)
        {
            isBorrowed = true;
            borrower = name;
            return true;
        }
    return false;
    }

    public void returnBook() {
        // reset book back to initial state
        isBorrowed = false;
        borrower = null;
    }

    public void printStatus() {
        // print title, then show different output depending on state
        if(isBorrowed)
        {
            System.out.println("The book " + title + " is currently borrowed and cannot be claimed");
        }
        else
        {
            System.out.println("The book " + title + " is currently available and can be claimed");
        }
    }
}