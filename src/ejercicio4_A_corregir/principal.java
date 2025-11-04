package ejercicio4_A_corregir;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int[] numeros_usados = new int[100];
        int numero_secreto = (int) (Math.random() * 100) + 1;
        System.out.println(numero_secreto);
        int numero_usuario;
        int iteradora =0 ;
        do{
            System.out.println("Adivina un número entre 1 y 100:");
            Scanner teclado = new Scanner(System.in);
            numero_usuario = teclado.nextInt();
            boolean repetido = true;


            for( int i =0; i<numeros_usados.length; i++){
                if(numero_usuario == numeros_usados[i]){
                    System.out.println("El número ya ha sido usado. No es el número secreto");
                }else{
                    repetido = false;

                }
            }
            if(!repetido){
                numeros_usados[iteradora] = numero_usuario;
                iteradora++;
            }
        }while((numero_secreto != numero_usuario)  &&(iteradora<numeros_usados.length));

        if(numero_usuario == numero_secreto){
            System.out.println("Has acertado el numero. Felicidades");
            System.out.println("has usado "+iteradora+" intentos para adivinard");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(800);
                System.out.println("felicidades");
            }
        }else {
            System.out.println("PROGRAMA FINALIZADO");
        }
        System.out.println("numerios usados por el usuario");
        for(int i =0; i<numeros_usados.length; i++){
            System.out.println(numeros_usados[i]);
        }
    }
}

