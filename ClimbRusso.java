/*
Date: 9/6/2022
name: Aiden Russo
description: We made a simple mountain climbing game
self grade: I deserve a 100% because I met all the requirements

*/
import java.util.*;

public class ClimbRusso // <------ change this name to include your last name
 {
  private static int CONSOLE_WIDTH = 80;

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    Random rand = new Random();
    execute(rand, kb);
  }
  /*this method calls the other methods to run the program*/
  public static void execute(Random rand, Scanner kb) {
    boolean repeat = true;
    while (repeat) {
      description();
      int h = input(kb);
      int slpis = climb(h, rand);
      System.out.println("You slipped " + slpis + " times!");
      System.out.println("Do you want to play again?");
	  kb.nextLine();
      String play = kb.nextLine();
      if (play.equals("no")) {
        repeat = false;
      }
    }
    System.out.println("Good Bye");
  }

  /* this method asks the height of the mountain that a person will climb
  Data validation must be done to ensure that the highet is a positive integer
  while loop and do- while loop must be used
   */
  public static int input(Scanner kb) {

    int h = 0;
    do {
      System.out.print("What is the height of the mountain: ");
      while (!kb
          .hasNextInt()) // as lons as the user is not entering an integer it should keep prompting
                         // the user
      {
        kb.next();
      }
      h = kb.nextInt();

    } while (h < 0);
    return h;
  } // gets the height of the mountain and a Random object as its parameters

  public static int climb(int h, Random rand) {
    int distance = 0;
    int slip = 0;
    int steps = 0;
    do {
      int random = rand.nextInt(2);
      if (random == 1) {
        steps = rand.nextInt((30 - 20) + 1) + 20;
        if (h - distance < steps) {
		  steps = h - distance;
		}
		  distance += steps;
          System.out.println("You moved up " + steps + " steps!");
      }
	  else {
          int slp = rand.nextInt(5) + 1;
          slip += 1;
          if (distance != 0) {
            distance -= slp;
            System.out.println("You sliped down " + slp + " steps!");
          }
        }
    } while (distance < h);
    return slip;
  }
  /*Displays the information about the program such as the number of steps moving up, number of the steps
  slipping:
    */
  public static void description() {
    String[] inputs = {
      "In this game you are trying to climb a mountain!",
      "You will climb the mountain up 20-30 steps at a time",
      "but be careful because you can also slip a little",
      "please enter a positive integer for the height of the mountain"
    };
    for (int i = 0; i < inputs.length + 2; i++) {
      System.out.println(
          "&"
              + centerString(
                  i > 0 && i < inputs.length + 1 ? inputs[i - 1] : "",
                  CONSOLE_WIDTH - 2,
                  i == 0 || i == inputs.length + 1 ? '&' : ' ')
              + "&");
    }
  }

  public static String centerString(String input, int width, char fillChar) {
    return ("" + fillChar).repeat((width - input.length()) / 2)
        + input
        + ("" + fillChar).repeat((width - input.length()) / 2)
        + ((width - input.length()) % 2 == 1 ? "" + fillChar : "");
  }
}
