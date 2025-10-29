package ejercicio5;

import java.util.Scanner;

public class principal {
    static void main() {
        double acumuladornota = 0;
        int contador = 0;
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            double nota;
            do {
                System.out.println("introduzca nota");
                nota = sc.nextDouble();
                if (nota==-1){
                    break;
                }
            }while(nota>10 || nota <0);
            if (nota==-1){
                break;
            }
            contador++;
            acumuladornota += nota;
            System.out.println(acumuladornota);
            System.out.println(contador);

        }
        System.out.println("la media es "+(acumuladornota/contador));
        }
    }

