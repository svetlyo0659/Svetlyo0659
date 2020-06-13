package OOP;

import java.util.ArrayList;

public class Course
{
  String name;
  ArrayList<String> students = new ArrayList<>();

  Course()
  {
  }

  Course(String name)
  {
    this.name = name;
  }

  Course(String name, ArrayList<String> students)
  {
    this.name = name;
    this.students = students;
  }

  public String setName(String name)
  {
    this.name = name;
    return name;
  }
}


