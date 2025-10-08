package models;


/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 07/10/2025
 * Projeto: SeuProjetoAqui
 * Descrição:
 */

public class ImportedProduct extends Product{
    private Double customsFee;
    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    public Double totalPrice() {  // Renomeado para camelCase (minúscula inicial)
        return getPrice() + customsFee;
    }
    @Override
    public String priceTag() {
        return getName()  // Nome do produto (herdado de Product)
                + " $ "
                + String.format("%.2f", totalPrice())  // Chama o método correto
                + " (Customs fee: $ "
                + String.format("%.2f", getCustomsFee())  // Usa getter para encapsulamento
                + ")";

    }


}
