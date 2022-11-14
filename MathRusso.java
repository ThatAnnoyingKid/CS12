/*
Name: Aiden Russo
date: 11/13/22
description: This program makes a simple math quiz, but it only uses integers which make for some wierd answer checks with division
self grade: I would give a 100 becuase it hits all the requirements

Make sure to remove all the commnets provided by me. Then add your own commnets
*/

import java.util.*;

public class MathRusso {

  public static void main(String[] args) {
    System.out.println(
        "There are 5 questionsin this math quiz!\n"
            + "You will get points by answering them correctly!\n"
            + "Let's take the quiz and good luck!!!\n");
    prep();
  }
  // This method declares arrays to hold questions, answers and points for each question
  public static void prep() {
    String[] mathQuestions = new String[5];
    int[] answers = new int[5];
    int[] points = new int[5];
    Random random = new Random();
    Scanner kb = new Scanner(System.in);

    boolean repeat = true;
    while (repeat) {
      int max = random.nextInt((20 - 11) + 1) + 11;
      int min = random.nextInt((10 - 5) + 1) + 5;
      populate(mathQuestions, answers, points, max, min);
      int testReturn = test(mathQuestions, answers, points);

      System.out.println("Test Return: " + testReturn);

      System.out.println("Would you like to play again?");
      String rep = kb.nextLine();
      if (rep.equals("no")) {
        repeat = false;
      }
    }
    System.out.println("Goodbye");
  }
  // This methos genrates math expressions randomly and assigns points
  public static void populate(String[] quiz, int[] answer, int[] points, int max, int min) {
    char[] operation = {'*', '/', '+', '-'}; // valid operations
    Random random = new Random();
    for (int i = 0; i < quiz.length; i++) {
      int int1 = random.nextInt((max - min) + 1) + min;
      int int2 = random.nextInt((max - min) + 1) + min;
      int index = random.nextInt((3 - 1) + 1) + 1;

      char op = operation[index];

      String question = int1 + " " + op + " " + int2;
      quiz[i] = question;
      answer[i] = calculate(int1, op, int2);
      points[i] = random.nextInt((10 - 1) + 1) + 1;
    }
  }

  public static int calculate(int num1, char op, int num2) {
    switch (op) {
      case '*':
        return num1 * num2;
      case '/':
        return num1 / num2;
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      default:
        return -1;
    }
  }

  // This method ask the questions and grades them
  public static int test(String[] questions, int[] answers, int[] values) {
    int score = 0;
    Scanner kb = new Scanner(System.in);
    for (int i = 0; i < answers.length; i++) {
      System.out.println(questions[i]);
      int response = kb.nextInt();
      if (response == answers[i]) {
        score = score + values[i];
        System.out.println("You have scored " + values[i] + " points!");
      } else {
        System.out.println("Your answer is wrong :(");
      }
    }

    return score;
  }
}
