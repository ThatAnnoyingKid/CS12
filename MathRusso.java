import java.util.Scanner;

/*
name: Aiden Russo
date: 10/16/22
program description: In this program we make a simple calculator style system
self grade: I would give myself a 100% for this assignment because I completed all requirements
*/
public class MathRusso {
  private static int CONSOLE_WIDTH = 80;

  public static void main(String[] args) {
    start();
  }
  /* This must be the last method to implement
  After you have implemented all the methods*/
  public static void start() {
    Scanner kb = new Scanner(System.in);
    System.out.print("How many times do you want to use the software:  ");
    int count = kb.nextInt();
    for (int i = 1; i <= count; i++) {
      list();
      System.out.print("\nEnter the operation: ");
      String operation = kb.next();
      System.out.print("\nEnter a number between 0-9: ");
      int numA = kb.nextInt();
      System.out.print("\nEnter a number between 0-9: ");
      int numB = kb.nextInt();
      System.out.println(evaluate(numA, numB, operation));
      System.out.println(
          convertNumToWord(numA)
              + ' '
              + convertOpToWords(operation)
              + ' '
              + convertNumToWord(numB)
              + " is "
              + evaluate(numA, numB, operation));
    }
  }
  /*This method get the opration and returns the name of the operation in words. for example
  if the operation is * , it should return multiply.
  must use switch statement  */
  public static String convertOpToWords(String operator) {
    switch (operator) {
      case "+":
        return "plus";
      case "*":
        return "multiply";
      case "-":
        return "minus";
      case "/":
        return "divide";
      case "^":
        return "to the power of";
      case "%":
        return "mod";
    }

    return "";
  }

  /* This method gets a number 1-9 and returns it in  words.
  for example if the num is 1 it shuld return one
  must use if/else statements in this method
  */

  public static String convertNumToWord(int a) {
    if (a == 0) {
      return "zero";
    } else if (a == 1) {
      return "one";
    } else if (a == 2) {
      return "two";
    } else if (a == 3) {
      return "three";
    } else if (a == 4) {
      return "four";
    } else if (a == 5) {
      return "five";
    } else if (a == 6) {
      return "six";
    } else if (a == 7) {
      return "seven";
    } else if (a == 8) {
      return "eight";
    } else if (a == 9) {
      return "nine";
    }
    return "";
  }
  /*
  this method gets two numbers and the operation and returns the result of the expression.
  for example if this method gets 3, 2 and * , then the method should return 6
  Must use switch cases
  */
  public static int evaluate(int a, int b, String op) {
    switch (op) {
      case "+":
        return a + b;
      case "*":
        return a * b;
      case "-":
        return a - b;
      case "/":
        return a / b;
      case "^":
        return a ^ b;
      case "%":
        return a % b;
    }
    return 0;
  }
  /*This method list all the operations that the user can choose from.
  You must create your own menu and  not to use the menu that I provided in the sample output
  be creative and provide a user freindly menu.
  providing the exact same menu as the sample output, will not get credit
  */
  public static void list() {
    String[] inputs = {
      "To do addition enter +",
      "To do multiplication enter *",
      "To do subtraction enter -",
      "To do division enter /",
      "To do exponent enter ^",
      "To do modulus enter %"
    };
    for (int i = 0; i < inputs.length + 2; i++)
      System.out.println(
          "&"
              + centerString(
                  i > 0 && i < inputs.length + 1 ? inputs[i - 1] : "",
                  CONSOLE_WIDTH - 2,
                  i == 0 || i == inputs.length + 1 ? '&' : ' ')
              + "&"); // Technically 2 if-statements
  }

  // I use this method to center the terminal and make it pretty
  public static String centerString(String input, int width, char fillChar) {
    return ("" + fillChar).repeat((width - input.length()) / 2)
        + input
        + ("" + fillChar).repeat((width - input.length()) / 2)
        + ((width - input.length()) % 2 == 1 ? "" + fillChar : "");
  }
}
