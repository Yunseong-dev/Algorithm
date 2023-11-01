import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine().trim();
		
		if (s.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(s.split(" ").length);
		}
		
        scanner.close();
	}
}