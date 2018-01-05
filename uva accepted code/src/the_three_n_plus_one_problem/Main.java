package the_three_n_plus_one_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class TaskSolver {

		private BufferedReader br;
		private String input;
		private StringTokenizer stringTokenizer;

		public TaskSolver() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public void solve() throws IOException {

			while ((input = readLine()) != null) {
				stringTokenizer = new StringTokenizer(input);
				int a = Integer.parseInt(stringTokenizer.nextToken());
				int b = Integer.parseInt(stringTokenizer.nextToken());
				System.out.print(a + " " + b + " ");

				if (b < a) {
					a = a + b;
					b = a - b;
					a = a - b;
				}

				int max = 0;
				for (int i = a; i <= b; i++) {
					int n = i, cnt = 1;
					while (n != 1) {
						if (n % 2 == 0)
							n = n / 2;
						else
							n = 3 * n + 1;
						cnt++;
					}
					max = Math.max(max, cnt);
				}
				System.out.println(max);
			}

		}

		public String readLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
			}
			return null;
		}

	}

	public static void main(String[] arg) {
		try {
			TaskSolver taskSolver = new TaskSolver();
			taskSolver.solve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}