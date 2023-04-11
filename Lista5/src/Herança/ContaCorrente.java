package Herança;

public class ContaCorrente extends Conta {
  public void atualiza(double taxa) {
    super.deposita(this.getSaldo() * taxa * 2);
    super.deposita(-1);
  }
}