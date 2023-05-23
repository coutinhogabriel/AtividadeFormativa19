package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class Formativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    // criar matriz com colunas e linhas (ambas informações dadas pelo usuario)
    public void exercicio01() {
        // solicitar a quantidade de colunas e linhas do usuario
        System.out.println("Digite o número de linhas da sua matriz: ");
        int linha = sc.nextInt();
        System.out.println("Digite o número de colunas da sua matriz: ");
        int coluna = sc.nextInt();
        // criação da matriz
        int matriz[][] = new int[linha][coluna];
        // preencher a matriz de forma random
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("Valores do sistema:");
        // substituir valores pela regra de preenchimento
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
        // laço não contavél (quando não sei a quantidade - while)
        while (nSorteado != nDigitado) {
            System.out.println("Tente adivinhar o número sorteado entre 0 e 1000");
            nDigitado = sc.nextInt();
            if (nSorteado > nDigitado) {
                System.out.println("O número digitado é menor do que o número sorteado, tente outra vez");
                contador++;
            }
            if (nSorteado < nDigitado) {
                System.out.println("O número digitado é maior do que o número sorteado, tente outra vez");
                contador++;
            }

        }
        System.out.println("Parabéns, você acertou em " + contador + " tentativa");
    }

    public void exercicio03() {
        // criar um vetor 100-1000 itens
        int vetor[] = new int[rd.nextInt(900) + 100];
        // preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }
        // procurar os nº Impares
        int contImparNaPar = 0;
        int contParNaImpar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {// resto == 1
                System.out.println("casa impar " + vetor[i]);
                // se esta na casa par
                if (i % 2 == 1) {// casa par
                    contImparNaPar++;
                }
            }
        }
        // procurar os nº Pares
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {// resto == 0
                System.out.println("casa par " + vetor[i]);
                 // se esta na casa impar
                 if (i % 2 == 0) {// casa impar
                    contParNaImpar++;
                }
            }
        }
    }
}
