import java.util.Scanner;
import java.util.Calendar; // Using since the year will not stay the same.

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();
    currentYear = Calendar.getInstance().get(Calendar.YEAR);
    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
// This only works if your birthday has already happened. Otherwise it is one
// year less that my age.
