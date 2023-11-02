import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1, 1, 2, 2, 2, 8};
        int[] arr2 = new int[6];

        for (int i = 0; i < 6; ++i) {
                arr2[i] = scanner.nextInt();
        }

        for(int i = 0; i < 6; ++i) {
            System.out.print(arr[i] - arr2[i] + " ");
        }
        scanner.close();
    }
}
