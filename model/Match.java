package model;

import java.time.LocalDateTime;

import model.Player;
import model.Game;

/**
* Domain Model Class for Match
*
**/
public class Match {
    private LocalDateTime date;
    private Player player1;
    private Player player2;
    private Game game;
    private int scorePlayer1;
    private int scorePlayer2;
    private int id;

    public Match(Player _player1,Player _player2,Game _game, int _id){
        this.id = _id;
        this.player1 = _player1;
        this.player2 = _player2;
        this.game = _game;
    }

    public Player getPlayer1(){
        return this.player1;    
    }

    public Player getPlayer2(){
        return this.player2;    
    }
    
    public Game getGame(){
        return this.game;    
    }

    public void setScorePlayer1(int _score){
        this.scorePlayer1 = _score;    
    }

    public int getScorePlayer1(){
        return this.scorePlayer1;    
    }

    public void setScorePlayer2(int _score){
        this.scorePlayer2 = _score;    
    }

    public int getScorePlayer2(){
        return this.scorePlayer2;    
    }
    
     public void setId(int _id){
        this.id = _id;    
    }

    public int getId(){
        return this.id;    
    }
    
    public String dbgMeAsStr(){
        return
            (this.player1==null ? "null" : this.player1.dbgMeAsStr()) + (this.player2==null ? "null" : this.player2.dbgMeAsStr()) + (this.game==null ? "null" : this.game.dbgMeAsStr()) + " scorePlayer1 " + this.scorePlayer1 + " scorePlayer2 " + this.scorePlayer2 + " id " + this.id; // call parent function
    } 
    
     public void dbgMe(){
        System.out.println(this.dbgMeAsStr());
    } 
}    