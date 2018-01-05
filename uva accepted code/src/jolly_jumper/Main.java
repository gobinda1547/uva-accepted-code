package jolly_jumper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
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
				int x = Integer.parseInt(stringTokenizer.nextToken());
				int[] arr = new int[x];
				for (int i = 0; i < x; i++) {
					arr[i] = Integer.parseInt(stringTokenizer.nextToken());
				}
				System.out.println(isJollyOrNot(arr));
			}
			System.exit(0);

		}

		private String isJollyOrNot(int[] arr) {

			Set<Integer> set = new HashSet<>();
			for (int i = 1; i < arr.length; i++) {

				int dif = Math.abs(arr[i] - arr[i - 1]);
				if (dif == 0 || dif >= arr.length || set.contains(dif)) {
					return "Not jolly";
				}
				set.add(dif);

			}

			return "Jolly";
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