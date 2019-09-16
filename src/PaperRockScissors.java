import java.util.Scanner;

public class PaperRockScissors {
  private static boolean play = true;

  public static void main(String[] args) {

    Shape inputShape;
    Shape randomShape;  //ezt kivenni, ne legyen elmentve változóba

    while (play) {
      inputShape = askUserForInput();
      randomShape = Shape.randomShape();  //ez nem kell
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
      System.err.println( "Wrong input, please type one of the followings: Rock, Paper, or Scissors!" );
      return askUserForInput();
    }
  }

  public static String playRockPaperScissorsGame(Shape user, Shape computer) {
    if(user == computer) {
      return "It's a tie! Try again!";
    }
    if(user.winsAgainst.equalsIgnoreCase(computer.toString())) {
      return "Nice one, you won: " + user.message;
    } else {
      return "Sorry, you lost the game: " + computer.message + ". Try again!";
    }
  }
}
