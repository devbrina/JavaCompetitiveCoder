import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double[][] idProduto = {
                {1001, 1.50},
                {1002, 2.50},
                {1003, 3.50},
                {1004, 4.50},
                {1005, 5.50}
        };

        int p = scanner.nextInt();

        double total = 0.0;

        for (int i = 0; i < p; i++) {
            int id = scanner.nextInt();
            int quantidade = scanner.nextInt();

            for (int j = 0; j < idProduto.length; j++) {
                if (id == idProduto[j][0]) {
                    total += idProduto[j][1] * quantidade;
                    break;
                }
            }
        }
        scanner.close();
        System.out.printf("%.2f\n", total);
    }
}
