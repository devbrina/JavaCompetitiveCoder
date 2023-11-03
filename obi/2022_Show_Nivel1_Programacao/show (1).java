// OBI2022
// Tarefa show

import java.util.Scanner;

public class show {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int a = in.nextInt();
	int n = in.nextInt();
	int m = in.nextInt();
	int melhor_fila = n+1;
	int contiguos;
	
	for (int fila=n; fila > 0; fila--) {
	    contiguos = 0;
	    for (int i=0; i < m; i++) {
		int assento = in.nextInt();
		if (assento == 0) {
		    contiguos++;
		    if (contiguos >= a) {
			// amigos cabem nesta fila
			if (fila < melhor_fila) 
			    melhor_fila = fila;
		    }
		}
		else
		    contiguos = 0;
	    }
	}
	
	if (melhor_fila == n+1)
	    System.out.printf("-1\n");
	else
	    System.out.printf("%d\n",melhor_fila);
    }
}
