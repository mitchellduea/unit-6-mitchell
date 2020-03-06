
import java.util.ArrayList;
import java.util.Collections;
public class Deck{
private ArrayList<Card> deck;
public Deck(){
  Fives = new ArrayList<>();
  for(String rank: Card.RANK) {
    for(String suit: Card.SUIT){
      Fives.add(new Card(rank, suit));
    }
  }
}
public ArrayList<Card> getDeck(){
  return Fives;
}
public void shuffle(){
Collections.shuffle(Fives);
}
public static void main(String[] args){
  Fives first = new Deck();
  System.out.println(first.getDeck());
  first.shuffle();
  System.out.println(first.getDeck());
}
}
