package db;

import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Game;

/**
 * DbMockup Db MockUp simulate Database Operations
 * 
**/
public class DbMockup{
    public List<Player> getPlayers(String prefix){
        List list = new ArrayList<Player>();
        list.add(new Player("Nicolas", 1));
        list.add(new Player("Robert", 2));
        list.add(new Player("Frank", 3));
        list.add(new Player("John", 4));
        return list;
    };

    public List<Player> getTopPlayers(){
        List list = new ArrayList<Player>();
        list.add(new Player("Mon", 10));
        list.add(new Player("Julia", 24));
        list.add(new Player("Eva", 33));
        list.add(new Player("John", 44));
        return list;
    };

    public List<Game> getGames(){
        List list = new ArrayList<Game>();
        list.add(new Game("Tic Tac Toe", 1));
        list.add(new Game("Checkers", 2));
        return list;
    };

}