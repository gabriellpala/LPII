package View;

import agronegocio.Categoria;
import agronegocio.Cliente;
import agronegocio.Estoque;
import agronegocio.Marca;
import agronegocio.Produto;

public class Main {
    public static void main(String[] args) {
        Marca marca1 = new Marca(1, " john deere");
        Categoria categoria1 = new Categoria(1, " maquinario");
        Produto produto1 = new Produto(1, "Trator Série 7J", 200000.00, marca1, categoria1);
        Cliente cliente1 = new Cliente(1, "Maria da rosa", "Rua A, 123", "9896-9080");
        Estoque estoque1 = new Estoque(produto1, 1);
        

        System.out.println("Produto: Trator");
        System.out.println("Código: " + produto1.getCodigo());
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Marca: " + produto1.getMarca().getNome());
        System.out.println("Categoria: " + produto1.getCategoria().getNome());
        System.out.println("Estoque: 10");
        System.out.println("Nome do Produto: " + estoque1.getProduto().getNome());
        System.out.println("Quantidade: " + estoque1.getQuantidade());
        
        System.out.println("*********************\n");
        System.out.println("Cliente: Maria da rosa");
        System.out.println("Código do cliente: " + cliente1.getCodigo());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        
        System.out.println("*********************\n");
        
    }
}
