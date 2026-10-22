
import java.util.ArrayList;

public class Main{

    public static void main(String[] args)
    {
        ArrayList<Double> grades = new ArrayList<Double>();
        grades.add(92.0);
        grades.add(17.0);
        grades.add(59.0);
        Student s = new Student("Jeremiah", 123456, grades);

        s.printReport();
        s.addGrade(100.0);
        System.out.println(s.getAverage());




    }
}
