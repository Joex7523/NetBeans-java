/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.EXITO.precioFerreteria;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
 class Ferreteria {
     void ferreteria2(int op2) {

        Scanner leer = new Scanner(System.in);
        while (op2 <= 5) {
            System.out.println("Ferreteria");
            System.out.println("1 - pala :$100");
            System.out.println("2- martillo :$200");
            System.out.println("3 - destornillador :$300");
            System.out.println("4 - taladro :$400");
            System.out.println("5 - alicate9 :$500");
            System.out.println("6 - volver atras");
            System.out.println(""+op2);

            op2 = Integer.parseInt(leer.next());
            if (op2 == 1) {
                precioFerreteria = precioFerreteria + 100;
            } else if (op2 == 2) {
                precioFerreteria = precioFerreteria + 200;
            } else if (op2 == 3) {
                precioFerreteria = precioFerreteria + 300;
            } else if (op2 == 4) {
                precioFerreteria = precioFerreteria + 400;
            } else if (op2 == 5) {
                precioFerreteria = precioFerreteria + 500;
            }

        }
        System.out.println("total a pagar en Ferrreteria: " + precioFerreteria);
    }
    
}
