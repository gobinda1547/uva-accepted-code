package Summing_Digits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str = null;

		while ((str = in.readLine()) != null) {
			int inputNumber = Integer.parseInt(str);
			if (inputNumber == 0) {
				break;
			}
			while (inputNumber > 9) {
				int sum = 0;
				while (inputNumber != 0) {
					sum += inputNumber % 10;
					inputNumber /= 10;
				}
				inputNumber = sum;
			}
			out.println(inputNumber);

		}

		in.close();
		out.close();
		System.exit(0);
	}

}