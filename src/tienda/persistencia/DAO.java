/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.sql.Statement;
//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author eze_1
 */
public class DAO {
    
    protected Connection conexion = null;
    
    protected ResultSet resultado = null;
    
    protected Statement sentencia = null;
    
    
    private final String user = "root";
    private final String password = "root";
    private final String database = "tienda";
    
    
   
    protected void conectarBase() {
       
            try{
            Class.forName("com.mysql.jdbc.Driver") ;
            
            String urlDataBase = "jdbc:mysql://localhost:3306/" + database + "?useSSL=false";
            
            conexion = DriverManager.getConnection(urlDataBase, user, password);
            
          
    }catch(Exception e){
              System.out.println(e.getMessage());
        System.out.println("error al conectarse!!");
    }
            
    }
    

    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();
            sentencia =   conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception e) {
            
            
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    
    protected void consultarBase(String sql){
        
        try{
            conectarBase();
            
            sentencia = (Statement) conexion.createStatement();
            
            resultado = sentencia.executeQuery(sql);
            
        }catch(Exception e){
     
          System.out.println("error al consultar base!! ");
        }
            
    }
    protected void desconectarBase(){
        try{
            if(resultado!=null){
                resultado.close();
            }
            if(sentencia!=null){
                sentencia.close();
            }
            if(conexion!=null){
                conexion.close();
            }
            
            
        }catch(Exception e){
            System.out.println("error al desconectarse");
        }
    }
    
}
