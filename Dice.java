import java.util.*;
class Dice{
    private int noOfDice;
    public Dice(int noOfDice){
        this.noOfDice=noOfDice;
    }
    public int roll(){
        return new Random().nextInt(6*noOfDice-noOfDice)+noOfDice;
    }
}