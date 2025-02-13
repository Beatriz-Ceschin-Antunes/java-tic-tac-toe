package Views;
import Controllers.TicTacToeController;
import wheelsFX.users.Shapes.*;
import javafx.scene.paint.Color;

/**
 * Board.java
 * Class that contains GUIs and its listeners for the tic-tac-toe game.
 *
 * @author Beatriz Ceschin Antunes
 * @version 1.0, Nov 3 2024
 * @see Controllers.TicTacToeController,wheelsFX.users.Shapes,javafx.scene.paint.Color
 */
public class Board {
    // instance of controller
    private TicTacToeController ticTacToeController;
    // elements used to create board visuals
    private Line leftX1_1, rightX1_1, leftX1_2, rightX1_2, leftX1_3, rightX1_3;
    private Line leftX2_1, rightX2_1, leftX2_2, rightX2_2, leftX2_3, rightX2_3;
    private Line leftX3_1, rightX3_1, leftX3_2, rightX3_2, leftX3_3, rightX3_3;
    private Ellipse o1_1, o1_2, o1_3;
    private Ellipse o2_1, o2_2, o2_3;
    private Ellipse o3_1, o3_2, o3_3;
    // spots in game board by row and col
    public Rectangle spot1_1, spot2_1, spot3_1, spot1_2, spot2_2, spot3_2, spot1_3, spot2_3, spot3_3;

    /**
     * Constructor to create a controller and draw game board.
     */
    public Board(){
        this.ticTacToeController = new TicTacToeController(this);
        drawBoard();
    }

    /**
     * Turns all game tokens transparent to restart GUI for a new game.
     */
    public void resetBoard(){
        // X tokens
        leftX1_1.setColor(Color.TRANSPARENT);
        rightX1_1.setColor(Color.TRANSPARENT);
        leftX1_2.setColor(Color.TRANSPARENT);
        rightX1_2.setColor(Color.TRANSPARENT);
        leftX1_3.setColor(Color.TRANSPARENT);
        rightX1_3.setColor(Color.TRANSPARENT);
        leftX2_1.setColor(Color.TRANSPARENT);
        rightX2_1.setColor(Color.TRANSPARENT);
        leftX2_2.setColor(Color.TRANSPARENT);
        rightX2_2.setColor(Color.TRANSPARENT);
        leftX2_3.setColor(Color.TRANSPARENT);
        rightX2_3.setColor(Color.TRANSPARENT);
        leftX3_1.setColor(Color.TRANSPARENT);
        rightX3_1.setColor(Color.TRANSPARENT);
        leftX3_2.setColor(Color.TRANSPARENT);
        rightX3_2.setColor(Color.TRANSPARENT);
        leftX3_3.setColor(Color.TRANSPARENT);
        rightX3_3.setColor(Color.TRANSPARENT);
        // O tokens
        o1_1.setOutlineColor(Color.TRANSPARENT);
        o1_2.setOutlineColor(Color.TRANSPARENT);
        o1_3.setOutlineColor(Color.TRANSPARENT);
        o2_1.setOutlineColor(Color.TRANSPARENT);
        o2_2.setOutlineColor(Color.TRANSPARENT);
        o2_3.setOutlineColor(Color.TRANSPARENT);
        o3_1.setOutlineColor(Color.TRANSPARENT);
        o3_2.setOutlineColor(Color.TRANSPARENT);
        o3_3.setOutlineColor(Color.TRANSPARENT);
    }

    /**
     * Method called by the controller to show tokens based on player's play.
     * @param player 1 or 2 to indicate 1st or 2nd player
     * @param row number from 1-3 corresponding to row on game board
     * @param column number from 1-3 corresponding to column on game board
     */
    public void showToken(int player, int row, int column){
        // if first player is playing, draw Xs
        if (player == 1){
            showXToken(row, column);
        }
        // if second player is playing, draw Os
        else if (player == 2){
        showOToken(row, column);}
    }

    /**
     * Method called to draw O tokens on the board.
     * @param row number from 1-3 corresponding to row on game board
     * @param column number from 1-3 corresponding to column on game board
     */
    private void showOToken(int row, int column){
        // if player chose spot 1,1 make O visible in that spot, call controller back to save play
        if (row == 1 && column == 1){
            o1_1.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(1, 1);
        }
        // if player chose spot 1,2 make O visible in that spot, call controller back to save play
        else if (row == 1 && column == 2){
            o1_2.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(1, 2);
        }
        // if player chose spot 1,3 make O visible in that spot, call controller back to save play
        else if (row == 1 && column == 3){
            o1_3.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(1, 3);
        }
        // if player chose spot 2,1 make O visible in that spot, call controller back to save play
        else if (row == 2 && column == 1){
            o2_1.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(2, 1);
        }
        // if player chose spot 2,2 make O visible in that spot, call controller back to save play
        else if (row == 2 && column == 2){
            o2_2.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(2, 2);
        }
        // if player chose spot 2,3 make O visible in that spot, call controller back to save play
        else if (row == 2 && column == 3){
            o2_3.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(2, 3);
        }
        // if player chose spot 3,1 make O visible in that spot, call controller back to save play
        else if (row == 3 && column == 1){
            o3_1.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(3, 1);
        }
        // if player chose spot 3,2 make O visible in that spot, call controller back to save play
        else if (row == 3 && column == 2){
            o3_2.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(3, 2);
        }
        // if player chose spot 3,3 make O visible in that spot, call controller back to save play
        else if (row == 3 && column == 3){
            o3_3.setOutlineColor(Color.BLUE);
            ticTacToeController.saveToken(3, 3);
        }
    }

    /**
     * Method called to draw X tokens on the board.
     * @param row number from 1-3 corresponding to row on game board
     * @param column number from 1-3 corresponding to column on game board
     */
    private void showXToken(int row, int column){
        // if player chose spot 1,1 make X visible in that spot, call controller back to save play
        if (row == 1 && column == 1){
            leftX1_1.setColor(Color.RED);
            rightX1_1.setColor(Color.RED);
            ticTacToeController.saveToken(1,1);
        }
        // if player chose spot 1,2 make X visible in that spot, call controller back to save play
        else if (row == 1 && column == 2){
            leftX1_2.setColor(Color.RED);
            rightX1_2.setColor(Color.RED);
            ticTacToeController.saveToken(1, 2);
        }
        // if player chose spot 1,3 make X visible in that spot, call controller back to save play
        else if (row == 1 && column == 3){
            leftX1_3.setColor(Color.RED);
            rightX1_3.setColor(Color.RED);
            ticTacToeController.saveToken(1, 3);
        }
        // if player chose spot 2,1 make X visible in that spot, call controller back to save play
        else if (row == 2 && column == 1){
            leftX2_1.setColor(Color.RED);
            rightX2_1.setColor(Color.RED);
            ticTacToeController.saveToken(2, 1);
        }
        // if player chose spot 2,2 make X visible in that spot, call controller back to save play
        else if (row == 2 && column == 2){
            leftX2_2.setColor(Color.RED);
            rightX2_2.setColor(Color.RED);
            ticTacToeController.saveToken(2, 2);
        }
        // if player chose spot 2,3 make X visible in that spot, call controller back to save play
        else if (row == 2 && column == 3){
            leftX2_3.setColor(Color.RED);
            rightX2_3.setColor(Color.RED);
            ticTacToeController.saveToken(2, 3);
        }
        // if player chose spot 3,1 make X visible in that spot, call controller back to save play
        else if (row == 3 && column == 1){
            leftX3_1.setColor(Color.RED);
            rightX3_1.setColor(Color.RED);
            ticTacToeController.saveToken(3, 1);
        }
        // if player chose spot 3,2 make X visible in that spot, call controller back to save play
        else if (row == 3 && column == 2){
            leftX3_2.setColor(Color.RED);
            rightX3_2.setColor(Color.RED);
            ticTacToeController.saveToken(3, 2);
        }
        // if player chose spot 3,3 make X visible in that spot, call controller back to save play
        else if (row == 3 && column == 3){
            leftX3_3.setColor(Color.RED);
            rightX3_3.setColor(Color.RED);
            ticTacToeController.saveToken(3, 3);
        }
    }

    // ****************** drawing first row of transparent Os ******************

    /**
     * Draws a transparent O at 1,1
     */
    private void drawO_1_1(){
        o1_1 = new Ellipse(307, 145);

        o1_1.setColor(Color.TRANSPARENT);
        o1_1.setSize(42,42);
        o1_1.setOutlineThickness(5);
    }

    /**
     * Draws a transparent O at 1,2
     */
    private void drawO_1_2(){
        o1_2 = new Ellipse(402, 145);

        o1_2.setColor(Color.TRANSPARENT);
        o1_2.setSize(42,42);
        o1_2.setOutlineThickness(5);
    }

    /**
     * Draws a transparent O at 1,3
     */
    private void drawO_1_3(){
        o1_3 = new Ellipse(497, 145);

        o1_3.setColor(Color.TRANSPARENT);
        o1_3.setSize(42,42);
        o1_3.setOutlineThickness(5);
    }

    // ****************** drawing second row of transparent Os ******************
    /**
     * Draws a transparent O at 2,1
     */
    private void drawO_2_1(){
        o2_1 = new Ellipse(307, 245);

        o2_1.setColor(Color.TRANSPARENT);
        o2_1.setSize(42,42);
        o2_1.setOutlineThickness(5);
    }

    /**
     * Draws a transparent O at 2,2
     */
    private void drawO_2_2(){
        o2_2 = new Ellipse(402, 245);

        o2_2.setColor(Color.TRANSPARENT);
        o2_2.setSize(42,42);
        o2_2.setOutlineThickness(5);
    }

    /**
     * Draws a transparent O at 2,3
     */
    private void drawO_2_3(){
        o2_3 = new Ellipse(497, 245);

        o2_3.setColor(Color.TRANSPARENT);
        o2_3.setSize(42,42);
        o2_3.setOutlineThickness(5);
    }

    // ****************** drawing third row of transparent Os ******************
    /**
     * Draws a transparent O at 3,1
     */
    private void drawO_3_1(){
        o3_1 = new Ellipse(307, 345);

        o3_1.setColor(Color.TRANSPARENT);
        o3_1.setSize(42,42);
        o3_1.setOutlineThickness(5);
    }

    /**
     * Draws a transparent O at 3,2
     */
    private void drawO_3_2(){
        o3_2 = new Ellipse(402, 345);

        o3_2.setColor(Color.TRANSPARENT);
        o3_2.setSize(42,42);
        o3_2.setOutlineThickness(5);
    }

    /**
     * Draws a transparent O at 3,3
     */
    private void drawO_3_3(){
        o3_3 = new Ellipse(497, 345);

        o3_3.setColor(Color.TRANSPARENT);
        o3_3.setSize(42,42);
        o3_3.setOutlineThickness(5);
    }

    // ****************** drawing first row of transparent Xs ******************
    /**
     * Draws a transparent X at 1,1
     */
    private void drawX_1_1(){
        leftX1_1 = new Line(265, 100, 345, 180);
        rightX1_1 = new Line(265, 180, 345, 100);
        leftX1_1.setColor(Color.TRANSPARENT);
        rightX1_1.setColor(Color.TRANSPARENT);
        leftX1_1.setThickness(3);
        rightX1_1.setThickness(3);
    }

    /**
     * Draws a transparent X at 1,2
     */
    private void drawX_1_2(){
        leftX1_2 = new Line(360, 100, 440, 180);
        rightX1_2 = new Line(360, 180, 440, 100);
        leftX1_2.setColor(Color.TRANSPARENT);
        rightX1_2.setColor(Color.TRANSPARENT);
        leftX1_2.setThickness(3);
        rightX1_2.setThickness(3);
    }

    /**
     * Draws a transparent X at 1,3
     */
    private void drawX_1_3(){
        leftX1_3 = new Line(455, 100, 535, 180);
        rightX1_3 = new Line(455, 180, 535, 100);
        leftX1_3.setColor(Color.TRANSPARENT);
        rightX1_3.setColor(Color.TRANSPARENT);
        leftX1_3.setThickness(3);
        rightX1_3.setThickness(3);
    }

    // ****************** drawing second row of transparent Xs ******************
    /**
     * Draws a transparent X at 2,1
     */
    private void drawX_2_1(){
        leftX2_1 = new Line(265, 200, 345, 280);
        rightX2_1 = new Line(265, 280, 345, 200);
        leftX2_1.setColor(Color.TRANSPARENT);
        rightX2_1.setColor(Color.TRANSPARENT);
        leftX2_1.setThickness(3);
        rightX2_1.setThickness(3);
    }

    /**
     * Draws a transparent X at 2,2
     */
    private void drawX_2_2(){
        leftX2_2 = new Line(360, 200, 440, 280);
        rightX2_2 = new Line(360, 280, 440, 200);
        leftX2_2.setColor(Color.TRANSPARENT);
        rightX2_2.setColor(Color.TRANSPARENT);
        leftX2_2.setThickness(3);
        rightX2_2.setThickness(3);
    }

    /**
     * Draws a transparent X at 2,3
     */
    private void drawX_2_3(){
        leftX2_3 = new Line(455, 200, 535, 280);
        rightX2_3 = new Line(455, 280, 535, 200);
        leftX2_3.setColor(Color.TRANSPARENT);
        rightX2_3.setColor(Color.TRANSPARENT);
        leftX2_3.setThickness(3);
        rightX2_3.setThickness(3);
    }

    // ****************** drawing third row of transparent Xs ******************
    /**
     * Draws a transparent X at 3,1
     */
    private void drawX_3_1(){
        leftX3_1 = new Line(265, 300, 345, 380);
        rightX3_1 = new Line(265, 380, 345, 300);
        leftX3_1.setColor(Color.TRANSPARENT);
        rightX3_1.setColor(Color.TRANSPARENT);
        leftX3_1.setThickness(3);
        rightX3_1.setThickness(3);
    }

    /**
     * Draws a transparent X at 3,2
     */
    private void drawX_3_2(){
        leftX3_2 = new Line(360, 300, 440, 380);
        rightX3_2 = new Line(360, 380, 440, 300);
        leftX3_2.setColor(Color.TRANSPARENT);
        rightX3_2.setColor(Color.TRANSPARENT);
        leftX3_2.setThickness(3);
        rightX3_2.setThickness(3);
    }

    /**
     * Draws a transparent X at 3,3
     */
    private void drawX_3_3(){
        leftX3_3 = new Line(455, 300, 535, 380);
        rightX3_3 = new Line(455, 380, 535, 300);
        leftX3_3.setColor(Color.TRANSPARENT);
        rightX3_3.setColor(Color.TRANSPARENT);
        leftX3_3.setThickness(3);
        rightX3_3.setThickness(3);
    }

    // ****************** drawing empty game board ******************

    /**
     * Draws lines and transparent rectangles to create game board
     */
    private void drawBoard(){
        // lines to create tic-tac-toe board
        Line line1, line2, line3, line4;

        line1 = new Line(350,100,350,400);
        line2 = new Line(450,100,450,400);

        line1.setThickness(4);
        line2.setThickness(4);

        line3 = new Line(250,195,550,195);
        line4 = new Line(250,295,550,295);

        line3.setThickness(4);
        line4.setThickness(4);

        // first column to the left
        spot1_1 = new Rectangle(265, 100);
        spot2_1 = new Rectangle(265, 200);
        spot3_1 = new Rectangle(265, 300);

        // second (middle) columns
        spot1_2 = new Rectangle(360, 100);
        spot2_2 = new Rectangle(360, 200);
        spot3_2 = new Rectangle(360, 300);

        // third right-most column
        spot1_3 = new Rectangle(455, 100);
        spot2_3 = new Rectangle(455, 200);
        spot3_3 = new Rectangle(455, 300);

        // first column to the left
        spot1_1.setSize(80,90);
        spot1_1.setColor(Color.TRANSPARENT);

        spot2_1.setSize(80,90);
        spot2_1.setColor(Color.TRANSPARENT);

        spot3_1.setSize(80,90);
        spot3_1.setColor(Color.TRANSPARENT);

        // second (middle) columns
        spot1_2.setSize(80,90);
        spot1_2.setColor(Color.TRANSPARENT);

        spot2_2.setSize(80,90);
        spot2_2.setColor(Color.TRANSPARENT);

        spot3_2.setSize(80,90);
        spot3_2.setColor(Color.TRANSPARENT);

        // third right-most column
        spot1_3.setSize(80,90);
        spot1_3.setColor(Color.TRANSPARENT);

        spot2_3.setSize(80,90);
        spot2_3.setColor(Color.TRANSPARENT);

        spot3_3.setSize(80,90);
        spot3_3.setColor(Color.TRANSPARENT);

        // call methods to draw invisible tokens in those spots
        drawX_1_1();
        drawX_1_2();
        drawX_1_3();
        drawX_2_1();
        drawX_2_2();
        drawX_2_3();
        drawX_3_1();
        drawX_3_2();
        drawX_3_3();

        // call methods to draw invisible tokens in those spots
        drawO_1_1();
        drawO_1_2();
        drawO_1_3();
        drawO_2_1();
        drawO_2_2();
        drawO_2_3();
        drawO_3_1();
        drawO_3_2();
        drawO_3_3();
    }

}
