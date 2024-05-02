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
        out.printf("""
                O que deseja fazer hoje?

                1 - Verificar se o número é um palindromo
                2 - Ordenar um Array
                3 - Calcular Juro Compostos
                4 - Contar quantas letras tem um palavra/frase
                5 - Combinar dois Arrays
                6 - Calcular a distancia de dois Pontos
                0 - Sair
               \n
                """);
        int userOption = scan.nextInt();
        scan.nextLine();

        switch (userOption) {
            case 1 -> palindromo.solicitaNumero(scan);
            case 2 -> ordenaArray.solicitaArray(scan);
            case 3 -> calcularJuros.solicitarJuros(scan);
            case 4 -> contarLetras.solicitarFrasePalavra(scan);
            case 5 -> combinarArray.solicitarArray(scan);
//            case 6 ->
//            case 0 ->
        }
    }
}
