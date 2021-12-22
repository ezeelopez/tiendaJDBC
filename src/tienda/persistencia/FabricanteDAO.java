/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

/**
 *
 * @author eze_1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tienda.entidades.Fabricante;


public class FabricanteDAO extends DAO {
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   public List<Fabricante> listarFabricante() throws Exception {
         
        try {
            
            String sql = "SELECT codigo,nombre "
                    + "FROM fabricante";
            consultarBase(sql);
            
            Fabricante fabricant = null;
            
            List<Fabricante> fabricante = new ArrayList<>();
            
            while(resultado.next()){
                
                fabricant = new Fabricante();
                fabricant.setCodigoo(resultado.getInt(1));
                fabricant.setNombre(resultado.getString(2));
              
                
                fabricante.add(fabricant);
                
            }
            
            return fabricante;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error al desconectarse ");
            throw new Exception("");
        } finally {
            desconectarBase();
        }
       

    }

    
    
    public void  ingresarFabricante() throws Exception {
  
        try {
            
            System.out.println("ingrese un nuevo codigo");
            int codi = leer.nextInt();
            System.out.println("ingrese el nuevo nombre del fabricante");
           String nom = leer.next();
        
    
            String sql = "INSERT INTO fabricante "
                    + "VAlUES(" + codi + ", '"+nom+"'" + ")";

           insertarModificarEliminar(sql);
            
        } catch (Exception e) {
          throw new Exception("");
        } finally {
            desconectarBase();
        }
       
    }
    
    public void modificarFabricante()throws Exception {
        
            System.out.println("ingrese el nuevo fabricante a modificar");
        String nom = leer.next();
        System.out.println("ingrese el codigo en donde se encuentra");
        int codi = leer.nextInt();
            String sql = " SELECT * FROM FABRICANTE; "
                    + "UPDATE fabricante SET nombre ="+ nom +"WHERE codigo ="+codi+ ";";
                  

           insertarModificarEliminar(sql);
        
        
    }
    
    
    
    
    
}
