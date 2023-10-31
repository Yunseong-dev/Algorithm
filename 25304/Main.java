import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int X = scanner.nextInt();
		int n = scanner.nextInt();
		int sum = 0;

		for (int i = 0; i < n; ++i) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			sum += a * b;
		}
		if (sum == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
