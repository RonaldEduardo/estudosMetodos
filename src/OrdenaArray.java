import java.util.Scanner;

public class OrdenaArray {
    public void solicitaArray(Scanner scan){
        System.out.println("Digite o tamanho do array que deseja organizar:");
        int tamanhoArray = scan.nextInt();
        int[] arrayOrganizar = new int[tamanhoArray];
        for(int i = 0; i < tamanhoArray; i++){
            System.out.println("Digite um numero para a posição " + (i+1));
            arrayOrganizar[i] = scan.nextInt();
        }
        System.out.print("Array desorganizado: ");
        imprimirArray(arrayOrganizar);
        organizaArray(arrayOrganizar);
    }
    private void organizaArray(int[] arrayOrganizar){
        int tamanho = arrayOrganizar.length;
        for (int i = 0; i < arrayOrganizar.length; i++){
            for(int j = 0; j < tamanho-i-1;j++){
                if (arrayOrganizar[j] > arrayOrganizar[j + 1]) {
                    int temp = arrayOrganizar[j];
                    arrayOrganizar[j] = arrayOrganizar[j + 1];
                    arrayOrganizar[j + 1] = temp;
                }
            }
        }
        System.out.print("\nArray organizado: ");
        imprimirArray(arrayOrganizar);
    }
    private void imprimirArray(int[] arrayImprimir){
        for(int i = 0; i < arrayImprimir.length; i++){
            System.out.print(arrayImprimir[i]);
        }
    }
}
