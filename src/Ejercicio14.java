import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();

        while (valores.size() <2) {
            int num = castNumero();
            valores.add(num);
        }
        if (valores.get(0) == valores.get(1))
        {
            System.out.println("\nAmbos numeros son iguales");
        }
        else {
            System.out.println(Math.max(valores.get(0),valores.get(1)));
        }
    }


    public static int castNumero() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("introduce un numero entero: ");
        String cast = consoleInput.next();

        try {
            int num = Integer.parseInt(cast);
            return num;
        } catch (NumberFormatException e) {
            System.out.print("\n\u001B[31mNo es un valor valido\u001B[0m\n");
        }
        return castNumero();
    }
}
