
public class MagicWord {
	
	private boolean[] guessed;
	private static final String[] WORD = {"testing","board","people","yellow","darkshadow"};
	private String hiddenWord;
	

	public MagicWord() {
		
		int rand = (int)(Math.random()*WORD.length);
		hiddenWord = WORD[rand];
		guessed = new boolean[hiddenWord.length()];
		
		for (int i = 0; i < guessed.length;i++) {
			guessed[i] = false;
		}
	}
	
	@Override
	public String toString() {
		String com = "";
		
		for (int i = 0; i < guessed.length; i++) {
			if(guessed[i] == false) {
				com += "_";
			} else {
				com += hiddenWord.charAt(i);
			}
		}
		return com;
	}
	
	public void check(String s) {
		if (s.length() == 1) {
			checkChar(s.charAt(0));
		} else {
			checkString(s);;
		}
	}

	public void checkChar(char c) {
		for (int i = 0;i < guessed.length;i++) {
			if (c == hiddenWord.charAt(i)) {
				guessed[i] = true;
			}
		}
	}

	public void checkString(String s) {
		
		for (int i = 0;i < guessed.length;i++) {
			if(s.equals(hiddenWord)) {
				guessed[i] = true;
			}
		}
	}
	
	public boolean isWin() {
		for (int i = 0;i < guessed.length;i++) {
			if(guessed[i] == false) {
				return false;
			}
		}	
		return true;
	}
	
	public String getHiddenWord() {
	
		return hiddenWord;
		
	}
}
