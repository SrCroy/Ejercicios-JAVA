import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        boolean verficar = palabras(palabra1, palabra2);

        if (verficar) {
            System.out.println("Es un anagrama: => " + palabra1 + " => " + palabra2);
        }
        else {
            System.out.println("No es un anagrama");
        }

    }

    public static boolean  palabras(String palabra1, String palabra2) {
        if (palabra1.equals(palabra2)) {
            return false;
        }

        char[] array1 = palabra1.toCharArray();
        char[] array2 = palabra2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}










