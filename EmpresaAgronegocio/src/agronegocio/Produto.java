
package agronegocio;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private Marca marca;
    private Categoria categoria;

    public Produto(int codigo, String nome, double preco, Marca marca, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Marca getMarca() {
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
