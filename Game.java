import java.util.*;
class Game{
    private SnakeAndLadderBoard snakeAndLadderBoard;
    private Dice d;
    private int initialNumberOfPlayers;
    private Queue<Player> players;
    private boolean isGameCompleted;
    //Optional rules
    private boolean playUptoLastPlayer;
    private boolean allowMultipleSixes;
    private int noOfDices=1;
    private int boardSize=100;
    
    public void setBoardSize(int boardSize){
        this.boardSize=boardSize;
    }
    
    public void setDices(int noOfDices){
        this.noOfDices=noOfDices;
    }
    d= new Dice(noOfDices);
    public Game(HashMap snakes,HashMap ladders,HashMap playerPlaces){
        snakeAndLadderBoard = new SnakeAndLadderBoard(int boardSize);
        d= new Dice(noOfDices);
        snakeAndLadderBoard.setSnakes_Ladders_Places(HashMap snakes,HashMap ladders,List<Player> players);
    }
}