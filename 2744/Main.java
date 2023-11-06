import java.util.*;

public class Main {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		String result = "";

		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)){
				result += Character.toUpperCase(x);				}
			else {
				result += Character.toLowerCase(x);            }
		}
		scanner.close();
		System.out.println(result);
	}
}