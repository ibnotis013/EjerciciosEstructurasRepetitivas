package ejercicio4_A_corregir;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
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

            //recorrer un array (vector) unidimensional

            for( int i =0; i<numeros_usados.length; i++){
                if(numero_usuario == numeros_usados[i]){
                    System.out.println("El número ya ha sido usado. No es el número secreto");
                }else{
                    repetido = false;

                }
            }
            if(!repetido){
                numeros_usados[iteradora] = numero_usuario;
            }
            iteradora++;
        }while(numero_secreto != numero_usuario);



    }
}

