import java.util.InputMismatchException;
import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        int cara = castNumero();

        switch (cara){
            case 1:
                System.out.println("\nLa cara contraria a "+cara+" es 6");
                break;
            case 2:
                System.out.println("\nLa cara contraria a "+cara+" es 5");
                break;
            case 3:
                System.out.println("\nLa cara contraria a "+cara+" es 4");
                break;
            case 4:
                System.out.println("\nLa cara contraria a "+cara+" es 3");
                break;
            case 5:
                System.out.println("\nLa cara contraria a "+cara+" es 2");
                break;
            case 6:
                System.out.println("\nLa cara contraria a "+cara+" es 1");
                break;
        }
    }

    static int castNumero() {

        Scanner input = new Scanner(System.in);
        int caraDado = 0;
        System.out.print("\nIntroduce el resultado de lanzar el dado: ");
        boolean valido = false;
        while (!valido){
            try {
                caraDado = input.nextInt();
                if (caraDado >= 1 && caraDado <= 6) {
                    valido = true;
                } else {
                    System.out.println("\n\u001B[31mERROR: Número incorrecto\u001B[0m");
                }
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("\n\u001B[31mERROR: Se esperaba otro tipo de valor\u001B[0m");
            }
        }return caraDado;
    }
}
