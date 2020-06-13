import java.util.Scanner;

public class Currency
{

  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the currency you want to sell:"); //user selects type of currency he/she wants to exchange.
    String currencyForSale = in.nextLine();

    System.out.println("Enter currency you want to buy:"); //user selects type of currency he/she wants to buy.
    String currencyToBuy = in.nextLine();

    System.out.println("Enter Amount:"); // user declares amount of currency he/she wants to sell.
    double amount = in.nextDouble();

    String symbol = " ";

    switch (currencyForSale) {

      case "USD":
        switch (currencyToBuy) {
          case "BGN":
            amount *= 1.77;
            symbol = ".лв";
            break;
          case "EURO":
            amount *= 0.91;
            symbol ="e" ;
            break;
          case "GBP":
            amount *= 0.78;
            symbol = "£";
            break;
        }
        break;

      case "EURO":
        switch (currencyToBuy) {
          case "BGN":
            amount *= 1.95;
            symbol =".лв";
            break;
          case "USD":
            amount *= 1.09;
            symbol = "$";
            break;
          case "GBP":
            amount *= 0.85;
            symbol = "£";
            break;
        }
        break;

      case "GBP":
        switch (currencyToBuy) {
          case "BGN":
            amount *= 1.95;
            symbol =".лв";
            break;
          case "USD":
            amount *= 1.29;
            symbol = "$";
            break;
          case "EURO":
            amount *= 1.18;
            symbol = "e";
            break;
        }
        break;

      case "BGN":
        switch (currencyToBuy) {
          case "GBP":
            amount *= 0.43;
            symbol = "£";
            break;
          case "USD":
            amount *= 0.56;
            symbol = "$";
            break;
          case "EURO":
            amount *= 0.51;
            symbol = "e";
            break;
        }
        break;

    }

    System.out.printf("%.2f", amount);// prints out on the console the amount of currency the user bought.
    System.out.println(" " + symbol);// prints out on the console the currency sigb on the same line.
  }

}
