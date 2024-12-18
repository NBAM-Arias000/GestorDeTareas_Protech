package interfaz;

import info.Mensaje;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.WindowConstants;
import info.Tarea;
import info.ArchivosTarea;
import info.Usuario;
import info.*;
import info.registro;
import static interfaz.inicio.archivosTarea;
import static interfaz.inicio.registroA;
import java.util.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import static interfaz.inicio.ActualUsuario;


/**
 * Esta clase representa la ventana principal del gestor de tareas.
 * Permite a los usuarios visualizar y administrar sus tareas, así como consultar la información de los usuarios registrados.
 * 
 * @author Nicole Arias
 */
public class pag extends javax.swing.JFrame {
    public Mensaje mensaje;
    registro registro = new registro();
    ArchivosTarea f = new ArchivosTarea();
    registro c= new registro();
    
     /**
     * Constructor de la clase. Inicializa los componentes de la interfaz gráfica y carga los datos de tareas y usuarios.
     */
    public pag() {
        mensaje = new Mensaje();
        initComponents();
        cargarTareas(); 
        cargarDatosUsuarios();
        setResizable(false);
        setTitle("Gestor de Tareas");
        setLocationRelativeTo(null);
    }
    
    /**
     * Inicia la escritura del mensaje de bienvenida en la interfaz.
     * 
     * @see Mensaje#escribirTextoAutomaticamente(javax.swing.JLabel, String, int)
     */
    public void iniciarEscritura() {
        String user =  ActualUsuario.getNombre();
        String texto = "Bienvenido " +user+ ". ¿Qué desea hacer hoy?";
        mensaje.escribirTextoAutomaticamente(jLabel29, texto, 50);
    }
    
    /**
     * Carga las tareas en la tabla correspondiente de la interfaz.
     * Se obtienen las tareas desde la lista de tareas y se agregan al modelo de la tabla.
     */
    private void cargarTareas() {
    // Obtener el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) jTable4.getModel();

    // Limpia las filas actuales de la tabla
        modeloTabla.setRowCount(0);

    // Lista de usuarios (puedes obtenerla de tu registro o base de datos)
        List<Tarea> tareas = archivosTarea.getTareas(); // Supongamos que este método ya existe

    // Agregar filas a la tabla
        for (Tarea tarea : tareas) {
            modeloTabla.addRow(new Object[]{
            tarea.getNombre(), // Primera columna
            tarea.getDescripcion(), // Tercera columna
            tarea.getPrioridad(),
            tarea.getEstado(),
            tarea.getFechaDeInicio(),
            tarea.getFechaEntrega()
            });
        }
    }
    
    /**
     * Actualiza la tabla de tareas con las tareas filtradas.
     * 
     * @param tareasFiltradas Lista de tareas que cumplen con los filtros establecidos.
     */
    private void actualizarTablaConTareas(List<Tarea> tareasFiltradas) {
        DefaultTableModel modelo = (DefaultTableModel) jTable4.getModel();
        modelo.setRowCount(0); // Limpia la tabla antes de añadir nuevas filas

        for (Tarea tarea : tareasFiltradas) {
            modelo.addRow(new Object[]{
            tarea.getNombre(), // Primera columna
            tarea.getDescripcion(), // Tercera columna
            tarea.getPrioridad(),
            tarea.getEstado(),
            tarea.getFechaDeInicio(),
            tarea.getFechaEntrega() 
        });
        }
    }
    
    /**
     * Carga los datos de los usuarios en la tabla correspondiente de la interfaz.
     * Se obtienen los usuarios desde la lista de usuarios registrados y se agregan al modelo de la tabla.
     */
    private void cargarDatosUsuarios() {
    // Obtener el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();

    // Limpia las filas actuales de la tabla
        modeloTabla.setRowCount(0);

    // Lista de usuarios (puedes obtenerla de tu registro o base de datos)
        List<Usuario> usuarios = registroA.getUsuarios(); // Supongamos que este método ya existe

    // Agregar filas a la tabla
        for (Usuario usuario : usuarios) {
            modeloTabla.addRow(new Object[]{
            usuario.getNombre(), // Primera columna
            usuario.getCorreo(), // Tercera columna
            usuario.getRol() // Cuarta columna
            });
        }
    }
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new JPanel();
        jLabel3 = new JLabel();
        jTabbedPane2 = new JTabbedPane();
        jPanel8 = new JPanel();
        jScrollPane6 = new JScrollPane();
        jTable4 = new JTable();
        jLabel31 = new JLabel();
        jButton9 = new JButton();
        jButton11 = new JButton();
        jTextField12 = new JTextField();
        jButton12 = new JButton();
        jComboBox6 = new JComboBox<>();
        jComboBox7 = new JComboBox<>();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        jLabel34 = new JLabel();
        jPanel3 = new JPanel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jTextField3 = new JTextField();
        jTextField7 = new JTextField();
        jTextField8 = new JTextField();
        jComboBox1 = new JComboBox<>();
        jComboBox3 = new JComboBox<>();
        jLabel28 = new JLabel();
        jTextField10 = new JTextField();
        jButton3 = new JButton();
        jTextField11 = new JTextField();
        jLabel30 = new JLabel();
        jPanel2 = new JPanel();
        jLabel22 = new JLabel();
        jScrollPane2 = new JScrollPane();
        table = new JTable();
        jButton4 = new JButton();
        jPanel4 = new JPanel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jButton1 = new JButton();
        jComboBox2 = new JComboBox<>();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jLabel12 = new JLabel();
        jPasswordField1 = new JPasswordField();
        jLabel2 = new JLabel();
        jPanel7 = new JPanel();
        jScrollPane4 = new JScrollPane();
        jTable2 = new JTable();
        jLabel23 = new JLabel();
        jLabel29 = new JLabel();
        jButton10 = new JButton();
        jLabel20 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new AbsoluteLayout());

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/imagenes/logo_protech_smaller.png"))); // NOI18N
        jPanel1.add(jLabel3, new AbsoluteConstraints(23, 6, -1, 63));

        jTabbedPane2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        jTable4.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Detalles", "Prioridad", "Estado", "Fecha de Inicio", "Fecha de Entrega", "Esitar/Borrar Tareas"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable4);

        jLabel31.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel31.setForeground(new Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel31.setText("LISTA DE TAREAS:");

        jButton9.setBackground(new Color(0, 0, 0));
        jButton9.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton9.setForeground(new Color(255, 255, 255));
        jButton9.setText("ELIMINAR");
        jButton9.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new Color(0, 0, 0));
        jButton11.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton11.setForeground(new Color(255, 255, 255));
        jButton11.setText("EDITAR");
        jButton11.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField12.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(JTextField.CENTER);
        jTextField12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new Color(0, 0, 0));
        jButton12.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton12.setForeground(new Color(255, 255, 255));
        jButton12.setIcon(new ImageIcon(getClass().getResource("/imagenes/magnifying_glass_dark_background_50x50_1.jpg"))); // NOI18N
        jButton12.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox6.setModel(new DefaultComboBoxModel<>(new String[] { "Estado", "Baja", "Media", "Alta" }));
        jComboBox6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jComboBox7.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox7.setModel(new DefaultComboBoxModel<>(new String[] { "Prioridad", "Por hacer", "En progreso", "Completada" }));
        jComboBox7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel32.setForeground(new Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel32.setText("NOMBRE:");

        jLabel33.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel33.setForeground(new Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel33.setText("ESTADO:");

        jLabel34.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel34.setForeground(new Color(0, 0, 0));
        jLabel34.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel34.setText("PRIORIDAD:");

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel32)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox6, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addGap(20, 20, 20)
                        .addComponent(jComboBox7, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton12))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 871, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton12)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("LISTA DE TAREAS", jPanel8);

        jLabel13.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel13.setText("DESCRIPCION:");

        jLabel14.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel14.setText("CREAR TAREA");

        jLabel15.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel15.setText("ESTADO:");

        jLabel16.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel16.setText("PRIORIDAD:");

        jLabel17.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel17.setText("COMENTARIOS:");

        jLabel18.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel18.setText("FECHA DE INICIO:");

        jTextField3.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(JTextField.CENTER);
        jTextField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(JTextField.CENTER);
        jTextField7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(JTextField.CENTER);
        jTextField8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Por Hacer", "En Progreso", "Completada" }));

        jComboBox3.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));
        jComboBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setForeground(new Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel28.setText("NOMBRE:");

        jTextField10.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(JTextField.CENTER);
        jTextField10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(0, 0, 0));
        jButton3.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new Color(255, 255, 255));
        jButton3.setText("CREAR TAREA");
        jButton3.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField11.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(JTextField.CENTER);
        jTextField11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setForeground(new Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel30.setText("FECHA DE ENTREGA:");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CREAR TAREA", jPanel3);

        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        jLabel22.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel22.setForeground(new Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel22.setText("LISTA DE USUARIOS:");

        table.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Rol", "Eliminar Usuarios"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, Integer.class, Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        jButton4.setBackground(new Color(0, 0, 0));
        jButton4.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new Color(255, 255, 255));
        jButton4.setText("ELIMINAR USUARIOS");
        jButton4.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 867, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel22, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane2.addTab("LISTA DE USUARIOS", jPanel2);

        jLabel4.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel4.setText("NOMBRE DE USUARIO:");

        jLabel5.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel5.setText("CORREO ELECTRONICO:");

        jLabel6.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel6.setText("CONTRASEÑA:");

        jLabel7.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel7.setText("TIPO DE USUARIO:");

        jButton1.setBackground(new Color(0, 0, 0));
        jButton1.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente" }));

        jTextField4.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(JTextField.CENTER);
        jTextField4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(JTextField.CENTER);
        jTextField5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(JTextField.CENTER);
        jTextField6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel12.setText("NOMBRE:");

        jPasswordField1.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.setHorizontalAlignment(JTextField.CENTER);

        jLabel2.setFont(new Font("Segoe UI", 0, 26)); // NOI18N
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Registro de Nuevos Usuarios");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(64, 64, 64)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CREAR USUARIOS", jPanel4);

        jTable2.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modificador", "Archivo Modificados", "Prioridad", "Estado", "Fecha de Modificacion"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, Object.class, Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jLabel23.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel23.setForeground(new Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel23.setText("LISTA DE MODIFICACIONES:");

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 832, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel23, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("HISTORIAL", jPanel7);

        jPanel1.add(jTabbedPane2, new AbsoluteConstraints(17, 90, 940, 500));

        jLabel29.setFont(new Font("Segoe UI", 0, 20)); // NOI18N
        jLabel29.setForeground(new Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(SwingConstants.LEFT);
        jPanel1.add(jLabel29, new AbsoluteConstraints(110, 20, 580, 50));

        jButton10.setBackground(new Color(0, 0, 0));
        jButton10.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setForeground(new Color(255, 255, 255));
        jButton10.setText("Cerrar sesión");
        jButton10.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new AbsoluteConstraints(748, 30, 190, 40));

        jLabel20.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel20.setIcon(new ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel20, new AbsoluteConstraints(0, 0, 1000, 630));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 995, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 628, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }//GEN-END:initComponents

    /**
     * Método para manejar la acción realizada en el campo de texto jTextField3.
     * Se ejecuta cuando el usuario interactúa con el campo de texto.
     * 
     * @param evt Evento que contiene la información sobre la acción.
     */
    private void jTextField3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * Método para manejar la acción realizada en el campo de texto jTextField7.
     * Se ejecuta cuando el usuario interactúa con el campo de texto.
     * 
     * @param evt Evento que contiene la información sobre la acción.
     */
    private void jTextField7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    /**
     * Método para manejar la acción realizada en el campo de texto jTextField8.
     * Se ejecuta cuando el usuario interactúa con el campo de texto.
     * 
     * @param evt Evento que contiene la información sobre la acción.
     */
    private void jTextField8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    /**
     * Método para manejar la acción realizada en el combo box jComboBox3.
     * Se ejecuta cuando el usuario interactúa con el combo box.
     * 
     * @param evt Evento que contiene la información sobre la acción.
     */
    private void jComboBox3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    /**
     * Método para manejar la acción realizada en el campo de texto jTextField10.
     * Se ejecuta cuando el usuario interactúa con el campo de texto.
     * 
     * @param evt Evento que contiene la información sobre la acción.
     */
    private void jTextField10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    /**
     * Método que maneja la acción del botón para crear una nueva tarea.
     * Crea una tarea con los datos proporcionados en los campos de texto y combo boxes.
     * Si la tarea se crea correctamente, se actualiza la lista de tareas.
     * 
     * @param evt Evento que contiene la información sobre la acción.
     */
    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nom = jTextField7.getText();
        String descripcion = jTextField3.getText();
        String prioridad = jComboBox3.getSelectedItem().toString();
        String estado = jComboBox1.getSelectedItem().toString();
        String FechaEntrega= jTextField8.getText();
        String fechaInicio=jTextField11.getText();
        String comentarios= jTextField10.getText();
        if(archivosTarea.crearTarea(nom,descripcion,prioridad,estado, FechaEntrega,fechaInicio, comentarios)){
            JOptionPane.showMessageDialog(null, "Tarea creada con éxito!");
            cargarTareas();
            jTextField7.setText("");
            jTextField3.setText("");
            jTextField11.setText("");
            jTextField8.setText("");
            jTextField10.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear la tarea. Intente otro.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Método que maneja la acción del botón para cerrar la aplicación y volver al inicio.
     * 
     * @param evt Evento que contiene la información sobre la acción.
     */
    private void jButton10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    
    /**
     * Método que maneja la acción del botón para eliminar tareas seleccionadas.
     * Recorre la tabla y elimina las tareas que estén marcadas como activas.
     * 
     * @param evt Evento que contiene la información sobre la acción.
     */
    private void jButton4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        List<String> nomAEliminar = new ArrayList<>(); // Lista para almacenar las tareas a eliminar
        DefaultTableModel modelo = (DefaultTableModel) table.getModel(); // Obtener el modelo de la tabla
    
        // Validar que la tabla tenga filas
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La tabla no contiene datos para eliminar.");
            return;
        }

        // Recorrer las filas de la tabla
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Boolean activo = (Boolean) modelo.getValueAt(i, 3); // Columna 6 es "Activo"
            if (Boolean.TRUE.equals(activo)) { // Comparar con Boolean.TRUE para evitar null pointer
                String nombre = (String) modelo.getValueAt(i, 0); // Obtener el nombre (columna 0)
                if (nombre != null && !nombre.isEmpty()) {
                    nomAEliminar.add(nombre); // Agregar a la lista
                }
            }
        }

        // Verificar si se seleccionaron tareas para eliminar
        if (nomAEliminar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna casilla para eliminar.");
            return;
        }

        // Eliminar las tareas seleccionadas
        for (String tarea : nomAEliminar) {
            registro.eliminarUser(tarea); // Llamar al método eliminarTarea
        }

        // Eliminar las filas correspondientes del modelo de la tabla
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            Boolean activo = (Boolean) modelo.getValueAt(i, 6);
            if (Boolean.TRUE.equals(activo)) {
                modelo.removeRow(i); // Eliminar la fila del modelo
            }
        }

        JOptionPane.showMessageDialog(null, "Usuarios eliminados exitosamente.");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom = jTextField5.getText();
        String nomUser = jTextField6.getText();
        String correo = jTextField4.getText();
        String rol=jComboBox1.getSelectedItem().toString();
        String pass= jPasswordField1.getText();
        if (nom.isEmpty() || nomUser.isEmpty() || correo.isEmpty() || rol.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            
        }else{
            if(registroA.registrarUsers(nom,nomUser,correo,pass,rol)){
                JOptionPane.showMessageDialog(null, "Usuario registrado con éxito!");
                cargarDatosUsuarios();
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField4.setText("");
                jPasswordField1.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "El correo ya está en uso. Intente otro.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed
 
    private void jButton9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                                                 
        List<String> tareasAEliminar = new ArrayList<>(); // Lista para almacenar las tareas a eliminar
        DefaultTableModel modelo = (DefaultTableModel) jTable4.getModel(); // Obtener el modelo de la tabla
    
        // Validar que la tabla tenga filas
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La tabla no contiene datos para eliminar.");
            return;
        }

        // Recorrer las filas de la tabla
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Boolean activo = (Boolean) modelo.getValueAt(i, 6); // Columna 6 es "Activo"
            if (Boolean.TRUE.equals(activo)) { // Comparar con Boolean.TRUE para evitar null pointer
                String nombre = (String) modelo.getValueAt(i, 0); // Obtener el nombre (columna 0)
                if (nombre != null && !nombre.isEmpty()) {
                    tareasAEliminar.add(nombre); // Agregar a la lista
                }
            }
        }

        // Verificar si se seleccionaron tareas para eliminar
        if (tareasAEliminar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna casilla para eliminar.");
            return;
        }

        // Eliminar las tareas seleccionadas
        for (String tarea : tareasAEliminar) {
            f.eliminarTarea(tarea); // Llamar al método eliminarTarea
        }

        // Eliminar las filas correspondientes del modelo de la tabla
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            Boolean activo = (Boolean) modelo.getValueAt(i, 6);
            if (Boolean.TRUE.equals(activo)) {
                modelo.removeRow(i); // Eliminar la fila del modelo
            }
        }

        JOptionPane.showMessageDialog(null, "Tareas eliminadas exitosamente.");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
                                                
        DefaultTableModel modelo = (DefaultTableModel) jTable4.getModel(); // Obtener el modelo de la tabla

        // Validar que la tabla tenga filas
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La tabla no contiene datos para editar.");
            return;
        }

        List<String> seleccionados = new ArrayList<>();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            // Leer el valor de la columna "Activo" como Boolean
            Boolean activo = (Boolean) modelo.getValueAt(i, 6); // Columna "Activo"
        
            if (activo != null && activo) { // Si la casilla está marcada
                // Asegurarse de que la columna "Nombre" tenga un valor no nulo
                String nombre = (String) modelo.getValueAt(i, 0); // Columna "Nombre"
                if (nombre != null && !nombre.trim().isEmpty()) {
                    seleccionados.add(nombre);
                }
            }
        }

        // Validar las selecciones
        if (seleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se seleccionaron tareas.");
        } else if (seleccionados.size() > 1) {
            JOptionPane.showMessageDialog(null, "Solo debe seleccionar una casilla para realizar la edición de la tarea.");
        } else {
            // Abrir la ventana de edición y pasar el dato seleccionado
            EditarTareas ca = new EditarTareas();
            ca.setVisible(true);
            String seleccionado = seleccionados.get(0); // Obtener el único elemento seleccionado
            ca.llenar(seleccionado); // Pasar el dato al método de edición
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String nombre = jTextField12.getText().trim(); // Obtiene el nombre
        String prioridad = jComboBox6.getSelectedItem().toString().trim(); // Obtiene la prioridad
        String estado = jComboBox7.getSelectedItem().toString().trim();    // Obtiene el estado
        if(nombre.equals("")){
            nombre= "";
        }
        if(prioridad.equals("Estado")){
            prioridad= "";
        }
        if(estado.equals("Estado")){
            estado="";
        }
        // Realiza la búsqueda
        List<Tarea> tareasFiltradas = archivosTarea.buscarTareas(nombre, estado, prioridad);

        // Actualiza la tabla con las tareas filtradas
        actualizarTablaConTareas(tareasFiltradas);

        // Opcional: muestra un mensaje si no hay resultados
        if (tareasFiltradas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron tareas con los criterios proporcionados.");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jComboBox6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed


    /**
     * Método principal para ejecutar la interfaz gráfica.
     * 
     * @param args Argumentos de la línea de comandos.
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
            java.util.logging.Logger.getLogger(pag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton jButton1;
    JButton jButton10;
    JButton jButton11;
    JButton jButton12;
    JButton jButton3;
    JButton jButton4;
    JButton jButton9;
    JComboBox<String> jComboBox1;
    JComboBox<String> jComboBox2;
    JComboBox<String> jComboBox3;
    JComboBox<String> jComboBox6;
    JComboBox<String> jComboBox7;
    JLabel jLabel12;
    JLabel jLabel13;
    JLabel jLabel14;
    JLabel jLabel15;
    JLabel jLabel16;
    JLabel jLabel17;
    JLabel jLabel18;
    JLabel jLabel2;
    JLabel jLabel20;
    JLabel jLabel22;
    JLabel jLabel23;
    JLabel jLabel28;
    JLabel jLabel29;
    JLabel jLabel3;
    JLabel jLabel30;
    JLabel jLabel31;
    JLabel jLabel32;
    JLabel jLabel33;
    JLabel jLabel34;
    JLabel jLabel4;
    JLabel jLabel5;
    JLabel jLabel6;
    JLabel jLabel7;
    JPanel jPanel1;
    JPanel jPanel2;
    JPanel jPanel3;
    JPanel jPanel4;
    JPanel jPanel7;
    JPanel jPanel8;
    JPasswordField jPasswordField1;
    JScrollPane jScrollPane2;
    JScrollPane jScrollPane4;
    JScrollPane jScrollPane6;
    JTabbedPane jTabbedPane2;
    JTable jTable2;
    JTable jTable4;
    JTextField jTextField10;
    JTextField jTextField11;
    JTextField jTextField12;
    JTextField jTextField3;
    JTextField jTextField4;
    JTextField jTextField5;
    JTextField jTextField6;
    JTextField jTextField7;
    JTextField jTextField8;
    JTable table;
    // End of variables declaration//GEN-END:variables

}
