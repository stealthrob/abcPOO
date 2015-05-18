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
public class EmpleadoAsalariado extends Empleado implements Serializable{
private double salario;
    public EmpleadoAsalariado(String nombre, String apellidos, String nss, double salario) {
        super(nombre, apellidos, nss);
        this.salario = validarSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = validarSalario(salario);
    }
    
    private double validarSalario(double salario){
        return (salario<0)?0:salario;
    }
    
    @Override
    public String toString(){
        return String.format("Empleado por Comision: %s\nApellidos: %s\nNSS: %s\n"
                + "Salario: %.2f\n",
                super.getNombre(),super.getApellidos(),super.getNss(),salario);
    }
    
}
