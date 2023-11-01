import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int i = scanner.nextInt() - 1;

        System.out.println(str.charAt(i));

        scanner.close();
    }
}