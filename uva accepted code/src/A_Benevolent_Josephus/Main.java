package A_Benevolent_Josephus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	static int[] xx = new int[33000];

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;

		for (int total = 0, incre = 1; total <= 32767; incre *= 2) {
			for (int i = 1; i <= incre; i += 2) {
				xx[total++] = i;
			}
		}

		while ((str = in.readLine()) != null) {
			int x = Integer.parseInt(str);
			int alive, die, ans = 0;
			do {
				alive = xx[x];
				die = x - alive;
				if (die > 0) {
					ans += die;
					x -= die;
				} else {
					ans += 2 * alive;
					break;
				}
			} while (die > 0);
			out.println(ans);

		}

		in.close();
		out.close();
		System.exit(0);
	}


}