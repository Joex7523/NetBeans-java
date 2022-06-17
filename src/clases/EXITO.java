package clases;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aprendiz
 */
import com.sun.glass.ui.SystemClipboard;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;


public class EXITO {
    
    
      static int preciototal = 0;
    static int precioLacteos = 0;
    static int precioGranos = 0;
    static int precioVerduras = 0;
    static int precioFrutas = 0;
    static int precioJugueteria = 0;
    static int precioFerreteria = 0;
        static int p = 0;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        

        int op1 = 0;
        int op2 =0;
        
        
             

        System.out.println("Bienvenido a la tienda virtual supermercados Exito");
        System.out.println("seleccione una categoria de su interes.");
        

        do {

            System.out.println("1 - Lacteos");
            System.out.println("2 - Granos");
            System.out.println("3 - Verduras");
            System.out.println("4 - Frutas");
            System.out.println("5 - Jugueteria");
            System.out.println("6 - Ferreteria");
            System.out.println("7 - suma de dos numeros");
            System.out.println("8 - Fin de la compra y total");

            op1 = Integer.parseInt(teclado.next());

            switch (op1) {
                case 1:

                    Lacteos lacteos= new Lacteos();
                    lacteos.lacteo(op2);

                 break;
                case 2:

                    Granos grano= new Granos();
                    grano.granos(op2);
                 break;
                case 3:

                    Verduras verdura= new Verduras();
                    verdura.verduras2(op2);
                 break;
                case 4:

                    Frutas fruta=new Frutas();
                    fruta.frutas2(op2);
               break;
                case 5:

                    Jugueteria juguete= new Jugueteria();
                    juguete.jugueteri2(op2);
                 break;

                case 6:

                    Ferreteria ferro= new Ferreteria();
                    ferro.ferreteria2(op2);

                    break;
                    
                 case 7:
                     System.out.println("ingrese numero a");
        int a=teclado.nextInt();
         System.out.println("ingrese numero a");
        int b=teclado.nextInt();
        

                     

                    break;

                //default:
                //System.out.println("total: "+precio);
            }

            sumaTotal suma= new sumaTotal();
            suma.sumaTotal();
           

        } while (op1 != 8);

    }


  
    
    
    

    static void suma() {

    }

   



  

   

  

    

}
