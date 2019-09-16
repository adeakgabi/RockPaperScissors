import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Shape {
  ROCK("SCISSORS", "PAPER", "Rock breaks scissors"),
  PAPER("ROCK", "SCISSORS", "Paper covers rock"),
  SCISSORS("PAPER", "ROCK", "Scissors cut paper");

  public static final List<Shape> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  public static final int SIZE = VALUES.size();
  public static final Random RANDOM = new Random();

  public final String winsAgainst;
  public final String losesAgainst;
  public final String message;

  Shape(String winsAgainst, String losesAgainst, String message) {
    this.winsAgainst = winsAgainst;
    this.losesAgainst = losesAgainst;
    this.message = message;
  }

  public static Shape randomShape()  {
    return VALUES.get(RANDOM.nextInt(SIZE));
  }
}
