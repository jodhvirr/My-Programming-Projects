import java.io.*;
import java.util.*;
public class StudentRegistration
{

    public static void main(String[] args)
    {
        ArrayList <Course> courses = new ArrayList<>();
        ArrayList <Student> students = new ArrayList<>();
        boolean running = true;
        Scanner scan = new Scanner(System.in);
        while(running)
        {

            // menu

            IO.println("*************************************");
            IO.println("Welcome to the Student Registration");
            IO.println("*************************************");
            IO.println("You will be given options from 1 through 7");
            IO.println("1. Add a course");
            IO.println("2. Remove a course");
            IO.println("3. Show all the courses");
            IO.println("4. Add a student to a course");
            IO.println("5. Remove a student from a course");
            IO.println("6. Is the course full?");
            IO.println("7. Print all the students in the course");
            IO.println("Type the number you choose: ");

            int option = scan.nextInt(); // what the user chooses

            switch(option)
            {
                case 1: 
                {
                    IO.println("What is the course code?");
                    String code = scan.nextLine();
                    IO.println("What is the course name?");
                    String name = scan.nextLine();
                    IO.println("How many credits are there?");
                    double credits = scan.nextDouble();
                    IO.println("What is the maximum amount of students there can be in the course?");
                    int max = scan.nextInt();
                    Course c = new Course(code, name, credits, max);
                    break;
                }

                case 2:
                {

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

                case 7:
                {

                }
                
                default:
                {
                    IO.println("Not an option from the list... Try Again.");
                }

            }

        }



    }


}




