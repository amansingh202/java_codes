public class Card {
 private char suit, kind;
 private boolean faceUp;
 // value will be taken from the index position in KINDS (plus 2)
 public static final char [] SUITS={'C','D','H','S'}; 
 private static final String [] SUIT_NAMES={"clubs","diamonds","hearts","spades"}; 
 public static final char [] KINDS={'2','3','4','5','6','7','8','9','T','J','Q','K','A'};
 private static final String [] KIND_NAMES={"two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
 
 public Card( ) {
  suit=SUITS[SUITS.length-1];
  kind=KINDS[KINDS.length-1];
  faceUp=false;
 }
 // no mutator methods needed, so data validation in non-default constructor only
 public Card( char s, char k ) {
  faceUp=false;
  int i=0;
  while (i<SUITS.length && SUITS[i]!=s) i++;
  if (i==SUITS.length) {
   suit=SUITS[SUITS.length-1];
   kind=KINDS[KINDS.length-1];
  }
  else {
   suit=s;
   i=0;
   while (i<KINDS.length && KINDS[i]!=k) i++;
   if (i==KINDS.length) {
    suit=SUITS[SUITS.length-1];
    kind=KINDS[KINDS.length-1];
   }
   else kind=k;
  }
 }
 
 public void flip() {
  faceUp=!faceUp;
 }
 public String toString() {
  if (faceUp) {
   int i=0, j=0;
   while (i<KINDS.length && KINDS[i]!=kind) i++;
   while (j<SUITS.length && SUITS[j]!=suit) j++;
   return KIND_NAMES[i] + " of " + SUIT_NAMES[j];
  }
  else return "card";
 } 
 
 public boolean equals(Card that) {
  return (this.faceUp && that.faceUp && this.suit==that.suit && this.kind==that.kind);
 }
 public int compareTo(Card that) {
  if (this.faceUp && that.faceUp) { 
   int i=0, j=0;
   while (i<KINDS.length && KINDS[i]!=this.kind) i++;
   while (j<KINDS.length && KINDS[j]!=that.kind) j++;
   return (i-j);
  }
  else return Integer.MIN_VALUE;
 } 
 
 public boolean sameSuit(Card that) {
  return (this.faceUp && that.faceUp && this.suit==that.suit);
 }
 
 public boolean sameKind(Card that) {
  return (this.faceUp && that.faceUp && this.kind==that.kind);
 }
}
