import java.util.Scanner;

/**
 * Created by nagyza on 2017.03.22..
 */
public class Exercise_28 {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number! ");
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < (number - i - 1); j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (1 + (i * 2)); k++) {
        System.out.print("*");
      }
      System.out.println("");

    }
  }
}
