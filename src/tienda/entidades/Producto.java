/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.entidades;

import java.util.Comparator;
import java.util.List;



/**
 *
 * @author eze_1
 */
public class Producto  {

    public static void sort(Comparator<Producto> ordenarPrecio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    • private int codigo;
//• private String nombre;
//• private double precio;
//• private int codigoFabricant

    public static void sort(List<Producto> productos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int codigo;
    public String nombre;
    private Double precio;
    private int codigoFabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, Double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }

    public Producto(List<Producto> productoss) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo: " + codigo + "| nombre: " + nombre + " | precio: " + precio + " | codigoFabricante: " + codigoFabricante + '}';
    }

            
    
}
