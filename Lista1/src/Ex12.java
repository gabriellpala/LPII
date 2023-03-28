
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rendaAnual, irpfSimples;

        System.out.print("Digite o valor da renda anual do contribuinte: ");
        rendaAnual = input.nextDouble();

        if (rendaAnual <= 10800.00) {
            irpfSimples = 0.00;
        } else if (rendaAnual <= 21600.00) {
            irpfSimples = rendaAnual * 0.15 - 1620.00;
        } else {
            irpfSimples = rendaAnual * 0.275 - 4320.00;
        }

        System.out.printf("O valor do IRPF Simples a ser pago é R$ %.2f", irpfSimples);
    }

}
