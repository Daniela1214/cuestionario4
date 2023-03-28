package TareaConFor;
import java.util.Scanner;
import java.util.Timer;

public class tarea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Intoduce un numero ");
        int numero = entrada.nextInt();

        

        for(int i = 0 ;numero >= i; numero--){
            
            System.out.printf("%s segundos...\n", numero);
            

        }

    }
}
