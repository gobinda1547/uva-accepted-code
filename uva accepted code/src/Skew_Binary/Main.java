package Skew_Binary;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;

		while ((str = in.readLine()) != null) {
			int ans = 0, len = str.length();
			if (len == 1 && str.equals("0")) {
				break;
			}
			for (int i = len - 1, multiple = 2; i >= 0; i--, multiple *= 2) {
				ans += (str.charAt(i) - '0') * (multiple - 1);
			}
			out.println(ans);
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
