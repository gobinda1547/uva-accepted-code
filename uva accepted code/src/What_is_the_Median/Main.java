package What_is_the_Median;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;
		StringTokenizer st;
		int[] arr = new int[11000];
		int nowTop = 0;
		while ((str = in.readLine()) != null) {
			st = new StringTokenizer(str);
			int val = Integer.parseInt(st.nextToken());
			for (int i = 0; i < nowTop; i++) {
				if (val < arr[i]) {
					int c = arr[i];
					arr[i] = val;
					val = c;
				}
			}
			arr[nowTop++] = val;
			int mid = nowTop / 2;
			if (nowTop % 2 == 1) {
				out.println(arr[mid]);
			} else {
				int v1 = arr[mid];
				int v2 = arr[mid - 1];
				int ans = 0;
				if (v1 % 2 == 1 && v2 % 2 == 1)
					ans++;
				ans += v1 / 2;
				ans += v2 / 2;
				out.println(ans);
			}
		}

		in.close();
		out.close();
		System.exit(0);
	}

	public static void printArray(char[] a, String message) {

	}

}
