import java.util.Scanner;

public class ComparingNumbers {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print("Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print("Second: ");
    second = keyboard.nextDouble();

    if(first < second)
      System.out.println(first + " is LESS THAN " + second);
    if(first <= second)
      System.out.println(first + " is LESS THAN/EQUAL TO " + second);
    if(first == second)
      System.out.println(first + " is EQUAL TO " + second);
    if(first >= second)
      System.out.println(first + " is GREATER THAN/EQUAL TO " + second);
    if(first > second)
      System.out.println(first + " is GREATER THAN " + second);
    if(first != second) {
      System.out.println(first + " is NOT EQUAL TO " + second);
      System.out.println("Hey.");
    }
  }
}
// 1. Hey runs no matter what since it is not included within the if statement
// since there are no brackets enclosing it.
// 2. Since all other if statements are one line they do not require the bracket
