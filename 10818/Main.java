import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long min = 1000001, max = -1000001;
        int N = scanner.nextInt();

        for (int i = 0; i < N; ++i) {
            long num = scanner.nextInt();
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println(min + " " + max);
    }
}