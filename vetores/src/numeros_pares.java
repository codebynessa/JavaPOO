import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */

public class numeros_pares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        System.out.printf("%nNUMEROS PARES:%n");

        int par = 0;
        for (int i=0; i<n; i++){
        if (vet[i] % 2 == 0) {
            System.out.printf("%d ", vet[i]);
            par++;

         }

        }
        System.out.println();

        System.out.printf("%nQUANTIDADE DE PARES = %d ", par);

            sc.close();
    }

}
