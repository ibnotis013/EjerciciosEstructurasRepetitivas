package ejercicio2;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int saldo = 1000;
        System.out.println("bienvenido al cajero");
        boolean salir = true;
        do {
            System.out.println("ingrese una opcion");
            System.out.println("1. Saldo");
            System.out.println("2. ingresar");
            System.out.println("3. retirar");
            System.out.println("4. salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("tu saldo es de " + saldo);
                    break;

                case 2:
                    System.out.println("cuanto quiere ingresar");
                    int ingresar=sc.nextInt();
                    saldo= saldo+ingresar;
                    System.out.println("saldo es de " + saldo);
                    break;

                case 3:

                    System.out.println("cuanto quieres retirar");
                    boolean retirarinva=true ;
                    int retirar= sc.nextInt();
                    if(retirar>saldo||retirar<=0){
                        System.out.println("retirada invalida");
                        while(retirarinva){
                            System.out.println("cuanto quieres retirar");
                            retirar=sc.nextInt();
                            if(retirar>saldo||retirar<=0){
                                System.out.println("retirada invalida");
                            }
                            else {
                                retirarinva=false;
                                saldo=saldo-retirar;
                                System.out.println("retias "+retirar);
                                System.out.println("te queda "+saldo);
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("saliendo");
                    salir=false;
            }

        }while(salir);




    }
}
