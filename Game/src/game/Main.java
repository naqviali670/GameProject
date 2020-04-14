/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author WALEED TRADERS
 */
public class Main {
    static ArrayList<Player> players = new ArrayList<Player>();
    static ArrayList<Game> games = new ArrayList<Game>();
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int choice=-1;
        while(choice==-1)
        {
            System.out.println("Enter 1 to Play:");
            System.out.println("Enter 2 to exit:");
            switch(s.nextInt())
            {
                case 1:
                    boolean player1=false,player2=false;
            
            int turn = 1,row,col,turn1=0,turn2=0;
            
            Board b=new Board('-');
            System.out.println("Enter first player's name: ");
            Player p1=new Player(s.next(), 'X');
            System.out.println("Enter second player's name: ");
            Player p2=new Player(s.next(),'O');
            Game g = new Game(p1,p2);
            games.add(g);
            System.out.println("******GAME STARTED******");
            while(b.isEmpty()==true){
                
            b.displayBoard();
            if(turn == 1)
            {
                System.out.println("***"+p1.getName()+"'s turn***");
                System.out.println("Row: ");
                row = s.nextInt();
                System.out.println("Column: ");
                col = s.nextInt();
                if(b.isEmptyPosition(row, col)==true)
                {
                    b.fillBoard(p1.getAssignedname(), row, col);
                    turn1=turn1+1;
                    turn = 2;
                    
                }
                    
                else
                {
                    System.out.println("Place is already filled try again***");
                    turn = 1;
                }
                    
                
            }
            else if(turn==2)
            {
                System.out.println("***"+p2.getName()+"'s turn***");
                
                System.out.println("Row: ");
                row = s.nextInt();
                System.out.println("Column: ");
                col = s.nextInt();
                
                if(b.isEmptyPosition(row, col)==true)
                {
                    b.fillBoard(p2.getAssignedname(), row, col);
                    turn2++;
                    turn = 1;
                }
                    
                else
                {
                    System.out.println("Place is already filled try again***");
                    turn = 2;
                }
            
            }
            }
            p1.setTurns(turn1);
            p2.setTurns(turn2);
            for(Player p: players)
            {
                if(p.equals(p1))
                {
                    if(turn == 2)
                    {
                        p.setWins(1);
                    }
                    player1 = true;
                    
                }
                if(p.equals(p2))
                {
                    if(turn == 1)
                    {
                        p.setWins(1);
                    }
                    player2 = true;
                }
                
            }
            if(player1 == false)
            {
                if(turn == 2)
                    p1.setWins(1);
                players.add(p1);
            }
            if(player2 == false)
            {
                if(turn == 1)
                    p2.setWins(1);
                players.add(p2);
            }
            
            if(turn == 1)
            {
                g.setWinner(p2.getName());
                System.out.println("****"+ p2.getName()+" is the winner****");
            }
            else
            {
                System.out.println("****"+ p1.getName()+" is the winner****");
            }
            System.out.println("Player1:"+g.getPlayers().get(0).getName()+"    turns:"+g.getPlayers().get(0).getTurns());
            System.out.println("Player2:"+g.getPlayers().get(1).getName()+"    turns:"+g.getPlayers().get(1).getTurns());
            Collections.sort(players);
        
                    break;
                case 2:
                    System.out.println("Thanks for playing hope you enjoyed it!");
                    choice=0;
                    break;
            }
         }
       Collections.sort(players);
       System.out.println("***Top 5 Players***");
       int count=0;
       for(Player p: players)
       {
           if(count==5)
               break;
           System.out.println(p.getName());
           count++;
       }
    }
}
