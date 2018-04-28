package Beat_the_Spread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 * problem statement is little tricky here
 * all you have to focus on the value of "football goal"
 * football goal value can not be negative
 * so the sum and sub both will be greater then 0
 * and sum will be always greater than sub
 * 
 * if somehow sub is greater then sum then you are sure that it is not valid
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = null;

		int totalTestCase = Integer.parseInt(in.readLine());
		for (int currentCase = 1; currentCase <= totalTestCase; currentCase++) {
			st = new StringTokenizer(in.readLine());
			int sum = Integer.parseInt(st.nextToken());
			int sub = Integer.parseInt(st.nextToken());
			if ((sum + sub) % 2 != 0 || sum < sub) {
				out.println("impossible");
				continue;
			}
			int[] vals1 = getValues(sum, sub);
			int[] vals2 = getValues(sum, -sub);

			if (vals1[0] >= 0 && vals1[1] >= 0) {
				out.println(Math.max(vals1[0], vals1[1]) + " " + Math.min(vals1[0], vals1[1]));
			} else if (vals2[0] >= 0 && vals2[1] >= 0) {
				out.println(Math.max(vals2[0], vals2[1]) + " " + Math.min(vals2[0], vals2[1]));
			} else {
				out.println("impossible");
			}
		}

		in.close();
		out.close();
		System.exit(0);
	}

	private static int[] getValues(int sum, int sub) {
		int[] vals = new int[2];
		vals[0] = (sum + sub) / 2;
		vals[1] = sum - vals[0];
		return vals;
	}

}
