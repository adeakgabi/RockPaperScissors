import java.util.Scanner;

public class PaperRockScissors {
  private static boolean play = true;

  public static void main(String[] args) {
    while (play) {
      Shape inputShape = askUserForInput();
      Shape randomShape = Shape.randomShape();
      System.out.println(playRockPaperScissorsGame(inputShape, randomShape));
      System.out.println("Your answer: " + inputShape);
      System.out.println("The computer's answer: " + randomShape);
    }
  }

  public static Shape askUserForInput() {
    System.out.println("Type one of the followings: Rock, Paper, or Scissors! " +
            "If you would like to quit the game, type exit");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine().toUpperCase();

    if(userInput.equals("EXIT")) {
      System.out.println("Thank you for the game!");
      System.exit(0);
    }

    try {
      return Shape.valueOf(userInput);
    } catch ( IllegalArgumentException e ) {
      System.err.println( "Wrong input. Would you like to continue?" );
      return askUserForInput();
    }
  }

  public static String playRockPaperScissorsGame(Shape user, Shape computer) {
    if(user == computer) {
      return "It's a tie! Try again!";
    } else if(user.winsAgainst.equalsIgnoreCase(computer.toString())) {
      return "Nice one, you won: " + user.message;
    } else {
      return "Sorry, you lost the game: " + computer.message + ". Try again!";
    }
  }
}
