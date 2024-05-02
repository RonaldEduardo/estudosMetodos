import java.util.Scanner;

public class CombinarArray {
  public void solicitarArray(Scanner scan){

    System.out.println("Qual o tamanho dos dois arrays?");
    int tamanhoArrays = scan.nextInt();
    scan.nextLine();

    int[] primeiroArray = new int[tamanhoArrays];
    int[] segundoArray = new int[tamanhoArrays];

    System.out.println("Para preencher o primeiro array");
    primeiroArray = preencherArray(tamanhoArrays, scan);

    System.out.println("Para preencher o segundo array");
    segundoArray = preencherArray(tamanhoArrays, scan);
    String[] arrayCombinado = combinarArray(primeiroArray, segundoArray);

    exibirArray(arrayCombinado);

  }

  private int[] preencherArray(int tamanho,Scanner scan){
    int[] array = new int[tamanho];
    for(int i = 0; i < array.length;i++){
      System.out.println("Digite um numero para adicionar na posição " + (i+1) + " ?");
      array[i] = scan.nextInt();
    }
    return array;
  }
  private String[] combinarArray(int[] primeiroArray, int[] segundoArray){
    int tamanhoArrays = primeiroArray.length;
    String[] arrayCombinado = new String[tamanhoArrays * tamanhoArrays];
    int combinacao = 0;
    for (int i = 0; i < tamanhoArrays; i++) {
      for (int j = 0; j < tamanhoArrays; j++) {
        arrayCombinado[combinacao] = "(" + primeiroArray[i] + "," + segundoArray[j] + ")";
        combinacao++;
      }
    }
    return arrayCombinado;
  }
  private void exibirArray(String[] array){
    for (String par : array) {
      System.out.println(par);
    }
  }
}
