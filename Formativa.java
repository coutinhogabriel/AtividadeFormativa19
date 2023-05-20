package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class Formativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio01() {
        System.out.println("Digite o número de linhas da sua matriz: ");
        int linha = sc.nextInt();
        System.out.println("Digite o número de colunas da sua matriz: ");
        int coluna = sc.nextInt();
        int matriz[][] = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("Valores do sistema:");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);

                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else if (j > i) {
                    matriz[i][j] = 2;
                }

            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void exercicio02() {
        int nSorteado = rd.nextInt(1000);
        int nDigitado = 0;
        int contador = 1;

        while (nSorteado != nDigitado) {
            System.out.println("Tente adivinhar o número sorteado entre 0 e 1000");
            nDigitado = sc.nextInt();
            if (nSorteado > nDigitado) {
                System.out.println("O número digitado é menor do que o número sorteado, tente outra vez");
                contador++;
            } else if (nSorteado < nDigitado) {
                System.out.println("O número digitado é maior do que o número sorteado, tente outra vez");
                contador++;
            }

        }
        System.out.println("Parabéns, você acertou em " + contador + " tentativa");
    }


}
