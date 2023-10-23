import java.util.InputMismatchException;
import java.util.Scanner;

public class promocion {
    public static void main (String[] args){
        System.out.print("\nIntroduce el valor total de la compra: ");
        double totcompra = Castnum();
        int bolita =(int) (Math.random()*5+1);

        switch (bolita){
            case 1:
                System.out.print("\nBolita \u001B[1mblanca\u001B[0m,");
                break;
            case 2:
                System.out.print("\nBolita \u001B[1m\u001B[32mverde\u001B[0m,");
                totcompra = totcompra*0.9;
                break;
            case 3:
                System.out.print("\nBolita \u001B[1m\u001B[33mamarilla\u001B[0m,");
                totcompra = totcompra* 0.75;
                break;
            case 4:
                System.out.print("\nBolita \u001B[1m\u001B[34mazul\u001B[0m,");
                totcompra = totcompra* 0.5;
                break;
            case 5:
                System.out.print("\nBolita \u001B[1m\u001B[31mroja\u001B[0m,");
                totcompra = 0;
                System.out.print(" enorauena es gratis\n");
                break;


        }
        if (totcompra != 0){
            System.out.print(" ta costao "+ totcompra+"\n");
        }


    }
    static int Castnum(){
        boolean valido = false;
        Scanner input = new Scanner(System.in);
        int num = 0;
        while (!valido){
          try {
              num = input.nextInt();
              valido = true;
          }catch (InputMismatchException e){
              System.out.println("\u001B[31m\u001B[1mError\u001B[0m\u001B[31m: introduce un numero valido\u001B[0m\n");
              input.next();
          }
        }
        return num;
    }
}
