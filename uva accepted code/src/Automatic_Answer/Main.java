package Automatic_Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;

		int x = Integer.parseInt(in.readLine());
		for (int i = 0; i < x; i++) {
			int a = Integer.parseInt(in.readLine()) * 315 + 36962;
			a = a / 10;
			str = String.valueOf(a);
			out.println(str.charAt(str.length() - 1));
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
