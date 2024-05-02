import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        Palindromo palindromo = new Palindromo();
        OrdenaArray ordenaArray = new OrdenaArray();
        CalcularJuros calcularJuros = new CalcularJuros();
        ContarLetras contarLetras = new ContarLetras();
        CombinarArray combinarArray = new CombinarArray();
        CalcularDistaciaPontos calcularDistaciaPontos = new CalcularDistaciaPontos();

        System.out.print("\033[H\033[2J"); // Limpa a tela
        System.out.flush();// limpa o buffer de saida

        out.printf("""
                O que deseja fazer hoje?

                1 - Verificar se o número é um palindromo
                2 - Ordenar um Array
                3 - Calcular Juro Compostos
                4 - Contar quantas letras tem um palavra/frase
                5 - Combinar dois Arrays
                6 - Calcular a distancia de dois Pontos
                0 - Sair
                """);
        int userOption = scan.nextInt();
        scan.nextLine();

        switch (userOption) {
            case 1 -> palindromo.solicitaNumero(scan);// solicita ao usuario um numero para verificar se é um palindromo
            case 2 -> ordenaArray.solicitaArray(scan);// ordena um array listado pelo usuario
            case 3 -> calcularJuros.solicitarJuros(scan);// faz o calculo de juros composto do usuario
            case 4 -> contarLetras.solicitarFrasePalavra(scan);// conta os caracteres de um plavavra ou frase do usuario
            case 5 -> combinarArray.solicitarArray(scan);// encontra as combinaçãoes de dois arrays digitado pelo usuario
            case 6 -> calcularDistaciaPontos.solicitarPontos(scan);// calcula a distancia de dois pontosm, definidos pelo usuario
            case 0 -> System.out.println("Fechando!");//acabouuuuuuuuuuu
        }
    }
}
