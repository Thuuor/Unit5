import java.util.Scanner;

public class WordGuess {

	private static int ATTS = 40;
	private static boolean gameOver = false;
	
	public static void main(String[] args) {
		
		
		MagicWord magicWord = new MagicWord();

		Scanner input = new Scanner(System.in);
		
		while (!gameOver) {
			
			System.out.println(magicWord.toString());
			System.out.println("Enter one character or your guess word: ");
			
			String letter = input.next();
			magicWord.check(letter);
			ATTS--;
			checkWin(magicWord);
		}
		
		
		input.close();
	}
	
	

	public static void checkWin(MagicWord m) {
		if (ATTS <= 0) {
			System.out.println("¡¡Has perdido bro!!");
			gameOver = true;
			System.out.println("La palabra era: " + m.getHiddenWord());
		} else {
			if (m.isWin()) {
				System.out.println("¡¡Has ganado!!");
				gameOver = true;
			}
		}
	}
	
	
}
