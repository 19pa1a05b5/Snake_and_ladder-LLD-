import java.util.*;
class Ladders{
    private static HashMap<Integer,Integer> ladders = new HashMap<Integer,Integer>();
    public void setLadder(int start,int end){
        ladders.put(start,end);
    }
    public HashMap getLadder(){
        return ladders;
    }
}