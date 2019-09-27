/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.modelos;

import java.util.Objects;

/**
 *
 * @author gabinete
 */
public abstract class Persona {
    private String apellido;
    private String nombre;
    private int dni;

    public Persona(String apellido, String nombre, int dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void mostrarPersona(){
        System.out.println("[" + dni + "] " + apellido + ", " + nombre);
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
/*RESPUESTA
    Crear una clase abstracta implica no poder instancear objetos de ese tipo.
*/