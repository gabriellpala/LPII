package casa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());

        pessoa.setNome("Maria");
        pessoa.setIdade(35);
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());

        pessoa.fazAniversario();
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());

        Porta porta = new Porta(false, "branca", 0.8, 2.0, 0.03);
        System.out.println("Porta aberta? " + porta.isAberta());
        porta.setAberta(true);
        System.out.println("Porta aberta? " + porta.isAberta());
        porta.setAberta(false);
        System.out.println("Porta aberta? " + porta.isAberta());
        porta.setCor("azul");
        System.out.println("Cor da porta: " + porta.getCor());
        porta.setDimensaoX(1.0);
        porta.setDimensaoY(2.1);
        porta.setDimensaoZ(0.04);
        System.out.println("Dimensões da porta: " + porta.getDimensaoX() + " x " + porta.getDimensaoY() + " x " + porta.getDimensaoZ());

        // Criando as portas
        Porta porta1 = new Porta(false, "azul", 1.2, 2.0, 0.03);
        Porta porta2 = new Porta(true, "verde", 1.0, 2.1, 0.04);
        Porta porta3 = new Porta(false, "amarela", 0.9, 2.2, 0.05);

        // Criando a casa
        Casa casa = new Casa("branca", porta1, porta2, porta3);

        // Pintando a casa
        casa.setCor("vermelha");

        // Abrindo e fechando as portas
        casa.getPorta1().abre();
        casa.getPorta2().fecha();
        casa.getPorta3().abre();

        // Imprimindo o número de portas abertas
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());

    }
}
