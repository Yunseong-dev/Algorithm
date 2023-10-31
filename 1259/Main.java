import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            boolean chk = true;

            if (str.equals("0"))
                break;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                    chk = false;
            }

            if (chk)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}