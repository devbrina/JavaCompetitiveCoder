import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int qtdeOp = scanner.nextInt();

        Pilha pilha = new Pilha();

        for (int i = 0; i < qtdeOp; i++) {
            String operacao = scanner.next();
            if (operacao.equals("POP")) {
                pilha.desempilhar();
            } else if (operacao.equals("MIN")) {
                pilha.printarMinimo();
            } else if (operacao.equals("PUSH")) {
                int grau = scanner.nextInt();
                pilha.empilhar(grau);
            }
        }
    }

    static class Pilha {
        private Deque<Integer> elementos;
        private Deque<Integer> minimos;

        public Pilha() {
            this.elementos = new ArrayDeque<>();
            this.minimos = new ArrayDeque<>();
        }

        public void empilhar(int elemento) {
            elementos.push(elemento);
            if (minimos.isEmpty() || elemento <= minimos.peek()) {
                minimos.push(elemento);
            }
        }

        public void desempilhar() {
            if (elementos.isEmpty()) {
                System.out.println("EMPTY");
                return;
            }
            int topo = elementos.pop();
            if (topo == minimos.peek()) {
                minimos.pop();
            }
        }

        public void printarMinimo() {
            if (elementos.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(minimos.peek());
            }
        }
    }
}
