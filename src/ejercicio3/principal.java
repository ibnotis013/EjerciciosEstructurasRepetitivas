package ejercicio3;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre de personaje");
        String nombre = sc.nextLine();
        boolean haganado=false;
        boolean perdido=false;
        System.out.println("te despiertas en una habitacion, no entiendes nada, lo unico que sabes es que tienes qiue salir de ahi");
        System.out.println("miras la habitacion y ves una puerta, un cajon , un armario");
        while (!haganado && !perdido) {
            System.out.println("1. puerta");
            System.out.println("2. cajon");
            System.out.println("3. armario");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La puerta esta cerrada, necesitas una llave para abrirla \n" +
                            "vuelves a atras");
                    break;

                case 2:
                    System.out.println("miras en el cajon pero no encuentras nada. \n" +
                            "vuelves a atras");
                    break;

                case 3:
                    System.out.println("dentro de el armario encuentras una cerradura de codigo");
                    System.out.println("la intentas abrir (Si) o decides vulver a atras (No)");
                    String decision = sc.nextLine();
                    if  (decision.equals("Si")) {
                        for (int i=1;i>5; i++){

                        }
                    }
                    String caja=


            }




        }
    }
}
