package OOP;

public class Student
{
  String name;
  int    grade;

  Student(String name, int grade)  // constructor for the Student object with name and grade args.
  {
    this.name = name;
    this.grade = grade;
  }

  Student(String name)
  {
    this.name = name;
    this.grade = grade;
  }

  public String getName(String name) // getters for the name and the grade.
  {
    return this.name;
  }

  public int getGrade(int grade)
  {
    return this.grade;
  }

  public String setName(String name) // setters for the name and the grade
  {
    this.name = name;
    return name;
  }

  public int setGrade(int grade)
  {
    this.grade = grade;
    return grade;
  }
}
