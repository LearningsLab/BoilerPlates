import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private int game_id;
    private String CurrMove;
    private List<Player> players;
    private Constants.GameStatus status;

    public Game(){
        this.board=new Board();
        this.players = new ArrayList<>();
    }

    public int getGame_id(){
        return this.game_id;
    }
    public Constants.GameStatus getStatus(){
        return this.status;
    }
    public String getCurrMove(){
        return this.CurrMove;
    }
    public List<Player> getPlayers(){
        return this.players;
    }

    public Board getBoard(){
        return this.board;
    }
    
    public static class Builder{
        private Game game;
        public Builder(){
            this.game = new Game();
        }
        public Builder setBoardDimension(int rows,int cols)
        {
         ArrayList<ArrayList<Integer>> localState=new ArrayList<ArrayList<Integer>>(rows);
         for (int i = 0; i < cols; ++i) {
            localState.set(i, new ArrayList<Integer>(cols));
            }           
            this.game.getBoard().setState(localState); 
            return this;
        }
        public Builder addPlayer(Player player1){
            this.game.players.add(player1);
            return this;
        }
        public Game build(){   
            return this.game;
        }

    }



}
