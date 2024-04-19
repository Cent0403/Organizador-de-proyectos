/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import CLASES.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

/**
 *
 * @author victo
 */
public class Administrar extends javax.swing.JFrame {
    ArrayList<Proyectos> lproyectos;
    ArrayList<Miembros> lmiembros;
    ArrayList<Asignaciones> lasignaciones;
    DefaultTableModel modeloTa;
    DefaultTableModel modeloMi;     
    DefaultTableModel modeloAs;
    DateFormat formatoFecha;
    String aUsername;
    String aName;
    

    public Administrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        lproyectos = new ArrayList<>();
        lmiembros = new ArrayList<>();
        lasignaciones = new ArrayList<>();
        modeloTa = (DefaultTableModel) this.jTable1.getModel();
        modeloMi = (DefaultTableModel) this.jTable2.getModel();
        modeloAs = (DefaultTableModel) this.jTable3.getModel();
        formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); 
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PROYECTO");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA DE ENTREGA:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MIEMBROS:");

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Miembro1");

        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Miembro2");

        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Miembro3");

        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Miembro4");

        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Miembro5");

        jButton1.setText("AGREGAR PROYECTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR PROYECTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proyectos", "Fecha de Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton5.setText("AGREGAR MIEMBRO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel6)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(36, 36, 36))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jTable3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable3.setForeground(new java.awt.Color(51, 51, 51));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tareas", "Fecha Limite", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ASIGNACIÓN:");

        jButton4.setText("AGREGAR ASIG");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("ELIMINAR ASIG");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("ATRAS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setForeground(new java.awt.Color(51, 51, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Miembros", "Fecha de Agregación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jTable2.setCellSelectionEnabled(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FECHA DE ENTREGA:");

        jButton8.setText("ELIMINAR MIEMBRO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("ENVIAR EMAIL");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("COMPLETAR ASIG");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4)
                                .addComponent(jButton7)
                                .addComponent(jButton6)
                                .addComponent(jButton10))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(963, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void SetUsername(String Username, String Name){
        this.aUsername = Username;
        this.aName = Name;
        CargarProyectos();
    }
    
    public void CargarProyectos() {
        String admin = this.aUsername;

        modeloTa.setRowCount(0);

        ArrayList<Proyectos> proyectos = Proyectos.ProyectosAdmin(admin);

        for (Proyectos proyecto : proyectos) {
            String[] registroP = {proyecto.getProyecto(), formatoFecha.format(proyecto.getEntrega())};
            modeloTa.addRow(registroP);

            this.lproyectos.add(proyecto);

            for (Miembros miembro : proyecto.lMiembros) {
                lmiembros.add(miembro);

                for (Asignaciones asignacion : miembro.lAsignaciones) {
                    lasignaciones.add(asignacion);
                }
            }
}
    }
    
    private void actualizarVistaProyectos() {
        modeloTa.setRowCount(0); 
        modeloAs.setRowCount(0); 
        modeloMi.setRowCount(0); 
        CargarProyectos(); 
    }
    
    public void CargarMiembros() {
        modeloMi.getDataVector().removeAllElements();
        
        int indiceProyecto = this.jTable1.getSelectedRow();
        int cantMiembros = this.lproyectos.get(indiceProyecto).lMiembros.size();
        for(int j=0; j<cantMiembros; j++)
        {
            String[] registroP = {this.lproyectos.get(indiceProyecto).lMiembros.get(j).Miembros,
                                  formatoFecha.format(this.lproyectos.get(indiceProyecto).lMiembros.get(j).fecha)};
            modeloMi.addRow(registroP);
        }
    }
    
    public void CargarAsignaciones() {
        modeloAs.setRowCount(0);
        int indiceMiembro = this.jTable2.getSelectedRow();
        int indiceProyecto = this.jTable1.getSelectedRow();

        if (indiceMiembro != -1 && indiceMiembro < this.lmiembros.size() &&
            indiceProyecto != -1 && indiceProyecto < this.lproyectos.size()) { 

            String proyectoSeleccionado = (String) jTable1.getValueAt(indiceProyecto, 0);
            String miembroSeleccionado = (String) jTable2.getValueAt(indiceMiembro, 0);
            this.jLabel1.setText(miembroSeleccionado);

            for (Proyectos proyecto : lproyectos) {
                for (Miembros miembro : proyecto.lMiembros) {
                    for (Asignaciones asignacion : miembro.lAsignaciones) {
                        if (asignacion.getProyecto().equals(proyectoSeleccionado) &&
                            asignacion.getMiembro().equals(miembroSeleccionado)) {
                            String[] registroP = {asignacion.Asignación,
                                                  formatoFecha.format(asignacion.Entrega),
                                                  asignacion.Estado};
                            modeloAs.addRow(registroP);
                        }
                    }
                }
            }
        }
    }
    
  
    public void enviarCorreo(String destinatario, String nombreMiembro, String asignacion) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("correderemitente@gmail.com", "#### #### #### ####");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("correderemitente@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario, true));
            message.setSubject("Asignación de tarea");
            String cuerpoMensaje = "Hola " + nombreMiembro + ",\n\n" +
                                   "Recordatorio de la siguiente tarea:\n" +
                                   asignacion + "\n\n" +
                                   "Por favor, procede según sea necesario.\n\n" +
                                   "Saludos,\n" +
                                   "Tu equipo";
            message.setText(cuerpoMensaje);
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Correo enviado exitosamente.");

        } catch (MessagingException me) {
            JOptionPane.showMessageDialog(this, "Exception: " + me);
        }

    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String maxTa = this.jTextField2.getText();
        String admin = aUsername;
        Date maxFe = this.jDateChooser2.getDate();
        boolean alMenosUnMiembroSeleccionado = false;
        JCheckBox[] jCheckBoxes = {jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5};
        Date fechaActual = new Date();

        if (maxTa.isEmpty() || maxFe == null) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (maxFe.before(fechaActual)) {
            JOptionPane.showMessageDialog(this, "La fecha máxima debe ser posterior a la fecha actual.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Proyectos proyecto : lproyectos) {
            if (proyecto.getProyecto().equals(maxTa)) {
                JOptionPane.showMessageDialog(this, "Ya existe un proyecto con el mismo nombre.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        for (JCheckBox checkBox : jCheckBoxes) {
            if (checkBox.isSelected()) {
                alMenosUnMiembroSeleccionado = true;
                break;
            }
        }
        if (!alMenosUnMiembroSeleccionado) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione al menos un miembro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Proyectos nuevoProyecto = new Proyectos(admin, maxTa, maxFe);
        this.lproyectos.add(nuevoProyecto);

        Object[] rowData = {maxTa, maxFe};
        modeloTa.addRow(rowData);

        for (JCheckBox checkBox : jCheckBoxes) {
            if (checkBox.isSelected()) {
                String checkBoxText = checkBox.getText();
                Miembros nuevoMiembro = new Miembros(maxTa, checkBoxText, fechaActual);
                this.lmiembros.add(nuevoMiembro);
                nuevoProyecto.lMiembros.add(nuevoMiembro);
            }
        }

        this.jTextField2.setText("");
        this.jDateChooser2.setDate(null);
        for (JCheckBox checkBox : jCheckBoxes) {
            checkBox.setSelected(false);
        }
        modeloAs.setRowCount(0); 
        modeloMi.setRowCount(0); 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String pUsername = aUsername;
        String pName = aName;
        Menu menu = new Menu();
        menu.SetUsername(pUsername, pName);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        CargarMiembros();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        CargarAsignaciones();
    }//GEN-LAST:event_jTable2MouseClicked
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int indiceMiembro = this.jTable2.getSelectedRow();
        int indiceProyecto = this.jTable1.getSelectedRow();
        String asignacion = jTextField3.getText();
        Date fechaActual = new Date();
        Date fecha = this.jDateChooser3.getDate();

        if (indiceMiembro == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un miembro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (indiceProyecto == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proyecto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (asignacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una descripción para la asignación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha para la asignación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (fecha.before(fechaActual)) {
            JOptionPane.showMessageDialog(this, "La fecha máxima debe ser posterior a la fecha actual.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Proyectos proyectoSeleccionado = lproyectos.get(indiceProyecto);
        Miembros miembroSeleccionado = proyectoSeleccionado.getMiembros().get(indiceMiembro);

        String nombreProyecto = proyectoSeleccionado.getProyecto();
        String nombreMiembro = miembroSeleccionado.getMiembro();

        miembroSeleccionado.lAsignaciones.add(new Asignaciones(nombreProyecto, nombreMiembro, asignacion, fecha, "Pendiente"));

        jTextField3.setText("");
        this.jDateChooser3.setDate(null);
        CargarAsignaciones();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int indiceProyecto = this.jTable1.getSelectedRow();
        if (indiceProyecto == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proyecto para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Proyectos proyectoAEliminar = lproyectos.get(indiceProyecto);
        for (Miembros miembro : proyectoAEliminar.lMiembros) {
            for (Iterator<Asignaciones> iterator = miembro.lAsignaciones.iterator(); iterator.hasNext();) {
                Asignaciones asignacion = iterator.next();
                if (asignacion.getProyecto().equals(proyectoAEliminar.getProyecto())) {
                    iterator.remove();
                }
            }
            if (miembro.lAsignaciones.isEmpty()) {
                lmiembros.remove(miembro);
            }
        }

        proyectoAEliminar.lMiembros.clear(); 
        lproyectos.remove(proyectoAEliminar); 
        modeloTa.removeRow(indiceProyecto);
        
        Proyectos.eliminarProyecto(proyectoAEliminar);
        this.jTable1.clearSelection();
        actualizarVistaProyectos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int indiceAsignacion = this.jTable3.getSelectedRow();
        int indiceMiembro = this.jTable2.getSelectedRow();
        int indiceProyecto = this.jTable1.getSelectedRow();

        if (indiceAsignacion == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una asignación para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (indiceMiembro == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un miembro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (indiceProyecto == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proyecto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Proyectos proyectoSeleccionado = lproyectos.get(indiceProyecto);
        Miembros miembroSeleccionado = proyectoSeleccionado.getMiembros().get(indiceMiembro);

        Asignaciones asignacionAEliminar = miembroSeleccionado.lAsignaciones.get(indiceAsignacion);
        miembroSeleccionado.lAsignaciones.remove(asignacionAEliminar);
        
        CargarAsignaciones();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int indiceMiembro = this.jTable2.getSelectedRow();
        int indiceProyecto = this.jTable1.getSelectedRow();
        if (indiceMiembro == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un miembro para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (indiceProyecto == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proyecto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Proyectos proyecto = lproyectos.get(indiceProyecto);
    
        Miembros miembroAEliminar = proyecto.lMiembros.get(indiceMiembro);

        Iterator<Asignaciones> iterator = miembroAEliminar.lAsignaciones.iterator();
        while (iterator.hasNext()) {
            Asignaciones asignacion = iterator.next();
            if (asignacion.getProyecto().equals(proyecto.getProyecto())) {
                iterator.remove();
            }
        }

        proyecto.lMiembros.remove(miembroAEliminar);

        if (miembroAEliminar.lAsignaciones.isEmpty()) {
            lmiembros.remove(miembroAEliminar);
        }
        
        CargarMiembros();
        modeloAs.setRowCount(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nombreNuevoMiembro = this.jTextField4.getText();
        int indiceProyecto = this.jTable1.getSelectedRow();
        if (indiceProyecto == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un proyecto.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if (nombreNuevoMiembro.isEmpty() || nombreNuevoMiembro == null) {
            JOptionPane.showMessageDialog(this, "Por favor, asigne un nombre al nuevo miembro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for (Miembros miembro : lmiembros) {
            if (miembro.getMiembro().equals(nombreNuevoMiembro)) {
                JOptionPane.showMessageDialog(this, "Ya existe un miembro con el mismo nombre.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Proyectos proyecto = lproyectos.get(indiceProyecto);
        Miembros nuevoMiembro = new Miembros(proyecto.getProyecto(), nombreNuevoMiembro, new Date());
        proyecto.lMiembros.add(nuevoMiembro);
        lmiembros.add(nuevoMiembro);
        this.jTextField4.setText("");
        CargarMiembros();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int indiceMiembro = this.jTable2.getSelectedRow();
        int indiceAsignacion = this.jTable3.getSelectedRow();

        if (indiceMiembro == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un miembro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (indiceAsignacion == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una asignación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String destinatario = this.jTextField5.getText().trim(); 
        String miembroSeleccionado = (String) jTable2.getValueAt(indiceMiembro, 0);
        String asignacionSeleccionada = (String) jTable3.getValueAt(indiceAsignacion, 0);
        String estadoAsignacion = (String) jTable3.getValueAt(indiceAsignacion, 2);

        if (destinatario.isEmpty()) { 
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el correo a enviar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (estadoAsignacion.equals("Completado")) {
            JOptionPane.showMessageDialog(this, "Esta tarea ya ha sido completada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        enviarCorreo(destinatario, miembroSeleccionado, asignacionSeleccionada);;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int indiceProyecto = this.jTable1.getSelectedRow();
        int indiceMiembro = this.jTable2.getSelectedRow();
        int indiceAsignacion = this.jTable3.getSelectedRow();
        
        if (indiceProyecto == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proyecto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (indiceMiembro == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un miembro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (indiceAsignacion == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una asignación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String proyectoAsignado = (String) jTable1.getValueAt(indiceProyecto, 0);
        String miembroAsignado = (String) jTable2.getValueAt(indiceMiembro, 0);
        String asignacionAsignada = (String) jTable3.getValueAt(indiceAsignacion, 0);
        
        for (Proyectos proyecto : lproyectos) {
                for (Miembros miembro : proyecto.lMiembros) {
                    for (Asignaciones asignacion : miembro.lAsignaciones) {
                        if (asignacion.getProyecto().equals(proyectoAsignado)&&
                                asignacion.getMiembro().equals(miembroAsignado)&&
                                        asignacion.getAsignacion().equals(asignacionAsignada)){
                            asignacion.setEstado();
                        }
                    }
                }
            }
        CargarAsignaciones();
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Administrar().setVisible(true);
                }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
