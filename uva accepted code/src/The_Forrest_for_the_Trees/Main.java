package The_Forrest_for_the_Trees;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static boolean[][] inputs = new boolean[26][26];
	public static boolean[] visit = new boolean[26];

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String str;

		int totalTestCaseve = Integer.parseInt(in.readLine()), currentTestCase = 1;
		while (currentTestCase <= totalTestCaseve) {

			for (int i = 0; i < inputs.length; i++) {
				Arrays.fill(inputs[i], false);
				Arrays.fill(visit, false);
			}

			while ((str = in.readLine()).charAt(0) != '*') {
				int ch1 = str.charAt(1) - 'A';
				int ch2 = str.charAt(3) - 'A';
				inputs[ch1][ch2] = true;
				inputs[ch2][ch1] = true;
			}

			String allNodes = in.readLine();
			int ans1 = 0, ans2 = 0;

			for (int i = 0; i < allNodes.length(); i += 2) {

				Queue<Integer> queue = new LinkedList<>();
				int currentPos = allNodes.charAt(i) - 'A';
				if (visit[currentPos]) {
					continue;
				}
				queue.add(currentPos);

				boolean isItAcorn = true;
				while (queue.isEmpty() == false) {
					int pp = queue.poll();
					visit[pp] = true;
					for (int j = 0; j < 26; j++) {
						if (inputs[pp][j]) {
							isItAcorn = false;
							if (visit[j] == false) {
								queue.add(j);
							}
						}
					}
				}
				if (isItAcorn) {
					ans2++;
				} else {
					ans1++;
				}
			}
			out.println("There are " + ans1 + " tree(s) and " + ans2 + " acorn(s).");
			currentTestCase++;
		}

		in.close();
		out.close();
		System.exit(0);
	}

}