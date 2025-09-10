import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
 * o vetor C gerado.
 */

public class soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        double[] A = new double[n];
        double[] B = new double[n];
        double[] C = new double[n];

        System.out.print("Digite os valores do vetor A:\n ");
        for (int i = 0; i < n; i++) {
            System.out.println("digite " + (i + 1) + "o valor: ");
            A[i] = sc.nextDouble();
        }

        System.out.print("Digite os valores do vetor B:\n ");
        for (int i = 0; i < n; i++) {
            System.out.println("digite " + (i + 1) + "o valor: ");
            B[i] = sc.nextDouble();
        }


        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }
        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.0f%n", C[i]);

        }
            sc.close();

    }
}
