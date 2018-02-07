public class ThereAndBackAgain {
  public static void main(String[] args) {
    System.out.println("Here.");
    erebor();
    System.out.println("Back first time.");
    //erebor();
    System.out.println("Back second time.");
  }

  public static void erebor() {
    System.out.println("There.");
  }
}
// Study drill 1. When the parentheses are removed from the function call
// the compiler throws error: not a statement
// it is referring to erebor; without the parentheses

// Study drill 2. I guessed that the output would be Here. There.
// Back first time. Back second time. I was correct.
