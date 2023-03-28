package TareaConWhile;

import java.util.Scanner;

public class tareaWhile1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Intoduce un numero ");
        int numero = entrada.nextInt();
        int i = 0;
        

        while(numero>=i){
            
            System.out.printf("%s segundos...\n",numero-i);
            i++;

        }

    }
}
