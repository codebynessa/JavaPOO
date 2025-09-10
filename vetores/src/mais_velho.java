import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 * da pessoa mais velha.
 */

public class mais_velho {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int mais_velho, pos;

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

        }
         mais_velho = idades[0];
         pos = 0;
        for(int i=1; i<n; i++){
            if(idades[i] > mais_velho){
                mais_velho = idades[i];
                pos = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[pos]);

        sc.close();
    }

}
