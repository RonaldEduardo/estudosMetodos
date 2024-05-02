import java.util.Scanner;


public class CalcularDistaciaPontos {
  public void solicitarPontos(Scanner scan){
    float xPontoUm = 0;
    float yPontoUm = 0;
    float xPontoDois = 0;
    float yPontoDois = 0;

    System.out.println("Digite o (x,y) do primeiro ponto");
    System.out.println("X:");
    xPontoUm = scan.nextFloat();
    scan.nextLine();
    System.out.println("Y:");
    yPontoUm = scan.nextFloat();
    scan.nextLine();

    System.out.println("Digite o (x,y) do segundo ponto");
    System.out.println("X:");
    xPontoDois = scan.nextFloat();
    scan.nextLine();
    System.out.println("Y:");
    yPontoDois = scan.nextFloat();
    scan.nextLine();
    System.out.println(calcularDistancia(xPontoUm, yPontoUm, xPontoDois, yPontoDois));

  }

  private double calcularDistancia(float xPontoUm,float yPontoUm, float xPontoDois, float yPontoDois){
    return Math.sqrt(Math.pow(xPontoDois-xPontoUm,2) + Math.pow(yPontoDois-yPontoUm,2));
  }
}
