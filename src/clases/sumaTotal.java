/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.EXITO.precioFerreteria;
import static clases.EXITO.precioFrutas;
import static clases.EXITO.precioGranos;
import static clases.EXITO.precioJugueteria;
import static clases.EXITO.precioLacteos;
import static clases.EXITO.precioVerduras;
import static clases.EXITO.preciototal;

/**
 *
 * @author Aprendiz
 */
public class sumaTotal {
    
        void sumaTotal() {
             preciototal = precioGranos + precioLacteos + precioFerreteria + precioFrutas + precioVerduras + precioJugueteria;
        System.out.println("la suma total de la compra es: "+preciototal);
    }
}
