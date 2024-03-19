package com.example;

import java.util.Scanner;

/**
 * This program calculates the length of wood per one board.
 *
 * @author Christopher Di Bert
 * @version 1.0
 * @since 2024-03-18
 */

// BoardFoot class
public final class BoardFoot {

  /** Private constructor to prevent instantiation. */
  private BoardFoot() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    // Instantiate scanner and display welcome message.
    Scanner sc = new Scanner(System.in);
    System.out.print("This program finds the length of a wooden board\n");
    System.out.print("where the volume of one foot is 144in^3 of wood.");

    try {
      // Gets the height and width of the board from the user.
      System.out.print("\n\n\n\n\nEnter the height (in): ");
      double userHeight = sc.nextDouble();
      System.out.print("Enter the width (in): ");
      double userWidth = sc.nextDouble();

      // Calls length calculation method.
      double boardLength = calculateLen(userHeight, userWidth);

      // Checks if the user entered a negative dimension.
      if (boardLength < 0) {
        System.out.println("You must enter positive values!");
      } else {
        // Outputs the board length to the console.
        System.out.print("\nThe board length is ");
        System.out.println(boardLength + " inches.");
      }

      // Error message if invalid input was provided.
    } catch (Exception e) {
      System.out.println("You must enter a number!");
    }
  }

  /**
   * Method that calculates the length of a board per one board foot.
   *
   * @param height passed.
   * @param width passed.
   * @return boardLength.
   */
  private static double calculateLen(final double height, final double width) {
    // Declares the volume of one board length.
    final double boardVolume = 144f;

    // Calculates the board length.
    final double boardLength = boardVolume / (height * width);

    // Returns the board length.
    return boardLength;
  }
}
