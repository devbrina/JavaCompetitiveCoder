import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            System.out.println(getPrimeStatus(X));
        }
        scanner.close();
    }

    public static String getPrimeStatus(int X) {
        if (X <= 1) {
            return "Not Prime";
        }

        int sqrtX = (int) Math.sqrt(X);
        for (int i = 2; i <= sqrtX; i++) {
            if (X % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
