package Palindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * this is a very easy problem while read the problem statement very clearly
 * most of the case you will get Wrong answer or presentation error 
 * because there is line which explained that for each of the input, you have 
 * to press a new line must, remember for [each input] 
 * 
 */
public class Main {

	private static char[] reverseChar = new char[255];

	public static void main(String[] args) throws IOException {
		reverseChar['A'] = 'A';
		reverseChar['E'] = '3';
		reverseChar['H'] = 'H';
		reverseChar['I'] = 'I';
		reverseChar['J'] = 'L';
		reverseChar['L'] = 'J';
		reverseChar['M'] = 'M';
		reverseChar['O'] = 'O';
		reverseChar['S'] = '2';
		reverseChar['T'] = 'T';
		reverseChar['U'] = 'U';
		reverseChar['V'] = 'V';
		reverseChar['W'] = 'W';
		reverseChar['X'] = 'X';
		reverseChar['Y'] = 'Y';
		reverseChar['Z'] = '5';
		reverseChar['1'] = '1';
		reverseChar['2'] = 'S';
		reverseChar['3'] = 'E';
		reverseChar['5'] = 'Z';
		reverseChar['8'] = '8';
		reverseChar['0'] = '0';

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str = null;

		while ((str = in.readLine()) != null) {

			boolean isPalindrom = isPalindrome(str);
			boolean isReverseed = isReverseed(str);

			if (isPalindrom) {
				if (isReverseed) {
					out.println(str + " -- is a mirrored palindrome.");
				} else {
					out.println(str + " -- is a regular palindrome.");
				}
			} else {
				if (isReverseed) {
					out.println(str + " -- is a mirrored string.");
				} else {
					out.println(str + " -- is not a palindrome.");
				}
			}
			out.println();

		}

		in.close();
		out.close();
		System.exit(0);
	}

	private static boolean isReverseed(String str) {
		int len = str.length();
		int halfLength = len / 2;
		for (int i = 0; i <= halfLength; i++) {
			char a = str.charAt(i);
			char b = str.charAt(len - i - 1);
			if (a != reverseChar[b]) {
				return false;
			}
		}
		return true;
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

	public static boolean isPrime(long x) {
		if (x < 2)
			return false;
		long lastLoop = (long) Math.sqrt(x);
		for (int i = 2; i <= lastLoop; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}