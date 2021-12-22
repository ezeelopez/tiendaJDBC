/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicio;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;



/**
 *
 * @author eze_1
 */
public class TiendaService {
    
 private ProductoDAO dao;
 private FabricanteDAO f;
 
 
    public TiendaService() {
     this.dao = new ProductoDAO();
     this.f = new FabricanteDAO();
    }
 

  
    
    @Override
    public String toString() {
        return "ProductoService{" + "dao= " + dao + '}';
    }

    
    public List<Producto> listarProducto() throws Exception{
        
        try {
            
            List<Producto> productos = dao.listarProducto();
            
            return productos;
               
        } catch (Exception e) {
              throw new Exception("error ");
        }
    }
    
    public void imprimirProducto() throws Exception{
        
        List<Producto> productos = dao.listarProducto();
        
        for (Producto pro : productos) {
            System.out.println(pro);
        }
        
    }
    //b) Lista los nombres y los precios de todos los productos de la tabla producto. 
    
    public void imprmirNombrePrecio() throws Exception{
        
         List<Producto> productos = dao.listarProducto();
         
         for (Producto pro : productos) {
             System.out.println(pro.getNombre() + "" + pro.getPrecio());
            
        }
}
    
//c) Listar aquellos productos que su precio esté entre 120 y 202. 
    
    public void  imprmirVerificarPrecio() throws Exception{
        
        List<Producto> productos = dao.verificarPrecio();
        
        for (Producto pro : productos) {
             System.out.println(pro.getPrecio() + "" + pro.getNombre());
        }
    }
    
      //d) Buscar y listar todos los Portátiles de la tabla producto.   
   
    public void  imprmirPortatl() throws Exception{
        try{
        List<Producto> productos = dao.listarPortatil();
        
             for (Producto pro : productos) {
                System.out.println(pro.getNombre());          }
      
        }catch(Exception e){
            System.out.println("aca no existe nombre portatil!");
        }
    }
    
//    e) Listar el nombre y el precio del producto más barato. 
    
     public void PrecioBarato ()throws Exception{
     try {
         List<Producto> productos = dao.listarProducto();
        
        System.out.print(Collections.min(productos , ordenarPrecio));
       
        
     } catch (Exception e) {
       System.out.println("aca no existe precio barato!!!");
     }
     
     }
         
     
     public void ingresarProducto ()throws Exception{
     try {
    
       dao.ingresarProducto();
       
     } catch (Exception e) {
       System.out.println(e.getMessage());
       System.out.println("aca no existe EL NUEVO DATO!!!");
     }
     
     }
     
    
    public List<Fabricante> listarFabricante() throws Exception{
        
        try {
            
            List<Fabricante> Fabricante = f.listarFabricante();
            
            for (Fabricante f : Fabricante) {
                System.out.println(f);
            }
            
            return Fabricante;
               
        } catch (Exception e) {
              throw new Exception("error ");
        }
    }
     
 
     public void ingresarFabricante ()throws Exception {
     try {
         
       f.ingresarFabricante();
       
     } catch (Exception e) {
       System.out.println(e.getMessage());
       System.out.println("aca no existe EL NUEVO fabricante!!");
     }
    
     }
     
       public void modificarFabricante ()throws Exception {
     try {
         
       f.modificarFabricante();
       
     } catch (Exception e) {
       System.out.println(e.getMessage());
       System.out.println("NO SE HA MODIFICADO!!");
     }
      
     }
     
       public static Comparator<Producto> ordenarPrecio = new Comparator<Producto>() {
        
        @Override
        public int compare(Producto o1, Producto o2) {
            
            return o1.getPrecio().compareTo(o2.getPrecio());
        }
    
    };
}
      

