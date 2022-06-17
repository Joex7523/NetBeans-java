package clases;


import static clases.EXITO.precioGranos;

import java.util.Scanner;



 class Granos{

        Scanner leer = new Scanner(System.in);

        
 void granos(int op2) {
        while (op2 <= 5) {
            System.out.println("Granos");
            System.out.println("1 - frijol :$100");
            System.out.println("2- lenteja :$200");
            System.out.println("3 - soja :$300");
            System.out.println("4 - garbanzo :$400");
            System.out.println("5 - arbeja :$500");
            System.out.println("6 - volver atras");

            op2 = Integer.parseInt(leer.next());
            if (op2 == 1) {
                precioGranos = precioGranos + 100;
            } else if (op2 == 2) {
                precioGranos = precioGranos + 200;
            } else if (op2 == 3) {
                precioGranos = precioGranos + 300;
            } else if (op2 == 4) {
                precioGranos = precioGranos + 400;
            } else if (op2 == 5) {
                precioGranos = precioGranos + 500;
            }

        }
        System.out.println("total a pagar en Granos: " + precioGranos);
}
    }


