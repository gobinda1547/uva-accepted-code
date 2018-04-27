package Perfect_Numbers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	static long[] powerOf2 = new long[63 + 1];
	static long[] xx = new long[100];

	public static void main(String[] args) throws IOException {

		powerOf2[0] = 1;
		for (int i = 1; i < powerOf2.length; i++) {
			powerOf2[i] = powerOf2[i - 1] * 2;
		}

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String str = in.readLine();
		int totalInput = Integer.parseInt(str);

		String[] strings = in.readLine().split(",");

		for (int i = 0; i < totalInput; i++) {
			int p = Integer.parseInt(strings[i]);
			if (p > 63) {
				out.println("No");
				continue;
			}

			long calCValue = powerOf2[p] - 1;
			if (isPrime(p) && isPrime(calCValue)) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		}

		in.close();
		out.close();
		System.exit(0);
	}

	public static boolean isPrime(long x) {
		if (x < 2)
			return false;
		long lastLoop = (long) Math.sqrt(x);
		for (int i = 2; i <= lastLoop; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}