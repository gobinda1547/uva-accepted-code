package Quadtrees;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	private static int MAX_DEPTH = 6;
	public static char[] vals1 = new char[50000];
	public static char[] vals2 = new char[50000];

	public static int[] depth1 = new int[50000];
	public static int[] depth2 = new int[50000];

	public static int index1, index2;
	public static String str1, str2;
	public static int strlen1, strlen2;

	public static void main(String[] args) throws IOException {
		//System.out.println(1 + 4 + 16 + 64 + 256);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		int totalTestCase = Integer.parseInt(in.readLine()), currentTestCase = 1;
		while (currentTestCase <= totalTestCase) {

			index1 = 0;
			index2 = 0;
			str1 = in.readLine();
			str2 = in.readLine();

			strlen1 = str1.length();
			strlen2 = str2.length();

			makeTree1(0, 1);
			makeTree2(0, 1);

			int totalAns = margeResultAfterMargin();
			out.println("There are " + totalAns + " black pixels.");

			currentTestCase++;
		}

		in.close();
		out.close();
		System.exit(0);
	}

	public static int margeResultAfterMargin() {
		int cnt = 0;
		for (int i = 341; i < vals1.length; i++) {
			if (vals1[i] == 'f' || vals2[i] == 'f') {
				cnt++;
			}
		}
		return cnt;
	}

	private static void makeTree1(int position, int depth) {
		if (index1 < strlen1 && depth <= MAX_DEPTH) {
			char ch = str1.charAt(index1);
			vals1[position] = ch;
			depth1[position] = depth;
			if (ch == 'p') {
				for (int i = 1; i <= 4; i++) {
					index1++;
					makeTree1(position * 4 + i, depth + 1);
				}
			} else {
				for (int i = 1; i <= 4; i++) {
					fillTree1(ch, position * 4 + i, depth + 1);
				}
			}
		}
	}

	private static void fillTree1(char ch, int position, int depth) {
		if (depth <= MAX_DEPTH) {
			vals1[position] = ch;
			depth1[position] = depth;
			for (int i = 1; i <= 4; i++) {
				fillTree1(ch, position * 4 + i, depth + 1);
			}
		}
	}




	private static void makeTree2(int position, int depth) {
		if (index2 < strlen2 && depth <= MAX_DEPTH) {
			char ch = str2.charAt(index2);
			vals2[position] = ch;
			depth2[position] = depth;
			if (ch == 'p') {
				for (int i = 1; i <= 4; i++) {
					index2++;
					makeTree2(position * 4 + i, depth + 1);
				}
			} else {
				for (int i = 1; i <= 4; i++) {
					fillTree2(ch, position * 4 + i, depth + 1);
				}
			}
		}
	}

	private static void fillTree2(char ch, int position, int depth) {
		if (depth <= MAX_DEPTH) {
			vals2[position] = ch;
			depth2[position] = depth;
			for (int i = 1; i <= 4; i++) {
				fillTree2(ch, position * 4 + i, depth + 1);
			}
		}
	}




}

