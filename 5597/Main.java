import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 30; ++i) {
            arr.add(i + 1);
        }

        for (int i = 0; i < 28; ++i) {
            int n = scanner.nextInt();

            arr.remove(Integer.valueOf(n));
        }

        Collections.sort(arr);
        for(int arrs: arr){
            System.out.println(arrs + " ");
        }
        scanner.close();
    }
}
