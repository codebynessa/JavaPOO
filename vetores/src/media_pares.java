import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

public class media_pares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        double sum = 0;
        int npares = 0;
        for (int i=0; i<n; i++){
            if (vet[i] % 2 == 0){
                sum = sum + vet[i];
                npares++;
            }

        }
        if (npares == 0){
            System.out.println("NENHUM NUMERO PAR");

        }
        else {
            double med = sum / npares;
            System.out.printf("MEDIA DOS PARES = %.1f", med);

        }



        sc.close();
    }

}
