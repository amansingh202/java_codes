import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HangmanDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		File inFile = new File("secretwords.txt");
		Scanner inScan = new Scanner(inFile);
		boolean playAgain=true, guessed;
		String secret = new String();
		Template game = new Template();
		String s=""; 
		char c;
		int guessCount;

		secret = inScan.next();

		while (inScan.hasNext() && playAgain)
		{
			guessed=false;
			secret = inScan.next();
			game.setWord(secret);
			guessCount=0;
			while (guessCount<=10 && !game.guess(game.getTemplate()) && !guessed)
			{
				s = JOptionPane.showInputDialog( null,
					game.getTemplate() + "\nGuess a letter or * to guess the word: " );
				c=s.toLowerCase().charAt(0);
				if (c == '*')
				{	
					s = JOptionPane.showInputDialog( null,
						game.getTemplate() + "\nGuess the word: " );
					guessCount++;
					if (game.guess(s)) guessed=true;
				}
				else
				{	
					guessCount++;
					game.guess(c);
				}
			}

			if (guessed)
				JOptionPane.showMessageDialog( null, game.getTemplate() + "=" +s + "\nYou got it!" );
			else if (game.guess(game.getTemplate()))
				JOptionPane.showMessageDialog( null, game.getTemplate() + "\nYou got it!" );
			else
			    JOptionPane.showMessageDialog( null, game.getTemplate() + "\nSorry, out of guesses." );

			s = JOptionPane.showInputDialog( null,
					"Do you want to play again (y or n)?" );
			if (s.equals("y") && s.equals("Y"))
				playAgain=false;


		}
		if (playAgain) 
			JOptionPane.showMessageDialog( null, "Sorry, no more secret words left." );
	}
}