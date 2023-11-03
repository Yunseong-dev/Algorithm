import java.util.*;

public class Main{   
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 97;
			System.out.println(index);
			arr[index]++;
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
		scanner.close();
	}
}