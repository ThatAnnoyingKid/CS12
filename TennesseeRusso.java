/*
Aiden Russo
9/11/22
We are learning how to use methods to learn decomposition by having it output Tennessee twice
I believe that I deserve a 100%
*/

// We will be printing Tennessee
public class TennesseeRusso {
  /* This method looks at each char and then calls the correct method for it*/
  public static void main(String[] args) {
    String tennessee = "tennessee"; // GALAXY BRAIN 100% BRAIN POWER USED LETS GOOOOOO
    for (int i = 0; i < tennessee.length(); i++) {
      switch (tennessee.charAt(i)) {
        case 't':
          printDoubleT();
          break;
        case 'e':
          printDoubleE();
          break;
        case 'n':
          printDoubleN();
          break;
        case 's':
          printDoubleS();
          break;
      }
      System.out.println();
    }
  }

  /*I use a for loop to help reduce reduncies here, it will write the top lines and then loop for each middle line*/
  public static void printDoubleT() // should display two T side by side
      {
    for (int i = 0; i < 5; i++) {
      if (i == 0) {
        topLine();
      }
      tLine();
    }
  }

  /*I use a for loop to help, when it's even it will print the lines of E and odds are the "gap"*/
  public static void printDoubleE() // should display 2 E side by side
      {
    for (int i = 0; i < 5; i++) {
      if (i % 2 == 0) {
        eLine();
      } else {
        eGap();
      }
    }
  }

  /*Print out a single line of N Twice*/
  public static void printDoubleN() // should display 2 N side by side
      {
    for (int i = 0; i < 4; i++) {
      makeNLine(i);
      System.out.print("\t");
      makeNLine(i);
      System.out.println();
    }
  }

  /*Print out a single line of S twice*/
  public static void printDoubleS() // should display 2 s side by side
      {
    for (int i = 0; i < 9; i++) {
      makeSLine(i);
      System.out.print("      ");
      makeSLine(i);
      System.out.println();
    }
  }

  /* This method writes the top line for each T */
  public static void topLine() {
    System.out.println("TTTTTTTTTT\tTTTTTTTTTT");
  }

  /*This method writes the middle line for each T */
  public static void tLine() {
    System.out.println("    TT\t\t    TT");
  }

  /*This method will write the lines in E*/
  public static void eLine() {
    System.out.println("EEEEEEEEEEE\tEEEEEEEEEE");
  }

  /*This method will write the "gap" in E*/
  public static void eGap() {
    System.out.println("E\t\tE");
  }

  /*Generate the N line for the given line*/
  public static void makeNLine(int line) {
    System.out.print("N ");
    for (int i = 0; i < 3; i++) {
      if (i == line) {
        System.out.print("N ");
      } else {
        System.out.print("  ");
      }
    }
    System.out.print("N");
  }

  /*Generates the S line for the given line*/
  public static void makeSLine(int line) {
    boolean sec = line >= 5 && line < 8;
    line %= 4;
    if (sec) {
      line = 4 - line;
    }
    switch (line) {
      case 0:
        System.out.print(" SSSSSSSS ");
        break;
      case 1:
        System.out.print("S        S");
        break;
      case 2:
      case 3:
        if (!sec) {
          System.out.print("S         ");
        } else {
          System.out.print("         S");
        }
        break;
    }
  }
}
