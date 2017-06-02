/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

/**
 *
 * @author inmer
 */
public class Actividades {
    
    private int id;
    private String actividad;
    private int predecesor;
    private int tiempo;
    private String recurso;

    public Actividades(int id, String actividad, 
            int predecesor, int tiempo, String recurso) {
        this.id = id;
        this.actividad = actividad;
        this.predecesor = predecesor;
        this.tiempo = tiempo;
        this.recurso = recurso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getPredecesor() {
        return predecesor;
    }

    public void setPredecesor(int predecesor) {
        this.predecesor = predecesor;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    
 

}
