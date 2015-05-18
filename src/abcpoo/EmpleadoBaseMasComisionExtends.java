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
public class EmpleadoBaseMasComisionExtends extends EmpleadoPorComisionExtends implements Serializable{
    private double salarioTotal,salarioBase;
    public EmpleadoBaseMasComisionExtends(String nombre, String apellidos, String nss, double comision, double ventasBrutas,double salarioTotal, double salarioBase) {
        super(nombre, apellidos, nss, comision, ventasBrutas);
        
        
    }


    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    public void ingresosTotales(double ingresos){
        salarioTotal = ingresos+salarioBase;
    }
    
    @Override
    public String toString(){
        return String.format("Empleado por Comision: %s\nApellidos: %s\nNSS: %s\n"
                + "Venta: %.2f\nTarifa Comision: %.2f\nIngreso: %.2f\n Salario Total: ",
                super.getNombre(),super.getApellidos(),super.getNss(),ventasBrutas,comision,super.ingresos(),salarioTotal);
    }
    
    
    
}
