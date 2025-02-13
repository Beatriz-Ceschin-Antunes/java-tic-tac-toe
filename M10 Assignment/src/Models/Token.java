package Models;

/**
 * Token.java
 * Class to create representation of X and O game tokens.
 *
 * @author Beatriz Ceschin Antunes
 * @version 1.0, Nov 3 2024
 */
public class Token {

    // variables used for game tokens
    private int value;
    public static final int X = 1;
    public static final int O = 2;
    public static final int NULL = 0;

    // sets value for token
    public Token(int value) {
        this.value = value;
    }
}
