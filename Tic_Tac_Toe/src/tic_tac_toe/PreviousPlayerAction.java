/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toe;

/**
 *
 * @author Matthew
 */
public class PreviousPlayerAction {
    //Fields
    private int playersTurn;    //Holds which players turn it was
    private int[][] gridLayout;    //Holds a hard copy of the current ticTacToeAreaGrid when this PreviousPlayerAction Object was created
    private int numOfCompletedTurns;    //Hold the number of turns that have been completed so far
    
    
    //Constructor
    public PreviousPlayerAction(int playersTurn, int[][] currentGrid, int numOfCompletedTurns){
        this.playersTurn = playersTurn;
        gridLayout = currentGrid;
        this.numOfCompletedTurns = numOfCompletedTurns;
    }
    
    //Getters
    public int getPlayersTurn(){ return playersTurn; }  //Returns the players turn
    public int[][] getGridLayout(){ return gridLayout; }  //Returns the tic tac grid after the users action
    public int getNumOfCompletedTurns() { return numOfCompletedTurns; } //Returns the number of turns that have been completed so far
    
}
