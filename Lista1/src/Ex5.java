import java.util.Scanner;
public class Ex5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite seu peso (em kg): ");
    double peso = scanner.nextDouble();
    
    System.out.print("Digite sua altura (em metros): ");
    double altura = scanner.nextDouble();
    
    System.out.print("Digite seu gênero (M para mulher e H para homem): ");
    String genero = scanner.next();
    
    double imc = peso/(altura * altura);  
    System.out.println("Seu IMC é: " + imc);
    
    if (genero.equals("M")) {
      if (imc < 19.1) {
        System.out.println("Você está abaixo do peso.");
      } else if (imc >= 19.1 && imc <= 25.8) {
        System.out.println("Você está no peso ideal.");
      } else {
        System.out.println("Você está obesa.");
      }
    } else if (genero.equals("H")) {
      if (imc < 20.7) {
        System.out.println("Você está abaixo do peso.");
      } else if (imc >= 20.7 && imc <= 26.4) {
        System.out.println("Você está no peso ideal.");
      } else {
        System.out.println("Você está obeso.");
      }
    } else {
      System.out.println("Gênero inválido.");
    }
  }
}