import java.util.Scanner;

public class MinGap
{
  static int[] numbers;
  static Scanner in = new Scanner(System.in);

  static int minGap(int length, int[] numbers)
  {
    int sum = 0;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < 1; j++) {
        int firstNum = numbers[i];
        int secondNum = numbers[j + i + 1];
        sum = secondNum - firstNum;
        if (sum < min) {
          min = sum;
        }
      }
    }
    return min;
  }

  public static void main(String[] args)
  {
    System.out.println("Enter the length of the Integer Array:");
    int length = in.nextInt();
    numbers = new int[length]; /// creates a new empty array with the length of the user input.
    System.out.println("Enter the numbers for the Integer Array NOTE(split the numbers  with ','):");

    String numbersString = in.next();
    String[] numbersArray = numbersString.split(",");

    for (int i = 0; i < numbersArray.length; i++) { ///converts the String Array of numbers to an int array with the same numbers.
      numbers[i] = Integer.valueOf(numbersArray[i]);
    }
    System.out.println("MinGap = " + minGap(length, numbers)); // calls the method and gets the minimum result from the int array
  }
}
