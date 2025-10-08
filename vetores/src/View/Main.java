package View;

import models.ImportedProduct;
import models.Product;
import models.UsedProduct;  // Adicionei import para UsedProduct
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 07/10/2025
 * Projeto: SeuProjetoAqui
 * Descrição:
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);  // Para lidar com ponto decimal em doubles (útil em PT-BR)

        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consome newline residual após nextInt()
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");  // Mudei para println para nova linha
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();  // Consome newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();  // Consome newline após double
            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));  // Agora adiciona à lista!
            } else if (type == 'i') {
                System.out.print("Customs fee: ");  // Prompt corrigido
                double customsFee = sc.nextDouble();
                sc.nextLine();  // Consome newline
                list.add(new ImportedProduct(customsFee, name, price));  // Ordem de params corrigida
            }
        }
        System.out.println();  // Linha em branco
        System.out.println("PRICE TAGS:");  // Consistente em inglês
        for (Product prod : list) {
            System.out.println(prod.priceTag());  // Polimorfismo: chama o priceTag() da subclasse certa
        }
        sc.close();
    }
}


