package model;

public class ContaPoupanca extends Conta {
    public void atualiza(double taxa) {
      super.deposita(this.getSaldo() * taxa * 3);
    }
  }
