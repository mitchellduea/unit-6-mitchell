import java.util.ArrayList;
public class card{
  public static final[] RANK = {"A", "K", "Q", "J", "10", '9', "8", "7", "6", "5","4", "3", "2",};
  public static final String[] SUIT = {}
    public int compareTo(Object other){
Card otherCard = (card) other;
return this.getRankValue() - otherCard.getRankValue();
    }
    public String toString(){
return rank + suit;
    }
    public String getRank(){
      return rank;
    }
    public String getSuit(){
      return suit;
    }
    public card(String rank, String suit){
      this.rank = rank;
      this.suit = suit;
    }
    public int getRankValue(String rank){
      for(int i = 0; i < RANK.length; i++){
        if(this.rank.equals(RANK[i])){
          return 14 - i;
        }
      }
      return -1;
    }
    public static void main(String[] args){
      card c1 = new Card(RANK[0], SUIT[0]);
      System.out.println(c1);
      Card c2 = new Card(RANK[RANK.length-1], SUIT[SUIT.length-1]);
      System.out.println(c2);
      System.out.println(c1.getRankValue());
      System.out.println(c1.getRankValue());
      System.out.println(c1.compareTo(c2));

    }
}
