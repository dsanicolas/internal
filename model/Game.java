package model;

/**
* Domain Model Class for Game
*
**/
public class Game{
    private String name;
    private int id;

    //override constructor to make it private
    private Game(){
    } 

    //overload constructor
    public Game(String _name, int _id){
        this.id=_id;
        this.name = _name;
    } 

    public void setName(String _name){
        this.name = _name;    
    }

    public String getName(){
        return this.name;    
    }

    public void setId(int _id){
        this.id = _id;    
    }

    public int getId(){
        return this.id;    
    }
    
    public String dbgMeAsStr(){
        return "Game:  name " + this.name + " id " + this.id;
    }
    
    public void dbgMe(){
        System.out.println(this.dbgMeAsStr());
    } 
}