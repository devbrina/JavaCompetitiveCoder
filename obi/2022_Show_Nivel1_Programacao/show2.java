import java.util.Scanner;

public class show2 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);

    int a = in.nextInt();           //qtde alunos
    int n = in.nextInt();           //qtde filas
    int m = in.nextInt();           //qtde cadeiras por fila
    int [][] x = new int [N][M];    //ocupacao da cadeira
    int contiguosVazios;            //contador de assentos contíguos vazios
    int melhorFila = -1;            //fila que obedece às condicoes

    //definindo a ocupação de cada assento (com 0 ou 1)
    for (fila=n; fila>N; fila--){   //percorrer reversamente
        for (assento=0; assento<M; assento++){
            X[fila][assento] = in.nextInt();

            if (X[fila][assento] == 0){
                contiguosVazios ++;
            }
        }
    }
    if (contiguosVazios >= A){
        melhorFila
    }
}
