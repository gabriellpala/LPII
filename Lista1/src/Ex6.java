import java.util.Scanner;

public class Ex6{

 public static void main(String[] args) {

  float area, comp, larg, perimetro;
  
  Scanner ent = new Scanner(System.in);
  
  System.out.println("Digite o comprimento do retangulo");
  comp=ent.nextFloat();
  
  System.out.println("Digite a largura do retangulo");
  larg=ent.nextFloat();
  area=larg*comp;
       
  
  System.out.printf("A area do retangulo é: "+area);
  perimetro=(comp*2)+(larg*2);
  
  System.out.printf("\nO perimetro do retangulo é: "+perimetro);
 }


}