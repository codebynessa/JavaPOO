package entities;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 26/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Suponha um negócio de banco que possui uma conta comum e uma conta para
 * empresas, sendo que a conta para empresa possui todos membros da conta
 * comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
 */
//classe BusinessAcount_heranca vai herdar tudo da classe Account_heranca
public class BusinessAccount_heranca extends Account_heranca {

    private Double loanLimit;

    public BusinessAccount_heranca() {

    }

    public BusinessAccount_heranca(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount_heranca(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount){ //emprestimo
        if (amount <= loanLimit){
            deposit(amount);
    }
    }
}

