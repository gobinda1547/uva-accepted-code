package Box_of_Bricks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str = null;
		StringTokenizer st = null;

		int total = 0;
		while ((str = in.readLine()) != null) {
			total++;
			if (total != 1) {
				out.println();
			}
			st = new StringTokenizer(str);
			int n = Integer.parseInt(st.nextToken());
			if (n == 0)
				break;
			int[] arr = new int[n];
			st = new StringTokenizer(in.readLine());
			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			int avg = sum / n, ans = 0;

			for (int x : arr) {
				ans += (Math.abs(x - avg));
			}

			out.println(String.format("Set #%d\nThe minimum number of moves is %d.", total, ans / 2));
		}
		in.close();
		out.close();
		System.exit(0);
	}

}
