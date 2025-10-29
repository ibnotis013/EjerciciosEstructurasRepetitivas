package ejercicio4;

import java.util.Scanner;

public class principal {
    static void main() {
        int [] numeros_usados = new int [100];
        Scanner sc = new Scanner(System.in);
        int numero = (int) (Math.random() * 100)+1;
        int intento=1;
        System.out.println(numero);
        System.out.println("bxienvenido, intente adivinar el numero");
        System.out.println("ingrese un numero");
        int num;
        int iteradora=0;
        do {
            num = sc.nextInt();

            numeros_usados[iteradora] = num;
            iteradora++;
            for (int i=0; i<numeros_usados.length; i++) {
                if (num==numeros_usados[i]) {
                    System.out.println("el numero es repetido");
                }else{
                    numeros_usados[i]=num;
                }

            }
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

                for (int i=1;i<=3;i++){
                    System.out.println("felicidades, acertaste el numero");
                }
                System.out.println("numero de intentos "+intento);
            }


        }while (num!=numero);
    }
}
