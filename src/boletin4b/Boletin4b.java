/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4b;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin4b {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Consumo coche=new Consumo();
    int a=Integer.parseInt(JOptionPane.showInputDialog("teclea kms"));
    coche.setKm(a);
    int b=Integer.parseInt(JOptionPane.showInputDialog("Teclea consumo"));
  coche.setLitros(b);
  int c=Integer.parseInt(JOptionPane.showInputDialog("Teclea precio de gasolina"));
  coche.setpGas(c); 
  int d=Integer.parseInt(JOptionPane.showInputDialog("Teclea velocidad"));
  coche.setvMedia(d);
  coche.consumoEuros();
  coche.consumoMedio();
  coche.getTempo();
    }
    
}
