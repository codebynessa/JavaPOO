import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
 * considerando a primeira posição como 0 (zero).
 */

public class maior_posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();

        }
        double maior = vet[0];
        int pos = 0;
        for(int i=0; i<n; i++){
            if(vet[i] > maior){
                maior = vet[i];
                pos = i;
            }

        }
        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", pos);

        sc.close();
    }

}
