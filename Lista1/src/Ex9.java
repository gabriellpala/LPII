import java.util.Scanner;

public class Ex9 {
 
 public static void main(String[] args) {
 
  float area_total,area_cons,nao_cons,total;
  
  Scanner ent=new Scanner(System.in);
  
  System.out.println("Digite a área total do terreno");
  area_total=ent.nextFloat();
  
  System.out.println("Digite a área que está construida no terreno");
  area_cons=ent.nextFloat();
  nao_cons=area_total-area_cons;
  total=(area_cons*5)+(nao_cons*(float)3.8);
  
  System.out.printf("O valor a ser pago é: R$ %.2f",total);

 }

}