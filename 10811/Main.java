import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = scanner.nextInt();

        for(int i = 0; i < N; ++i) {
            arr.add(i + 1);
        }


        int M = scanner.nextInt();

        for (int i = 0; i < M; ++i) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();

            Collections.reverse(arr.subList(I - 1, J));
        }

        for(int arrs: arr){
            System.out.print(arrs + " ");
        }
		scanner.close();
    }
}

