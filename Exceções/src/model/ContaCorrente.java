package model;

public class ContaCorrente extends Conta implements Tributavel{
    public void atualiza(double taxa) throws ValorInvalidoException {
      
      super.deposita(this.getSaldo() * taxa * 2);
      super.deposita(-1);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
  }
