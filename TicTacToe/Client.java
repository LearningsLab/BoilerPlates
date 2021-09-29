import java.util.ArrayList;
//import 

//import Game.Builder;

public class Client {
    // board=createboard()
    // Game=new Game(board(3)
    //create a board of dimension NXN
    // create a Game
    // create set 2 players
        // build a player
        // choose difficulty if there is an AiPlayer involved
    //start the game
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>(); 
        Board brd=new Board();
        Game game =new Game.Builder().setBoardDimension(3, 3).addPlayer(new HumanPlayer.Builder().withUserId(123).build()
         ).addPlayer(new HumanPlayer.Builder().withUserId(123).build()).build();
        //game.run() 
    }

    
}
//new keyword
