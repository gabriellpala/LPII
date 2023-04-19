package model;

public class ValorInvalidoException extends Exception {
    ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }    
}
