import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
 * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

public class abaixo_da_media {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }
        double sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + vet[i];
        }
        double med = sum / n;
        System.out.printf("MEDIA DO VETOR = %.3f%n", med);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");


        for(int i=0; i<n; i++){
            if(vet[i] < med){
                System.out.printf("%.1f%n", vet[i]);

            }
        }


        sc.close();
    }

}
