import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();

        ArrayList<Integer> arr = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            arr.add(0);
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < str.length(); i++) {
            int charIndex = str.charAt(i) - 65;
            arr.set(charIndex, arr.get(charIndex) + 1);

            if (max < arr.get(charIndex)) {
                max = arr.get(charIndex);
                result = str.charAt(i);
            } else if (max == arr.get(charIndex)) {
                result = '?';
            }
        }
        System.out.println(result);
        scanner.close();
    }
}