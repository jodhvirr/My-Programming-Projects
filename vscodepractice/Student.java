
public class Student{
private String name;
private int gradeLevel;
private double [] testScores;
private double gpa;
private int id;
private int scoreCount = 0;
public Student(String name, int gradeLevel, double gpa, int id)
{
this.name = name;
this.gradeLevel = gradeLevel;
this.gpa = gpa;
this.id = id;
this.testScores = new double[5];
}
public void addScore(double score)
{
  if(scoreCount<testScores.length)
  {
    testScores[scoreCount] = score;
    scoreCount++;
  }
  else
  {
    System.out.println("Your array is full!");
  }
}

public int getId()
{
  return id;
}

public double calculateAverage()
{
double total = 0;
for(double scores: testScores)
{
    total += scores;
}
return total / scoreCount;
}

public String toString()
{
    return "Name: " + name + ", Grade: " + gradeLevel + ", ID: " + id + ", GPA: " + gpa;
}








}
