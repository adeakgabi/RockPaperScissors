import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Shape {
  ROCK("SCISSORS", "Rock breaks scissors"),
  PAPER("ROCK", "Paper covers rock"),
  SCISSORS("PAPER",  "Scissors cut paper");

  public static final List<Shape> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  public static final Random RANDOM = new Random();

  public final String winsAgainst;
  public final String message;

  Shape(String winsAgainst, String message) {
    this.winsAgainst = winsAgainst;
    this.message = message;
  }

  public static Shape randomShape()  {
    return VALUES.get(RANDOM.nextInt(VALUES.size()));
  }
}
