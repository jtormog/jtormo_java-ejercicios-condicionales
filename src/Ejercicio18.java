import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("\nIntroduce tu nombre: ");
        String nombre = input.next();

        ArrayList<Double> sueldo = new  ArrayList<>();
        Double num;

        while (sueldo.size()<2){
            if (sueldo.isEmpty()) {
                System.out.print("\nIntroduce el numero de horas semanales:  ");
            } else {
                System.out.print("Introduce la tarifa normal :  ");
            }
            num = castNumero(sueldo.size());
            sueldo.add(num);
        }
        if (sueldo.get(0)>35){
            sueldo.set(0,((sueldo.get(0)-35)* (sueldo.get(1)*1.5))+(35*sueldo.get(1)));
        }
        else sueldo.set(0, sueldo.get(0)* sueldo.get(1));
        System.out.println("\nNombre: "+nombre+"\nSueldo bruto: "+sueldo.get(0)+"\nTarifa normal: "+sueldo.get(1));

    }
    static Double castNumero(int sizeList) {
        Scanner consoleInput = new Scanner(System.in);

        try {
            return consoleInput.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\n\u001B[31mNo es un valor valido\n\u001B[0m");
            switch (sizeList) {
                case 0:
                    System.out.print("Introduce el numero de horas semanales: ");
                    break;
                case 1:
                    System.out.print("Introduce la tarifa normal: ");
                    break;
            }

        }
        return castNumero(sizeList);
    }
}
