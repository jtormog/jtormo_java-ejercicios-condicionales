import java.util.*;

public class Ejercicio15 {

    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();

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
            int num = Integer.parseInt(cast);
            return num;
        } catch (NumberFormatException e) {
            System.out.print("\n\u001B[31mNo es un valor valido\u001B[0m\n");
        }
        return castNumero();
    }
}
