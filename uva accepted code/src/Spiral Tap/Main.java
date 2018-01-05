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

			while ((input = readLine()) != null) {
				stringTokenizer = new StringTokenizer(input);
				int a = Integer.parseInt(stringTokenizer.nextToken());
				int b = Integer.parseInt(stringTokenizer.nextToken());

				if (a == 0 && b == 0)
					break;

				int row = (a / 2) + 1, col = (a / 2) + 1, val = 1, rootVal = 1;
				for (int i = 3; val < b; i += 2, row++, col++) {
					val = i * i;
					rootVal = i;
				}

				boolean gotAns = false;
				//int check = 0;
				// System.out.println(String.format("ch=%d v=%d l=%d c=%d",
				// check, val, row, col));

				if (gotAns == false && val >= b && b >= (val - rootVal + 1)) {
					row = row - (val - b);
					val = -1;
					//check = 1;
					gotAns = true;
				} else {
					if (gotAns == false) {
						row = row - (rootVal - 1);
						val = val - (rootVal - 1);
					}
				}
				// System.out.println(String.format("ch=%d v=%d l=%d c=%d",
				// check, val, row, col));

				if (gotAns == false && val >= b && b >= (val - rootVal + 1)) {
					col = col - (val - b);
					val = -1;
					//check = 2;
					gotAns = true;
				} else {
					if (gotAns == false) {
						col = col - (rootVal - 1);
						val = val - (rootVal - 1);
					}
				}
				// System.out.println(String.format("ch=%d v=%d l=%d c=%d",
				// check, val, row, col));

				if (gotAns == false && val >= b && b >= (val - rootVal + 1)) {
					row = row + (val - b);
					val = -1;
					//check = 3;
					gotAns = true;
				} else {
					if (gotAns == false) {
						row = row + (rootVal - 1);
						val = val - (rootVal - 1);
					}
				}
				// System.out.println(String.format("ch=%d v=%d l=%d c=%d",
				// check, val, row, col));

				if (gotAns == false && val >= b && b >= (val - rootVal + 1)) {
					col = col + (val - b);
					val = -1;
					//check = 4;
					gotAns = true;
				} else {
					if (gotAns == false) {
						col = col + (rootVal - 1);
						val = val - (rootVal - 1);
					}
				}
				System.out.println(String.format("Line = %d, column = %d.", row, col));
				// System.out.println(String.format("ch=%d v=%d l=%d c=%d",
				// check, val, row, col));

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