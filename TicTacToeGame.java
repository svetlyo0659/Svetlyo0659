import java.util.*;

public class TicTacToeGame
{

  static ArrayList<Integer> playerOnePositions = new ArrayList<Integer>(); // static makes it global
  static ArrayList<Integer> playerTwoPositions = new ArrayList<Integer>();

  static boolean isTrue = true;

  static void PrintBoardOnConsole(char[][] board)
  {
    for (char[] row : board) {
      for (char symbolOfRow : row) {
        System.out.print(symbolOfRow);
      }
      System.out.println();
    }
  }

  static void playerOneSelection(char[][] board, int positionOnBoardForPlayerOne)
  {
    char x = 'X';
    switch (positionOnBoardForPlayerOne) {
      case 1:
        board[0][0] = x;
        playerOnePositions.add(1);
        break;
      case 2:
        board[0][2] = x;
        playerOnePositions.add(2);
        break;
      case 3:
        board[0][4] = x;
        playerOnePositions.add(3);
        break;
      case 4:
        board[2][0] = x;
        playerOnePositions.add(4);
        break;
      case 5:
        board[2][2] = x;
        playerOnePositions.add(5);
        break;
      case 6:
        board[2][4] = x;
        playerOnePositions.add(6);
        break;
      case 7:
        board[4][0] = x;
        playerOnePositions.add(7);
        break;
      case 8:
        board[4][2] = x;
        playerOnePositions.add(8);
        break;
      case 9:
        board[4][4] = x;
        playerOnePositions.add(9);
        break;
      default:
        System.out.println("Error!");
        System.out.println("Enter a valid position!");
        break;
    }
    PrintBoardOnConsole(board);
  }

  static void playerTwoSelection(char[][] board, int positionOnBoardForPlayerTwo)
  {
    char o = 'O';
    switch (positionOnBoardForPlayerTwo) {
      case 1:
        board[0][0] = o;
        playerTwoPositions.add(1);
        break;
      case 2:
        board[0][2] = o;
        playerTwoPositions.add(2);
        break;
      case 3:
        board[0][4] = o;
        playerTwoPositions.add(3);
        break;
      case 4:
        board[2][0] = o;
        playerTwoPositions.add(4);
        break;
      case 5:
        board[2][2] = o;
        playerTwoPositions.add(5);
        break;
      case 6:
        board[2][4] = o;
        playerTwoPositions.add(6);
        break;
      case 7:
        board[4][0] = o;
        playerTwoPositions.add(7);
        break;
      case 8:
        board[4][2] = o;
        playerTwoPositions.add(8);
        break;
      case 9:
        board[4][4] = o;
        playerTwoPositions.add(9);
        break;
      default:
        System.out.println("Error!");
        break;
    }
    PrintBoardOnConsole(board);
  }

  static void checkIfWin(ArrayList<Integer> win)
  {

    ArrayList<Integer> firstCombo = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> secondCombo = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
    ArrayList<Integer> thirdCombo = new ArrayList<Integer>(Arrays.asList(7, 8, 9));
    ArrayList<Integer> fourthCombo = new ArrayList<Integer>(Arrays.asList(1, 4, 7));
    ArrayList<Integer> fifthCombo = new ArrayList<Integer>(Arrays.asList(2, 5, 8));
    ArrayList<Integer> sixthCombo = new ArrayList<Integer>(Arrays.asList(3, 6, 9));
    ArrayList<Integer> seventhCombo = new ArrayList<Integer>(Arrays.asList(1, 5, 9));
    ArrayList<Integer> eightCombo = new ArrayList<Integer>(Arrays.asList(3, 5, 7));

    if ((playerOnePositions.equals(firstCombo) || playerOnePositions.equals(secondCombo) ||
        playerOnePositions.equals(thirdCombo) || playerOnePositions.equals(fourthCombo) ||
        playerOnePositions.equals(fifthCombo) || playerOnePositions.equals(sixthCombo) ||
        playerOnePositions.equals(seventhCombo) || playerOnePositions.equals(eightCombo))) {
      System.out.println("Player One Wins!");
      isTrue = false;
    }
    else if ((playerTwoPositions.equals(firstCombo) || playerTwoPositions.equals(secondCombo) ||
        playerTwoPositions.equals(thirdCombo) || playerTwoPositions.equals(fourthCombo) ||
        playerTwoPositions.equals(fifthCombo) || playerTwoPositions.equals(sixthCombo) ||
        playerTwoPositions.equals(seventhCombo) || playerTwoPositions.equals(eightCombo))) {
      System.out.println("Player Two Wins!");
      isTrue = false;
    }//else{
    //  if((playerTwoPositions.size()+playerTwoPositions.size())>9){
    //    System.out.println("Its a TIE!");
    //    System.out.println("New game? y/n");
    //  }
    //}
  }

  public static void main(String[] args)
  {
    char[][] board = {{'1', '|', '2', '|', '3'}, ////displays the game board for Tic Tac Toe  1d array !!!!
        {'-', '|', '-', '|', '-'},
        {'4', '|', '5', '|', '6'},
        {'-', '|', '-', '|', '-'},
        {'7', '|', '8', '|', '9'}
    };


    PrintBoardOnConsole(board);

    Scanner in = new Scanner(System.in);

    System.out.println("Player 1, select your position from 1 to 9: ");
    int positionOnBoardForPlayerOne = in.nextInt();

    while (isTrue) {

      playerOneSelection(board, positionOnBoardForPlayerOne);
      checkIfWin(playerOnePositions); // check if player One or Player two Wins and if true breaks the loop

      System.out.println("Player 2 select your position : ");
      int positionOnBoardForPlayerTwo = in.nextInt();

      playerTwoSelection(board, positionOnBoardForPlayerTwo);
      checkIfWin(playerTwoPositions); // check if player One or Player two Wins and if true breaks the loop

      System.out.println("Player 1, select your position from : ");
      positionOnBoardForPlayerOne = in.nextInt();

    }

  }

}
