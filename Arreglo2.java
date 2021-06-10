import java.util.*;

public class Arreglo2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();

        if (numero >= 0) {

            for (int i = numero; i >= 1; i--) {
            System.out.println(i);
            }

        }
    }
}