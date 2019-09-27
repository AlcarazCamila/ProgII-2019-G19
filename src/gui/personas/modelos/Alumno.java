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
public class Alumno extends Persona{
    
    private String cx;

    public Alumno(String apellido, String nombre, int dni, String cx) {
        super(apellido, nombre, dni);
        this.cx = cx;
    }
    
    @Override
    public void mostrarPersona(){
        System.out.println("[" + super.getDni() + "] " + super.getApellido() + ", " + super.getNombre());
        System.out.println("CX" + cx);
        System.out.println("");
    }

    @Override
    public String toString() {
        return "[" + super.getDni() + "] " + super.getApellido() + ", " + super.getNombre() + " - CX" + cx;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Alumno other = (Alumno) obj;
            if (!Objects.equals(this.cx, other.cx)) {
                return false;
            }
        }
        return true;
    }
    
    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }
    
}
