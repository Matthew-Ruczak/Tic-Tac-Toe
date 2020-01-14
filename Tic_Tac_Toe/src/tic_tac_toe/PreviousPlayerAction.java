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
    
    
    //Constructor
    public PreviousPlayerAction(int playersTurn, int[][] currentGrid){
        this.playersTurn = playersTurn;
        gridLayout = currentGrid;
    }
    
    //Getters
    public int getPlayersTurn(){ return playersTurn; }  //Returns the players turn
    public int[][] getGridLayout(){ return gridLayout; }  //Returns the tic tac grid after the users action
    
}
