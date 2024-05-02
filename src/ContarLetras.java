import java.util.Scanner;

public class ContarLetras {
  public void solicitarFrasePalavra(Scanner scan){
    System.out.println("Digite uma frase para contar os caracteres");
    String palavraFrase = scan.nextLine();
    System.out.println(contarCaracter(palavraFrase));

  }

  private String contarCaracter(String palavraFrase){
    palavraFrase = palavraFrase.replace(" ", "");
    int contador = 0;

    for (int i = 0; i < palavraFrase.length(); i++) {
      contador = i;
    }

    return "O número de caracteres é de " + (contador+1);
  }
}
