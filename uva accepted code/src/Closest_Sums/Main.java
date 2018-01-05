package Closest_Sums;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;

		int caseNumber = 1;
		while ((str = in.readLine()) != null) {
			int n = Integer.parseInt(str);
			if (n == 0) {
				break;
			}
			out.println(String.format("Case %d:", caseNumber++));
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(in.readLine());
			}

			int queryLimit = Integer.parseInt(in.readLine());
			for (int kk = 1; kk <= queryLimit; kk++) {
				int nowValue = Integer.parseInt(in.readLine());
				int ansSum = arr[0] + arr[1], nowSum = arr[0] + arr[1];
				for (int i = 0; i < n - 1; i++) {
					for (int j = i + 1; j < n; j++) {
						nowSum = arr[i] + arr[j];
						ansSum = Math.abs(nowValue - nowSum) < Math.abs(nowValue - ansSum) ? nowSum : ansSum;
					}
				}
				out.println(String.format("Closest sum to %d is %d.", nowValue, ansSum));
			}

		}

		in.close();
		out.close();
		System.exit(0);
	}

}
