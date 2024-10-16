import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aleatorios = (int) (Math.random() * 10);

        int numero= 0;
        int intentos=0;

        while (numero!=aleatorios) {
               intentos++;
            System.out.println("Introduce un número del 1 al 10:");

            numero = sc.nextInt();

            if (aleatorios<numero) {
                System.out.println("Tu número es mayor");
            }
            else if (aleatorios>numero) {
                System.out.println("Tu número es menor:");
            }

        }
       System.out.println("¡¡¡Premio!!! Lo has consigo en " + intentos +" intentos");


    }
}
