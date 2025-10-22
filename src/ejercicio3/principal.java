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
            int llave= 0;
            System.out.println("inventario llave: "+llave);
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (llave==0){
                    System.out.println("La puerta esta cerrada, necesitas una llave para abrirla \n" +
                            "vuelves a atras");}
                    else {
                        System.out.println("abriste la puerta y escapaste !!felicidades "+nombre);
                        haganado=true;
                    }
                    break;

                case 2:
                    System.out.println("miras en el cajon pero no encuentras nada. \n" +
                            "vuelves a atras");
                    break;

                case 3:
                    System.out.println("dentro de el armario encuentras una cerradura de codigo");
                    System.out.println("la intentas abrir (Si) o decides vulver a atras (No)");
                    String decision = sc.next();
                    if (decision.equalsIgnoreCase("Si")) {
                        System.out.println("tienes 3 intentos para abrir la caja fuerte");
                        int numero;
                        numero = (int) (Math.random() * 10) + 1;
                        for (int i=3;i>=0; i--){
                            System.out.println("tienes que intentar adivinar numero de 1 al 10, tienes 3 intentos antes de que explote");
                            System.out.println(numero);
                            int code = sc.nextInt();
                            if(code==numero){
                                System.out.println("abriste la caja fuerte, coges la llave ");
                                llave = 1;
                                break;
                            }else {
                                System.out.println("codigo incorrecto introduzcalo de nuevo");
                            }
                            if (i==1){
                                System.out.println("EXPLOTASTE Y PERDISTE");
                                perdido=true;
                            }
                        }
                    }else {
                        System.out.println("vuelves para atras");
                    break;
                    }

            }
        }
    }
}
