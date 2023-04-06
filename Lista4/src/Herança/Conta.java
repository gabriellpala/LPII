package Herança;

public class Conta {
  private double saldo;

  public void deposita(double valor) {
    this.saldo += valor;
  }

  public void atualiza(double taxa) {
    this.saldo += this.saldo * taxa;
  }

  public double getSaldo() {
    return this.saldo;
  }
}
