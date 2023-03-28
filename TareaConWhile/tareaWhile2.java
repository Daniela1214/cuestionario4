package TareaConWhile;

import java.util.Scanner;

public class tareaWhile2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduaca un numero ");
        int numero = entrada.nextInt();
        int i = 0;

        if(numero!=42){

            while(numero>=i){
                int cuadrado = (int)Math.pow(i, 2);
                System.out.printf("El cuadrado de %s es %s\n ", i, cuadrado);
                i++;
            }

        }else{
            System.out.println("El numero introducido es 42 por tanto ce detiene el programa");
        }
    }
}
