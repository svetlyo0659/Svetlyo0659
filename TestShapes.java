package OopInheritance.Shapes;

public class TestShapes extends Shape
{
  public static void main(String[] args)
  {
    Rectangle rectangleOne = new Rectangle(6, 4);
    Square squareOne = new Square(5);

    System.out.println("The height of the rectangle is: " + rectangleOne.getHeight() + "cm"); // prints the height of the Rectangle
    System.out.println("The width of the rectangle is: " + rectangleOne.getWidth()+ "cm");  // prints the Width of the Rectangle
    System.out.println("The side of the square is: " + squareOne.getSide()+ "cm"); // prints the length of the side of the Square.

    //squareOne.setSide(6); // changes the value of the side of the square (with the setter)
    //System.out.println("The side of the square is: " + squareOne.getSide()+ "cm"); // prints the new value of the side of the Square
    System.out.println("The area of the rectangle is: " + rectangleOne.getArea()+ "cm²");
    System.out.println("The perimeter of the rectangle is: " + squareOne.getPerimeter()+ "cm");
    System.out.println("The area of the square is: " + squareOne.getArea()+ "cm²"); //square class inherits the getArea from rhe Rectangle class
    System.out.println("The perimeter of the square is: " + squareOne.getPerimeter()+ "cm"); // same for the getPerimeter


  }
}
