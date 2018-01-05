package java_template_uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static class TaskSolver {

		private BufferedReader br;
		private StringTokenizer stringTokenizer;

		public TaskSolver() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public void solve() throws IOException {

			int total = Integer.parseInt(readLine());

			for (int i = 1; i <= total; i++) {

				int k = Integer.parseInt(readLine());
				Map<Integer, Integer> map = new HashMap<>();
				for (int j = 0, x, val; j < k; j++) {
					stringTokenizer = new StringTokenizer(readLine());
					x = stringTokenizer.nextToken().charAt(0);
					val = Integer.parseInt(stringTokenizer.nextToken());
					map.put(x, val);
				}

				k = Integer.parseInt(readLine());

				int cnt = 0;
				for (int j = 0; j < k; j++) {
					char[] ch = readLine().toCharArray();
					int nowVal = 0;
					for (int c : ch) {
						try {
							nowVal += map.get(c);
						} catch (Exception e) {
						}
					}
					cnt += nowVal;
					// System.out.println(nowVal);
				}
				double dd = cnt / 100.0;

				System.out.println(String.format("%.2f$", dd));

			}

			System.exit(0);
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