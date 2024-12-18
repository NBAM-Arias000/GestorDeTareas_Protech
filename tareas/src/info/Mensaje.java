/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Clase que maneja la escritura automática de texto en etiquetas (JLabel o Label) con un retraso.
 * 
 * La clase utiliza un temporizador (Timer) para simular la escritura de texto de manera automática,
 * añadiendo un carácter a la vez en una etiqueta, con un intervalo definido.
 * 
 * @author Nicole Arias
 */
public class Mensaje {
    private Timer timer;
    private int index;

    /**
     * Constructor de la clase Mensaje. Inicializa el índice a 0.
     */
    public Mensaje() {
        this.index = 0;
    }

    /**
     * Escribe un texto automáticamente en un JLabel, mostrando un carácter por vez con un retraso.
     * 
     * @param label El JLabel donde se mostrará el texto.
     * @param texto El texto a mostrar.
     * @param delay El retraso en milisegundos entre cada carácter.
     */
    public void escribirTextoAutomaticamente(JLabel label, String texto, int delay) {
        // Reinicia el índice de caracteres y el texto del JLabel
        index = 0;
        label.setText("");

        // Configuración del Timer
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < texto.length()) {
                    label.setText(label.getText() + texto.charAt(index));
                    index++;
                } else {
                    timer.stop();  // Detiene el temporizador cuando el texto está completo
                }
            }
        });
        timer.start();
    }
    
    
    /**
     * Escribe un texto automáticamente en un Label, mostrando un carácter por vez con un retraso.
     * 
     * @param label El Label donde se mostrará el texto.
     * @param texto El texto a mostrar.
     * @param delay El retraso en milisegundos entre cada carácter.
     */
    public void escribirTextoAutomaticamente2(Label label, String texto, int delay) {
        // Reinicia el índice de caracteres y el texto del JLabel
        index = 0;
        label.setText("");

        // Configuración del Timer
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < texto.length()) {
                    label.setText(label.getText() + texto.charAt(index));
                    index++;
                } else {
                    timer.stop();  // Detiene el temporizador cuando el texto está completo
                }
            }
        });
        timer.start();
    }
}
