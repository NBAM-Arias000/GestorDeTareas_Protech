/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario con atributos como nombre, correo, rol, contraseña, nombre de usuario
 * y una lista de tareas asignadas. Permite gestionar los datos de un usuario y asignar o eliminar tareas.
 * 
 * @author Nicole Arias
 */
public class Usuario {
    private String Nombre;
    private String Correo;
    private String Rol;
    private String Contraseña;
    private String NombreUser;
    private List<Tarea> tareasAsignadas;
    
    
    /**
     * Constructor para crear un usuario con los atributos especificados.
     * 
     * @param nombre Nombre del usuario.
     * @param NombreUser Nombre de usuario (usuario para iniciar sesión).
     * @param Correo Correo electrónico del usuario.
     * @param Contraseña Contraseña del usuario.
     * @param Rol Rol del usuario (por ejemplo, administrador, empleado).
     */
    public Usuario(String nombre, String NombreUser, String Correo, String Contraseña, String Rol){ 
       this.Nombre = nombre;
       this.NombreUser= NombreUser;
       this.Correo= Correo;
       this.Contraseña = Contraseña;
       this.Rol= Rol;
       this.tareasAsignadas = new ArrayList<>();
    }
    
    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre(){
        return Nombre;
    }
    
    /**
     * Obtiene el rol del usuario.
     * 
     * @return El rol del usuario.
     */
    public String getRol(){
        return Rol;
    }
    
     /**
     * Obtiene el correo electrónico del usuario.
     * 
     * @return El correo electrónico del usuario.
     */
    public String getCorreo(){
        return Correo;
    }
    
     /**
     * Obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
    public String getContraseña(){
        return Contraseña;
    }
    
    /**
     * Obtiene el nombre de usuario (usuario para iniciar sesión).
     * 
     * @return El nombre de usuario.
     */
    public String getNombreUser(){
        return NombreUser;
    }
    
    /**
     * Establece el nombre del usuario.
     * 
     * @param nN El nuevo nombre del usuario.
     */
    public void setNombre(String nN){
        this.Nombre=nN;
    }
    
    /**
     * Establece el correo electrónico del usuario.
     * 
     * @param nC El nuevo correo electrónico del usuario.
     */
    public void setCorreo(String nC){
        this.Correo=nC;
    }
    
    /**
     * Establece el rol del usuario.
     * 
     * @param nR El nuevo rol del usuario.
     */
    public void setRol(String nR){
        this.Rol=nR;
    }
    
    /**
     * Establece la contraseña del usuario.
     * 
     * @param nC La nueva contraseña del usuario.
     */
    public void setContraseña(String nC){
        this.Contraseña=nC;
    }
    
    /**
     * Obtiene la lista de tareas asignadas al usuario.
     * 
     * @return La lista de tareas asignadas al usuario.
     */
    public List<Tarea> getTareasAsignadas() {
        return tareasAsignadas;
    }

    /**
     * Asigna una tarea al usuario si no está ya asignada.
     * 
     * @param tarea La tarea a asignar al usuario.
     */
    public void asignarTareas(Tarea tarea) {
        if (!tareasAsignadas.contains(tarea)) {
            tareasAsignadas.add(tarea);
            System.out.println("tareas asignadas correctamente");
        }
    }

    /**
     * Elimina una tarea de la lista de tareas asignadas al usuario.
     * 
     * @param tarea La tarea a eliminar.
     */
    public void eliminarTarea(Tarea tarea) {
        tareasAsignadas.remove(tarea);
    }
    
    /**
     * Verifica si la contraseña proporcionada es válida. La contraseña debe tener al menos 8 caracteres
     * y coincidir con la confirmación.
     * 
     * @param contra1 La contraseña proporcionada.
     * @param contraConf La confirmación de la contraseña.
     * @return true si la contraseña es válida, false en caso contrario.
     */
    public boolean contraseñaValida(String contra1, String contraConf){
        return contra1.length()>=8 && contra1.equals(contraConf);
    }
}
