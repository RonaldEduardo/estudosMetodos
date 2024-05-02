import java.util.Scanner;

public class CombinarArray {
  // solicita os arrays para o usuario
  public void solicitarArray(Scanner scan) {
    System.out.println("Qual o tamanho dos dois arrays?");
    int tamanhoArrays = scan.nextInt(); // pede o tamanho dos arrays
    scan.nextLine();

    int[] primeiroArray = new int[tamanhoArrays]; // primeiro array
    int[] segundoArray = new int[tamanhoArrays]; // segundo array

    System.out.println("Para preencher o primeiro array");
    primeiroArray = preencherArray(tamanhoArrays, scan); // Preenche o primeiro array

    System.out.println("Para preencher o segundo array");
    segundoArray = preencherArray(tamanhoArrays, scan); // Preenche o segundo array
    String[] arrayCombinado = combinarArray(primeiroArray, segundoArray); // Combina os dois arrays

    exibirArray(arrayCombinado); // Exibe o resultado da combinação
  }

  // preenche os arrays
  private int[] preencherArray(int tamanho, Scanner scan) {
    int[] array = new int[tamanho];
    for (int i = 0; i < array.length; i++) {
      System.out.println("Digite um numero para adicionar na posição " + (i + 1) + " ?");
      array[i] = scan.nextInt(); // intera no array o numero digitado
    }
    return array;
  }

  // Método para combinar dois arrays em todas as combinações possíveis de pares
  private String[] combinarArray(int[] primeiroArray, int[] segundoArray) {
    int tamanhoArrays = primeiroArray.length;
    String[] arrayCombinado = new String[tamanhoArrays * tamanhoArrays]; // Array para guardar as combinações
    int combinacao = 0;
    for (int i = 0; i < tamanhoArrays; i++) {
      for (int j = 0; j < tamanhoArrays; j++) {
        arrayCombinado[combinacao] = "(" + primeiroArray[i] + "," + segundoArray[j] + ")"; // Cria uma string de combinação
        combinacao++;
      }
    }
    return arrayCombinado;
  }

  // exibe todos os elementos de um array
  private void exibirArray(String[] array) {
    for (String par : array) {
      System.out.println(par);
    }
  }
}
