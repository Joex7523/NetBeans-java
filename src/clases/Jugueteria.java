/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import static clases.EXITO.precioJugueteria;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
class Jugueteria{
  void jugueteri2(int op2) {

        Scanner leer = new Scanner(System.in);
        while (op2 <= 5) {
            System.out.println("Jugueteria");
            System.out.println("1 - uno :$100");
            System.out.println("2- monopolio :$200");
            System.out.println("3 - ajedrez :$300");
            System.out.println("4 - balon :$400");
            System.out.println("5 - plastilina :$500");
            System.out.println("6 - volver atras");

            op2 = Integer.parseInt(leer.next());
            if (op2 == 1) {
                precioJugueteria = precioJugueteria + 100;
            } else if (op2 == 2) {
                precioJugueteria = precioJugueteria + 200;
            } else if (op2 == 3) {
                precioJugueteria = precioJugueteria + 300;
            } else if (op2 == 4) {
                precioJugueteria = precioJugueteria + 400;
            } else if (op2 == 5) {
                precioJugueteria = precioJugueteria + 500;
            }

        }
        System.out.println("total a pagar en Jugueteria: " + precioJugueteria);
    }
}


