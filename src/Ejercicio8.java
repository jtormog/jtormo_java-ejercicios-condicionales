import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int edadUsuario = castNumero();

        if (edadUsuario >= 18) {
            System.out.println("\nEres mayor de edad");
        }
    }

    static int castNumero() {
        Scanner consoleInput = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        while (!valido){
            System.out.print("\nintroduce tu edad: ");

            try {
                num = consoleInput.nextInt();
                if (num >0){
                    valido = true;
                }
                else {
                    System.out.print("\n\u001B[31mNo puedes tener 0 años o menos\u001B[0m\n");
                }
            } catch (InputMismatchException e) {
                consoleInput.next();
                System.out.print("\n\u001B[31mNo es un valor valido\u001B[0m\n");
            }

        }return num;
    }
}
