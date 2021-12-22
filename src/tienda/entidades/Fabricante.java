/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.entidades;

/**
 *
 * @author eze_1
 */
public class Fabricante {
    
    
    private int codigoo;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(int codigoo, String nombre) {
        this.codigoo = codigoo;
        this.nombre = nombre;
    }

    public int getCodigoo() {
        return codigoo;
    }

    public void setCodigoo(int codigoo) {
        this.codigoo = codigoo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "codigoo: " + codigoo + "| nombre: " + nombre + '}';
    }

    public void setCodigo(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
