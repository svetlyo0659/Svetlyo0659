import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeVer2  /// simple game of TIC TAC TOE (....not so simple)
{
  static String[]           board          = new String[9]; /// the board is global and always with 9 positions
  static Scanner            in             = new Scanner(System.in); /// scanner for user input
  static String             symbolOfPlayer = null; /// the symbol for player ONE is "X" and for player Two is "O"
  static boolean            isTrue         = true;  /// boolean that helps for the while loop break
  static String             nextPlayer     = null;  /// Only one variable for player One and Two  it changes
  static ArrayList<Integer> positions      = new ArrayList<>(); /// list for all the selected positions for Player ONE and Player TWO

  static void printBoard() // prints an empty board PRINTS NULL
  {
    for (int i = 0; i < board.length; i++) {
      board[i] = (String.valueOf(i + 1));
    }
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        board[y] = board[(x * 3) + y];
        System.out.print(" " + board[y]);
      }
      System.out.println();
    }
  }

  static void printSelectedPositions(int position, String symbolOfPlayer)  /// fills the board with taken positions!
  {
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        if (board[(x * 3) + y].equals(String.valueOf(position))) {
          board[(x * 3) + y] = symbolOfPlayer;
        }
        System.out.print(" " + board[(x * 3) + y]);
      }
      System.out.println();
    }
  }

  static String[] fillEmptyPositions() //fills the board for the game with positions  from 1 to 9!
  {
    for (int i = 0; i < board.length; i++) {  /// fills the board with empty positions!
      board[i] = (String.valueOf(i + 1));
    }
    return board;
  }

  static void checkIfWin() /// checks if there is a winner in the game!
  {
    for (int i = 1; i <=8; i++) {  /// for loop to go trough all winning combinations (all winning combos are 8)
      String winCombo = "";
      switch (i) {
        case 1:
          winCombo = board[0] + board[1] + board[2]; // first winning combo and so on...
          break;
        case 2:
          winCombo = board[3] + board[4] + board[5];
          break;
        case 3:
          winCombo = board[6] + board[7] + board[8];
          break;
        case 4:
          winCombo = board[0] + board[3] + board[6];
          break;
        case 5:
          winCombo = board[1] + board[4] + board[7];
          break;
        case 6:
          winCombo = board[2] + board[5] + board[8];
          break;
        case 7:
          winCombo = board[0] + board[4] + board[8];
          break;
        case 8:
          winCombo = board[2] + board[4] + board[6];
          break;
      }
      if (winCombo.equals("XXX")) { /// if not all positions are filled and the winner is player ONE
        isTrue = false;
        System.out.println("PLAYER ONE WINS!");
      }
      else if (winCombo.equals("OOO")) { /// if not all positions are filled and the winner is player TWO
        isTrue = false;
        System.out.println("PLAYER TWO WINS!");
      }
      else if (positions.size() == 9) { /// if all the position are filled and there is no winner its a tie.
        if (winCombo.equals("XXX")) {
          isTrue = false;
          System.out.println("PLAYER ONE WINS!");
          break;
        }else if(winCombo.equals("OOO")){
          isTrue = false;
          System.out.println("PLAYER TWO WINS!");
          break;
        }else{
          isTrue = false;   /// if the last position is filled and there is no WINNER!
          System.out.println("ITS A TIE");
          break;
        }
      }
    }
  }

  public static void main(String[] args)
  {
    System.out.println("===============================");
    System.out.println("LETS PLAY A GAME OF TIC TAC TOE");
    System.out.println("===============================");
    printBoard();/// prints the empty board with null!
    System.out.println("===============================");
    fillEmptyPositions(); /// fills the empty board with position 1 to 9

    symbolOfPlayer = "X";  /// player one is always first with X
    nextPlayer = "ONE";  /// next player

    while (isTrue) { /// loops while there is a winner or a TIE/draw
      System.out.println("PLAYER " + nextPlayer + ", SELECT POSITION:");
      int position = in.nextInt(); /// user input for the position (both player one and player Two)
      if (positions.contains(position)) { // check if the position is already taken!
        System.out.println("POSITION TAKEN!");
        continue;
      }
      if (!(position >= 1 && position <= 9)) { /// if the selected position is out of range its invalid user selects new position!
        System.out.println("INVALID POSITION! ENTER VALID POSITION:");
        System.out.println();
        continue;
      }
      else {
        positions.add(position); /// adds the selected position to an ListArray so that can be matched
        printSelectedPositions(position, symbolOfPlayer); // prints the board with the selected positions.
        System.out.println();
        checkIfWin(); /// checks if there is a WINNER
        if (symbolOfPlayer.equals("X")) {
          nextPlayer = "TWO"; /// if the first player is player ONE the second becomes player TWO and the symbol changes too.
          symbolOfPlayer = "O";
        }
        else {
          nextPlayer = "ONE";
          symbolOfPlayer = "X";
        }
      }
    }
  }
}