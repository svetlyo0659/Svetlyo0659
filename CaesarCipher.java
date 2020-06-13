
import java.util.*;

public class CaesarCipher
{

  /* NOTE !!! Simple cipher program. user enters a massage and a key (number ) to shift the char value of every letter in the message
  with n (key positions). The user that wants to read the cipher has to KNOW the KEY so that the message can be decrypted.
  */

  static String message;
  static char[] encryptedTextChar;
  static char[] decryptedTextChar;
  static char[] output;

  static void encrypt(String message, char[] encryptedTextChar, int key) /// method for encryption
  {
    // x=(x+n)%26 algorithm for shifting the chars where X = encrypted char, N = key and 26 is the length of the EN alphabet.
    encryptedTextChar = new char[message.length()];
    output = new char[message.length()];
    for (char letter = 0; letter < message.length(); letter++) { //loop reading the message and adding each letter to a char array.
      encryptedTextChar[letter] = message.charAt(letter);
      output[letter] = (char) (((int) encryptedTextChar[letter] + key - 97) % 26 + 97); // 97  is the ascii code for letter a
      if (encryptedTextChar[letter] == ' ') {
        output[letter] = ' ';
      }
      System.out.print(String.valueOf(output[letter]).toUpperCase());
    }
  }

  static void decrypt(String message, char[] decryptedTextChar, int key) // method for decryption
  {
    // algorithm for decrypting is x= (x-n)%26 where X = decrypted char, N = key  and 26 is the length of the EN alphabet.

    decryptedTextChar = new char[message.length()];
    output = new char[message.length()];
    for (char letter = 0; letter < message.length(); letter++) { //loop reading the message and adding each letter to a char array.
      decryptedTextChar[letter] = message.charAt(letter);
      if (decryptedTextChar[letter] - (char) key < 97) {
        output[letter] = (char) (((int) decryptedTextChar[letter] - key - 97 + 26) % 26 + 97); // 97  is the ascii code for letter a
        if(decryptedTextChar[letter]==' '){ /// if there is a space in the message it the current char will be space ' '.
          output[letter]=' ';
        }
      }
      else {
        output[letter] = (char) (((int) decryptedTextChar[letter] - key - 97) % 26 + 97);
        if(decryptedTextChar[letter]==' '){ /// if there is a space in the message it the current char will be space ' '.
          output[letter]=' ';
        }
      }

      System.out.print(String.valueOf(output[letter]).toUpperCase());
    }
  }

  public static void main(String[] args) // main method
  {
    Scanner in = new Scanner(System.in);
    System.out.println("ENTER MESSAGE");
    message = in.nextLine().toLowerCase();
    System.out.println("CHOOSE 1 (FOR ENCRYPTION) OR 2 (FOR DECRYPTION)"); // user chooses options

    while (true) {
      int option = in.nextInt();
      if (option != 1 && option != 2) { // validation
        System.out.println("ERROR! ENTER A VALID OPTION:");
        continue;
      }
      else if (option == 1) { /// if user choose option 1
        System.out.println("ENTER THE KEY FOR ENCRYPTION (1-25):");
        int key = in.nextInt();
        System.out.println("ENCRYPTED MESSAGE:");
        encrypt(message, encryptedTextChar, key);
        break;
      }
      else {
        System.out.println("ENTER THE KEY FOR DECRYPTION (1-25):");
        int key = in.nextInt();
        System.out.println("DECRYPTED MESSAGE:"); /// if user choose option 2
        decrypt(message, decryptedTextChar, key);
        break;
      }
    }
  }
}
