import java.util.Scanner;

public class CalcularJuros {
  public void solicitarJuros(Scanner scan){
    System.out.println("Qual o valor inicial ?");
    double valorInicial = scan.nextDouble();
    scan.nextLine();

    System.out.println("Qual a taxa dos juros?");
    float valorJuros = scan.nextFloat();
    scan.nextLine();

    System.out.println("Qual o periodo deseja calcular? (Mes)");
    int periodo = scan.nextInt();
    scan.nextLine();

    double juroFinal = calcularJuros(valorInicial, valorJuros, periodo);

    System.out.printf("O seu montante depois de %d anos o montante é de R$%.2f", periodo, juroFinal);
  }
  
  private double calcularJuros(double valorInicial, float taxaJuros,int periodo){
    periodo = periodo / 12;
    return valorInicial * Math.pow(1 + (taxaJuros / 100), periodo);
  }
}
