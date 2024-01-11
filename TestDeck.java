public class TestDeck {
	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d);
		Card c = d.deal();
		c.flip();
		System.out.println(c);
		System.out.println(d);
		d.shuffle();
		c = d.deal();
		c.flip();
		System.out.println(c);
		System.out.println(d);		
	}
}
/*
Sample output (2nd card drawn should be different every time)
deck with 52 cards
ace of spades
deck with 51 cards
nine of spades
deck with 50 cards

*/