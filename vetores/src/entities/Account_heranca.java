package entities;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 26/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Suponha um negócio de banco que possui uma conta comum e uma conta para
 * empresas, sendo que a conta para empresa possui todos membros da conta
 * comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
 */

public class Account_heranca {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account_heranca(){ //construtor padrao
    }

    public Account_heranca(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    public void withdraw(double amount) { // operacao de saque
        balance -= amount;
    }
    public void deposit(double amount) { //operacao de deposito
        balance -= amount;
    }
}
