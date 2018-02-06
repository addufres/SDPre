import java.util.Scanner;

public class PigDice {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int roll, ptot, ctot, ttot;
    String choice = "";

    ptot = 0;
    ctot = 0;
    //PLAYERS TURN Do While Loop continues until "hold" or 1 is rolled
    do {
      ttot = 0;
      System.out.println("You have "+ptot+" points.");

      do {
        roll = 1 + (int)(Math.random()*6);
        System.out.println("\tYou rolled a "+roll+".");
        if(roll == 1) {
          System.out.println("\tThat ends your turn.");
          ttot = 0;
        }
        else {
          ttot += roll;
          System.out.print("\tYou have "+ttot+" points");
          System.out.print(" so far this round. \n");
          System.out.print("\tWould you like to \"roll\" again");
          System.out.print(" or \"hold\"? ");
          choice = keyboard.next();
        }
      } while(roll != 1 && choice.equals("roll"));
      // adds ttot to current ptot
      ptot += ttot;
      System.out.println("\tYou end the round with "+ptot+" points.");
      //only give COMPUTER turn if ptot < 100
      if(ptot < 100) {
        ttot = 0;
        System.out.println("Computer has "+ctot+" points.");
        //COMPUTER TURN do while loop
        do {
          roll = 1+(int)(Math.random()*6);
          System.out.println("\tComuter rolled a "+roll+".");
          if(roll ==1) {
            System.out.println("\tThat ends its turn.");
            ttot = 0;
          }
          else {
            ttot += roll;
            System.out.print("\tComputer has "+ttot);
            System.out.print(" points so far this round.\n");
            if(ttot < 20) {
              System.out.println("\tComputer will roll again.");
            }
          }
        } while(roll != 1 && (ttot < 20 || 100-ctot+ttot <= ttot));
        //adds ttot to ctot
        ctot += ttot;
        System.out.print("\tComputer ends the round with ");
        System.out.print(ctot+" points.\n");
      }

    } while(ptot < 100 && ctot < 100);// continues game until ctot||ptot >= 100
    // Determine outcome
    if(ptot > ctot) {
      System.out.println("Humanity wins!");
    }
    else {
      System.out.println("The Computer wins.");
    }
  }
}
