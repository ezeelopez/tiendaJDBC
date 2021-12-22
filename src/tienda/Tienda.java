/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;
import tienda.servicio.TiendaService;

/**
 *
 * @author eze_1
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//
//f) Ingresar un producto a la base de datos.
//g) Ingresar un fabricante a la base de datos
//h) Editar un producto con datos a elección   
        TiendaService serv = new TiendaService();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int salir = 0;
        String stop;

        do {
            System.out.println("selecciones las siguiente opciones");
            System.out.println("1 mostrar todo los producto");
            System.out.println("2 mostrar todo los fabricante");
            System.out.println("3 ingresar un nuevo producto");
            System.out.println("4 ingresar un nuevo fabricante");
            System.out.println("5 mostrar el nombre y precio del producto");
            System.out.println("6 mostrar precio desde 120 a 202");
            System.out.println("7 mostrar el producto portatil");
            System.out.println("8 mostrar el precio mas barato");
   
            int num = leer.nextInt();

            switch (num) {
                case 1:
                    try {
                        serv.imprimirProducto();
                    } catch (Exception e) {
                        System.out.println();
                    }
                    break ;
                case 2:
                     try {
                        serv.listarFabricante();
                    } catch (Exception e) {
                        System.out.println();
                    }
                    break ;
                case 3:
                       try{
                      serv.ingresarProducto();
                     }catch(Exception e){
                       System.out.println();
                     }
                       break;
                case 4:
                      try{
                      serv.ingresarFabricante();
                     }catch(Exception e){
                       System.out.println();
                     }
                       break;
                case 5:
                     try {
                            serv.imprmirNombrePrecio();
                        } catch (Exception e) {
                            System.out.println();
                        }
                     break;
                case 6:
                      try {
                
                            serv.imprmirVerificarPrecio();
                        } catch (Exception e) {
                            System.out.println();
                        }
                      break;
                case 7:
                    try {
                            serv.imprmirPortatl();
                        } catch (Exception e) {
                            System.out.println();
                        }
                    break;
                case 8:
                            try {
                           serv.PrecioBarato();
                        } catch (Exception e) {
                            System.out.println();
                        }
                        break;
                    }
         System.out.println("");
         System.out.println("DESEA CONTINUAR  S/N");
                    stop = leer.next();
               if(stop.equalsIgnoreCase("n")){
                   salir = 0;
               }else
                   salir = 1;
           
            
        } while (salir != 0) ;
              
    
        
////        
//        try {
//            serv.modificarFabricante();
//        } catch (Exception e) {
//            System.out.println();
//        }
//
 }

}
