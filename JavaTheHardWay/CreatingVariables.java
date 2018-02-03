public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, year;
    double seconds, e, checking, pi;
    String firstName, lastName, title, state, town;

    x = 10;
    y = 400;
    age = 27;
    year = 1990;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    pi = 3.14159265358979323846;

    firstName = "Andrew";
    lastName = "Dufresne";
    title = "Mr.";
    state = "Colorado";
    town = "Broomfield";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + " " + lastName);
    System.out.println("I was born in " + year + ", so I am " + age + " years old.");
    System.out.println("I live in " + town + ", " + state + ".");
    System.out.println("Here...have some pi\n" + pi);
  }
}
