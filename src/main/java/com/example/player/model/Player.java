/*
 * You can use the following import statements
 * import javax.persistence.*;
 * 
 */

// Write your code here

package com.example.player.model;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="team")

public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="playerid")
    private int playerId;
    @Column(name="playername")
    private String playerName;
    @Column(name="jerseynumber")
    private int jerseyNumber;
    @Column(name="role")
    private String role;


    public Player(){}

    public Player(int playerId, String playerName, int jerseyNumber, String role){
        this.playerId=playerId;
        this.playerName=playerName;
        this.jerseyNumber=jerseyNumber;
        this.role=role;
    }


    public int getPlayerId(){
        return playerId;
    }
    public void setPlayerId(int playerId){
        this.playerId=playerId;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }

    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber=jerseyNumber;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role=role;
    }
}