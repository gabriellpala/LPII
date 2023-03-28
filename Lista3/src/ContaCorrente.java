public class ContaCorrente extends Conta {
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void deposita(double valor) {
        double valorDeposito = valor - 1;
        super.deposita(valorDeposito);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2 / 100;
    }
}