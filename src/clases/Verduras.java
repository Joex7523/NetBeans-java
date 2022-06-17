/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import static clases.EXITO.precioVerduras;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
class Verduras{
   void verduras2(int op2) {

        Scanner leer = new Scanner(System.in);
        while (op2 <= 5) {
            System.out.println("verduras");
            System.out.println("1 - espinaca :$100");
            System.out.println("2- coliflor :$200");
            System.out.println("3 - zanahoria :$300");
            System.out.println("4 - tomate :$400");
            System.out.println("5 - cebolla :$500");
            System.out.println("6 - volver atras");

            op2 = Integer.parseInt(leer.next());
            if (op2 == 1) {
                precioVerduras = precioVerduras + 100;
            } else if (op2 == 2) {
                precioVerduras = precioVerduras + 200;
            } else if (op2 == 3) {
                precioVerduras = precioVerduras + 300;
            } else if (op2 == 4) {
                precioVerduras = precioVerduras + 400;
            } else if (op2 == 5) {
                precioVerduras = precioVerduras + 500;
            }

        }
        System.out.println("total a pagar en Verduras: " + precioVerduras);
   }
    }



