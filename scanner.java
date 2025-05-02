import java.util.Scanner;

public class UserInputExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

  System.out.print("Please enter your favourite colo: ");
    string favoriteColor = scanner.textLine();

  System.out.println("Your favorite color is " + favoritecolor + ".");
    scanner.close();
  }
}  
