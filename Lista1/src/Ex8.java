import java.util.Scanner;

public class Ex8{
 public static void main(String[] args) {

 float hp,lp,ha,la,qtd,arp,ara;
  
  Scanner ent=new Scanner(System.in);
  
  System.out.println("Digite a altura da parede");
  hp=ent.nextFloat();
  
  System.out.println("Digite a largura da parede");
  lp=ent.nextFloat();
  arp=hp*lp;
  
  System.out.println("Digite a altura do azulejo");
  ha=ent.nextFloat();
  
  System.out.println("Digite a largura do azulejo ");
  la=ent.nextFloat();
  ara=ha*la;
  qtd=arp/ara;
  
  System.out.printf("A quantidade de azulejos em uma parede de %.0f cm2 é de %.0f azulejos", +arp,qtd);
 }

}