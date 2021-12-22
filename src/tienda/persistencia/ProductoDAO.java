/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author eze_1
 */
public class ProductoDAO extends DAO{
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public List<Producto> listarProducto() throws Exception {
         
        try {
            
            String sql = "SELECT codigo , nombre , precio , codigo_fabricante "
                    + "FROM Producto";
            consultarBase(sql);
            
            Producto producto = null;
            
            List<Producto> productos = new ArrayList<>();
            
            while(resultado.next()){
                
                producto = new Producto();
                
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                
                productos.add(producto);
                
            }
            
            return productos;
            
        } catch (Exception e) {
            System.out.println("error al desconectarse ");
            throw new Exception("");
        } finally {
            desconectarBase();
        }
       

    }

    public List<Producto> listarPortatil() throws Exception {
         
        try {
            
            String sql = "SELECT nombre FROM Producto " 
                    + "WHERE nombre LIKE 'portatil%'";
            consultarBase(sql);
            
            Producto producto = null;
            
            List<Producto> productos = new ArrayList<>();
            
            while(resultado.next()){
                
                producto = new Producto();

               producto.setNombre(resultado.getString(1));
            
                productos.add(producto);
                
            }
            
            return productos;
            
        } catch (Exception e) {
            System.out.println("error al desconectarse ");
            throw new Exception("");
        } finally {
            desconectarBase();
        }
       
    }
    public List<Producto> verificarPrecio() throws Exception {
         
        try {
            
            String sql = "SELECT * FROM Producto " 
                    + "WHERE precio >= 120 and precio <= 202";
            consultarBase(sql);
            
            Producto producto = null;
            
            List<Producto> productos = new ArrayList<>();
            
            while(resultado.next()){
                
                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            
                productos.add(producto);
                
            }
            
            return productos;
            
        } catch (Exception e) {
            System.out.println("error al desconectarse ");
            throw new Exception("");
        } finally {
            desconectarBase();
        }
       
    }
    
     //Ingresar un producto a la base de datos.
    
    public void  ingresarProducto() throws Exception {
  
        try {
            
           System.out.println("ingrese el nuevo nombre");
           String nom = leer.next();
           System.out.println("ingrese el precio");
           double pre = leer.nextDouble();
           System.out.println("ingrese el codigo de fabricante");
           int cod = leer.nextInt();
            String sql = "INSERT INTO producto "
                    + "VAlUES("  + this.generarCodigo() + " , '" + nom +" ' , " + pre +"," + cod +")";

           insertarModificarEliminar(sql);
            
        } catch (Exception e) {
          throw new Exception("");
        } finally {
            desconectarBase();
        }
       
    }


    public int generarCodigo( )  throws Exception{
        
        try {
            
             String sql =  "SELECT max(p.codigo)+1 from producto p ";
               consultarBase(sql);
            
            resultado.next();
            int x = resultado.getInt(1);
     
          return x;
          
        } catch (Exception e) {
            return 0 ;
        }
      
       
       
    }
    
    
    
    
    @Override
    public String toString() {
        return "ProductoDAO{ " + '}';
    }
            
        
    
}
            
    
    

