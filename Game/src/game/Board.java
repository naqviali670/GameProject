/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author WALEED TRADERS
 */
public class Board {
    protected char [][] card = new char[6][6];
    public Board(char c){
        int i=0,j=0;
        for(i=0; i<6; i++)
        {
            for(j=0; j<6; j++)
            {
                card[i][j]=c;
            }
        }
    }
    public boolean fillBoard(char c , int row , int col)
    {
        int r1,c1;
        if(row == 1 && col == 1)
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1+1] == '-')
                card[row-1][col-1+1] = c;
            if(card[row-1+1][col-1] == '-')
                card[row-1+1][col-1] = c;
        }
        else if(row == 1 && col == 6)
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1-1] == '-')
                card[row-1][col-1-1] = c;
            if(card[row-1+1][col-1] == '-')
                card[row-1+1][col-1] = c;
        }
        else if(row == 6 && col == 1)
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1+1] == '-')
                card[row-1][col-1+1] = c;
            if(card[row-1-1][col-1] == '-')
                card[row-1-1][col-1] = c;
        }
        else if(row == 6 && col == 6)
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1-1] == '-')
                card[row-1][col-1-1] = c;
            if(card[row-1-1][col-1] == '-')
                card[row-1-1][col-1] = c;
        }
        else if(row == 1)
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1-1] == '-')
                card[row-1][col-1-1] = c;
            if(card[row-1+1][col-1] == '-')
                card[row-1+1][col-1] = c;
            if(card[row-1][col-1+1] == '-')
                card[row-1][col-1+1] = c;
            
        }
        else if(row == 6)
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1-1] == '-')
                card[row-1][col-1-1] = c;
            if(card[row-1-1][col-1] == '-')
                card[row-1-1][col-1] = c;
            if(card[row-1][col-1+1] == '-')
                card[row-1][col-1+1] = c;
        }
        else if(col == 1)
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1+1] == '-')
                card[row-1][col-1+1] = c;
            if(card[row-1-1][col-1] == '-')
                card[row-1-1][col-1] = c;
            if(card[row-1+1][col-1] == '-')
                card[row-1+1][col-1] = c;
        }
        else if(col == 6)
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1-1] == '-')
                card[row-1][col-1-1] = c;
            if(card[row-1-1][col-1] == '-')
                card[row-1-1][col-1] = c;
            if(card[row-1+1][col-1] == '-')
                card[row-1+1][col-1] = c;
        }
        else
        {
            card[row-1][col-1] = c;
            if(card[row-1][col-1-1] == '-')
                card[row-1][col-1-1] = c;
            if(card[row-1-1][col-1] == '-')
                card[row-1-1][col-1] = c;
            if(card[row-1+1][col-1] == '-')
                card[row-1+1][col-1] = c;
            if(card[row-1][col-1+1] == '-')
                card[row-1][col-1+1] = c;
        }
                
        
        return true;
        
    }
    public void displayBoard()
    {
        int i=0,j=0;
        System.out.println("******GAME STARTED******");
        for(i=0; i<6; i++)
        {
            for(j=0; j<6; j++)
            {
                if(j<5)
                System.out.print(card[i][j]+" ");
                else
                    System.out.print(card[i][j]);
            }
            System.out.println();
        }
    }
    public boolean isEmpty()
    {
        int i=0, j=0;
        for(i=0; i<6; i++)
        {
            for(j=0; j<6; j++)
            {
                if(card[i][j]=='-')
                    return true;
                
            }
        }
        return false;
    }
    public boolean isEmptyPosition(int row ,  int col)
    {
        if(card[row-1][col-1] == '-')
            return true;
        else
            return false;
    }
}
