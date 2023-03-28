package TareaConFor;
import java.util.Scanner;
import java.math.*;

public class tarea2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduaca un numero ");
        int numero = entrada.nextInt();


        if(numero!=42){
            for (int i = 0 ; numero >= i; i++){

                int cuadrado = (int)Math.pow(i, 2);
                System.out.printf("El cuadrado de %s es %s\n ", i, cuadrado);
    
            }
        }else{
            System.out.println("El numero introducido es 42 por tanto ce detiene el programa");
        }
        
    }
}
