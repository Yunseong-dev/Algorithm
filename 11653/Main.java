import java.util.*; 

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 2; ;) {
            if(N == 1){
                break;
            }
            else if(N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
            else if(N % i != 0) {
                ++i;
            }
        }
        scanner.close();
    }
}