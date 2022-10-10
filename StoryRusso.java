/*
Name: Aiden Russo
Date: 10/9/22
program description: This program outputs a mad-lib style story
self grade: I think I deserve a 100% because I made the requirements
*/

import java.util.*;

public
class StoryRusso // We don't have the story class becuase it pervented us from calling main using
                 // the format provided.
 {
  /* the main method is given to you*/
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("How many stories are you making: ");
    int count = kb.nextInt();
    kb.nextLine();
    for (int i = 1; i <= count; i++) {
      System.out.println("Answer a few questions and I will make up a story for you\n");
      System.out.println(story(kb));
    }
  }

  public static String story(Scanner kb) {
    // We ask our questions and assign the variables here
    System.out.print("\n Enter an adjective: ");
    String adj = kb.next().toLowerCase(); // We use .toLowerCase for our string class
    System.out.print("\n Enter a type of bird: ");
    String bird = kb.next().toLowerCase();
    System.out.print("\n Enter a room: ");
    String room = kb.next().toLowerCase();
    System.out.print("\n Enter a verb: ");
    String verb = kb.next().toLowerCase();
    System.out.print("\n Enter a verb (past tense): ");
    String pastVerb = kb.next().toLowerCase();
    System.out.print("\n Enter a relative's name: ");
    String relv = kb.next().toLowerCase();
    System.out.print("\n Enter a noun: ");
    String noun = kb.next().toLowerCase();
    System.out.print("\n Enter a liquid: ");
    String liquid = kb.next().toLowerCase();
    System.out.print("\n Enter a verb (ending in a -ing): ");
    String verbing = kb.next().toLowerCase();
    System.out.print("\n Enter a part of the body (plural): ");
    String body = kb.next().toLowerCase();
    System.out.print("\n Enter a noun (plural): ");
    String nouns = kb.next().toLowerCase();
    System.out.print("\n Enter a number: ");
    double num = Math.ceil(kb.nextDouble()); // We use Math.ceil for our math class
    // We make and display our story here
    return "\n\nIt was a "
        + adj
        + ", cold November day. I woke up to the "
        + adj
        + " smell of "
        + bird
        + " roasting in the "
        + room
        + " downstairs. I "
        + pastVerb
        + " down the stairs to see if I could help "
        + verb
        + " the dinner. My mom said, \"See if "
        + relv
        + " needs a fresh "
        + noun
        + ".\" So I carried a tray with "
        + num
        + " glasses of "
        + liquid
        + " into the "
        + verbing
        + " room. When I got there, I couldn't believe my "
        + body
        + "! There were "
        + nouns
        + ' '
        + verbing
        + " on the "
        + noun
        + '!';
  }
}
