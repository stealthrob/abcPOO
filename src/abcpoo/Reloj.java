/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcpoo;

import java.util.*;
import javax.swing.JLabel;

/**
 *
 * @author RNS
 */
public class Reloj extends JLabel implements Runnable{
    String dia, mes, año, hora, minutos, segundos; 
    
    private Calendar calendario = new GregorianCalendar();
    
    Thread hilo; 
    
    public Reloj( int x, int y, int p, int p1) { //Constructor 
setBounds(x, y, p, p1); 
hilo = new Thread(this); 
hilo.start(); 

} //fin constructor 
    
    public void actualiza() { 

Date fechaHoraActual = new Date(); 
calendario.setTime(fechaHoraActual); 

hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)); 
minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE); 
segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND); 
dia = calendario.get(Calendar.DATE) > 9 ? "" + calendario.get(Calendar.DATE) : "0" + calendario.get(Calendar.DATE); 
mes = calendario.get(Calendar.MONTH) > 9 ? "" + calendario.get(Calendar.MONTH) : "0" + calendario.get(Calendar.MONTH); 
año = calendario.get(Calendar.YEAR) > 9 ? "" + calendario.get(Calendar.YEAR) : "0" + calendario.get(Calendar.YEAR); 
}
 
    
    @Override
    public void run( ){ 
        Thread ct = Thread.currentThread(); 
while (ct == hilo) { 
try { 
actualiza(); 
int mesE; 
mesE = Integer.valueOf(mes) + 1; 

setText("<html><center>" + hora + ":" + minutos + ":" + segundos + "<br>" +   dia + " / " + mesE + " / " + año        ); 

Thread.sleep(1000); 
} catch (InterruptedException ex) { 
System.out.println(ex.getMessage()); 
} 

} 

} 

    
}
