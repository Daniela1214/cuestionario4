package TareaConWhile;

import java.util.Scanner;

public class tareaWhile5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdusca un numero: ");
        int numero = entrada.nextInt();

        int i = 0;
        while(numero>i){
            int c = 0;
            while(i>=c){
                System.out.print("*");
                c++;
            }
            System.out.print("\n");
            i++;

        }

    }
}
