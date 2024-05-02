import java.util.Scanner;

public class Palindromo {
    //solicita ao usuaio um numero
    public void solicitaNumero(Scanner scan){
        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        boolean numeroPositivo = verificaNumeroPositivo(numero,scan);

        if(numeroPositivo){
            boolean ehPalindromo = verificarPalindromo(numero);
            if (ehPalindromo) {
                System.out.println(numero + " é um número palíndromo.");
            } else {
                System.out.println(numero + " não é um número palíndromo.");
            }
        }
    }
    //verfica se o numero digitado é menor que 0
    private boolean verificaNumeroPositivo(int numero, Scanner scan){
        boolean numNegativo = numero <= 0 ? true : false;
        //o usuario nao pode digita um numero menor que 0
        while (numNegativo){
            System.out.println("O número que vc digitou é menor que zero!!, digite novamente:");
            numero = scan.nextInt();
            numNegativo = numero <= 0 ? true : false;
        }
        return true;
    }

    //calculo para descobrir se o numeor é um palindromo
    private boolean verificarPalindromo(int numero){
        int numeroOriginal = numero;
        int invertido = 0;

        // Inverter o número digitado
        while (numero != 0) {
            int ultimoDigito = numero % 10;
            invertido = invertido * 10 + ultimoDigito;
            numero /= 10;
        }

        // Verificar se o número original é palíndromo
        return numeroOriginal == invertido;
    }
}
