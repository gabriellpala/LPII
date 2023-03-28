import java.util.Scanner;

public class Ex15 {
public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        int n_invertido = 0, resultado = 0;
        int aux;           
        char opt;           
              System.out.println("Digite um número:"); 
        do {              
            n = leia.nextInt();     
         aux = 0;  
aux = n;
            do {
                resultado = aux % 10;
                aux = aux / 10;
                n_invertido = n_invertido * 10 + resultado;
      
            } while (aux != 0);
        
            if (n == n_invertido) {
                System.out.println("O numero é capicua");
            } else {
                System.out.println("O numero é não capicua");
            }
            System.out.println("Deseja rodar novamente? (S/N)"); 
            opt = leia.next().charAt(0);                         
           
        } while (opt=='S');
    }
}