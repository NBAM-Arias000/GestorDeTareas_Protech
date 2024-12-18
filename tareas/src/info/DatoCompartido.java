/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info;

/**
 * Clase que gestiona un dato compartido entre diferentes partes del programa.
 * 
 * Esta clase permite almacenar y acceder a un dato común (dato seleccionado) de manera estática,
 * lo que facilita su uso en diferentes clases sin necesidad de crear una instancia de la clase `DatoCompartido`.
 * 
 * @author Nicole Arias
 */
public class DatoCompartido {
    
    private static String datoSeleccionado;

    /**
     * Establece el valor del dato seleccionado.
     * 
     * Este método permite asignar un valor al dato seleccionado que puede ser usado posteriormente
     * en otras partes del programa. Dado que es estático, el valor es compartido entre todas las instancias
     * de la clase.
     * 
     * @param dato El valor que se desea asignar al dato seleccionado.
     */
    public static void setDatoSeleccionado(String dato) {
        datoSeleccionado = dato;
    }

    /**
     * Obtiene el valor del dato seleccionado.
     * 
     * Este método retorna el valor del dato seleccionado previamente almacenado mediante el método
     * `setDatoSeleccionado`. Si no se ha asignado un valor, retornará `null`.
     * 
     * @return El valor del dato seleccionado, o `null` si no se ha establecido.
     */
    public static String getDatoSeleccionado() {
        return datoSeleccionado;
    }
}
    
