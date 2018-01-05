package Searching_for_Nessy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		// String str;
		StringTokenizer st;

		int x = Integer.parseInt(in.readLine());
		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken()) - 2;
			int b = Integer.parseInt(st.nextToken()) - 2;

			int ans1 = (a % 3 != 0) ? (a / 3) + 1 : (a / 3);
			int ans2 = (b % 3 != 0) ? (b / 3) + 1 : (b / 3);

			out.println(ans1 * ans2);
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
