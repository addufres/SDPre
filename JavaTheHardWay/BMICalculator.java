import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, ft, totalIn, in, lbs, bmi;

    System.out.print("Your height (feet only): ");
    ft = keyboard.nextDouble();


    System.out.print("Your height (inches): ");
    in = keyboard.nextDouble();
    totalIn = ft*12 + in;
    m = totalIn*0.0254;

    System.out.print("Your weight in pounds: ");
    lbs = keyboard.nextDouble();
    kg = lbs*0.45359237;

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);
  }
}
