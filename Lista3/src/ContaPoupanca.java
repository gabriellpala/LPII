public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3 / 100;
    }
}