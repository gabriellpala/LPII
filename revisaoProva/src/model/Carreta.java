package model;


public class Carreta {
    private String cor;
    private String modeloCarreta;
    
    // construtor da classe
    public Carreta(String cor, String modeloCarreta) {
        this.cor = cor;
        this.modeloCarreta = modeloCarreta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModeloCarreta() {
        return modeloCarreta;
    }

    public void setModeloCarreta(String modeloCarreta) {
        this.modeloCarreta = modeloCarreta;
    }
    
}
