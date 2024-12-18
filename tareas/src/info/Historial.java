/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase que representa un historial de cambios realizados en tareas.
 * 
 * Esta clase almacena información sobre los cambios que se realizan en las tareas, incluyendo el cambio
 * en el estado, prioridad, nombre y la fecha en que se realizó el cambio.
 * 
 * @author Nicole Arias
 */
public class Historial {
    private String cambio;
    private String nom;
    private String camest;
    private String campri;
    private String fechaDeCambio;
    
    
     /**
     * Constructor para crear un objeto `Historial` con la información proporcionada.
     * 
     * @param cambio El cambio realizado (por ejemplo, "estado cambiado").
     * @param nom El nombre de la tarea asociada al cambio.
     * @param camest El estado anterior de la tarea.
     * @param campri La prioridad anterior de la tarea.
     * @param fecha La fecha en que se realizó el cambio.
     */
    public Historial(String cambio,String nom,String camest,String campri,String fecha){
        this.cambio=cambio;
        this.nom= nom;
        this.camest=camest;
        this.campri=campri;
        fechaDeCambio= fecha;
    }
    
    /**
     * Obtiene el tipo de cambio realizado.
     * 
     * @return El cambio realizado, como una cadena de texto.
     */
    public String getCambio(){
        return cambio;
    }
    
    /**
     * Obtiene el nombre de la tarea asociada al historial.
     * 
     * @return El nombre de la tarea, como una cadena de texto.
     */
    public String getnom(){
        return nom;
    }
    
     /**
     * Obtiene la fecha en que se realizó el cambio.
     * 
     * @return La fecha del cambio, como una cadena de texto.
     */
    public String getfecha(){
        return fechaDeCambio;
    }
    
    /**
     * Obtiene la prioridad anterior de la tarea.
     * 
     * @return La prioridad anterior, como una cadena de texto.
     */
    public String getcampri(){
        return campri;
    }
    
    /**
     * Obtiene el estado anterior de la tarea.
     * 
     * @return El estado anterior, como una cadena de texto.
     */
    public String getcamest(){
        return camest;
    }
    
    
    /**
     * Establece el tipo de cambio realizado.
     * 
     * @param nN El nuevo tipo de cambio, como una cadena de texto.
     */
    public void setCambio(String nN){
        this.cambio=nN;
    }
    
    /**
     * Establece el nombre de la tarea asociada al historial.
     * 
     * @param nN El nuevo nombre de la tarea, como una cadena de texto.
     */
    public void setnom(String nN){
        this.nom=nN;
    }
    
    /**
     * Establece la prioridad anterior de la tarea.
     * 
     * @param nN La nueva prioridad de la tarea, como una cadena de texto.
     */
    public void setcampri(String nN){
        this.nom=nN;
    }
    
    /**
     * Establece el estado anterior de la tarea.
     * 
     * @param nN El nuevo estado de la tarea, como una cadena de texto.
     */
    public void setcamest(String nN){
        this.nom=nN;
    }
}
