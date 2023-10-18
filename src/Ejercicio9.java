import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        int edadUsuario = castNumero();

        if (edadUsuario >= 18) {
            System.out.println("\nEres mayor de edad");
        } else {
            System.out.println("\nEres menor de edad");
        }

    }

    public static int castNumero() {
        System.out.print("\nintroduce tu edad: ");
        Scanner consoleInput = new Scanner(System.in);
        String cast = consoleInput.next();

        try {
            int num = Integer.parseInt(cast);
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
