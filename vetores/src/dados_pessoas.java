import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 09/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição:T em-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
 * de homens.
 */
import java.util.Locale;
import java.util.Scanner;
public class dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdhomens, qtdmulheres;
        double menor, maior, alturafemMedia, alturafemtotal;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];



        for(int i=0; i<n; i++){
            System.out.print("Altura da " + (i+1) + "a pessoa:  ");
            altura[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa:  ");
            genero[i] = sc.next().charAt(0);
        }
         menor = altura[0];
         maior = altura[0];

        for(int i=0; i<n; i++){
            if(altura[i] > maior) {
                maior = altura[i];

            }
            if(altura[i] < menor) {
                menor = altura[i];

            }
        }
         qtdhomens = 0;
         qtdmulheres = 0;
         alturafemtotal = 0;
        for (int i=0; i<n; i++) {
            if (genero[i]=='M') {
                qtdhomens++;
            }
            else {
                qtdmulheres++;
                alturafemtotal = alturafemtotal + altura[i];
            }
        }

        alturafemMedia = alturafemtotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);

        sc.close();
    }

}
