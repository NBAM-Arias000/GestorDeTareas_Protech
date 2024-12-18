
package interfaz;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.WindowConstants;
import info.ArchivosTarea;
import info.*;
import static interfaz.inicio.registroA;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import static interfaz.inicio.ActualUsuario;
import java.text.SimpleDateFormat;

/**
 * La clase EditarTareas proporciona una interfaz para editar las tareas existentes en el sistema.
 * Permite al usuario cargar y modificar las propiedades de una tarea, como su nombre, descripción, prioridad,
 * estado, fecha de entrega y comentarios. Los cambios se reflejan en la interfaz y se gestionan mediante la
 * interacción con el sistema de almacenamiento de tareas.
 * 
 * @author Nicole Arias
 * @version 1.0
 */
public class EditarTareas extends javax.swing.JFrame {
    ArchivosTarea ca= new ArchivosTarea();
    ListaHistorial c= new ListaHistorial();
    
    /**
     * Constructor que inicializa los componentes de la interfaz gráfica de la ventana de edición de tareas.
     */
    public EditarTareas() {
        initComponents();
    }
    
    /**
     * Llena los campos de la interfaz con los datos de la tarea especificada por su nombre.
     * Si se encuentra la tarea, los datos se cargan en los campos correspondientes.
     * Si ocurre algún error o no se encuentra la tarea, se muestra un mensaje de error.
     *
     * @param nombreTarea El nombre de la tarea a buscar y cargar.
     */
    public void llenar(String nombreTarea) { 
    try {
        // Llamar a buscarTareas con parámetros nulos para estado y prioridad
        List<Tarea> tareasEncontradas = ca.buscarTareas(nombreTarea, null, null);

        // Verificar si no se encontró ninguna tarea
        if (tareasEncontradas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna tarea con el nombre proporcionado.");
            return;
        }

        // Obtener la primera tarea de la lista
        Tarea tarea = tareasEncontradas.get(0);

        // Llenar los campos con datos de la tarea, manejando valores nulos
        jTextField7.setText(validarTexto(tarea.getNombre()));
        jTextField8.setText(validarTexto(tarea.getDescripcion()));
        jComboBox2.setSelectedItem(validarTexto(tarea.getPrioridad()));
        jComboBox3.setSelectedItem(validarTexto(tarea.getEstado()));
        jTextField8.setText(validarTexto(tarea.getFechaEntrega()));
        jTextField10.setText(validarTexto(tarea.getComentario()));

    } catch (Exception e) {
        // Manejo de excepciones generales para evitar que errores inesperados rompan la ejecución
        JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos de la tarea: " + e.getMessage());
    }
    }
    
    /**
     * Valida si el texto proporcionado es nulo. Si lo es, devuelve una cadena vacía.
     * Si el texto no es nulo, devuelve el texto tal cual.
     *
     * @param texto El texto a validar.
     * @return El texto validado, o una cadena vacía si es nulo.
     */
    private String validarTexto(String texto) {
    return texto != null ? texto : "";
    }
    
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jTextField8 = new JTextField();
        jTextField7 = new JTextField();
        jTextField9 = new JTextField();
        jTextField10 = new JTextField();
        jComboBox2 = new JComboBox<>();
        jComboBox3 = new JComboBox<>();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel11 = new JLabel();
        jLabel7 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/logo_protech_resized.png"))); // NOI18N
        getContentPane().add(jLabel1, new AbsoluteConstraints(51, 24, -1, 116));

        jLabel2.setFont(new Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setText("EDITAR TAREAS");
        getContentPane().add(jLabel2, new AbsoluteConstraints(280, 70, -1, 38));

        jLabel4.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel4.setText("ESTADO:");
        getContentPane().add(jLabel4, new AbsoluteConstraints(80, 270, -1, 38));

        jLabel5.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel5.setText("NOTAS:");
        getContentPane().add(jLabel5, new AbsoluteConstraints(80, 360, -1, 38));

        jLabel6.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new Color(0, 0, 0));
        jLabel6.setText("DETALLES:");
        getContentPane().add(jLabel6, new AbsoluteConstraints(80, 190, -1, 38));

        jLabel8.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new Color(0, 0, 0));
        jLabel8.setText("NOMBRE:");
        getContentPane().add(jLabel8, new AbsoluteConstraints(80, 140, -1, 38));

        jLabel9.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new Color(0, 0, 0));
        jLabel9.setText("PRIORIDAD:");
        getContentPane().add(jLabel9, new AbsoluteConstraints(80, 230, -1, 38));

        jTextField8.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(JTextField.CENTER);
        jTextField8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new AbsoluteConstraints(320, 310, 370, 32));

        jTextField7.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(JTextField.CENTER);
        jTextField7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new AbsoluteConstraints(320, 140, 370, 32));

        jTextField9.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(JTextField.CENTER);
        jTextField9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new AbsoluteConstraints(320, 180, 370, 32));

        jTextField10.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(JTextField.CENTER);
        jTextField10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new AbsoluteConstraints(320, 360, 370, 30));

        jComboBox2.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));
        getContentPane().add(jComboBox2, new AbsoluteConstraints(320, 230, 370, -1));

        jComboBox3.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] { "Por hacer", "En progreso", "Completada" }));
        getContentPane().add(jComboBox3, new AbsoluteConstraints(320, 270, 370, -1));

        jButton2.setBackground(new Color(0, 0, 0));
        jButton2.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setText("ACTUALIZAR");
        jButton2.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new AbsoluteConstraints(480, 450, 150, 50));

        jButton3.setBackground(new Color(0, 0, 0));
        jButton3.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new Color(255, 255, 255));
        jButton3.setText("CANCELAR");
        jButton3.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new AbsoluteConstraints(190, 450, 150, 50));

        jLabel11.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new Color(0, 0, 0));
        jLabel11.setText("FECHA DE ENTREGA:");
        getContentPane().add(jLabel11, new AbsoluteConstraints(80, 310, -1, 38));

        jLabel7.setForeground(new Color(0, 0, 0));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new AbsoluteConstraints(0, 0, 820, 530));

        pack();
    }//GEN-END:initComponents

    /**
     * Maneja el evento de acción cuando el usuario interactúa con el campo de texto jTextField7.
     * Actualmente no tiene implementación funcional.
     * 
     * @param evt El evento de acción disparado.
     */
    private void jTextField7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    /**
     * Maneja el evento de acción cuando el usuario interactúa con el campo de texto jTextField8.
     * Actualmente no tiene implementación funcional.
     * 
     * @param evt El evento de acción disparado.
     */
    private void jTextField8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    /**
     * Maneja el evento de acción cuando el usuario interactúa con el campo de texto jTextField9.
     * Actualmente no tiene implementación funcional.
     * 
     * @param evt El evento de acción disparado.
     */
    private void jTextField9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    /**
     * Maneja el evento de acción cuando el usuario interactúa con el campo de texto jTextField10.
     * Actualmente no tiene implementación funcional.
     * 
     * @param evt El evento de acción disparado.
     */
    private void jTextField10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    /**
     * Maneja el evento de acción cuando el usuario hace clic en el botón para guardar los cambios en la tarea.
     * Valida los campos, busca la tarea especificada, y si la tarea existe, registra los cambios realizados en el historial.
     * Si los cambios se realizan correctamente, cierra la ventana; de lo contrario, muestra un mensaje de error.
     * 
     * @param evt El evento de acción disparado.
     */
    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nom = jTextField7.getText().trim();
    String des = jTextField9.getText().trim();
    String prio = jComboBox2.getSelectedItem().toString().trim();
    String est = jComboBox3.getSelectedItem().toString().trim();
    String not = jTextField10.getText().trim();
    String fech = jTextField8.getText().trim();

    // Validar que todos los campos estén llenos
    if (nom.isEmpty() || des.isEmpty() || prio.isEmpty() || est.isEmpty() || not.isEmpty() || fech.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
        return;
    }

    // Buscar la tarea
    Tarea tareaExistente = ca.buscarTarea(nom);
    if (tareaExistente == null) {
        JOptionPane.showMessageDialog(null, "La tarea especificada no existe.");
        return;
    }

    try {
        // Registrar historial
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = formato.format(fechaActual);

        c.registrarhistorial(
            "Edición de la tarea: " + tareaExistente.getNombre(),
            ActualUsuario.getNombre(),
            "Estado: " + tareaExistente.getEstado() + " -> " + est,
            "Prioridad: " + tareaExistente.getPrioridad() + " -> " + prio,
            fechaFormateada
        );

        // Editar la tarea
        boolean cambiosRealizados = ca.editarTarea(nom, des, prio, est, fech, not);
        if (cambiosRealizados) {
            JOptionPane.showMessageDialog(null, "Cambios realizados con éxito.");
            this.dispose(); // Cierra la ventana actual
        } else {
            JOptionPane.showMessageDialog(null, "No se pudieron realizar los cambios a esta tarea.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error durante la edición: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    /**
     * Maneja el evento de acción cuando el usuario hace clic en el botón para cerrar la ventana sin guardar cambios.
     * 
     * @param evt El evento de acción disparado.
     */
    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    /**
     * Método principal que inicia la aplicación y muestra la ventana EditarTareas.
     * 
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton jButton2;
    JButton jButton3;
    JComboBox<String> jComboBox2;
    JComboBox<String> jComboBox3;
    JLabel jLabel1;
    JLabel jLabel11;
    JLabel jLabel2;
    JLabel jLabel4;
    JLabel jLabel5;
    JLabel jLabel6;
    JLabel jLabel7;
    JLabel jLabel8;
    JLabel jLabel9;
    JTextField jTextField10;
    JTextField jTextField7;
    JTextField jTextField8;
    JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
