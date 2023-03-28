package TareaConFor;
import java.util.Scanner;

public class tarea5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdusca un numero: ");
        int numero = entrada.nextInt();

        for(int i = 0; numero > i; i++){
            for(int c = 0; i >= c; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
