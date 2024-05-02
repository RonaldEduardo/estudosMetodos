import java.util.Scanner;

public class CalcularJuros {
  public void solicitarJuros(Scanner scan){
    //solicita ao usuario o valor inicial
    System.out.println("Qual o valor inicial ?");
    double valorInicial = scan.nextDouble();
    scan.nextLine();
    // solicita ao usuario a taxa aplicada em porgentagem
    System.out.println("Qual a taxa dos juros?");
    float valorJuros = scan.nextFloat();
    scan.nextLine();
    // solicita ao usuario o perido em meses
    System.out.println("Qual o periodo deseja calcular? (Mes)");
    int periodo = scan.nextInt();
    scan.nextLine();

    double juroFinal = calcularJuros(valorInicial, valorJuros, periodo);

    //montante que é gerado depois de um certo periodo 
    System.out.printf("O seu montante depois de %d anos o montante é de R$%.2f", periodo, juroFinal);
  }
  //calcula os juros com base no valor inicial, taxa e periodo
  private double calcularJuros(double valorInicial, float taxaJuros,int periodo){
    periodo = periodo / 12;
    return valorInicial * Math.pow(1 + (taxaJuros / 100), periodo);
  }
}
