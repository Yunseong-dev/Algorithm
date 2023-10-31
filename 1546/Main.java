import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double M = -1;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            double v = scanner.nextDouble();
            sum += v;
            if (M < v) {
                M = v;
            }
        }

        double result = ((sum / M) / N) * 100;
        System.out.println(result);
        scanner.close();
    }
}