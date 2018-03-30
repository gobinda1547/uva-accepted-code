package Network_Connections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		int totalTestCase = Integer.parseInt(br.readLine()), MAX_NODE = 0;
		br.readLine();
		String string = "0";

		for (int currentTestCase = 1; currentTestCase <= totalTestCase; currentTestCase++) {
			MAX_NODE = Integer.parseInt(br.readLine());
			ArrayList<ArrayList<Integer>> arrs = new ArrayList<ArrayList<Integer>>();
			int correntAnswer = 0, falseAnswer = 0;
			for (int j = 0; j <= MAX_NODE; j++) {
				arrs.add(new ArrayList<>());
			}

			while ((string = br.readLine()) != null) {
				if (string.length() == 0)
					break;
				String[] sttt = string.split(" ");
				if (sttt.length != 3)
					break;
				int a = Integer.parseInt(sttt[1]);
				int b = Integer.parseInt(sttt[2]);
				if (string.charAt(0) == 'c') {
					arrs.get(a).add(b);
					arrs.get(b).add(a);
				} else {
					Queue<Integer> queue = new LinkedList<>();
					boolean[] visit = new boolean[MAX_NODE + 5];
					queue.add(a);
					int currentQueueValue = a;
					while (queue.isEmpty() == false) {
						currentQueueValue = queue.poll();
						if (currentQueueValue == b) {
							break;
						}
						if (visit[currentQueueValue] == false) {
							visit[currentQueueValue] = true;
							int len = arrs.get(currentQueueValue).size();
							for (int j = 0; j < len; j++) {
								queue.add(arrs.get(currentQueueValue).get(j));
							}
						}
					}
					if (currentQueueValue == b) {
						correntAnswer++;
					} else {
						falseAnswer++;
					}
				}
			}
			if (currentTestCase != 1)
				out.println();
			out.println(correntAnswer + "," + falseAnswer);
		}

		br.close();
		out.close();
		System.exit(0);
	}

}
