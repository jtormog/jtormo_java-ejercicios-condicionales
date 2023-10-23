import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();

        while (valores.size() <2) {
            int num = castNumero();
            valores.add(num);
        }
        System.out.println("\n"+Math.max(valores.get(0),valores.get(1)));

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
