    import java.util.*;
    public class Main{
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            for (int i = 0; i < N; ++i) {
                int num = scanner.nextInt();
                arr.add(num);
            }

            int V = scanner.nextInt();
            int sum = 0;

            for (int arrs: arr) {
                if (arrs == V) {
                    ++sum;
                }
            }
            System.out.println(sum);
            scanner.close();
        }
    }