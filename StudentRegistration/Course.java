import java.util.ArrayList;

public class Course
{
    private String courseCode;
    private String courseName;
    private double credits;
    private int maxStudents;
    ArrayList<Student> s = new ArrayList<>();


    public Course(String courseCode, String courseName, double credits, int maxStudents)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.maxStudents = maxStudents;
        s = new ArrayList<>();
    }

    public void addStudent(Student st)
    {
        s.add(st);
    }

    public void removeStudent(Student st)
    {
        s.remove(st);
    }

    public boolean isFull()
    {
        return s.size() >= maxStudents;
    }

    public void printStudents()
    {
        for(Student st : s)
        {
            IO.println(st);
        }
        
    }



}