package java_template_for_codeforces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class TaskSolver {

		private static int[][] arr = new int[3][3];

		public static void solve(MyScanner in, MyWriter out) throws IOException {

			int x = in.nextInt();
			for (int total = 0; total < x; total++) {

				for (int i = 0; i < 3; i++) {
					char[] ch = in.next().toCharArray();
					for (int j = 0; j < 3; j++) {
						arr[i][j] = ch[j] - '0';
					}
				}

				int ans = -1;
				while (arrayIsZero() == false) {
					changeTheArray();
					ans++;
				}
				out.println(ans);

			}

		}

		private static void changeTheArray() {
			int[][] h = new int[3][3];
			h[0][0] = arr[1][0] + arr[0][1];
			h[0][1] = arr[0][0] + arr[1][1] + arr[0][2];
			h[0][2] = arr[0][1] + arr[1][2];

			h[1][0] = arr[0][0] + arr[1][1] + arr[2][0];
			h[1][1] = arr[0][1] + arr[1][0] + arr[1][2] + arr[2][1];
			h[1][2] = arr[0][2] + arr[1][1] + arr[2][2];

			h[2][0] = arr[1][0] + arr[2][1];
			h[2][1] = arr[2][0] + arr[1][1] + arr[2][2];
			h[2][2] = arr[2][1] + arr[1][2];

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					arr[i][j] = h[i][j] % 2;
				}
			}
		}

		private static boolean arrayIsZero() {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (arr[j][k] > 0) {
						return false;
					}
				}
			}
			return true;
		}
	}

	public static void main(String[] arg) {
		try {
			MyScanner in = new MyScanner();
			MyWriter out = new MyWriter();
			TaskSolver.solve(in, out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class MyWriter extends PrintWriter {
		MyWriter() throws FileNotFoundException {
			super(System.out);
		}

		void printArrayInOneLine(int[] a) {
			print('[');
			for (int i : a) {
				print(i + " ");
			}
			println(']');
		}

	}

	static class MyScanner {

		private BufferedReader br;
		private StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					return null;
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

	}

}