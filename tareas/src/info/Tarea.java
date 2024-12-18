/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una tarea con atributos como nombre, descripción, prioridad, estado,
 * comentario, fechas de inicio y entrega, y una lista de usuarios asignados.
 * Permite gestionar los detalles de una tarea y asignar o eliminar usuarios.
 * 
 * @author Nicole Arias
 */
public class Tarea {
    
    private String Nombre;
    private String Descripcion;
    private String Prioridad;
    private String Estado;
    private String Comentario;
    private String FechaEntrega;
    private String FechaDeInicio;
    private List<Usuario> usuariosAsignados;
    
    /**
     * Constructor para crear una tarea con los atributos especificados.
     * 
     * @param nombre Nombre de la tarea.
     * @param descripcion Descripción detallada de la tarea.
     * @param prioridad Prioridad de la tarea (por ejemplo, alta, media, baja).
     * @param estado Estado actual de la tarea (por ejemplo, pendiente, en progreso, completada).
     * @param fechaEntrega Fecha de entrega de la tarea.
     * @param fechaDeInicio Fecha de inicio de la tarea.
     * @param comentario Comentarios adicionales sobre la tarea.
     */
    public Tarea(String nombre, String descripcion, String prioridad, String estado, String FechaEntrega,String FechaDeInicio, String comentario){
        this.Nombre=nombre;
        this.Descripcion=descripcion;
        this.Estado=estado;
        this.Prioridad=prioridad;
        this.Comentario = comentario;
        this.FechaEntrega= FechaEntrega;
        this.FechaDeInicio=FechaDeInicio;
        this.usuariosAsignados = new ArrayList<>();
    }
    
    /**
     * Obtiene el nombre de la tarea.
     * 
     * @return El nombre de la tarea.
     */
    public String getNombre(){
        return Nombre;
    }
    
    /**
     * Obtiene la descripción de la tarea.
     * 
     * @return La descripción de la tarea.
     */
    public String getDescripcion(){
        return Descripcion;
    }
    
    /**
     * Obtiene el estado de la tarea.
     * 
     * @return El estado de la tarea.
     */
    public String getEstado(){
        return Estado;
    }
    
    /**
     * Obtiene la prioridad de la tarea.
     * 
     * @return La prioridad de la tarea.
     */
    public String getPrioridad(){
        return Prioridad;
    }
    
    /**
     * Obtiene el comentario de la tarea.
     * 
     * @return El comentario de la tarea.
     */
    public String getComentario(){
        return Comentario;
    } 
    
    /**
     * Obtiene la fecha de entrega de la tarea.
     * 
     * @return La fecha de entrega de la tarea.
     */
    public String getFechaEntrega(){
        return FechaEntrega;
    } 
    
    /**
     * Obtiene la fecha de inicio de la tarea.
     * 
     * @return La fecha de inicio de la tarea.
     */
    public String getFechaDeInicio(){
        return FechaDeInicio;
    } 
    
    /**
     * Establece el nombre de la tarea.
     * 
     * @param eN El nuevo nombre de la tarea.
     */
    public void setNombre(String eN){
        this.Nombre = eN;
    }
    
    /**
     * Establece la descripción de la tarea.
     * 
     * @param eD La nueva descripción de la tarea.
     */
    public void setDescripcion(String eD){
        this.Descripcion = eD;
    }
    
    /**
     * Establece el estado de la tarea.
     * 
     * @param eE El nuevo estado de la tarea.
     */
    public void setEstado(String eE){
        this.Estado = eE;
    }
    
    /**
     * Establece la prioridad de la tarea.
     * 
     * @param eP La nueva prioridad de la tarea.
     */
    public void setPrioridad(String eP){
        this.Prioridad = eP; 
    }
    
    /**
     * Establece el comentario de la tarea.
     * 
     * @param eC El nuevo comentario de la tarea.
     */
    public void setComentario(String eC){
        this.Comentario = eC;
    }
    
    /**
     * Establece la fecha de entrega de la tarea.
     * 
     * @param eC La nueva fecha de entrega de la tarea.
     */
    public void setFechaEntrega(String eC){
        this.FechaEntrega = eC;
    }
    
    /**
     * Establece la fecha de inicio de la tarea.
     * 
     * @param eC La nueva fecha de inicio de la tarea.
     */
    public void setFechaDeInicio(String eC){
        this.FechaDeInicio = eC;
    }
    
    /**
     * Obtiene la lista de usuarios asignados a la tarea.
     * 
     * @return La lista de usuarios asignados.
     */
    public List<Usuario> getUsuariosAsignados() {
        return usuariosAsignados;
    }

    /**
     * Asigna un usuario a la tarea si aún no está asignado.
     * 
     * @param usuario El usuario a asignar a la tarea.
     */
    public void asignarUsuario(Usuario usuario) {
        if (!usuariosAsignados.contains(usuario)) {
            usuariosAsignados.add(usuario);
        }
    }

    /**
     * Elimina un usuario de la lista de usuarios asignados a la tarea.
     * 
     * @param usuario El usuario a eliminar de la tarea.
     */
    public void eliminarUsuario(Usuario usuario) {
        usuariosAsignados.remove(usuario);
    }
    
}
