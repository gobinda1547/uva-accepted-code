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

				char[][] ch = new char[a][a];
				char[][] ch2_0 = new char[b][b];
				char[][] ch2_90 = new char[b][b];
				char[][] ch2_180 = new char[b][b];
				char[][] ch2_270 = new char[b][b];

				for (int i = 0; i < a; i++) {
					ch[i] = readLine().toCharArray();
				}
				for (int i = 0; i < b; i++) {
					ch2_0[i] = readLine().toCharArray();
				}

				// 90 degree
				for (int i = 0, m = 0; i < b; i++, m++) {
					for (int j = b - 1, n = 0; j >= 0; j--, n++) {
						ch2_90[m][n] = ch2_0[j][i];
					}
				}
				//print2Darray(ch2_90);

				// initializing 180 degree
				for (int i = 0, m = 0; i < b; i++, m++) {
					for (int j = b - 1, n = 0; j >= 0; j--, n++) {
						ch2_180[m][n] = ch2_90[j][i];
					}
				}
				//print2Darray(ch2_180);

				// initializing 270 degree
				for (int i = 0, m = 0; i < b; i++, m++) {
					for (int j = b - 1, n = 0; j >= 0; j--, n++) {
						ch2_270[m][n] = ch2_180[j][i];
					}
				}
				//print2Darray(ch2_270);

				int x1 = countTheNumber(ch, ch2_0);
				int x2 = countTheNumber(ch, ch2_90);
				int x3 = countTheNumber(ch, ch2_180);
				int x4 = countTheNumber(ch, ch2_270);

				System.out.println(x1 + " " + x2 + " " + x3 + " " + x4);

			}

			System.exit(0);
		}

		private void print2Darray(char[][] ch) {
			for (int i = 0; i < ch.length; i++) {
				for (int j = 0; j < ch.length; j++) {
					System.out.print(ch[i][j] + " ");
				}
				System.out.println();
			}
		}

		public int countTheNumber(char[][] ch, char[][] ch2) {
			int cnt = 0, a = ch.length, b = ch2.length;
			for (int i = 0; i <= a - b; i++) {
				for (int j = 0; j <= a - b; j++) {
					boolean ans = true;
					for (int m = 0; m < b; m++) {
						for (int n = 0; n < b; n++) {
							if (ch[i + m][j + n] != ch2[m][n]) {
								m = b;
								n = b;
								ans = false;
							}
						}
					}
					if (ans) {
						cnt++;
					}
				}
			}
			return cnt;
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