import java.util.Scanner;

public class PaperRockScissors {

  public static void main(String[] args) {

    Shape inputShape = askUserForInput();
    Shape randomShape = Shape.randomShape();

    while (inputShape == null) {
      inputShape = askUserForInput();
    }

    System.out.println(playRockPaperScissorsGame(inputShape, randomShape));

    System.out.println("You: " + inputShape);
    System.out.println("The computer: " + randomShape);

  }

  public static Shape askUserForInput() {
    Scanner scanner = new Scanner(System.in);
    String userInput;

    System.out.println("Type one of the followings: Rock, Paper, or Scissors!");
    userInput = scanner.nextLine().toUpperCase();

    if(userInput.equals("EXIT")) {
      System.out.println("Thank you for the game!");
      System.exit(0);
    }

    try {
      return Shape.valueOf(userInput);
    } catch ( IllegalArgumentException e ) {
      System.err.println( "Wrong input, please type one of the followings: Rock, Paper, or Scissors!" );
      return null;
    }
  }

  public static String playRockPaperScissorsGame(Shape user, Shape computer) {
    if(user == computer) {
      return "It's a tie!";
    }
    if(user.losesAgainst.equals(computer.toString())) {
      return "Sorry, you lost the game, try again!";
    } else {
      return "Nice one! You won!";
    }
  }
}
