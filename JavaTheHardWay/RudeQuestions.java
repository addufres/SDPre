import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, town;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year! ");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    System.out.print("By the way, I forgot to ask you...Where do you live now? ");
    town = keyboard.next();
    System.out.println(town + " eh? Not too shabby!");
  }
}
// It does not blow up if an integer is entered in. I think this is because all
// integers are doubles but not visaversa.

// It does not blow up when a numeric value is entered in to a string value
// because the numeric value is able to be stored as a string type.

// Quesiton 1 every answer was accepted because all characters can be packaged
// as a string.
// Question 2 I made the program blow up by inputting a double type number.
// Questions 3 and 4 I could only get the program to blow up by inputting
// a string instead of numerals.
