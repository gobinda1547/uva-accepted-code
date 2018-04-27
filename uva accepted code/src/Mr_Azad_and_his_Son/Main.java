package Mr_Azad_and_his_Son;

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

		String str = null;
		while ((str = in.readLine()) != null) {
			int p = Integer.parseInt(str);
			if (p == 0) {
				break;
			}

			long calCValue =(powerOf2[p-1])*( powerOf2[p] - 1);
			boolean first = isPrime(p);
			boolean second = isPrime(powerOf2[p] - 1);
			if (first && second) {
				out.println("Perfect: " + calCValue + "!");
			} else if (first) {
				out.println("Given number is prime. But, NO perfect number is available.");
			} else {
				out.println("Given number is NOT prime! NO perfect number is available.");
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