package The_Department_of_Redundancy_Department;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int[] val = new int[1000000];
	public static int[] uniqueValue = new int[1000000];
	public static int divider = 500000;

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		Arrays.fill(val, 0);
		int pos = 0;
		while (scanner.hasNextInt()) {
			int x = scanner.nextInt()+divider;
			if (val[x] == 0) {
				uniqueValue[pos++] = x;
			}
			val[x]++;

		}

		for (int i = 0; i < pos; i++) {
			System.out.printf("%d %d\n", uniqueValue[i]-divider, val[uniqueValue[i]]);
		}
		scanner.close();
		System.exit(0);

	}

}