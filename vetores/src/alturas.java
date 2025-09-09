import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver.
 */

public class alturas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double med, sum, porc;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        sum = 0;
        for(int i=0; i<n; i++){
           sum = sum + altura[i];
        }
        med = sum / n;
        System.out.printf("%nAltura média: %.2f ", med);

        int cont = 0;
        for (int i=0; i<n; i++){
            if (idade[i] < 16){
                cont = cont + 1;
            }
        }
        porc = cont * 100.0 / n;
        System.out.printf("%nPessoas com menos de 16 anos: %.1f%%%n", porc);
        for (int i=0; i<n; i++) {
            if (idade[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();

    }

}
