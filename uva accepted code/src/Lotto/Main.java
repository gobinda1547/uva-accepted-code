
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

		boolean firstCase = true;
		while ((str = in.readLine()) != null) {
			st = new StringTokenizer(str);
			int n = Integer.parseInt(st.nextToken());
			if (n == 0)
				break;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			if (firstCase == false) {
				out.println();
			}
			for (int a = 0; a <= n - 6; a++) {
				for (int b = a + 1; b <= n - 5; b++) {
					for (int c = b + 1; c <= n - 4; c++) {
						for (int d = c + 1; d <= n - 3; d++) {
							for (int e = d + 1; e <= n - 2; e++) {
								for (int f = e + 1; f <= n - 1; f++) {
									out.println(String.format("%d %d %d %d %d %d", arr[a], arr[b], arr[c], arr[d],
											arr[e], arr[f]));
								}
							}
						}
					}
				}
			}
			firstCase = false;
		}

		in.close();
		out.close();
		System.exit(0);
	}

}
