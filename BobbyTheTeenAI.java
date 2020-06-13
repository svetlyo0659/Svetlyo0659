import java.util.Scanner;

public class BobbyTheTeenAI
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Кажи нещо на Боби:"); // say something to Bobby
    String line = in.nextLine(); // reads the next line from the console


    if (line.isEmpty()) {    // if line is empty user gets respond from Bobby and the program waits for the next line.
      System.out.println("Хубаво деее");
      line = in.nextLine();
    }

    Boolean isTrue = true; /// this is a boolean used for breaking the infinite loop with a command
    if (line.equals("Спри")) {
      isTrue = false;
      System.out.println("Аре чау....");  /// program saying goodbye. after this the  program stops.
    }

    while (isTrue) { // loops till the user enters a End command;

      String lastSymbol = line.substring(line.length() - 1); // gets the last symbol of the String line.
      String secondToLastSymbol = line.substring(line.length() - 2); // gets the second to last symbol from the String line


      for (int i = 0; i < 1; i++) { // loops ones throe the if-else statement

        if (secondToLastSymbol.equals(secondToLastSymbol.toLowerCase())) {
          if (lastSymbol.equals("?")) {
            System.out.println("Добре.");
          }
          else {
            System.out.println("Ахъ");
          }
        }
        else if (secondToLastSymbol.equals(secondToLastSymbol.toUpperCase())) {
          if (lastSymbol.equals("?")) {
            System.out.println("Споко бе, ман!");
          }
          else {
            System.out.println("Спокоооо, знам к'во правя!");
          }
        }
      }
      line = in.nextLine();  /// if the line is not equal to the STOP command it waits for the next line from the uses.

      if (line.equals("Спри")) {
        System.out.println("Аре...");
        break;
      }
    }
  }
}
