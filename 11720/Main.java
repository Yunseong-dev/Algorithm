import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += S.charAt(i) - '0'; // 0을 빼주는 이유는 0이 아스키코드로 48 숫자 1은 49이기 때문에
        }

        System.out.println(sum);

        scanner.close();
    }
}