import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; ++i) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            arr.add(A);
            arr.add(B);
            arr.add(A + B);
        }

        int j = 1;
        for (int i = 0; i < T * 3; ) {
            System.out.println("Case #" + j + ": " + arr.get(i) + " + " + arr.get(i + 1) + " = " + arr.get(i + 2));
            ++j;
            i += 3;
        }
        scanner.close();
    }
}
