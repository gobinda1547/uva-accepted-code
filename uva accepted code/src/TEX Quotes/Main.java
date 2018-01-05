
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;
		//StringTokenizer st;
boolean openingQuote = true;
		while ((str = in.readLine()) != null) {

			char[] ch = str.toCharArray();

			
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '"') {
					if (openingQuote) {
						out.print("``");
						openingQuote = false;
					} else {
						out.print("''");
						openingQuote = true;
					}
				} else {
					out.print(ch[i]);
				}
			}
			out.println();

		}

		in.close();
		out.close();
		System.exit(0);
	}

}
