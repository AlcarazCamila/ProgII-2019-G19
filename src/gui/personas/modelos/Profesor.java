/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.modelos;

import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Profesor extends Persona {
    private Cargo cargo;

    public Profesor(String apellido, String nombre, int dni, Cargo cargo) {
        super(apellido, nombre, dni);
        this.cargo = cargo;
    }
    
    @Override
    public void mostrarPersona(){
        System.out.println("[" + super.getDni() + "] " + super.getApellido() + ", " + super.getNombre());
        System.out.println("Cargo: " + cargo);
        System.out.println("");
    }

    @Override
    public String toString() {
        return "[" + super.getDni() + "] " + super.getApellido() + ", " + super.getNombre() + " - Cargo: " + cargo;
    }
    
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
           
}
