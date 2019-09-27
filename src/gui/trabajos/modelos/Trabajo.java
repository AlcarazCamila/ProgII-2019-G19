/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trabajos.modelos;

import gui.seminarios.modelos.Seminario;
import java.awt.geom.Area;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Trabajo {
    private String titulo;
    private int meses;
    private LocalDate fechaPresentacion;
    private LocalDate fechaAprobacion;
    private LocalDate fechaExposicion;
    ArrayList<Area> areas = new ArrayList<>();
    ArrayList<AlumnoEnTrabajo> alumnost = new ArrayList<>();    
    ArrayList<RolEnTrabajo> rolest = new ArrayList<>();
    ArrayList<Seminario> seminarios = new ArrayList<>();

    public Trabajo(String titulo, ArrayList areas, int meses, LocalDate fechaAprobacion, ArrayList alumnost, ArrayList rolest) {
        this.titulo = titulo;
        this.meses = meses;
        this.fechaAprobacion = fechaAprobacion;
        this.areas = areas;
        this.alumnost = alumnost;
        this.rolest = rolest;
        
    }

    public Trabajo(String titulo, ArrayList a, int meses, LocalDate fechaAprobacion, ArrayList b, ArrayList c, LocalDate fechaPresentacion) {
        this(titulo, a, meses, fechaAprobacion, b, c);
        this.fechaPresentacion = fechaPresentacion;
    }
    
    public String agregarSeminario(Seminario s){
        if(!seminarios.contains(s)){
            seminarios.add(s);
            return "Seminario agregado CORRECTAMENTE!";
        }
        return "El Seminario NO se agregó a la Lista";
    }
    
    public String agregarProfesor(RolEnTrabajo r){
        if(!rolest.contains(r)){
            rolest.add(r);
            return "PROFESOR agregado CORRECTAMENTE!";
        }
        return "El Profesor NO se agregó a la Lista";
    }
    
    public String agregarAlumno(AlumnoEnTrabajo a){
        if(!alumnost.contains(a)){
            alumnost.add(a);            
            return "Alumno agregado CORRECTAMENTE!";
        }
        return "El Alumno NO se agregó a la Lista";
}
    
    public void mostrar(){
        System.out.println("Trabajo: " + titulo + "\nDuración: " + meses + " meses");
        System.out.println("Fecha de Presentación en la CA: " + fechaPresentacion);
        System.out.println("Fecha de Aprobación: " + fechaAprobacion);
        System.out.println("");
        System.out.println("Alumnos");
        System.out.println("----------------------");
        for(AlumnoEnTrabajo a : alumnost )
            System.out.println(a);
        System.out.println("");
        System.out.println("Tutor");
        System.out.println("----------------------");
        for(RolEnTrabajo r : rolest)
            if(r.getRol().equals(Rol.TUTOR) || r.getRol().equals(Rol.COTUTOR))
                System.out.println(r.getProfesor().getNombre() + " " + r.getProfesor().getApellido());
        System.out.println("");
        System.out.println("Jurado");
        System.out.println("----------------------");
        for(RolEnTrabajo r : rolest)
            if(r.getRol().equals(Rol.JURADO))
                System.out.println(r.getProfesor().getNombre() + " " + r.getProfesor().getApellido());
        System.out.println("");
        System.out.println("\tSEMINARIOS");
        if(!seminarios.isEmpty()){
            System.out.println("*Lista*");
            for(Seminario s : seminarios)
                s.mostrar();
        }
//        }else
//            System.out.println("La lista de Seminarios está VACÍA!");
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nDuración: " + meses + " meses" + "\nFecha de Exposición: " + fechaPresentacion + "\nFecha de aprobación: " + fechaAprobacion + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.titulo);
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
        final Trabajo other = (Trabajo) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    public LocalDate getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(LocalDate fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }
    
    public LocalDate getFechaExposicion() {
        return fechaExposicion;
    }

    public void setFechaExposicion(LocalDate fechaExposicion) {
        this.fechaExposicion = fechaExposicion;
    }
    
}
