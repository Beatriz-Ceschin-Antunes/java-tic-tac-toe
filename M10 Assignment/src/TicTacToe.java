import Views.Board;
import wheelsFX.users.Frame.Frame;
import Controllers.TicTacToeController;

/**
 * TicTacToe.java
 * Main to start the game and display board.
 *
 * @author Beatriz Ceschin Antunes
 * @version 1.0, Nov 3 2024
 * @see wheelsFX.users.Frame.Frame,Controllers.TicTacToeController,Views.Board
 */
public class TicTacToe {
    // creates a new board and a new controller to begin a game
    public static void main(String[] args) {
        Board b = new Board();
        TicTacToeController tc = new TicTacToeController(b);

        // welcomes player to game
        System.out.println("Hello! Welcome to this game of Tic-Tac-Toe!");
        System.out.println("The first player to get three of their tokens in a horizontal, vertical or diagonal row, wins!");
        System.out.println("Player 1 will be X and Player 2 will be O.");

        // initiates game
        tc.play();

        // creates frame for game visuals
        Frame.createFrame();
    }
}
