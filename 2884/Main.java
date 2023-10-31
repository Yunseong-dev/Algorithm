import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt(); // 시
		int M = scanner.nextInt(); // 분
		scanner.close();

		if (M < 45) {
			H--; // 시(hour) 1 감소
			M = 60 - (45 - M); // 분(min) 감소
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}
}