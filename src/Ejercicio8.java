import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int edadUsuario = castNumero();

        if (edadUsuario >= 18) {
            System.out.println("\nEres mayor de edad");
        }
    }

    static int castNumero() {
        System.out.print("\nintroduce tu edad: ");
        Scanner consoleInput = new Scanner(System.in);

        try {
            int num = consoleInput.nextInt();
            if (num >0){
                return num;
            }
            else {
                System.out.print("\n\u001B[31mNo puedes tener 0 años o menos\u001B[0m\n");
            }
        } catch (NumberFormatException e) {
            System.out.print("\n\u001B[31mNo es un valor valido\u001B[0m\n");
        }
        return castNumero();

    }
}
