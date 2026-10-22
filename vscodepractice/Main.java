
import java.util.Scanner;

public class Main {
public static void main(String [] args) {

Scanner scan = new Scanner(System.in);
Gradebook gb = new Gradebook();
boolean running = true;

while(running)
{
    System.out.println("--GradeBook Menu--");
    System.out.println("1. Add Student");
    System.out.println("2. Remove Student");
    System.out.println("3. Print All Students");
    System.out.println("4. Add Score to Student");
    System.out.println("5. Show Class Average");
    System.out.println("6. Exit");
    System.out.println("Enter your choice");
    int option = scan.nextInt();
    
    switch(option) {
    case 1:
    {
        System.out.println("Enter Student's name:");
        String name = scan.next();
        System.out.println("Enter GradeLevel:");
        int gradeLevel = scan.nextInt();
        System.out.println("Enter Student's GPA:");
        double gpa = scan.nextDouble();
        System.out.println("Enter Student ID:");
        int id = scan.nextInt();
        Student s = new Student(name, gradeLevel, gpa, id);
        gb.addStudent(s);
    }

    case 2:
    {
        System.out.println("Enter Student's ID");
        
    }

    case 3:
    {

    }

    case 4:
    {

    }

    case 5:
    {

    }

    case 6:
    {

    }
}
}
}
}