import java.io.IOException;
import java.util.Scanner;

public class Main {

    static char[] stack;
    static int top = -1;

    static void push(char c) {
        stack[++top] = c;
    }

    static char pop() {
        return stack[top--];
    }

    static char peek() {
        return stack[top];
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void processInput(int qntdVagao, String[] ordemIn, String[] ordemOut) {
        char[] sequencia = new char[qntdVagao * 2];
        stack = new char[qntdVagao * 2];
        top = -1;

        int indice = 0;
        int j = 0;
        for (int i = 0; i < qntdVagao; i++) {
            push(ordemIn[i].charAt(0));
            sequencia[indice++] = 'I';

            while (!isEmpty() && peek() == ordemOut[j].charAt(0)) {
                pop();
                sequencia[indice++] = 'R';
                j++;
            }
        }

        boolean possivel = isEmpty();

        for (int i = 0; i < indice; i++) {
            System.out.print(sequencia[i]);
        }
        if (!possivel) {
            System.out.print(" Impossible");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int qntdVagao;
        while ((qntdVagao = in.nextInt()) != 0) {
            String[] ordemIn = new String[qntdVagao];
            String[] ordemOut = new String[qntdVagao];

            for (int i = 0; i < qntdVagao; i++) {
                ordemIn[i] = in.next();
            }
            for (int i = 0; i < qntdVagao; i++) {
                ordemOut[i] = in.next();
            }

            processInput(qntdVagao, ordemIn, ordemOut);
        }
    }
}

