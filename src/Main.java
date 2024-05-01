import java.util.Scanner;
import static java.lang.System.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
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

        switch (userOption)
            case 1 ->
//            case 2 ->
//            case 3 ->
//            case 4 ->
//            case 5 ->
//            case 6 ->
//            case 0 ->
    }
}