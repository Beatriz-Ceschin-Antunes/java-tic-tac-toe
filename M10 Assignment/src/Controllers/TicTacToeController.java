package Controllers;
import Models.Token;
import Views.Board;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.animation.PauseTransition;
import javafx.util.Duration;


/**
 * TicTacToeController.java
 * Class acts as the controller for a game of Tic-Tac-Toe. Containing the logic for how the game is played.
 *
 * @author Beatriz Ceschin Antunes
 * @version 1.0, Nov 3 2024
 * @see Models.Token,Views.Board,javafx.event.EventHandler,javafx.scene.input.MouseEvent,javafx.animation.PauseTransition,javafx.util.Duration
 */
public class TicTacToeController {
    // Board (Views) and Token (Models) variables
    private Board ticTacToeBoard;
    private Token[][] board;

    // indicates player 1 or 2
    private int player;

    // indicate player's token, X for 1 and O for 2
    private Token token;
    private Token tokenX;
    private Token tokenO;

    /**
     * Constructor to initialize a game with new tokens and board.
     * @param ticTacToeBoard instance of Board used for the game
     */
    public TicTacToeController(Board ticTacToeBoard) {
        // set up the board
        this.ticTacToeBoard = ticTacToeBoard;
        this.board =  new Token[3][3];

        // set up the tokens
        this.tokenX = new Token(Token.X);
        this.tokenO = new Token(Token.O);

        token = tokenX; // X starts the game
        this.player = Token.X;
    }

    /**
     * Starts the game, asking for the first player's play.
     */
    public void play(){
        getPlay(this.player);
    }

    /**
     * Method to catch mouse click and display token corresponding to click.
     * @param currentPlayer 1 or 2 to indicate if first or second player
     */
    public void getPlay(int currentPlayer){
        // 1st square of first row is clicked, show token at 1,1
        ticTacToeBoard.spot1_1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 1, 1);
            }
        });
        // 2nd square of first row is clicked, show token at 1,2
        ticTacToeBoard.spot1_2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 1, 2);
            }
        });
        // 3rd square of first row is clicked, show token at 1,3
        ticTacToeBoard.spot1_3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 1, 3);
            }
        });
        // 1st square of second row is clicked, show token at 2,1
        ticTacToeBoard.spot2_1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 2, 1);
            }
        });
        // 2nd square of second row is clicked, show token at 2,2
        ticTacToeBoard.spot2_2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 2, 2);
            }
        });
        // 3rd square of second row is clicked, show token at 2,3
        ticTacToeBoard.spot2_3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 2, 3);
            }
        });
        // 1st square of third row is clicked, show token at 3,1
        ticTacToeBoard.spot3_1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 3, 1);
            }
        });
        // 2nd square of third row is clicked, show token at 3,2
        ticTacToeBoard.spot3_2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 3, 2);
            }
        });
        // 3rd square of third row is clicked, show token at 3,3
        ticTacToeBoard.spot3_3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ticTacToeBoard.showToken(currentPlayer, 3, 3);
            }
        });
    }

    /**
     * Method called from Board to save player's play in Token array
     * @param row number from 1-3 corresponding to row on game board
     * @param col number from 1-3 corresponding to column on game board
     */
    public void saveToken(int row, int col){
        // save play in array
        board[row-1][col-1] = token;

        // check if someone won the game, if so restart
        if (checkWin()) {
            resetGame();
        }

        // if no winner, change players and continue game
        if (player == Token.X){
            player = Token.O;
            token = tokenO;
        }
        else if (player == Token.O){
            player = Token.X;
            token = tokenX;
        }
        // continue game
        play();

        }

    /**
     * Checks if there are three tokens in same row, column and diagonal to determine win.
      * @return value true if there is a win, false otherwise
     */
    public boolean checkWin(){
        // checks horizontals and verticals
        // if there is a sequence of 3 in a row, equals win
        for (int i = 0; i< 3; i++) {
            if ((board[i][0] == token && board[i][1] == token && board[i][2] == token) ||
                    (board[0][i] == token && board[1][i] == token && board[2][i] == token)) {
                System.out.println("\n* Player " + player + " wins! *");
                return true;
            }
            }
            // checks diagonally
            // if there is a sequence of 3 in a row, equals win
            if ((board[0][0] == token && board[1][1] == token && board [2][2] == token) ||
                    (board[2][0] == token && board[1][1] == token && board[0][2] == token)) {
                System.out.println("\n* Player " + player + " wins! *");
                return true;
            }
            // no sequence found so no win
            else return false;
    }

    /**
     * Method called whenever there is a win. Clears board and restarts game.
     */
    public void resetGame() {

        // pauses to show winning board to player before restarting
        PauseTransition pause = new PauseTransition(Duration.seconds(3));

        // pause then reset board and game
        pause.setOnFinished(event -> {
            ticTacToeBoard.resetBoard();
            System.out.println("\nGame board has been reset for a new game!");
            // reset board
            this.board =  new Token[3][3];
            //reset players
            token = tokenX; // X starts the game
            this.player = Token.X;
            play();
        });

        // Start the pause
        pause.play();
    }

    }



