import java.util.ArrayList;
//import java.util.List;

public class Board{
    private ArrayList<ArrayList<Integer>> state = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> getState(){
        return this.state;
    }

    public void setState(ArrayList<ArrayList<Integer>> state){
        this.state=state;
    }

}