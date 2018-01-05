package the_snail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static class TaskSolver {

		public static void solve(Scanner in, PrintWriter out) throws IOException {

			while (in.hasNextDouble()) {
				double totalHeight = in.nextDouble();
				double climbingDistance = in.nextDouble();
				double slidingDistance = in.nextDouble();
				double fatigue = in.nextDouble();
				if (totalHeight == 0.0) {
					break;
				}
				fatigue = climbingDistance * (fatigue / 100.0);
				double position = 0.0;
				int day = 1;

				while (day == 1 || position > 0.0) {
					position += climbingDistance;
					if (position > totalHeight) {
						break;
					}

					position -= slidingDistance;
					if (position < 0.0) {
						break;
					}

					day++;
					climbingDistance = Math.max(0.0, climbingDistance - fatigue);
				}

				if (position > 0.0) {
					out.println("success on day " + day);
				} else {
					out.println("failure on day " + day);
				}
			}

		}
	}

	public static void main(String[] arg) {
		try {
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			TaskSolver.solve(in, out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}