package org.ju.cse.gobinda.clock_hands;

import java.io.*;
import java.util.*;

public class Main {

	static class TaskSolver {

		public static void solve(MyScanner in, MyWriter out) throws IOException {

			String str;
			while ((str = in.nextLine()) != null) {
				String[] ss = str.split(":");
				int x = Integer.parseInt(ss[0]);
				int y = Integer.parseInt(ss[1]);

				if (x == 0 && y == 0) {
					break;
				}

				double second = y * 6;
				double hour = x * 30 + y * 0.5;

				double ans = Math.abs((hour - second));
				ans = Math.min(ans, 360 - ans);

				out.println(String.format("%.3f", ans));

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