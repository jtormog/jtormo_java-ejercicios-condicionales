import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        int notaUsuario = castNumero();

        switch (notaUsuario) {
            case 0:
            case 1:
            case 2:
                System.out.println("\nMuy deficiente");
                break;
            case 3:
            case 4:
                System.out.println("\nInsuficiente");
                break;
            case 5:
                System.out.println("\nBien");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("\nNotable");
                break;
            case 9:
            case 10:
                System.out.println("\nExcelente");
                break;

        }
    }

    public static int castNumero() {
        System.out.print("\nintroduce tu nota: ");
        Scanner consoleInput = new Scanner(System.in);
        String cast = consoleInput.next();
        int num;

        try {
            num = Integer.parseInt(cast);
            if (num <0|| num>10){
                System.out.println("\u001B[31mNo puedes tener una nota inferior a 0 o superior a 10\u001B[0m\n");
            }
            else {
                return num;
            }
        } catch (NumberFormatException e) {
            System.out.print("\n\u001B[31mNo es un valor valido\u001B[0m\n");
        }
        return castNumero();

    }
}