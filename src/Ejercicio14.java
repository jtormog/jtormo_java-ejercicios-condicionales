import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();

        while (valores.size() <2) {
            int num = castNumero();
            valores.add(num);
        }
        if (Objects.equals(valores.get(0), valores.get(1)))
        {
            System.out.println("\nAmbos números son iguales");
        }
        else {
            System.out.println(Math.max(valores.get(0),valores.get(1)));
        }
    }


    static int castNumero() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("introduce un numero entero: ");

        try {
           return consoleInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("\n\u001B[31mNo es un valor valido\u001B[0m\n");
        }
        return castNumero();
    }
}
