package org.ju.cse.gobinda.cost_cutting;

import java.io.*;
import java.util.*;

public class Main {

	static class TaskSolver {

		public static void solve(MyScanner in, MyWriter out) throws IOException {

			int n = in.nextInt();

			for (int i = 1; i <= n; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt();

				if ((b <= a && a <= c) || c <= a && a <= b) {
					out.println(String.format("Case %d: %d", i, a));
				} else if ((a <= b && b <= c) || c <= b && b <= a) {
					out.println(String.format("Case %d: %d", i, b));
				} else {
					out.println(String.format("Case %d: %d", i, c));
				}

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
				} catch (IOException e) {
					e.printStackTrace();
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
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "";
		}

	}

}