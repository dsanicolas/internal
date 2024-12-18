import java.util.List;
import java.util.Iterator;

import view.HomeView;

import db.DbMockup;
import model.Player;
import model.Game;
import model.Match;

/* This where the program will be started*/
public class TwoPlayersGame{
    public static void main (String [ ] args) {
        
        /*HomeView hmVw = new HomeView(db);*/
        
        DbMockup db = new DbMockup();

        List<Player> plyrs = db.getPlayers("prefix");
        List<Game> gms = db.getGames();
        
        Iterator<Player> plyrsItr = plyrs.iterator();
        while(plyrsItr.hasNext()){
            Player plyr = plyrsItr.next();
            plyr.dbgMe();        
        }

        Iterator<Game> gmsItr = gms.iterator();
        while(gmsItr.hasNext()){
            Game gm = gmsItr.next();
            gm.dbgMe(); 
        }
        
        Match aMtch = new Match(new Player("Nicolas",1),new Player("John",2),new Game("Tic Tac Toe",1), 1);
        aMtch.dbgMe();
    }
    
}

