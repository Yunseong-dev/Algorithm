import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[100];
		int T = scanner.nextInt();

		for (int i = 0; i < T; ++i) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();

			arr[i] = A + B;
		}
		for (int i = 0; i < T; ++i) {
			System.out.println(arr[i]);
		}
	}
}
