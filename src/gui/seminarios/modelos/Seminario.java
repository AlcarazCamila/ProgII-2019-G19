/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.seminarios.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Seminario {
    private LocalDate fechaExposicion;
    private String observaciones;
    private NotaAprobacion aprobacion;

    public Seminario(LocalDate fechaExposicion, NotaAprobacion aprobacion, String observaciones) {
        this.fechaExposicion = fechaExposicion;
        this.aprobacion = aprobacion;
        this.observaciones = observaciones;
    }
    
    public void mostrar(){
        System.out.println("Fecha de Exposición: " + fechaExposicion);
        System.out.println("Aprobacion: " + aprobacion);
        System.out.println("Observaciones: " + observaciones + "\n");
    }

    @Override
    public String toString() {
        return "Fecha de Exposición: " + fechaExposicion + "\nAprobación: " + aprobacion + "\nObservaciones: " + observaciones + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.fechaExposicion);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seminario other = (Seminario) obj;
        if (!Objects.equals(this.fechaExposicion, other.fechaExposicion)) {
            return false;
        }
        return true;
    }
    
    public NotaAprobacion getAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(NotaAprobacion aprobacion) {
        this.aprobacion = aprobacion;
    }

    public LocalDate getFechaExposicion() {
        return fechaExposicion;
    }

    public void setFechaExposicion(LocalDate fechaExposicion) {
        this.fechaExposicion = fechaExposicion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
