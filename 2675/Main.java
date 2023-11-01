import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; ++i) {
            int N = scanner.nextInt();
            String testStr = scanner.next();

            for (int j = 0; j < testStr.length(); ++j) {
                for (int k = 0; k < N; ++k) {
                    System.out.print(testStr.charAt(j));
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}