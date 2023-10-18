import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();

        while (valores.size() <3) {
            int num = castNumero();
            valores.add(num);
        }
        Collections.sort(valores);
        System.out.println(valores.getLast());

    }


    public static int castNumero() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("introduce un numero entero: ");
        String cast = consoleInput.next();

        try {
            return Integer.parseInt(cast);
        } catch (NumberFormatException e) {
            System.out.print("\n\u001B[31mNo es un valor valido\u001B[0m\n");
        }
        return castNumero();
    }
}
