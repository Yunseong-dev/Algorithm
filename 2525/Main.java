import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int C = scanner.nextInt();

        int min = 60 * A + B; // 시 -> 분
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
        scanner.close();
    }
}