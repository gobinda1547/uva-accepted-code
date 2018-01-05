package ID_Codes;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;

		while ((str = in.readLine()) != null) {
			if (str.equals("#"))
				break;
			int len = str.length();

			if (len == 1) {
				out.println("No Successor");
				continue;
			}

			char[] chs = str.toCharArray();
			int pos = -1;
			for (int i = len - 1; i > 0; i--) {
				if (chs[i - 1] < chs[i]) {
					pos = i;
					break;
				}
			}

			if (pos == -1) {
				out.println("No Successor");
				continue;
			}

			int totalRight = len - pos;
			char[] chs2 = new char[totalRight];
			for (int i = 0; i < totalRight; i++) {
				chs2[i] = chs[i + pos];
			}
			Arrays.sort(chs2);

			for (int i = 0; i < totalRight; i++) {
				chs[i + pos] = chs2[i];
			}

			int pos2 = pos - 1, pos3 = pos;
			for (int i = pos; i < len; i++) {
				if (chs[pos2] < chs[i]) {
					pos3 = i;
					break;
				}
			}

			char temp = chs[pos3];
			chs[pos3] = chs[pos2];
			chs[pos2] = temp;

			for (int i = 0; i < chs.length; i++) {
				out.print(chs[i]);
			}
			out.println();

		}

		in.close();
		out.close();
		System.exit(0);
	}

	public static void printArray(char[] a, String message) {

	}

}
