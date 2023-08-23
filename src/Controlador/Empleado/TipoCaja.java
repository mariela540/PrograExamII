/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Empleado;

/**
 *
 * @author Student
 */
public class TipoCaja {
   private char Plataforma;
   private char Cajas;
   private char Preferencial;

  
   
    public char getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(char Plataforma) {
        this.Plataforma = Plataforma;
    }

    public char getCajas() {
        return Cajas;
    }

    public void setCajas(char Cajas) {
        this.Cajas = Cajas;
    }

    public char getPreferencial() {
        return Preferencial;
    }

    public void setPreferencial(char Preferencial) {
        this.Preferencial = Preferencial;
    }
    
    public char TipoCaja(char Tip){
        if (Tip==Plataforma) {
          Plataforma= 'P';
        }
       return Plataforma;
    }
    
    
    
}
