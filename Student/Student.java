import java.util.*;
public class Student{

private String name;
private int studentID;
private ArrayList <Double> grades;

public Student(String name, int studentID, ArrayList<Double> grades)
{
    this.name = name;
    this.studentID = studentID;
    this.grades = grades;
}

public void addGrade(double a)
{
    grades.add(a);
    
}

public double getAverage()
{
    double sum = 0;
    for(Double grade: grades)
    {
        sum += grade;
    }
    return sum/grades.size();
}

public void printReport()
{
    System.out.println("Your name is: " + name);
    System.out.println("Your ID is: " + studentID);
    System.out.println("Your grades are: " + grades);
    System.out.println("Your average is " + getAverage());
}

}