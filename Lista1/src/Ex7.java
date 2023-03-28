import java.util.Scanner;

public class Ex7 {

 public static void main(String[] args) {
 
  float n1,n2,n3,n4,media;
  
 Scanner ent=new Scanner(System.in);
  
  System.out.println("Digite a primeira nota");
  n1=ent.nextFloat();
  
  System.out.println("Digite a segunda nota");
  n2=ent.nextFloat();
  
  System.out.println("Digite a terceira nota");
  n3=ent.nextFloat();
  
  System.out.println("Digite a quarta nota");
  n4=ent.nextFloat();
  media=(n1+n2+n3+n4)/4;
  
  System.out.printf("Sua média final é: %.1f",media);

 }

}