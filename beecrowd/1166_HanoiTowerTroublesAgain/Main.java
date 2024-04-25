import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        int[] caso = new int[casos];

        for (int t = 0; t < casos; t++) {
            int bola = 1;
            int pinos = scanner.nextInt();
            int[] pino = new int[pinos];
            pino[0] = bola;
            bola++;

            int n = 0;
            while (n < pinos) {
                boolean placed = false;

                for (int i = 0; i <= n; i++) {
                    int soma = pino[i] + bola;
                    double raizQuadrada = Math.sqrt(soma);

                    if (raizQuadrada == Math.floor(raizQuadrada)) {
                        pino[i] = bola;
                        bola++;
                        placed = true;
                        break;
                    }
                }

                if (!placed) {
                    if (n < pinos - 1) {
                        pino[n + 1] = bola;
                        bola++;
                        n++;
                    } else {
                        break;
                    }
                }
            }

            if (pinos > 50) {
                caso[t] = -1;
            } else {
                caso[t] = bola - 1;
            }
        }

        scanner.close();

        for (int j = 0; j < casos; j++) {
            System.out.println(caso[j]);
        }

    }

}
