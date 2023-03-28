package model;

public class Caminhoneiro {
    private String nome;
    private String cnpj;
    private String CPF;
    private double salario;
    
    // construtor da classe
    public Caminhoneiro(String nome, String cnpj, String CPF, double salario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.CPF = CPF;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
    