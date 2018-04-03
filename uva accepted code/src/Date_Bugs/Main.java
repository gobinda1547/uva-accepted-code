package Date_Bugs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;
		StringTokenizer st;

		int currentTestCase = 1;

		while ((str = in.readLine()) != null) {
			st = new StringTokenizer(str);
			int totalComputerNumber = Integer.parseInt(st.nextToken());
			if (totalComputerNumber == 0)
				break;

			int[] times = new int[10000];
			Arrays.fill(times, 0);
			int maxAi = -1;
			for (int i = 0; i < totalComputerNumber; i++) {
				st = new StringTokenizer(in.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());

				maxAi = Math.max(a, maxAi);
				int dif = c - b;
				for (int j = a; j < 10000; j += dif) {
					times[j]++;
				}
			}

			int ans = -1;
			for (int i = maxAi; i < times.length; i++) {
				if (times[i] == totalComputerNumber) {
					ans = i;
					break;
				}
			}

			out.printf("Case #%d:\n", currentTestCase);

			if (ans == -1) {
				out.printf("Unknown bugs detected.\n");
			} else {
				out.printf("The actual year is %d.\n", ans);
			}
			out.println();

			currentTestCase++;
		}

		in.close();
		out.close();
		System.exit(0);
	}

}