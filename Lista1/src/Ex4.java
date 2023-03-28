import java.util.Scanner;

public class Ex4 {
  
 public static void main(String[] args){
   
  float valor, dolar, real=(float)5.10;
   
Scanner ent = new Scanner(System.in);
      
   System.out.println("Digite o valor em dolares ");
   
   
   dolar=ent.nextFloat();
   valor=dolar*real;
   
   System.out.printf("O valor em reais é R$ %.2f.", valor);
   
   
 }


}