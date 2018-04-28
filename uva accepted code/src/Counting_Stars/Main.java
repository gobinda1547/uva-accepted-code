package Counting_Stars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str = null;
		StringTokenizer st = null;

		while ((str = in.readLine()) != null) {
			st = new StringTokenizer(str);

			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());

			if (row == 0 && col == 0) {
				break;
			}

			boolean[][] s = new boolean[row][col];
			for (int i = 0; i < row; i++) {
				str = in.readLine();
				for (int j = 0; j < col; j++) {
					s[i][j] = (str.charAt(j) == '.') ? false : true;
				}
			}

			int ans = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (s[i][j]) {
						if (0 < i && 0 < j && s[i - 1][j - 1]) {
						} else if (0 < i && s[i - 1][j]) {
						} else if (0 < i && j < col - 1 && s[i - 1][j + 1]) {
						} else if (0 < j && s[i][j - 1]) {
						} else if (j < col - 1 && s[i][j + 1]) {
						} else if (i < row - 1 && 0 < j && s[i + 1][j - 1]) {
						} else if (i < row - 1 && s[i + 1][j]) {
						} else if (i < row - 1 && j < col - 1 && s[i + 1][j + 1]) {
						} else {
							ans++;
						}
					}
				}
			}
			out.println(ans);

		}

		in.close();
		out.close();
		System.exit(0);
	}

}