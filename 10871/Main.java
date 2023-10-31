import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int X = scanner.nextInt();

		for (int i = 0; i < N; ++i) {
			int A = scanner.nextInt();
			if (A < X) {
				arr.add(A);
			}
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
