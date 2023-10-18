import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio17{

    public static void main(String[] args){
        List<Integer> tiempo = new  ArrayList<>();
        int num;

        while (tiempo.size()<3){
            if (tiempo.size() == 0) {
                System.out.print("\nIntroduce la hora: ");
            } else if (tiempo.size() == 1) {
                System.out.print("Introduce los minutos: ");
            } else if (tiempo.size() == 2) {
                System.out.print("Introduce los segundos: ");
            }
            num = castNumero(tiempo.size());
            tiempo.add(num);
        }
        tiempo.set(2,tiempo.get(2)+1);

        if (tiempo.get(0)>=24){
            tiempo.set(0,tiempo.get(0)-24);
        }
        if (tiempo.get(1)>=60){
            tiempo.set(1, tiempo.get(1)-60);
            tiempo.set(0, tiempo.get(0)+1);
        }
        if (tiempo.get(2)>=60){
            tiempo.set(2, tiempo.get(2)-60);
            tiempo.set(1, tiempo.get(1)+1);
        }
        System.out.println("\nDentro de un segundo serán las: "+tiempo.get(0)+":"+ tiempo.get(1)+":"+ tiempo.get(2));

    }

    public static int castNumero(int tamanyoLista) {
        Scanner consoleInput = new Scanner(System.in);
        String cast = consoleInput.next();
        int num;

        try {
            num = Integer.parseInt(cast);
            switch (tamanyoLista){
                case 0:
                    if (num >= 24 ||num <0){
                        System.out.println("\n\u001B[31mERROR: Se esperaba un numero entre el 0 y 23\u001B[0m");
                        System.out.print("\nIntroduce la hora: ");
                    }else{
                        return num;
                    }
                    break;
                case 1:
                    if (num >= 60){
                        System.out.println("\n\u001B[31mERROR: Se esperaba un numero entre el 0 y 59\u001B[0m");
                        System.out.print("\nIntroduce los minutos: ");
                    }else {
                        return num;
                    }
                    break;
                case 2:
                    if (num >= 60){
                        System.out.println("\n\u001B[31mERROR: Se esperaba un numero entre el 0 y 59\u001B[0m");
                        System.out.print("\nIntroduce los segundos: ");
                    }else {
                        return num;
                    }
                    break;
            }
            return castNumero(tamanyoLista);
        } catch (NumberFormatException e) {
            System.out.println("\n\u001B[31mNo es un valor valido\n\u001B[0m");
            switch (tamanyoLista){
                case 0:
                    System.out.print("Introduce la hora: ");
                    break;
                case 1:
                    System.out.print("Introduce los minutos: ");
                    break;
                case 2:
                    System.out.print("Introduce los segundos: ");
                    break;
            }

        }
        return castNumero(tamanyoLista);

    }

}
