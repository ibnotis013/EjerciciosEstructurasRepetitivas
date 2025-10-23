package ejercicio4;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero = (int) (Math.random() * 100)+1;
        boolean acertar = false;
        int intento=1;
        System.out.println(numero);
        System.out.println("bienvenido, intente adivinar el numero");
        System.out.println("ingrese un numero");
        do {
            int num = sc.nextInt();
            if(numero!=num){
                System.out.println("numero incorrecto, introduzca otro");
                intento=intento+1;
                if(numero>num){
                    System.out.println("el numero es mas alto");
                } else {
                    System.out.println("el numero es mas bajo");
                }
            }
            if (num == numero) {

                acertar = true;
                for (int i=1;i<=3;i++){
                    System.out.println("felicidades, acertaste el numero");
                }
                System.out.println("numero de intentos "+intento);
            }


        }while (!acertar);
    }
}
