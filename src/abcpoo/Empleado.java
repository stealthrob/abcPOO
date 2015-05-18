/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcpoo;

import java.io.Serializable;

/**
 *
 * @author RNS
 */
public class Empleado implements Serializable{
    private String nombre;
    private String apellidos;
    private String nss;

    public Empleado(String nombre, String apellidos, String nss) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }
    
    
    
}
