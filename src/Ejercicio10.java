import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();

        while (valores.size() <2){
            int num = castNumero();
                valores.add(num);
        }
        System.out.println("\nLa suma de "+ valores.get(0)+ " y " +valores.get(1)+ " es: "+ (valores.get(0) + valores.get(1)));
        System.out.println("La resta entre "+ valores.get(0)+ " y " +valores.get(1)+ " es: "+ (valores.get(0) - valores.get(1)));
        System.out.println("El producto de "+ valores.get(0)+ " por " +valores.get(1)+ " es: "+ (valores.get(0) * valores.get(1)));
        if (valores.get(1) != 0){
            float divisor = valores.get(0);
            float dividendo = valores.get(1);
            System.out.println("La división entre "+ valores.get(0)+ " y " +valores.get(1)+ " es: "+ (divisor/dividendo));
        }
        else {
            System.out.println("La división entre "+ valores.get(0)+ " y " +valores.get(1)+ " es: infinito");
        }

    }


    public static int castNumero() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("\nintroduce un numero entero: ");
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
