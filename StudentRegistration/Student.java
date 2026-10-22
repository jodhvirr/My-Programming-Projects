import java.io.*;
import java.util.*;
public class Student
{
    private int id;
    private String name;
    ArrayList<Course> list = new ArrayList <>();


    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.list = new ArrayList<>();

    }

    public void addCourse(Course c)
    {
        list.add(c);
    }

    public void removeCourse(Course c)
    {
        list.remove(c);
    }


    public void printCourses()
    {
        for(Course c : list)
        {
            IO.print(c);
        }

    }



}