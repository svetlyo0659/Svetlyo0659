package OopInheritance.Shapes;

public class Square extends Rectangle
{
  private double side; /// side of the Square.

  public Square(double side)  //constructor for the Square class
  {
    super(side, side);  // constructor for Square uses the constructor for the Rectangle class (parent class)
    this.side = side;
  }

  public double getSide()  // getter for Square side.
  {
    return side;
  }

  public void setSide(double side) // setter for Square side.
  {
    this.side = side;
  }


}
