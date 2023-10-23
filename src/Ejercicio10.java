import java.util.ArrayList;
import java.util.InputMismatchException;
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
