import java.util.Scanner;

public class PasswordChecker {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    String password;

    do{
      System.out.print("Enter the password: ");
      password = scanner.nextline();
    } while (!password.equals("secret123"));

    System.out.println("Access granted."0;
    scanner.close();
  }
  }
