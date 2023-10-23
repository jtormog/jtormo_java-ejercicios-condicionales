import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();

        while (valores.isEmpty()) {
            int num = castNumero();
            valores.add(num);
        }
        if (valores.get(0) >=0 ){
            System.out.println("\nEs positivo");
        }
        else {
            System.out.println("\nEs negativo");
        }
    }


    static int castNumero() {
        Scanner consoleInput = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        while (!valido){
            System.out.print("introduce un numero entero: ");

            try {
                num = consoleInput.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                consoleInput.next();
                System.out.println("\n\u001B[31mNo es un valor valido\u001B[0m\n");
            }

        }return num;
    }
}
