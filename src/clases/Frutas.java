/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import static clases.EXITO.precioFrutas;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
class Frutas{ 
void frutas2(int op2) {

        Scanner leer = new Scanner(System.in);
        while (op2 <= 5) {
            System.out.println("frutas");
            System.out.println("1 - manzana :$100");
            System.out.println("2- pera :$200");
            System.out.println("3 - banano :$300");
            System.out.println("4 - uvas :$400");
            System.out.println("5 - durazno :$500");
            System.out.println("6 - volver atras");

            op2 = Integer.parseInt(leer.next());
            if (op2 == 1) {
                precioFrutas = precioFrutas + 100;
            } else if (op2 == 2) {
                precioFrutas = precioFrutas + 200;
            } else if (op2 == 3) {
                precioFrutas = precioFrutas + 300;
            } else if (op2 == 4) {
                precioFrutas = precioFrutas + 400;
            } else if (op2 == 5) {
                precioFrutas = precioFrutas + 500;
            }

        }
        System.out.println("total a pagar en Frutas: " + precioFrutas);
}
    }



