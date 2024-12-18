
package info;

import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Clase que gestiona el historial de cambios de tareas.
 * 
 * Esta clase permite registrar y cargar el historial de cambios de las tareas, incluyendo información sobre
 * el cambio realizado, el nombre de la tarea afectada, su estado y prioridad anterior, y la fecha en que se 
 * realizó el cambio. Además, ofrece funcionalidades para almacenar y recuperar estos datos desde un archivo.
 * 
 * @author Nicole Arias
 */
public class ListaHistorial {
    private List<Historial> history;
    private final String UsersFile = "historial.txt";
    
     /**
     * Constructor que inicializa la lista de historial y carga los datos desde el archivo.
     */
    public ListaHistorial(){
        history= new ArrayList();
        cargarhistorial();
    }
    
    /**
     * Carga el historial de cambios desde un archivo.
     * 
     * Lee el archivo `historial.txt`, donde se almacena la información del historial de cambios, y 
     * carga los datos en la lista `history`. Si ocurre un error al leer el archivo, se muestra un mensaje de error.
     */
    private void cargarhistorial(){
        try (BufferedReader br = new BufferedReader (new FileReader(UsersFile))) {
            String line;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            while ((line = br.readLine()) != null){
                String[] Info = line.split(",");
                String cambio = Info[0];
                String nom= Info[1];
                String camest= Info[2];
                String campri= Info[3];
                String fecha = Info[4];
                history.add(new Historial(cambio, nom, camest, campri, fecha));
            }
        } catch (IOException e){
            System.out.println("No se puede cargar los datos del usuario");
        }
    }
    
    /**
     * Registra un nuevo historial de cambio.
     * 
     * Crea un nuevo objeto `Historial` con los parámetros proporcionados y lo agrega a la lista de historial.
     * Luego, guarda el historial actualizado en el archivo.
     * 
     * @param cambio El tipo de cambio realizado (por ejemplo, "estado cambiado").
     * @param nom El nombre de la tarea asociada al cambio.
     * @param camest El estado anterior de la tarea.
     * @param campri La prioridad anterior de la tarea.
     * @param fecha La fecha en que se realizó el cambio.
     * @return `true` si el historial fue registrado correctamente.
     */
    public boolean registrarhistorial(String cambio,String nom,String camest,String campri,String fecha){
        Historial newUser = new Historial(cambio, nom, camest, campri, fecha);
        history.add(newUser);
        guardarhistorial();
        return true;
    }
    
    /**
     * Crea un nuevo historial de cambio.
     * 
     * Similar al método `registrarhistorial()`, este método crea y agrega un nuevo historial a la lista y guarda
     * el historial actualizado en el archivo.
     * 
     * @param cambio El tipo de cambio realizado (por ejemplo, "estado cambiado").
     * @param nom El nombre de la tarea asociada al cambio.
     * @param camest El estado anterior de la tarea.
     * @param campri La prioridad anterior de la tarea.
     * @param fecha La fecha en que se realizó el cambio.
     * @return `true` si el historial fue creado correctamente.
     */
    public boolean crearhistorial(String cambio,String nom,String camest,String campri,String fecha){
        Historial newUser = new Historial(cambio, nom, camest, campri, fecha);
        history.add(newUser);
        guardarhistorial();
        return true;
    }
    
    
    /**
     * Guarda el historial de cambios en un archivo.
     * 
     * Este método sobrescribe el archivo `historial.txt` con los datos actuales de la lista de historial.
     * Cada historial de cambio se guarda como una línea en el archivo, con los campos separados por comas.
     */
    public void guardarhistorial() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(UsersFile))) {
            for (Historial User : history) {
                bw.write(User.getCambio() + "," 
                    + User.getnom() + "," 
                    + User.getcampri() + "," 
                    + User.getcamest()+ "," 
                    + User.getfecha());
                bw.newLine();             }
        } catch (IOException e){
            System.out.println("Error al guardar datos del usuario.");
        }
    }
    
    
    public List<Historial> gethistorial(){
        return history;
    }
}
