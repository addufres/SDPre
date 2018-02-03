import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    Double a, b, sum;
    Scanner input = new Scanner(System.in);

    System.out.println("Please pick a number:");
    a = input.nextDouble();
    System.out.println("Please pick another number:");
    b = input.nextDouble();
    sum = a + b;
    System.out.println("The sum of " + a + " + " + b + " = " + sum);

    input.close();
  }
}
