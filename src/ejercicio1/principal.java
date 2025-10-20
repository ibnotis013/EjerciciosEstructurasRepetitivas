package ejercicio1;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        boolean respuesta1 =false;
        System.out.println("Bienvenindo");
        int mayor;
        int menor;
        int numero;
        do {
            System.out.println("introdizca el primer numero");
            numero = sc.nextInt();
            mayor = numero;
            menor = numero;
            for (int i=2;i<6;i++){
                System.out.println("introdizca numero");
            numero  = sc.nextInt();
            if (numero>mayor){
                mayor = numero;
            }else if (numero<menor){
                menor = numero;
            }
            }
            System.out.println("el mayor es "+mayor);
            System.out.println("el menor es "+menor);
            System.out.println("quieres continuar con lo de los numeros (Si/No)");
            respuesta = sc.next();

            if (respuesta.equals("No")){
                System.out.println("chau");
                respuesta1 = true;
            }


        }while (!respuesta1);
    }
}
