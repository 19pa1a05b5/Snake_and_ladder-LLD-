import java.util.*;
class SnakeAndLadderBoard{
    private int max;
    private HashMap<Integer,Integer> snakes;
    private HashMap<Integer,Integer> ladders;
    private List<Player> players;
    private HashMap<String, Integer> playerPlaces;
    public SnakeAndLadderBoard(int max){
        this.max=max;
    }
    public void setSnakes_Ladders_Places(HashMap snakes,HashMap ladders,List<Player> players){
        this.snakes=snakes;
        this.ladders=ladders;
        for (Player player : players) {
            this.players.add(player);
            playerPlaces.put(name,0);
        }
    }
}