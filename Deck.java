import java.util.Random; 
public class Deck {
 private static Random rand = new Random(123456789); 
 private Card [] cards;
 private int count;
 
 public Deck( ) {
  cards=new Card[Card.SUITS.length*Card.KINDS.length];
  count=0;
  for (int i=0; i<Card.SUITS.length; i++) {
   for (int j=0; j<Card.KINDS.length; j++) { 
    cards[count]=new Card(Card.SUITS[i], Card.KINDS[j]);
    count++;
   }
  }
 }
 
 public int getCount() { return count; }
 
 public void shuffle( ) {
        for (int i = 0; i < count; i++){ 
            int r = i + rand.nextInt(count - i); 
             Card temp = cards[r]; 
             cards[r] = cards[i]; 
             cards[i] = temp; 
        } 
    }
 
 public Card deal() {
  if (count>0) {
   Card temp=cards[count-1];
   cards[count-1]=null;
   count--;
   return temp;
  }
  else 
   return null;
 }
 
 public String toString() {
  return "deck with "+count+ " cards";
 }
}
