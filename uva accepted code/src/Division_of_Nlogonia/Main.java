package org.ju.cse.gobinda.Division_of_Nlogonia;

import java.io.*;
import java.util.*;

public class Main {

	static class TaskSolver {

		public static void solve(MyScanner in, MyWriter out) throws IOException {

			int t;
			while ((t = in.nextInt()) != 0) {
				int a = in.nextInt();
				int b = in.nextInt();
				for (int i = 1; i <= t; i++) {
					int c = in.nextInt();
					int d = in.nextInt();

					if (a == c || b == d) {
						out.println("divisa");
					} else if (c > a && d > b) {
						out.println("NE");
					} else if (c < a && d > b) {
						out.println("NO");
					} else if (c < a && d < b) {
						out.println("SO");
					} else {
						out.println("SE");
					}

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