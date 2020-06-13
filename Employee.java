package OOP;

public class Employee
{

  String name;
  int age;
  private static  int lastId=0;
  private int id;

  public Employee(){
    lastId++;
    id = lastId;
  }

  public Employee(String name, int id ){
    this.name = name;
    lastId++;
    this.id = lastId;
  }


  public static void main(String[] args)
  {
    Employee one = new Employee();
    one.name = "Svetoslav";
    one.id=lastId;
    System.out.println(one.name);
    System.out.println(one.id);

    Employee two = new Employee();
    two.name = "Ivan";
    two.id = lastId;

    System.out.println(two.name);
    System.out.println(two.id);

    Employee three = new Employee("Petar",lastId);
    System.out.println(three.name);
    System.out.println(three.id);

    Employee four = new Employee();
    four.name = "Georgi";
    four.id= lastId;
    System.out.println(four.name);
    System.out.println(four.id);


  }

}
