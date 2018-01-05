package java_template_uva;

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

			class Pair {
				String name;
				long value;

				public Pair(String name, long value) {
					this.name = name;
					this.value = value;
				}

				public void display() {
					System.out.println(name + " " + value);
				}
			}

			while ((input = readLine()) != null) {
				stringTokenizer = new StringTokenizer(input);
				int[] arr = new int[9];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = Integer.parseInt(stringTokenizer.nextToken());
				}
				// B = 0 3 6
				// G = 1 4 7
				// C = 2 5 8
				Pair[] pairs = new Pair[6];
				pairs[0] = new Pair("BCG", arr[3] + arr[6] + arr[1] + arr[4] + arr[2] + arr[8]);
				pairs[1] = new Pair("BGC", arr[3] + arr[6] + arr[1] + arr[7] + arr[2] + arr[5]);
				pairs[2] = new Pair("CBG", arr[0] + arr[6] + arr[1] + arr[4] + arr[5] + arr[8]);
				pairs[3] = new Pair("CGB", arr[0] + arr[3] + arr[1] + arr[7] + arr[5] + arr[8]);
				pairs[4] = new Pair("GBC", arr[0] + arr[6] + arr[4] + arr[7] + arr[2] + arr[5]);
				pairs[5] = new Pair("GCB", arr[0] + arr[3] + arr[4] + arr[7] + arr[2] + arr[8]);

				long minCost = Long.MAX_VALUE;
				int ans = 0;

				for (int i = 0; i < pairs.length; i++) {
					if (pairs[i].value < minCost) {
						minCost = pairs[i].value;
						ans = i;
					}
				}

				pairs[ans].display();

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