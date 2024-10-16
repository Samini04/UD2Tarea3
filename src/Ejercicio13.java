import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el número de la clase: ");
        int aula = scanner.nextInt();

        System.out.println("Introduzca el numero de ordenadores:");
        int numO = scanner.nextInt();

        int contador = 1;

        while (contador <= numO) {
            System.out.println(aula + "." + contador);
            contador++;
        }
        System.out.println("Programa finalizado.");
    }
}



