package contasPagas;

public class Conta {
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    private Produto pro;
    private Cliente cli;

    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto pro, Cliente cli) {
        this.idConta = idConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.pro = pro;
        this.cli = cli;
    }

    public void visualizarConta() {
        System.out.println("Identificador da conta: " + idConta);
        System.out.println("Nome do produto: " + pro.getDescricaoProduto());
        System.out.println("Nome do cliente: " + cli.getNomeCliente() + " CPF: " + cli.getCpf());
        System.out.println("Valor do produto: " + pro.getValorProduto());
        System.out.println("Data de vencimento: " + dataVencimento);
        System.out.println("Data de pagamento: " + dataPagamento);
    }
}

