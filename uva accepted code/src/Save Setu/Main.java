
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		//String str;
		StringTokenizer st;

		int x = Integer.parseInt(in.readLine()), cash = 0;
		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(in.readLine());
			if (st.nextToken().equals("donate")) {
				cash += Integer.parseInt(st.nextToken());
			} else {
				out.println(cash);
			}
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
