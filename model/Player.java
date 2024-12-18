package model;

/**
* Domain Model Class for Player
*
**/
public class Player{
    private String nickName;
    private int score;
    private int id;

    public Player(String _nickName, int _id){
        this.id=_id;
        this.nickName = _nickName;
    } 

    public void setNickName(String _nickName){
        this.nickName = _nickName;    
    }

    public String getNickName(){
        return this.nickName;    
    }

    public void setScore(int score){
        this.score = score;    
    }

    public int getScore(){
        return score; 
    }

    public void setId(int _id){
        this.id = _id;    
    }

    public int getId(){
        return this.id;    
    }
    
    public String dbgMeAsStr(){
       return "Player:  name " + this.nickName + " score " +  this.score + " id " + this.id;
    }
    
    public void dbgMe(){
        System.out.println(this.dbgMeAsStr());
    } 
}