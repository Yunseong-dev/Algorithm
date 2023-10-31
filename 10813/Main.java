import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(N);

        for (int i = 0; i < N; ++i) {
            arr.add(i + 1);
        }

        int M = scanner.nextInt();

        for (int i = 0; i < M; ++i) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();

            Collections.swap(arr, I - 1, J - 1);
        }

        for (int arrs : arr) {
            System.out.print(arrs + " ");
        }
        scanner.close();
    }
}
