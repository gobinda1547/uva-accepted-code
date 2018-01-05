package Fractions_Again;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;
		StringBuilder sb;

		while ((str = in.readLine()) != null) {
			sb = new StringBuilder();
			int k = Integer.parseInt(str);
			int k2 = 2 * k;
			int counter = 0;
			for (int y = k + 1; y <= k2; y++) {
				double a = y * k, b = y - k;
				double dd = a / b;
				if ((int) dd == dd) {
					counter++;
					sb.append(String.format("1/%d = 1/%d + 1/%d\n", k, (int) dd, y));
				}
			}
			out.println(counter);
			out.print(sb.toString());
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
