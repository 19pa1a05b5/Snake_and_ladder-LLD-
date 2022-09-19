import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Dice dice = new Dice(1);
        
        int noOfPlayers=sc.nextInt();
        
        Queue<Player> allPlayers = new LinkedList<>();
        Map<String,Integer> playersCurrentPosition = new HashMap<>();
        
        for(int i=0;i<noOfPlayers;i++){
            String name=sc.next();
            int id=sc.nextInt();
            Player p = new Player(name,id);
            allPlayers.offer(p);
            playersCurrentPosition.put(name,id);
        }
        Jumper snake1 = new Jumper(10,2);
        Jumper snake2 = new Jumper(99,12);
        List<Jumper> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        Jumper ladder1 = new Jumper(5,25);
        Jumper ladder2 = new Jumper(40,89);
        List<Jumper> ladders = new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);
        
        GameBoard gb=new GameBoard(dice,allPlayers,snakes,ladders,playersCurrentPosition,100);
        gb.startGame();
    }
}
