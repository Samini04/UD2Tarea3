
import java.util.Scanner;

public class Ejercicio14 {
    public static void main (String [] args ) {



                Scanner scanner = new Scanner(System.in);
                int total = 0;
                int contador = 0;

                while (true) {
                    System.out.print("Introduce un número entero (negativo para salir): ");
                    int numero = scanner.nextInt();

                    if (numero < 0) {
                        break; // Salimos del bucle si el número es negativo
                    }

                    total += numero; // Suma el número
                    contador++; // Incrementa el contador
                }

                if (contador > 0) {
                    double media = (double) total / contador; // Calcula la media
                    System.out.println("La media es: " + media);
                } else {
                    System.out.println("No se han introducido números.");
                }

                scanner.close(); // Cierra el scanner
            }
        }




