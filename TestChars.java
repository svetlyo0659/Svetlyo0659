import java.util.Scanner;

public class TestChars
{
  static String encryptedText;

  static void result(String encryptedText){
    char[] encryptedTextChar = new char[encryptedText.length()];
    // x=(x+n)%26 algorithm for shifting the chars where X = encrypted char, N = shifting and 26 is the length of the EN alphabet.
    for (char letter = 0; letter < encryptedText.length(); letter++) {
      encryptedTextChar[letter] = encryptedText.charAt(letter);
      System.out.print(encryptedTextChar[letter]);
    }
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    encryptedText = in.nextLine();
    result(encryptedText);

  }
}
