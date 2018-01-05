
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
		StringTokenizer st;

		while ((str = in.readLine()) != null) {
			st = new StringTokenizer(str);
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			out.println(a^b);
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
