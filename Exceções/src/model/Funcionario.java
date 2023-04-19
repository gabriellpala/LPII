package model;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG;
    private boolean Ativo = true; 
    
    public double bonifica (double aumento) {
        return salario + aumento;
    }   

    public boolean demite () {
        return Ativo = false;
    }

    public void mostra () {
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("O salario é de: " + this.salario);
        System.out.println("Com a bonificação o salario fica: " + this.bonifica(50));
        System.out.println("Dada de entrada do funcionario: " + this.dataEntrada);
        System.out.println("Seu departamento é: " + this.departamento);
        System.out.println("O funcionario esta ativo? " + this.demite());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean ativo) {
        Ativo = ativo;
    }
    
}
