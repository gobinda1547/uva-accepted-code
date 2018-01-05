package Celebrity_jeopardy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;
		// StringTokenizer st;

		while ((str = in.readLine()) != null) {
			out.println(str);
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
