package banco;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean ativo;

    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.ativo = true;
    }

    public void bonifica(double valor) {
        this.salario += valor;
    }

    public void demite() {
        this.ativo = false;
    }

    // getters e setters
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void mostra () {
        System.out.println("Nome: " + getNome());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: " + getSalario());
        System.out.println("Data de entrada: " + getDataEntrada());
        System.out.println("RG: " + getRg());
        System.out.println("Ativo: " + isAtivo());
    }
}
