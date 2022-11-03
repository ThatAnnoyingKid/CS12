/*
Name: Aiden Russo
date: 9/25/22
In this assignment we are practicing for loops, class constant, and variable’s scope
self grade: I think I deserve a 100% becuase I followed the requirements
*/

public class GallonConversionRusso {

  private static double MULTIPLIER = 3.78; // This is the gallon multpler
  private static int CONSOLE_WIDTH = 80; // This is the width of the console

  public static void main(String[] args) {
    description();
    conversion();
  }

  /*description prints out the console line by line*/
  public static void description() {
    String[] inputs = {"This program converts gallons to liters", "1 Gallon is about 3.78 liters"};
    for (int i = 0; i < 5; i++)
      System.out.println(
          "&"
              + centerString(
                  i == 1 || i == 2 ? inputs[i - 1] : "",
                  CONSOLE_WIDTH - 2,
                  i == 0 || i == 4 ? '&' : ' ')
              + "&");
  }

  // This method centers the description in the console
  public static String centerString(String input, int width, char fillChar) {
    return ("" + fillChar).repeat((width - input.length()) / 2)
        + input
        + ("" + fillChar).repeat((width - input.length()) / 2)
        + ((width - input.length()) % 2 == 1 ? "" + fillChar : "");
  }

  /*conversion does the conversions for us*/
  public static void conversion() {
    System.out.println(centerString("Gallons    " + rightPad("Liters", 18), CONSOLE_WIDTH, ' '));
    for (int i = 1; i < 100; i += 4) {
      double liters;
      liters = MULTIPLIER * i;
      System.out.println(
          centerString(
              rightPad("" + i, 7) + "    " + rightPad("" + liters, 18),
              CONSOLE_WIDTH,
              ' ')); // This works by multpling the gallons by the constant multpler
    }
  }

  /*It adds spaces to the strings to help allign them, its like a tool for centerString*/
  public static String rightPad(String input, int width) {
    return input
        + (input.length() < width
            ? " ".repeat(width - input.length())
            : ""); // may i have forgiveness
  }
}
