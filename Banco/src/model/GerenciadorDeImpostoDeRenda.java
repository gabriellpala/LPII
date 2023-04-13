package model;

public class GerenciadorDeImpostoDeRenda {
    private double total;

    public void adiciona (Tributavel t) {
        System.out.println("Adicionando taxa tributária: " + t);
        this.total += t.calculaTributos();
    }

    public double getTotal () {
        return this.total;

    }
    
}
