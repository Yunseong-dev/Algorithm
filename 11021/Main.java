import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; ++i) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            arr.add(A + B);
        }
        int i = 1;
        for (int arrs : arr) {
            System.out.println("Case #" + i + ": " + arrs);
            ++i;
        }
        scanner.close();
    }
}
