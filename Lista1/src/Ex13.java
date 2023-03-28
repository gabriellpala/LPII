
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = sc.nextInt();

        System.out.print("Digite o número de dias do pacote turístico: ");
        int numDias = sc.nextInt();

        double preco;
        if (numPessoas <= 4) {
            preco = 160.0;
        } else if (numPessoas <= 8) {
            preco = 120.0;
        } else {
            preco = 80.0;
        }
        double valorTotal = numPessoas * preco * numDias;

        System.out.printf("O valor total do pacote turístico para %d pessoas por %d dias é R$%.2f\n",
                numPessoas, numDias, valorTotal);

        sc.close();
    }

}
