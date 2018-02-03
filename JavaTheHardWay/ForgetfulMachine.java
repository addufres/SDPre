import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city is the capital of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();

    System.out.println("Enter a number between 0.0 and 1.0.");
    keyboard.nextDouble();

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();
  }
}
// The second question blows the program up when I answer with anything other
// than an INT

// The third question blew up when I inputed a string. I am still unclear on how
// to differentiate between a double and int.
