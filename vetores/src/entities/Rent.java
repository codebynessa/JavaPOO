package entities;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 10/09/2025
 * Projeto: SeuProjetoAqui
 * Descrição: A dona de um pensionato possui dez quartos para alugar para estudantes,
 * sendo esses quartos identificados pelos números 0 a 9.
 * Fazer um programa que inicie com todos os dez quartos vazios, e depois
 * leia uma quantidade N representando o número de estudantes que vão
 * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
 * N estudantes. Para cada registro de aluguel, informar o nome e email do
 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
 * um relatório de todas ocupações do pensionato, por ordem de quarto,
 * conforme exemp
 */

public class Rent {
    private String name;
    private String email;

    public Rent(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Rent(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name +
                ", " + email;
    }
}
