import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 */

public class soma_vetor {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double med, sum;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();


        double[] vet = new double[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();

        }
        System.out.println();
        sum = 0.0;
        for(int i=0; i<n; i++){
            sum = sum + vet[i];
        }
        med = sum / n;
        System.out.print("VALORES = ");

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", vet[i]);
        }
        System.out.printf("%nSOMA = %.2f", sum);
        System.out.printf("%nMEDIA = %.2f", med);

        sc.close();
        }


    }



