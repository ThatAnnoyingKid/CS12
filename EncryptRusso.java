/*
name:Aiden Russo
Date:10/23/22
*
*
*
* Description: This software will encrypt and decrypta ceaser cypher
* Self grade: This assignment has followed all requirements, so I bieleve it deserves an A
*
*/

// Desription for each method is given in the text document

import java.util.*;

class EncryptRusso {
  private static int CONSOLE_WIDTH = 80;

  public static void main(String[] args) {

    start();
    // your code
  }

  // *************************************************************************************
  public static void start() {
    Scanner kb = new Scanner(System.in);
    for (int i = 0; i < 20; i++) {
      menu();
      System.out.println("Enter your choice");
      String choice = kb.nextLine().toLowerCase();
      if (!(choice.equals("e") || choice.equals("d"))) {
        System.out.println("INVALID CHOICE");
        continue;
      }
      System.out.println("Enter your message without any digits");
      String message = kb.nextLine();
      System.out.println("Enter a key");
      int key = kb.nextInt();
      kb.nextLine();
      if (key < 0) {
        System.out.println("INVALID KEY, MUST BE POSITIVE");
        continue;
      }
      if (choice.equals("e")) {
        System.out.println(encryptMsg(message, key));
      } else if (choice.equals("d")) {
        System.out.println(decryptMsg(message, key));
      }
    }
  }

  // *************************************************************************
  /*
   * Returns a new string with the letters of the given string shifted
   * forward or backward by the amount equal to the given key.
   * For example, shift("hello", 3) returns "khoor".
   */
  public static String encryptMsg(String s, int key) {
    s = s.toUpperCase();
    String encryptedMsg = "";
    for (int i = 0; i < s.length(); i++) {
      char enChar = s.charAt(i);
      if (enChar == ' ') {
        enChar = '#';
      } else {
        if (enChar >= 'A' && enChar <= 'Z') { // Forbidden C tech to check chars
          enChar += key;
        }
        if (enChar > 'Z') {
          enChar = (char) ((int) enChar - 26);
        }
        if (enChar < 'A') {
          enChar = (char) ((int) enChar + 26);
        }
      }
      encryptedMsg += enChar;
    }
    return encryptedMsg;
  }
  // *********************************************************************

  /*
   * decrypts the encrypted string using the same key value.
   * For example, decrypt("khoor", 3) returns "hello".
   */

  public static String decryptMsg(String s, int key) {
    String decryptedMsg = "";
    for (int i = 0; i < s.length(); i++) {
      char deChar = s.charAt(i);
      if (deChar >= 'A' && deChar <= 'Z') {
        deChar -= key;
      }
      if (deChar < 'A'
          && deChar
              != '#') { // I added the pound check to so it can include spaces in the output because
        // a space is less then A
        int dif = 'A' - deChar;
        deChar = (char) ('Z' - dif + 1);
      } else if (deChar > 'Z') {
        int dif = 'Z' - deChar;
        deChar = (char) ('A' - dif + 1);
      }
      if (deChar == '#') {
        deChar = ' ';
      }
      decryptedMsg += deChar;
    }
    return decryptedMsg;
  }

  // **********************************************************************

  /*This method displays a menu for the user to choose the option.
  refer to the provided output to see the menu*/
  public static void menu() {
    String[] inputs = {
      "Enter \"e\" to encrypt your message", "Enter \"d\" to decrypt your message"
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
  // we use centerstring to well center our strings
  public static String centerString(String input, int width, char fillChar) {
    return ("" + fillChar).repeat((width - input.length()) / 2)
        + input
        + ("" + fillChar).repeat((width - input.length()) / 2)
        + ((width - input.length()) % 2 == 1 ? "" + fillChar : "");
  }
}
