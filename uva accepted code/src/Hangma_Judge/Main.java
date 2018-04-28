package Hangma_Judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * read the problem statement carefully 
 * write your code step by step as the problem statement explained like
 * 
 * If the drawing of the hangman is completed before the contestant has successfully guessed all the
 * characters of the word, the contestant loses. [that's why i need to check (wrongGuessCounter != 7) in loop]
 * 
 * If the contestant has guessed all the characters of the word before the drawing is complete, the
 * contestant wins the game.[that's why i need to check (totalCharacter != 0) in loop]
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str = null;

		while ((str = in.readLine()) != null) {
			int roundNumber = Integer.parseInt(str);
			if (roundNumber == -1) {
				break;
			}
			String s1 = in.readLine();
			int totalCharacter = s1.length();
			String s2 = in.readLine();
			int[] puzzleCharacter = new int[26];
			for (int i = 0; i < totalCharacter; i++) {
				puzzleCharacter[s1.charAt(i) - 'a']++;
			}

			boolean[] pMatched = new boolean[26];
			int wrongGuessCounter = 0;
			for (int i = 0; i < s2.length() && wrongGuessCounter != 7 && totalCharacter != 0; i++) {
				int val = s2.charAt(i) - 'a';
				wrongGuessCounter += (pMatched[val] == false && puzzleCharacter[val] == 0) ? 1 : 0;
				totalCharacter -= (pMatched[val]) ? 0 : puzzleCharacter[val];
				pMatched[val] = true;
			}
			out.println("Round " + roundNumber);

			if (wrongGuessCounter == 7) {
				out.println("You lose.");
			} else if (totalCharacter == 0) {
				out.println("You win.");
			} else {
				out.println("You chickened out.");
			}

		}

		in.close();
		out.close();
		System.exit(0);
	}

}