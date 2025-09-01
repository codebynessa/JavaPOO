/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 01/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Fazer um programa para ler um número inteiro N e a altura de N
 * pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
 * altura média dessas pessoas.
 */

import java.util.Locale;
import java.util.Scanner;
public class Vet01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: " );
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i=0; i<n; i++) {
            System.out.print("Informe a altura: ");
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        sc.close();
    }
}