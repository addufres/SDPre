public class EscapeSequencesComments {
  public static void main(String[] args) {
    // This exercise demonstrates escape sequences & comments (like these)!
    System.out.print("Learn\tJava\n\tthe\nHard\tWay\n\n");
    System.out.print("\tLearn Java the \"Hard\" Way!\n");
    // System.out.frimp("Larn Java the Hard Way");
    System.out.print("Hello\n");
    System.out.print("Jello\by\n");
    /* The quick brown fox jumped over a lazy dog.
       Quick wafting zephyrs vex bold Jim. */
    System.out /* testing */ .println("Hard to believe, eh?");
    System.out.println("Surprised? /* abcde */ Or what did you expect?");
    System.out.println("\\// -=- \\//");
    System.out.println("\\\\ \\\\\\ \\\\\\\\"); // it takes 2 to make 1
    System.out.print("I hope you understand \"escape sequences\" now.\n");
    // and comments. :)
  }
}
// A block comment in the middle of println on line 13
// causes the code to not compile
