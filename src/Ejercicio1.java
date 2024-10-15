import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el numero de inicio: ");
        int contador = sc.nextInt();

        System.out.println("Introduce el numero final");
        int ValorFinal= sc.nextInt();

        while (contador <= ValorFinal) {
            System.out.println("contador es: "+contador);
            contador++;
        }
        System.out.println("Termina el bucle");
    }
}
