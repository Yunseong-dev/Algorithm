import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            arr.add(0); // 배열 내부 전부 0으로 지정
        }

        int M = scanner.nextInt();

        for (int i = 0; i < M; ++i) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();
            int K = scanner.nextInt();

            for (int j = I - 1; j < J; ++j) {
                arr.set(j, K);
            }
        }
        for (int k = 0; k < arr.size(); k++) {
            System.out.print(arr.get(k) + " ");
        }
    }
}
