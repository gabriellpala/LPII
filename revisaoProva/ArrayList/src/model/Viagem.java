package model;


public class Viagem {
    private String Destino;
    private double valorKM;
    private double valorViagem;
    private double distancia;
    
    // construtor da classe
    
    public Viagem (String Destino, double valorKM, double distancia) {
        this.Destino = Destino;
        this.distancia = distancia;
        this.valorKM = valorKM;
         
    }
    
    public void calcularViagem () {
        this.valorViagem = valorKM * distancia;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public double getValorKM() {
        return valorKM;
    }

    public void setValorKM(double valorKM) {
        this.valorKM = valorKM;
    }

    public double getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
}

