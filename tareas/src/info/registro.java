
package info;

import java.io.*;
import java.util.*;

/**
 * La clase `registro` gestiona la carga, registro y almacenamiento de usuarios en un sistema.
 * Permite registrar nuevos usuarios y verificar si ya existen en el archivo de usuarios.
 * 
 * @author Nicole Arias
 */
public class registro {
    private List<Usuario> Users;
    private final String UsersFile = "Users.txt";
    private ArchivosTarea archivosTarea;
    
    /**
     * Constructor que inicializa la lista de usuarios y carga los datos desde el archivo.
     */
    public registro(){
        Users = new ArrayList();
        cargarUsers();
    }
    
    /**
     * Carga los usuarios desde el archivo de texto `Users.txt`.
     * Los usuarios son almacenados en la lista `Users`. Si no se puede cargar el archivo,
     * se muestra un mensaje de error.
     */
    private void cargarUsers(){
        try (BufferedReader br = new BufferedReader (new FileReader(UsersFile))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] Info = line.split(",");
                String Nombre = Info[0];
                String NombreUser = Info[1];
                String Correo = Info[2];
                String Contraseña = Info[3];
                String Rol = Info[4];
                Users.add(new Usuario(Nombre,NombreUser, Correo,Contraseña,Rol));
            }
        } catch (IOException e){
            System.out.println("No se puede cargar los datos del usuario");
        }
    }
    
    /**
     * Registra un nuevo usuario, siempre y cuando no exista un usuario con el mismo nombre 
     * o correo electrónico.
     * 
     * @param Nombre El nombre del nuevo usuario.
     * @param NombreUser El nombre de usuario para iniciar sesión.
     * @param Correo El correo electrónico del usuario.
     * @param Contraseña La contraseña del usuario.
     * @param Rol El rol del usuario (por ejemplo, administrador, usuario).
     * @return `true` si el usuario fue registrado exitosamente, `false` si ya existe un usuario 
     *         con el mismo nombre o correo electrónico.
     */
    public boolean registrarUsers(String Nombre, String NombreUser, String Correo, String Contraseña, String Rol){
        if(existeUsers(Nombre) || existeCorreo(Correo)){
            return false;
        }
        Usuario newUser = new Usuario(Nombre,NombreUser, Correo,Contraseña,Rol);
        Users.add(newUser);
        guardarUsuario();
        return true;
    }
    
    public boolean crearUsers(String Nombre, String NombreUser, String Correo, String Contraseña, String Rol){
        if(existeUsers(Nombre) || existeCorreo(Correo)){
            return false;
        }
        
        Usuario newUser = new Usuario(Nombre,NombreUser, Correo,Contraseña,Rol);
        newUser.setRol(Rol);
        Users.add(newUser);
        guardarUsuario();
        return true;
    }
    
     /**
     * Verifica si ya existe un usuario con el mismo nombre.
     * 
     * @param Nombre El nombre a verificar.
     * @return `true` si el nombre ya existe en la lista de usuarios, `false` en caso contrario.
     */
    private boolean existeUsers(String nombre){
        for(Usuario User: Users){
            if(User.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Verifica si ya existe un usuario con el mismo correo electrónico.
     * 
     * @param Correo El correo a verificar.
     * @return `true` si el correo ya existe en la lista de usuarios, `false` en caso contrario.
     */
    private boolean existeCorreo(String correo){
        for(Usuario cor: Users){
            if(cor.getCorreo().equals(correo)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Guarda la lista actualizada de usuarios en el archivo `Users.txt`.
     * Cada usuario se guarda en una línea del archivo, con los atributos separados por comas.
     */
    public void guardarUsuario() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(UsersFile))) {
            for (Usuario User : Users) {
                bw.write(User.getNombre() + "," + User.getNombreUser()+","+User.getCorreo() + "," + User.getContraseña() + 
                        "," + User.getRol());
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Error al guardar datos del usuario.");
        }
    }
    
    
    /**
     * Autentica un usuario utilizando su nombre de usuario o correo electrónico y su contraseña.
     * 
     * @param nombreCorreo Nombre de usuario o correo electrónico del usuario.
     * @param contraseña Contraseña del usuario.
     * @return El objeto `Usuario` si las credenciales son válidas, `null` si no se encuentra al usuario
     *         o la contraseña es incorrecta.
     */
    //... :
    public Usuario autenticar(String nombreCorreo, String contraseña) {
    // Verificar si la lista de usuarios está vacía
    if (Users == null || Users.isEmpty()) {
        System.out.println("La lista de usuarios está vacía.");
        return null;
    }

    for (Usuario user : Users) {
        // Validar correo o nombre
        boolean esCorreoValido = correoValido(nombreCorreo) && user.getCorreo().trim().equalsIgnoreCase(nombreCorreo.trim());
        boolean esNombreValido = user.getNombre().trim().equalsIgnoreCase(nombreCorreo.trim());

        // Validar contraseña
        if ((esCorreoValido || esNombreValido) && user.getContraseña().equals(contraseña)) {
            System.out.println("Usuario autenticado: " + user.getNombre());
            return user;
        }
    }

    System.out.println("Usuario no encontrado o contraseña incorrecta.");
    return null;
}

     /**
     * Verifica si un usuario con el correo y contraseña proporcionados es un administrador (Docente).
     * 
     * @param correo Correo electrónico del usuario.
     * @param contra Contraseña del usuario.
     * @return `true` si el usuario es un administrador, `false` en caso contrario.
     */
    public boolean esAdmin( String correo, String contra){
        
        for (Usuario us : Users) {
            if (us.getCorreo().equalsIgnoreCase(correo) 
                && us.getContraseña().equals(contra) 
                && us.getRol().equalsIgnoreCase("Docente")) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Elimina un usuario de la lista de usuarios.
     * 
     * @param nombre Nombre del usuario a eliminar.
     * @return `true` si el usuario fue eliminado exitosamente, `false` si no se encuentra el usuario.
     */
    public boolean eliminarUser(String nombre) {
        Usuario usuarioAEliminar = null;
        for (Usuario us : Users) {
            if (us.getNombre().equals(nombre)) {
                usuarioAEliminar = us;
                break;
            }
        }

        if (usuarioAEliminar != null) {
            Users.remove(usuarioAEliminar);
            guardarUsuario();
            return true;
        }
        return false;
    }
    
    /**
     * Edita los detalles de un usuario existente.
     * 
     * @param nombre Nombre del usuario a editar.
     * @param nN Nuevo nombre para el usuario.
     * @param nuevoC Nuevo correo electrónico para el usuario.
     * @param nuevoCON Nueva contraseña para el usuario.
     * @param nuevaROL Nuevo rol para el usuario.
     * @return `true` si el usuario fue editado exitosamente, `false` si no se encuentra el usuario.
     */
    public boolean editarUser(String nombre, String nN, String nuevoC, String nuevoCON, String nuevaROL) {
        for (Usuario nUsuario : Users) {
            if (nUsuario.getNombre().equals(nombre)) {
                nUsuario.setNombre(nN);
                nUsuario.setCorreo(nuevoC);
                nUsuario.setContraseña(nuevoCON);
                nUsuario.setRol(nuevaROL);
                guardarUsuario();
                return true;
            }
        }
        return false;
    }
    
    /**
     * Obtiene la lista de todos los usuarios registrados.
     * 
     * @return La lista de objetos `Usuario`.
     */
    public List<Usuario> getUsuarios(){
        return Users;
    }
    
    /**
     * Verifica si un correo electrónico tiene un formato válido.
     * 
     * @param C El correo electrónico a verificar.
     * @return `true` si el correo electrónico tiene un formato válido, `false` en caso contrario.
     */
    public boolean correoValido(String C){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return C.matches(regex);
    }
    
    /**
     * Asigna una tarea a un usuario específico.
     * 
     * @param nombreUsuario Nombre del usuario al que se le asignará la tarea.
     * @param nombreTarea Nombre de la tarea a asignar.
     * @return `true` si la tarea fue asignada correctamente, `false` si no se encuentra el usuario o la tarea.
     */
    public boolean asignarTareaAUsuario(String nombreUsuario, String nombreTarea) {
        Usuario usuario = buscarUsuarioPorNombre(nombreUsuario.trim());
        Tarea tarea = buscarTareaPorNombre(nombreTarea);

        if (usuario == null) {
            System.out.println("Usuario no encontrado: " + nombreUsuario);
            return false;
        }
        if (tarea == null) {
           System.out.println("Tarea no encontrada: " + nombreTarea);
           return false;
        }

        usuario.asignarTareas(tarea);
        tarea.asignarUsuario(usuario);

        guardarUsuario(); // Asegúrate de que los usuarios con sus tareas se guardan
        archivosTarea.guardarTareas(); // Método adicional que debe guardar las tareas
        return true;
    }
    
    /**
     * Busca un usuario por su nombre.
     * 
     * @param nombreUsuario Nombre del usuario a buscar.
     * @return El objeto `Usuario` si se encuentra, `null` si no se encuentra.
     */
    private Usuario buscarUsuarioPorNombre(String nombreUsuario) {
        for (Usuario usuario : Users) {
            if (usuario.getNombre().equalsIgnoreCase(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

     /**
     * Busca una tarea por su nombre.
     * 
     * @param nombreTarea Nombre de la tarea a buscar.
     * @return El objeto `Tarea` si se encuentra, `null` si no se encuentra.
     */
    private Tarea buscarTareaPorNombre(String nombreTarea) {
        for (Tarea tarea : archivosTarea.getTareas()) { 
            if (tarea.getNombre().equalsIgnoreCase(nombreTarea)) {
                return tarea;
            }
        }
        return null;
    }

    /**
     * Obtiene la lista de los nombres de todas las tareas.
     * 
     * @return Una lista de cadenas con los nombres de las tareas.
     */
    public List<String> getNombresTareas() {
        List<String> nombresTareas = new ArrayList<>();
    for (Tarea tarea : archivosTarea.getTareas()) {
        nombresTareas.add(tarea.getNombre());
    }
    return nombresTareas;
    }
    
}
