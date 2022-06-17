package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
class Lacteos {


        Scanner leer = new Scanner(System.in);
double precioLacteos=0;
void lacteo(int op2) {
        while (op2 <= 5) {
            System.out.println("Lacteos");
            System.out.println("1 - leche :$100");
            System.out.println("2- yogurt :$200");
            System.out.println("3 - alpinito :$300");
            System.out.println("4 - queso :$400");
            System.out.println("5 - bon yurt :$500");
            System.out.println("6 - volver atras");

            op2 = Integer.parseInt(leer.next());
            if (op2 == 1) {
                precioLacteos = precioLacteos + 100;
            } else if (op2 == 2) {
                precioLacteos = precioLacteos + 200;
            } else if (op2 == 3) {
                precioLacteos = precioLacteos + 300;
            } else if (op2 == 4) {
                precioLacteos = precioLacteos + 400;
            } else if (op2 == 5) {
                precioLacteos = precioLacteos + 500;
            }
        }
        System.out.println("total a pagar en Lacteos: " + precioLacteos);
}
        

    }



