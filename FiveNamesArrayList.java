import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FiveNamesArrayList
{
  public static void main(String[] args)
  {
    ArrayList<String> names = new ArrayList<>();

    Scanner in = new Scanner(System.in);
    System.out.println("Please enter at least five random names:");
    String name = in.nextLine();

    while (true) {  // infinite loop
      names.add(name);
      if (name.equals(".")) {
        if (names.size() <=5) {
          System.out.println("You need at least five names!");
          System.out.println("Enter a name:");
          names.remove(name);
        }

        else {
          names.remove(name);
          break;
        }
      }
      name = in.nextLine();
    }

    System.out.println(names.get(4));
    Collections.sort(names); ///sorts the ArrayList. in  alphabetical order
    System.out.println(names);
  }
}
