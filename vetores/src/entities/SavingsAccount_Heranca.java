package entities;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 26/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição:
 */

public class SavingsAccount_Heranca extends Account_heranca{
    private Double interestRate;

    public SavingsAccount_Heranca(){
        super();
    }

    public SavingsAccount_Heranca(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount_Heranca(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }
}
