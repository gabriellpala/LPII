package model;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String CPF;
    private String RG;
    private Caminhoneiro c1;
    private Carreta carreta1;
    private ArrayList<Viagem> viagem1;

    public Cliente(String nome, Caminhoneiro caminhoneiro, Carreta carreta, ArrayList<Viagem> viagens) {
        this.nome = nome;
        this.c1 = caminhoneiro;
        this.carreta1 = carreta;
        this.viagem1 = viagens;
    }


    public void visualizarViagens() {
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome do caminhoneiro: " + c1.getNome());
        System.out.println("Modelo da carreta: " + carreta1.getModeloCarreta());
        System.out.println("Viagens:");
        for (Viagem viagem : viagem1) {
            System.out.println("Destino: " + viagem.getDestino());
            System.out.println("Valor do quilômetro: " + viagem.getValorKM());
            System.out.println("Distância percorrida: " + viagem.getDistancia());
            System.out.println("Valor total da viagem: " + viagem.getValorViagem());
        }
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Caminhoneiro getC1() {
        return c1;
    }

    public void setC1(Caminhoneiro c1) {
        this.c1 = c1;
    }

    public ArrayList<Viagem> getViagens() {
    return viagem1;
    }

    public void setViagens(ArrayList<Viagem> viagem) {
    this.viagem1 = viagem;
    }

    public Carreta getCarreta1() {
        return carreta1;
    }

    public void setCarreta1(Carreta carreta1) {
        this.carreta1 = carreta1;
    }
    
}

