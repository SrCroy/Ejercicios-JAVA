public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que imprima los 50 primeros números de la sucesión
         * de Fibonacci empezando en 0.
         * - La serie Fibonacci se compone por una sucesión de números en
         *   la que el siguiente siempre es la suma de los dos anteriores.
         *   0, 1, 1, 2, 3, 5, 8, 13...
         */

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        for (int i = 0; i < 50; i++) {
            if (i == 0){
                System.out.println(n2);
            }
            else if (i == 1){
                n1++;
                n2++;
                System.out.println(n2);
            }

            else if (i == 2){
                System.out.println(n2);
            }

            else {
                n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
}