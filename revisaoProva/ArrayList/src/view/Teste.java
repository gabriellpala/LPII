package view;

import java.util.ArrayList;
import model.*;

public class Teste {
    public static void main(String[] args) {
        Caminhoneiro caminhoneiro = new Caminhoneiro("João Alves", "123456", "123456789-10", 1.00);
        Carreta carreta = new Carreta("Preta", "ct-7000");
        Viagem viagem = new Viagem("São Paulo", 4.5, 350.0);
        
        
        ArrayList<Viagem> viagens = new ArrayList<Viagem>();
        viagens.add(new Viagem("São Paulo", 10.0, 500.0));
        viagens.add(new Viagem("Rio de Janeiro", 12.0, 800.0));
        
        Cliente cliente = new Cliente("Pedro", caminhoneiro, carreta, viagens);
        
        cliente.setViagens(viagens);
        viagem.calcularViagem();
        cliente.visualizarViagens();
        

    }
}