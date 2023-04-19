package view;
import model.*;

public class TestaDeposita {
    public static void main(String[] args) throws ValorInvalidoException {
        Conta cp = new ContaPoupanca();
        
        try {
            cp.deposita(-100);
        }

        catch(IllegalArgumentException e ) {
            System.out.println("Você tentou depositar um valor invalido");
            System.out.println(e.getMessage());

        }
    }
}
