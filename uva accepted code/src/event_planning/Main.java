package org.ju.cse.gobinda.event_planning;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static class TaskSolver {
 
		public static void solve(Scanner in, PrintWriter out) throws IOException {

			while (in.hasNextInt()) {
				int totalPeople = in.nextInt();
				int totalBudget = in.nextInt();
				int totalHotel = in.nextInt();
				int maxWeekend = in.nextInt();

				int[] arr = new int[totalHotel];
				Arrays.fill(arr, Integer.MAX_VALUE);

				for (int i = 0; i < totalHotel; i++) {
					int perPersonPayment = in.nextInt();

					int totalPayment = perPersonPayment * totalPeople;
					boolean posibleOrNot = (totalPayment <= totalBudget);

					boolean costFoundOrNot = false;
					for (int j = 0; j < maxWeekend; j++) {
						int nowBedHave = in.nextInt();
						if (posibleOrNot == false) {
							continue;
						}
						if (nowBedHave >= totalPeople) {
							costFoundOrNot = true;
						}
					}
					if (costFoundOrNot)
						arr[i] = totalPayment;
				}

				int minCost = Integer.MAX_VALUE;
				for (int i : arr) {
					minCost = Math.min(minCost, i);
				}

				if (minCost == Integer.MAX_VALUE) {
					out.println("stay home");
				} else {
					out.println(minCost);
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