import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Shape {
  ROCK("SCISSORS", "PAPER"),
  PAPER("ROCK", "SCISSORS"),
  SCISSORS("PAPER", "ROCK");

  public static final List<Shape> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  public static final int SIZE = VALUES.size();
  public static final Random RANDOM = new Random();

  public final String winsAgainst;
  public final String losesAgainst;

  Shape(String winsAgainst, String losesAgainst) {
    this.winsAgainst = winsAgainst;
    this.losesAgainst = losesAgainst;
  }

  public static Shape randomShape()  {
    return VALUES.get(RANDOM.nextInt(SIZE));
  }
}
