//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */

        for (int i = 2; i < 100; i ++){
            int contadorPrimo = 0;

            for (int j = 1; j < i; j ++){
                if (i % j == 0){
                    contadorPrimo++;
                }
            }

            if (contadorPrimo == 1){
                System.out.println("Si es un numero primo => " + i);
            }

            else {
                //System.out.println("No es un numero primo => " + i);
            }
        }
    }
}