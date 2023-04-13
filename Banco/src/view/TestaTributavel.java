package view;
import java.util.zip.CRC32;

import model.*;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        cc.calculaTributos();
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        


    }
}
