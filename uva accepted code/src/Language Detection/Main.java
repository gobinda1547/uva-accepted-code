
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str, ans;

		int count = 1;
		while ((str = in.readLine()) != null) {
			if (str.equals("#")) {
				break;
			} else if (str.equals("HELLO")) {
				ans = "ENGLISH";
			} else if (str.equals("HOLA")) {
				ans = "SPANISH";
			} else if (str.equals("HALLO")) {
				ans = "GERMAN";
			} else if (str.equals("BONJOUR")) {
				ans = "FRENCH";
			} else if (str.equals("CIAO")) {
				ans = "ITALIAN";
			} else if (str.equals("ZDRAVSTVUJTE")) {
				ans = "RUSSIAN";
			} else {
				ans = "UNKNOWN";
			}
			out.println(String.format("Case %d: %s", count++, ans));
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
