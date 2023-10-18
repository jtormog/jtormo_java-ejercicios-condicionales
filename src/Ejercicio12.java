import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();

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


    public static int castNumero() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("introduce un numero entero: ");
        String cast = consoleInput.next();
        int num;

        try {
            num = Integer.parseInt(cast);
            return num;
        } catch (NumberFormatException e) {
            System.out.print("\n\u001B[31mNo es un valor valido\u001B[0m\n");
        }
        return castNumero();
    }
}