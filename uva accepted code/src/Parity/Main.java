package Parity;

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

		while ((str = in.readLine()) != null) {

			int x = Integer.parseInt(str);
			if (x == 0)
				break;
			int[] arr = new int[40];

			int oneCounter = 0, totalNumberCounter = 0;
			while (x != 0) {
				arr[totalNumberCounter] = x % 2;
				x = x / 2;
				if (arr[totalNumberCounter] % 2 == 1)
					oneCounter++;
				totalNumberCounter++;
			}
			out.print(String.format("The parity of "));
			for (int i = totalNumberCounter - 1; i >= 0; i--) {
				out.print(arr[i]);
			}
			out.println(String.format(" is %d (mod 2).", oneCounter));

		}

		in.close();
		out.close();
		System.exit(0);
	}

}
