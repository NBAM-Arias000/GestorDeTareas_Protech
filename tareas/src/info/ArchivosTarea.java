
package info;

import java.io.*;
import java.util.*;
import javax.swing.DefaultListModel;

/**
 * Clase que gestiona el almacenamiento y la carga de tareas desde un archivo de texto.
 * Utiliza un modelo de lista para almacenar las tareas y un archivo .txt para guardarlas. xd
 */
public class ArchivosTarea {
    
    private DefaultListModel<String> listModel; // Modelo para manejar la lista de tareas visualmente en la interfaz gráfica.
    
    private List<Tarea> tareas; // Lista de objetos Tarea que representa todas las tareas cargadas o por cargar.
    private final String tareasFile = "Tareas.txt"; // Ruta del archivo donde se almacenan las tareas.
    
     /**
     * Constructor que inicializa la lista de tareas y carga las tareas desde el archivo.
     * El constructor invoca el método cargarTareas() para asegurar que las tareas se carguen 
     * correctamente desde el archivo al iniciar el objeto.
     */
    public ArchivosTarea(){
        tareas = new ArrayList();
        cargarTareas();
    }
    
    /**
 * Carga las tareas desde un archivo de texto y las agrega a la lista de tareas.
 * Cada línea del archivo debe contener los datos de una tarea separados por comas.
 * El archivo se lee línea por línea y se procesan los datos de cada tarea.
 * Si alguna línea del archivo está malformada (menos de 6 campos), se descarta.
 * 
 * El formato esperado en cada línea del archivo es el siguiente:
 * - nombre, descripción, prioridad, estado, fecha de entrega, fecha de inicio, comentarios
 */
    private void cargarTareas() {
    try (BufferedReader br = new BufferedReader(new FileReader(tareasFile))) {
        String line;   // Lee cada línea del archivo de tareas
        while ((line = br.readLine()) != null) {
            String[] info = line.split(",");  // Separa los datos de la tarea por comas
            if (info.length < 6) { // Verifica que haya 6 campos
                System.out.println("Línea inválida en el archivo de tareas: " + line);
                continue; // Salta líneas inválidas
            }
            String nombre = info[0];
            String descripcion = info[1];
            String prioridad = info[2];
            String estado = info[3];
            String fechaEntrega = info[4];
            String fechaInicio= info[5];
            String comentarios = info[6];
            tareas.add(new Tarea(nombre, descripcion, prioridad, estado, fechaEntrega,fechaInicio, comentarios));
        }
    } catch (FileNotFoundException e) {
         // Maneja el caso donde el archivo no se encuentra
        System.out.println("Archivo de tareas no encontrado: " + e.getMessage());
    } catch (IOException e) {
        // Maneja los errores al leer el archivo
        System.out.println("Error al leer el archivo de tareas: " + e.getMessage());
    }
}
    
    /**
 * Crea una nueva tarea con los parámetros proporcionados y la agrega a la lista de tareas.
 * Luego guarda las tareas actualizadas en el archivo correspondiente.
 * 
 * @param Nombre El nombre de la tarea.
 * @param Descripcion La descripción detallada de la tarea.
 * @param Prioridad El nivel de prioridad de la tarea.
 * @param Estado El estado actual de la tarea (Ej. "pendiente", "completa").
 * @param FechaEntrega La fecha en que debe entregarse la tarea.
 * @param fechaInicio La fecha en que se inicia la tarea.
 * @param comentarios Comentarios adicionales sobre la tarea.
 * 
 * @return `true` si la tarea fue creada correctamente y almacenada, de lo contrario `false`.
 */
    public boolean crearTarea(String Nombre, String Descripcion, String Prioridad, String Estado,String FechaEntrega,String fechaInicio,String comentarios){
        Tarea newTarea = new Tarea(Nombre,Descripcion, Prioridad,Estado, FechaEntrega,fechaInicio, comentarios);
        tareas.add(newTarea);
        guardarTareas(); // Cambiado a guardarTareas
        return true;
    }
    
    /**
 * Edita una tarea existente, actualizando su descripción, prioridad, estado, fecha de entrega y comentarios.
 * Si la tarea no se encuentra, el método devuelve `false`. 
 * De lo contrario, se actualiza la tarea y se guardan los cambios en el archivo de tareas.
 * 
 * @param nombre El nombre de la tarea que se desea editar.
 * @param nuevaDescripcion La nueva descripción de la tarea.
 * @param nuevaPrioridad La nueva prioridad de la tarea.
 * @param nuevoEstado El nuevo estado de la tarea (Ej. "pendiente", "completa").
 * @param nuevaFechaEntrega La nueva fecha de entrega de la tarea.
 * @param nuevoComentario Los nuevos comentarios sobre la tarea.
 * 
 * @return `true` si la tarea fue editada y los cambios guardados, de lo contrario `false`.
 */
    public boolean editarTarea(String nombre, String nuevaDescripcion,String nuevaPrioridad, String nuevoEstado,String nuevaFechaEntrega,String nuevoComentario) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombre)) {
                //tarea.setNombre(nombre);
                tarea.setDescripcion(nuevaDescripcion);
                tarea.setPrioridad(nuevaPrioridad);
                tarea.setEstado(nuevoEstado);
                tarea.setFechaEntrega(nuevaFechaEntrega);
                tarea.setComentario(nuevoComentario);
                guardarTareas();
                return true;
            }
        }
        return false;
    }
    
    
    /**
 * Modifica el estado de una tarea existente. Si la tarea es encontrada por su nombre, 
 * el estado se actualiza y se guardan los cambios en el archivo correspondiente.
 * 
 * @param nombre El nombre de la tarea que se desea modificar.
 * @param nuevoEstado El nuevo estado que se asignará a la tarea (Ej. "pendiente", "en proceso", "completa").
 * 
 * @return `true` si la tarea fue encontrada y el estado fue actualizado correctamente, de lo contrario `false`.
 */
    public boolean editarEstado(String nombre, String nuevoEstado) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombre)) {
                tarea.setEstado(nuevoEstado);
                guardarTareas();
                return true;
            }
        }
        return false;
    }
    
    
    /**
 * Modifica la prioridad de una tarea existente. Si la tarea es encontrada por su nombre, 
 * la prioridad se actualiza y se guardan los cambios en el archivo correspondiente.
 * 
 * @param nombre El nombre de la tarea que se desea modificar.
 * @param nuevaPrioridad La nueva prioridad que se asignará a la tarea (Ej. "alta", "media", "baja").
 * 
 * @return `true` si la tarea fue encontrada y la prioridad fue actualizada correctamente, de lo contrario `false`.
 */
    public boolean editarPrioridad(String nombre, String nuevaPrioridad) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombre)) {
                tarea.setPrioridad(nuevaPrioridad);
                guardarTareas();
                return true;
            }
        }
        return false;
    }
    
    
    /**
 * Elimina una tarea de la lista de tareas. Si la tarea es encontrada por su nombre, 
 * se elimina de la lista y se guardan los cambios en el archivo correspondiente.
 * 
 * @param nombre El nombre de la tarea que se desea eliminar.
 * 
 * @return `true` si la tarea fue encontrada y eliminada correctamente, de lo contrario `false`.
 */
    public boolean eliminarTarea(String nombre) {
        Iterator<Tarea> iterator = tareas.iterator();
         while (iterator.hasNext()) {
            Tarea tarea = iterator.next();
            if (tarea.getNombre().equals(nombre)) {
                iterator.remove();
                guardarTareas(); // Asegúrate de llamar al método correcto
                return true;
            }
        }
        return false;
    }

    
    /**
 * Obtiene una lista con los nombres de todas las tareas almacenadas.
 * 
 * Este método recorre la lista de tareas y extrae solo los nombres de cada tarea
 * para almacenarlos en una lista de tipo `List<String>`, que luego es devuelta.
 * 
 * @return `List<String>` una lista con los nombres de todas las tareas.
 */
    public List<String> getNombresTareas() {
    List<String> nombres = new ArrayList<>();
    for (Tarea tarea : tareas) {
        nombres.add(tarea.getNombre());
    }
    return nombres;
    }
    
    /**
 * Filtra las tareas según los criterios proporcionados (nombre, estado y prioridad).
 * Si el nombre, estado o prioridad de la tarea coinciden con los valores proporcionados,
 * la tarea es añadida a la lista de resultados. Si alguno de los parámetros es `null` o vacío, 
 * se ignora en el filtro correspondiente.
 * 
 * @param nombre El nombre de la tarea a buscar. Si es `null` o vacío, no se filtra por nombre.
 * @param estado El estado de la tarea a buscar. Si es `null` o vacío, no se filtra por estado.
 * @param prioridad La prioridad de la tarea a buscar. Si es `null` o vacío, no se filtra por prioridad.
 * 
 * @return `List<Tarea>` una lista de tareas que coinciden con los criterios proporcionados.
 */
    public List<Tarea> buscarTareas(String nombre, String estado, String prioridad) {
    List<Tarea> tareasFiltradas = new ArrayList<>();

    // Supongamos que tienes una lista de todas las tareas almacenadas en "todasLasTareas"
    for (Tarea tarea : tareas) {
        boolean coincideNombre = (nombre == null || nombre.isEmpty()) || tarea.getNombre().equalsIgnoreCase(nombre);
        
        // Verificar si el estado es nulo antes de llamar a isEmpty() o equalsIgnoreCase()
        boolean coincideEstado = (estado == null || estado.isEmpty()) || tarea.getEstado().equalsIgnoreCase(estado);
        
        
        boolean coincidePrioridad = (prioridad == null || prioridad.isEmpty()) || tarea.getPrioridad().equalsIgnoreCase(prioridad);


        if (coincideNombre && coincideEstado && coincidePrioridad) {
            tareasFiltradas.add(tarea);
        }
    }

    return tareasFiltradas;
}
    
    /**
 * Busca una tarea por su nombre.
 * 
 * Este método recorre la lista de tareas y compara el nombre de cada tarea con el nombre
 * proporcionado. Si encuentra una tarea con el nombre exacto (ignorando mayúsculas y minúsculas),
 * la retorna. Si el nombre no es válido (nulo o vacío), retorna `null`. Si no se encuentra ninguna
 * tarea con el nombre indicado, también retorna `null`.
 * 
 * @param nombre El nombre de la tarea a buscar.
 * @return `Tarea` La tarea encontrada con el nombre proporcionado, o `null` si no se encuentra.
 */
    public Tarea buscarTarea(String nombre) {
    // Validar que el nombre no sea nulo ni vacío
    if (nombre == null || nombre.isEmpty()) {
        return null; // Retornar null si el nombre no es válido
    }

    // Recorrer la lista de tareas para buscar una coincidencia
    for (Tarea tarea : tareas) {
        if (tarea.getNombre().equalsIgnoreCase(nombre)) {
            return tarea; // Retornar la tarea encontrada
        }
    }

    // Si no se encuentra ninguna tarea, retornar null
    return null;
}


    /**
 * Guarda todas las tareas actuales en un archivo de texto.
 * 
 * Este método recorre la lista de tareas y escribe los detalles de cada tarea en un archivo
 * de texto llamado `Tareas.txt`. Cada tarea se guarda en una nueva línea, con los campos separados
 * por comas. Si ocurre un error al escribir en el archivo, se imprime un mensaje en la consola.
 * 
 * @throws IOException Si ocurre un error durante la escritura en el archivo.
 */
    public void guardarTareas() {
    String tareasFile = "Tareas.txt"; // Archivo donde se guardarán las tareas
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(tareasFile))) {
        for (Tarea tarea : getTareas()) { // Si `getTareas` no existe, cámbialo al nombre del método adecuado
            bw.write(tarea.getNombre() + "," + tarea.getDescripcion() + "," + 
                     tarea.getPrioridad() + "," + tarea.getEstado() + "," +
                     tarea.getFechaEntrega()+","+tarea.getFechaDeInicio()+","+tarea.getComentario());
            bw.newLine();
        }
    } catch (IOException e) {
        System.out.println("Error al guardar las tareas: " + e.getMessage());
    }
}

    /**
 * Obtiene la lista de todas las tareas almacenadas.
 * 
 * Este método devuelve la lista de tareas que están actualmente almacenadas en el sistema.
 * 
 * @return `List<Tarea>` La lista de tareas.
 */
    public List<Tarea> getTareas(){
        return tareas;
    }
}
