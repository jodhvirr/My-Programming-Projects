import java.util.ArrayList;
public class Gradebook {
private ArrayList <Student> students;

public Gradebook()
{
    students = new ArrayList<>();
}

public void addStudent(Student s)
{
    students.add(s);
}

public void removeStudent(int id)
{
    for(int x = 0; x<students.size(); x++)
    if(students.get(x).getId() == id)
    {
        students.remove(x);
        break;
    }

}

public Student getStudent(int id)
{
    for(Student s: students)
    {
        if(s.getId() == id)
        {
           return s;
        }
    }
    return null;
}

public void printAllStudents()
{
    
    for(Student s: students)
    {
        System.out.println(s);
    }

}

public int size()
{
    return students.size();
}
public double classAverage()
{

    double average = 0;
    for(Student s:  students)
    {
       average += s.calculateAverage();
    }
 return average / students.size();
}
  




}




