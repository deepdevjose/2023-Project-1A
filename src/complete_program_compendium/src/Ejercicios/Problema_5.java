package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Josee 
 * Dado un numero binario de n bits regresar su equivalente en
 * decimal.
 */
public class Problema_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String numeroBin;
        int resp;
        Scanner binario = new Scanner(System.in);

        do {
            do {
                System.out.print("Ingresa un número binario: ");
                numeroBin = binario.nextLine();

                if (numeroBin.isEmpty()) {
                    System.out.println("Por favor ingresa un numero binario");
                } else if (!esBinario(numeroBin)) {
                    System.out.println("El número ingresado no es binario (solo 0 y 1).");
                }

            } while (numeroBin.isEmpty() || !esBinario(numeroBin));

            int resultadoDecimal = binarioADecimal(numeroBin);
            System.out.println("El número binario " + numeroBin + " en decimal es: " + resultadoDecimal);

            System.out.println("¿Deseas convertir otro? 1=SI 0=NO");
            resp = binario.nextInt();
        } while (resp == 1);
    }

    // Verifica si el número ingresado es binario (contiene solo 0 y 1)
    public static boolean esBinario(String numero) {

        return numero.matches("[01]+");
    }

    // Convierte un número binario a decimal
    public static int binarioADecimal(String binario) {

        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(binario.charAt(longitud - i - 1));
            decimal += digito * Math.pow(2, i);
        }

        return decimal;
    }
}
