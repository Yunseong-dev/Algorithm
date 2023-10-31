import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = 0, j=0;

        for (int i = 0; i < 9; ++i) {
            arr.add(scanner.nextInt());
            if(arr.get(i) > max) {
                max = arr.get(i);
                j = i + 1;
            }
        }
        System.out.println(max + "\n" + j);
        scanner.close();
    }
}
