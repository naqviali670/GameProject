/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WALEED TRADERS
 */
public class Game {
    ArrayList<Player> players = new ArrayList<Player>();
    private String winner;
    public Game(Player p1, Player p2)
    {
        players.add(p1);
        players.add(p2);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return winner;
    }
}
