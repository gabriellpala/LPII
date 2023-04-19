package model;

public abstract class Conta {
  private double saldo;

  public void deposita(double valor) throws ValorInvalidoException {
    if(valor < 0) {
     // throw new IllegalArgumentException("Você tentou depositar um valor negativo");
     throw new ValorInvalidoException(valor);
    } else {
      this.saldo += valor -0.10;
    }    
  }

  public abstract void atualiza(double taxa) throws ValorInvalidoException;

  public double getSaldo() {
    return this.saldo;
  }
}
