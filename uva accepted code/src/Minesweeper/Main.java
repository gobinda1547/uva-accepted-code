package Minesweeper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = null;
		String str = null;
		int caseNumber = 0;
		while ((str = in.readLine()) != null) {
			caseNumber++;
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0) {
				break;
			}
			char[][] ch = new char[a][b];
			int[][] ans = new int[a][b];
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					ans[i][j] = 0;
				}
			}

			for (int i = 0; i < a; i++) {
				str = in.readLine();
				ch[i] = str.toCharArray();
			}

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (ch[i][j] == '*') {
						if (0 < i && 0 < j) {
							ans[i - 1][j - 1]++;
						}
						if (0 < i) {
							ans[i - 1][j]++;
						}
						if (0 < i && j < b - 1) {
							ans[i - 1][j + 1]++;
						}
						if (j < b - 1) {
							ans[i][j + 1]++;
						}
						if (i < a - 1 && j < b - 1) {
							ans[i + 1][j + 1]++;
						}
						if (i < a - 1) {
							ans[i + 1][j]++;
						}
						if (i < a - 1 && 0 < j) {
							ans[i + 1][j - 1]++;
						}
						if (0 < j) {
							ans[i][j - 1]++;
						}
					}
				}
			}
			if (caseNumber != 1) {
				out.println();
			}
			out.println("Field #" + caseNumber + ":");
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (ch[i][j] == '*') {
						out.print('*');
					} else {
						out.print(ans[i][j]);
					}
				}
				out.println();
			}

		}

		in.close();
		out.close();
		System.exit(0);
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