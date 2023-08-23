/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Cliente;

/**
 *
 * @author Student
 */
public class ControladorClientes {
    private int edad;
    private String Discapacidad;
    private String op;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDiscapacidad() {
        return Discapacidad;
    }

    public void setDiscapacidad(String Discapacidad) {
        this.Discapacidad = Discapacidad;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public ControladorClientes(int edad, String Discapacidad, String op) {
        this.edad = edad;
        this.Discapacidad = Discapacidad;
        this.op = op;
    }
    
}
