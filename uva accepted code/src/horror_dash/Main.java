package org.ju.cse.gobinda.horror_dash;

import java.io.*;
import java.util.*;

public class Main {

	static class TaskSolver {

		public static void solve(MyScanner in, MyWriter out) throws IOException {

			int t = in.nextInt();

			for (int test = 1; test <= t; test++) {

				int n = in.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < n; i++)
					arr[i] = in.nextInt();

				int max = arr[0];
				for (int i : arr) {
					max = Math.max(max, i);
				}
				out.println(String.format("Case %d: %d", test, max));

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