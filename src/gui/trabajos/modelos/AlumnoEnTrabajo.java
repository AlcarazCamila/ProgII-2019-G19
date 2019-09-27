/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trabajos.modelos;

import gui.personas.modelos.Alumno;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class AlumnoEnTrabajo {
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private String razon;
    private Alumno alumno;

    public AlumnoEnTrabajo(LocalDate fechaDesde, Alumno alumno) {
        this.fechaDesde = fechaDesde;
        this.alumno = alumno;
    }
    
    public AlumnoEnTrabajo(LocalDate fechaDesde, Alumno alumno, LocalDate fechaHasta, String razon){
        this(fechaDesde, alumno);
        this.fechaHasta = fechaHasta;
        this.razon = razon;
    }

    @Override
    public String toString() {
        return alumno.getApellido() + ", " + alumno.getNombre();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.alumno);
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
        final AlumnoEnTrabajo other = (AlumnoEnTrabajo) obj;
        if (!Objects.equals(this.alumno, other.alumno)) {
            return false;
        }
        return true;
    }
    
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
}
