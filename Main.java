package OOP;

public class Main
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Мария", 6);
    Student student2 = new Student("Иван", 2);
    Student student3 = new Student("Кънчо");

    Course javaCourse = new Course();
    javaCourse.setName("JAVA");
    System.out.println(javaCourse.name);


    System.out.println(student1.name + " " + student1.grade);
    System.out.println(student2.name + " " + student2.grade);
    System.out.println(student3.name + " " + student3.grade);

    student3.setGrade(6);
    //System.out.println("Студент: " + student3.name +"\n" + " Оценка: " + student3.grade +"\n" + " Курс: " + java.name);
  }
}
