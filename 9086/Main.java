import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scanner.next();

            list.add(str.charAt(0));

            for (int j = 0; j < str.length(); ++j) {
                list2.add(str.charAt(j));
            }

            Collections.reverse(list2);

            list.add(list2.get(0));
        }

        for (int i = 0; i < T * 2; ++i) {
            System.out.println(""+list.get(i) + list.get(i + 1));
            i += 1;
        }
        scanner.close();
    }
}

