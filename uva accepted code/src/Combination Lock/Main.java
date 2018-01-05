
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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken()), ans = 720;

			if (a + b + c + d == 0)
				break;

			if (b >= a) {
				int dif = (40 - b) + a;
				ans += dif * 9;
			} else {
				int dif = a - b;
				ans += dif * 9;
			}

			ans += 360;

			if (c >= b) {
				int dif = c - b;
				ans += dif * 9;
			} else {
				int dif = (40 - b) + c;
				ans += dif * 9;
			}

			if (d >= c) {
				int dif = (40 - d) + c;
				ans += dif * 9;
			} else {
				int dif = c - d;
				ans += dif * 9;
			}

			// ans = ans + 360;

			out.println(ans);

		}

		in.close();
		out.close();
		System.exit(0);
	}

}
