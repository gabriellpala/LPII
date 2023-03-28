package view;
import model.*;
public class Teste {
    public static void main(String[] args) {
        Caminhoneiro caminhoneiro = new Caminhoneiro("João Alves", "123456", "123456789-10", 1.00);
        Carreta carreta = new Carreta("Preta", "ct-7000");
        Viagem viagem = new Viagem("São Paulo", 4.5, 350.0);
        Cliente cliente = new Cliente("Pedro", caminhoneiro, viagem, carreta);
        
        viagem.calcularViagem();
        cliente.visualizarViagem();
        

    }
}