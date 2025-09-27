package application;

import entities.Account_heranca;
import entities.BusinessAccount_heranca;
import entities.SavingsAccount_Heranca;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 26/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Suponha um negócio de banco que possui uma conta comum e uma conta para
 * empresas, sendo que a conta para empresa possui todos membros da conta
 * comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
 */

public class Program_heranca {
    public static void main(String[] args) {

        Account_heranca acc = new Account_heranca(1001, "Vanessa", 0.0);
        BusinessAccount_heranca bacc = new BusinessAccount_heranca(1002, "Milena", 0.0, 500.0);

        //UPCASTING
        // objeto da subclasse será atribuido a uma variavel da superclasse
        Account_heranca acc1 = bacc;
        Account_heranca acc2 = new BusinessAccount_heranca(1003, "Bob", 0.0, 0.01);
        Account_heranca acc3 = new SavingsAccount_Heranca(1004, "Lucas", 0.0, 0.01);

        //DOWNCASTING
        //objeto da SUPERCLASSE será atribuido a uma variavel da SUBCLASSE
        BusinessAccount_heranca acc4 = (BusinessAccount_heranca) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount_heranca) {
            BusinessAccount_heranca acc5 = (BusinessAccount_heranca)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount_Heranca) {
            SavingsAccount_Heranca acc5 = (SavingsAccount_Heranca)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }

}
