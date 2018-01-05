
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class TaskSolver {

		public static void solve(MyScanner in, MyWriter out) throws IOException {

			int total = in.nextInt();
			while ((total--) != 0) {
				int n = in.nextInt();
				int[] arr = new int[n];

				for (int i = 0; i < n; i++) {
					arr[i] = in.nextInt();
				}
				int mx = arr[0], mn = arr[0];
				for (int i = 1; i < n; i++) {
					mx = Math.max(mx, arr[i]);
					mn = Math.min(mn, arr[i]);
				}
				out.println((mx - mn) * 2);
			}
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