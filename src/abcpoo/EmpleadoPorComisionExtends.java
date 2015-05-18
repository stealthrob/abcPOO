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
public class EmpleadoPorComisionExtends extends Empleado implements Serializable{
protected double comision,ventasBrutas;
    public EmpleadoPorComisionExtends(String nombre, String apellidos, String nss, double comision, double ventasBrutas) {
        super(nombre, apellidos, nss);
        this.comision=validarTarifaComision(comision);
        this.ventasBrutas=validarVentas(ventasBrutas);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = validarTarifaComision(comision);
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = validarVentas(ventasBrutas);
    }
    
    protected double ingresos(){
        return ventasBrutas*comision;
    }

    @Override
    public String toString(){
        return String.format("Empleado por Comision: %s\nApellidos: %s\nNSS: %s\n"
                + "Venta: %.2f\nTarifa Comision: %.2f\nIngreso: %.2f",
                super.getNombre(),super.getApellidos(),super.getNss(),ventasBrutas,comision,ingresos());
    }
    
    protected double validarVentas(double VentasBrutas){
        return (VentasBrutas<0)?0:VentasBrutas;
    }
    
    
    protected double validarTarifaComision(double tarifaComision){
        return (tarifaComision>=0.0&&tarifaComision<=1)?tarifaComision:0.0;
    }
    
    
    
}
