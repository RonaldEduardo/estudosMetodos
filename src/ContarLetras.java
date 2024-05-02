import java.util.Scanner;

public class ContarLetras {
  public void solicitarFrasePalavra(Scanner scan){
    //solicita a palavra/frase do usuario
    System.out.println("Digite uma frase para contar os caracteres");
    String palavraFrase = scan.nextLine();
    System.out.println(contarCaracter(palavraFrase));

  }
  //conta a quantidade de caracteres
  private String contarCaracter(String palavraFrase){
    //retira os espaços da a frase, pq ele quer saber a quanridade de caraceter e eles nao sabe quem o espaço conta
    palavraFrase = palavraFrase.replace(" ", "");
    int contador = 0;
    //conta os caracteres
    for (int i = 0; i < palavraFrase.length(); i++) {
      contador = i;
    }

    return "O número de caracteres é de " + (contador+1);
  }
}
