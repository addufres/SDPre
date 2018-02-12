import java.util.Scanner;

public class ShapeArea {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int choice;
    double area = 0;

    System.out.print("Shape Area Calculator version 0.1");
    System.out.println(" (c) 2015 LJtHW Sample Output, Inc.");

    do {
      System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
      System.out.println("1) Triangle");
      System.out.println("2) Circle");
      System.out.println("3) Rectangle");
      System.out.println("4) Square");
      System.out.println("5) Quit");
      System.out.print("> ");
      choice = keyboard.nextInt();

      if(choice == 1) {
        System.out.print("\nBase: ");
        int b = keyboard.nextInt();
        System.out.print("Height: ");
        int h = keyboard.nextInt();
        area = computeTriangleArea(b, h);
        System.out.println("The area is "+area);
      }
      else if(choice == 2) {
        System.out.print("\nRadius: ");
        int r = keyboard.nextInt();
        area = computeCircleArea(r);
        System.out.println("The area is "+area);
      }
      else if(choice == 3) {
        System.out.print("\nLength: ");
        int l = keyboard.nextInt();
        System.out.print("Width: ");
        int w = keyboard.nextInt();
        area = computRectangleArea(l, w);
        System.out.println("The area is "+area);
      }
      else if(choice == 4) {
        System.out.print("\nSide: ");
        int s = keyboard.nextInt();
        area = computeSquareArea(s);
        System.out.println("The area is "+area);
      }
      else if(choice != 5) {
        System.out.println("ERROR.");
      }
    } while(choice != 5);

  }

  public static double computeTriangleArea(int b, int h) {
    double A;
    A = 0.5 * b * h;
    return A;
  }

  public static double computeCircleArea(int r) {
    double A;
    A = Math.PI * r * r;
    return A;
  }

  public static double computRectangleArea(int l, int w) {
    return(l*w);
  }

  public static double computeSquareArea(int s) {
    return(s*s);
  }
}
