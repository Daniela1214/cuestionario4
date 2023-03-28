package TareaConWhile;

import java.util.Scanner;

public class tareaWhile3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dijite un rango de numeros deparados por un espacio: ");
        int numero1 = entrada.nextInt();

        int numero2 = entrada.nextInt();

        int i = numero1;

        if (numero2 > numero1){

            while(numero2>=i){
                String texto = String.valueOf(i);
                int ultimo = Integer.parseInt(texto.substring(texto.length()-1));

               switch (ultimo){
                case 2: 
                    System.out.println(i);
                    break;
                case 3: 
                    System.out.println(i);
                    break;
                case 6:
                    System.out.println(i);
                    break;
               }
               i++;

            }

            

        }else{
            System.out.println("El segundo numero no puede ser menor q el primero. ");
        }
        
    }
}
