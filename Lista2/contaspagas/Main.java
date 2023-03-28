package contasPagas;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Maria Silva", "111.222.333-44");
        Cliente cli2 = new Cliente("João Oliveira", "555.444.333-22");
        Produto pro1 = new Produto("Camisa", 50.00);
        Produto pro2 = new Produto("Calça", 100.00);
        Conta c1 = new Conta(1, "10/02/2023", "11/02/2023", pro1, cli1);
        Conta c2 = new Conta(2, "20/02/2023", "21/02/2023", pro2, cli2);

        c1.visualizarConta();
        System.out.println("-------------------");
        c2.visualizarConta();
    }
}