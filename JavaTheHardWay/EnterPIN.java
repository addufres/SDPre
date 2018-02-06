import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, pwEntry;

    pin = 12345;
    password = "opensesame";

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("PLEASE ENTER YOUR PASSWORD: ");
    pwEntry = keyboard.next();

    while(!pwEntry.equals(password)) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN");
      System.out.print("ENTER YOUR PASSWORD: ");
      pwEntry = keyboard.next();
    }

    System.out.print("THANK YOU.\nPLEASE ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while(entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
