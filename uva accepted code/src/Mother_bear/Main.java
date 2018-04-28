package Mother_bear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * this is fucking easy problem
 * but i got a lot of wrong ans only for the output that is given in the input statement
 * don't copy paste the line ["You won’t be eaten!" and "Uh oh.."]
 * there is a problem with this copy paste , though we can not see it.
 * if you copy them , then you will get wrong answer. I just write them in my own hand and got AC.
 * if you want to copy them, then copy from here.
 * ["You won't be eaten!"]
 * ["Uh oh.."].
 * Fuck problem setter
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str = null;

		while ((str = in.readLine()) != null) {

			if (str.equals("DONE")) {
				break;
			}

			int len = str.length();
			String actualInput = "";
			for (int i = 0; i < len; i++) {
				char a = str.charAt(i);
				if (a != '.' && a != ',' && a != '!' && a != '?' && a != ' ') {
					actualInput += a;
				}
			}
			actualInput = actualInput.toUpperCase();

			if (isPalindrome(actualInput)) {
				out.println("You won't be eaten!");
			} else {
				out.println("Uh oh..");
			}
		}

		in.close();
		out.close();
		System.exit(0);
	}

	private static boolean isPalindrome(String str) {
		int len = str.length();
		int halfLen = len / 2;
		for (int i = 0; i < halfLen; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

}