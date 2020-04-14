/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.Scanner;
/**
 *
 * @author WALEED TRADERS
 */
public class Player implements Comparable<Player> {

    private String name;
    private char Assignedname;
    private int wins;
    private int turns;
    Player(String name, char assignedName)
    {
        this.name=name;
        this.Assignedname=assignedName;
        System.out.println("Your assigned name is "+assignedName);
    }

    public String getName() {
        return name;
    }

    public char getAssignedname() {
        return Assignedname;
    }

    public void setWins(int wins) {
        this.wins = this.wins + wins;
    }

    public int getWins() {
        return wins;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public int getTurns() {
        return turns;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.Assignedname;
        hash = 53 * hash + this.wins;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        
        if (!this.getName().equals(other.getName())) {
            return false;
        }
        
        return true;
    }

    @Override
    public int compareTo(Player o) {
        return -1*(this.getWins()-o.getWins());
    }
    
    
    
}
