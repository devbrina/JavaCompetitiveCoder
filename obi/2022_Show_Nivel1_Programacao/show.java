import java.util.Scanner;

public class show {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int N = in.nextInt();
        int M = in.nextInt();
        int melhorFila = -1;
        int amigosRestantes = A;

        for (int fila = 1; fila <= N; fila++) {
            String linha = in.next();
            int assentosLivres = 0;

            for (int i = 0; i < M; i++) {
                int assento = linha.charAt(i) - '0';

                if (assento == 0) {
                    assentosLivres++;

                    if (assentosLivres >= A) {
                        melhorFila = fila;
                        break;
                    }
                } else {
                    assentosLivres = 0;
                }
            }

            if (melhorFila != -1) {
                break;
            }
        }

        if (melhorFila == -1) {
            System.out.println(-1);
        } else {
            System.out.println(melhorFila);
        }
    }
}
