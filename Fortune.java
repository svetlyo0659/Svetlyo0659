import java.util.Random;

public class Fortune
{
  public static final String[] fortunes = {
      "Love",
      "Luck",
      "Money",
      "Bad luck"
  };

  public static String returnRandomString()
  {
    Random random = new Random();
    String randomString = fortunes[random.nextInt(fortunes.length)];
    return randomString;
  }

  public static void main(String[] args)
  {

    for (int i = 0; i < 10; i++) {
      System.out.println(returnRandomString());
    }

  }

}
