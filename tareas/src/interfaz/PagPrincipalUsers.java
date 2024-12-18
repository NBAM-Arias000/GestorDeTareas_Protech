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
 *
 * @author maxma
 */
public class PagPrincipalUsers extends javax.swing.JFrame {
    public Mensaje mensaje;
    registro registro = new registro();
    ArchivosTarea f = new ArchivosTarea();
    public PagPrincipalUsers() {
        mensaje = new Mensaje();
        initComponents();
        cargarTareas(); 
        setResizable(false);
        setTitle("Gestor de Tareas");
        setLocationRelativeTo(null);
    }
    public void iniciarEscritura() {
        String user =  ActualUsuario.getNombre();
        String texto = "Bienvenid@ " +user+ ". ¿Qué desea hacer hoy?";
        mensaje.escribirTextoAutomaticamente(jLabel29, texto, 50);
    }
    
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new JPanel();
        jLabel3 = new JLabel();
        jTabbedPane2 = new JTabbedPane();
        jPanel5 = new JPanel();
        jScrollPane3 = new JScrollPane();
        jTable1 = new JTable();
        jLabel21 = new JLabel();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jTextField9 = new JTextField();
        jButton6 = new JButton();
        jComboBox4 = new JComboBox<>();
        jComboBox5 = new JComboBox<>();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
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
        jLabel19 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<>();
        jLabel28 = new JLabel();
        jTextField10 = new JTextField();
        jButton3 = new JButton();
        jTextField11 = new JTextField();
        jLabel22 = new JLabel();
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

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Detalles", "Prioridad", "Estado", "Fecha de Entrega", "Esitar/Borrar Tareas"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class, Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel21.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel21.setForeground(new Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel21.setText("LISTA DE TAREAS:");

        jButton7.setBackground(new Color(0, 0, 0));
        jButton7.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setForeground(new Color(255, 255, 255));
        jButton7.setText("ELIMINAR");
        jButton7.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new Color(0, 0, 0));
        jButton8.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setForeground(new Color(255, 255, 255));
        jButton8.setText("EDITAR");
        jButton8.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(JTextField.CENTER);
        jTextField9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new Color(0, 0, 0));
        jButton6.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new Color(255, 255, 255));
        jButton6.setIcon(new ImageIcon(getClass().getResource("/imagenes/magnifying_glass_dark_background_50x50_1.jpg"))); // NOI18N
        jButton6.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox4.setModel(new DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));
        jComboBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox5.setModel(new DefaultComboBoxModel<>(new String[] { "Por hacer", "En progreso", "Completada" }));
        jComboBox5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel30.setForeground(new Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel30.setText("NOMBRE:");

        jLabel31.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel31.setForeground(new Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel31.setText("ESTADO:");

        jLabel32.setFont(new Font("Segoe UI", 0, 23)); // NOI18N
        jLabel32.setForeground(new Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel32.setText("PRIORIDAD:");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel30)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addGap(20, 20, 20)
                        .addComponent(jComboBox5, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton6))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 871, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton6)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("LISTA DE TAREAS", jPanel5);

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
        jLabel18.setText("FECHA DE ENTREGA:");

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

        jLabel19.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel19.setText("ASIGNAR:");

        jList1.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jList1.setModel(new AbstractListModel<String>() {
            String[] strings = { "as", "dasf", "afa", "dg", "A", "SF", "AFSD", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jList1);

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

        jLabel22.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel22.setText("FECHA DE INICIO:");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel22))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))))
                .addGap(120, 120, 120))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CREAR TAREA", jPanel3);

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
                    .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 651, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel23, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jButton10.setText("Cerrar Sesion");
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
    private void cargarTareas() {
        // Obtener el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();

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
            tarea.getFechaEntrega()
            });
        }
    }
    
    private void actualizarTablaConTareas(List<Tarea> tareasFiltradas) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // Limpia la tabla antes de añadir nuevas filas

        for (Tarea tarea : tareasFiltradas) {
            modelo.addRow(new Object[]{
            tarea.getNombre(),
            tarea.getPrioridad(),
            tarea.getEstado(), 
            });
        }
    }
    private void jButton10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new interfaz.inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jComboBox5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel(); // Obtener el modelo de la tabla

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
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        List<String> tareasAEliminar = new ArrayList<>(); // Lista para almacenar las tareas a eliminar
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel(); // Obtener el modelo de la tabla
    
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
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nom = jTextField7.getText();
        String descripcion = jTextField3.getText();
        String prioridad = jComboBox3.getSelectedItem().toString();
        String estado = jComboBox1.getSelectedItem().toString();
        String FechaEntrega= jTextField8.getText();
        String comentarios= jTextField10.getText();
        String fechaInicio= jTextField11.getText();
        if(archivosTarea.crearTarea(nom,descripcion,prioridad,estado, FechaEntrega,fechaInicio,comentarios)){
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

    private void jTextField10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jComboBox3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String nombre = jTextField9.getText().trim(); // Obtiene el nombre
        String prioridad = jComboBox4.getSelectedItem().toString().trim(); // Obtiene la prioridad
        String estado = jComboBox5.getSelectedItem().toString().trim();    // Obtiene el estado

        // Realiza la búsqueda
        List<Tarea> tareasFiltradas = archivosTarea.buscarTareas(nombre, estado, prioridad);

        // Actualiza la tabla con las tareas filtradas
        actualizarTablaConTareas(tareasFiltradas);

        // Opcional: muestra un mensaje si no hay resultados
        if (tareasFiltradas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron tareas con los criterios proporcionados.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PagPrincipalUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagPrincipalUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagPrincipalUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagPrincipalUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagPrincipalUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton jButton10;
    JButton jButton3;
    JButton jButton6;
    JButton jButton7;
    JButton jButton8;
    JComboBox<String> jComboBox1;
    JComboBox<String> jComboBox3;
    JComboBox<String> jComboBox4;
    JComboBox<String> jComboBox5;
    JLabel jLabel13;
    JLabel jLabel14;
    JLabel jLabel15;
    JLabel jLabel16;
    JLabel jLabel17;
    JLabel jLabel18;
    JLabel jLabel19;
    JLabel jLabel20;
    JLabel jLabel21;
    JLabel jLabel22;
    JLabel jLabel23;
    JLabel jLabel28;
    JLabel jLabel29;
    JLabel jLabel3;
    JLabel jLabel30;
    JLabel jLabel31;
    JLabel jLabel32;
    JList<String> jList1;
    JPanel jPanel1;
    JPanel jPanel3;
    JPanel jPanel5;
    JPanel jPanel7;
    JScrollPane jScrollPane1;
    JScrollPane jScrollPane3;
    JScrollPane jScrollPane4;
    JTabbedPane jTabbedPane2;
    JTable jTable1;
    JTable jTable2;
    JTextField jTextField10;
    JTextField jTextField11;
    JTextField jTextField3;
    JTextField jTextField7;
    JTextField jTextField8;
    JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
