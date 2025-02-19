package vista;

import controlador.GestionDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaVista extends javax.swing.JFrame {

    DefaultTableModel modeloListaTabla1 = new DefaultTableModel();
    GestionDatos gestion = GestionDatos.getInstancia();

    public PantallaVista() {
        initComponents();
        tablaDatos.setModel(modeloListaTabla1);
        String columnas[] = {"PACIENTE", "EDAD PACIENTE", "CEDULA PACIENTE", "MEDICO", "TURNO ENTRADA", "TURNO SALIDA"};
        modeloListaTabla1.setColumnIdentifiers(columnas);
        actualizarTabla();

    }

    private void actualizarTabla() {
        modeloListaTabla1.setRowCount(0);
        ArrayList<Object> datos = gestion.getListaCombinada();
        for (Object dato : datos) {
            modeloListaTabla1.addRow(new Object[]{datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4), datos.get(5)});
       
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        txtPaciente = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtMedico = new javax.swing.JTextField();
        txtTentrada = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        btnSubirDatos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE DEL PACIENTE:");

        jLabel2.setText("EDAD DEL PACIENTE:");

        jLabel3.setText("CEDULA DEL PACIENTE:");

        jLabel4.setText("MEDICO ENCARGADO:");

        jLabel5.setText("TURNO HORA DE ENTRADA:");

        jLabel6.setText("TURNO HORA DE SALIDA:");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PACIENTE", "EDAD PACIENTE", "CEDULA PACIENTE", "MEDICO", "TURNO ENTRADA", "TURNO SALIDA"
            }
        ));
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        txtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPacienteKeyTyped(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedicoKeyTyped(evt);
            }
        });

        btnSubirDatos.setText("SUBIR DATOS");
        btnSubirDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirDatosActionPerformed(evt);
            }
        });

        jLabel7.setText("SISTEMA DE GESTION DE TURNOS MEDICOS");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSalida)
                                        .addComponent(txtTentrada)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizar)
                                    .addComponent(btnSubirDatos)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnEliminar)))
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(476, 476, 476))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnSubirDatos)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirDatosActionPerformed
    String nombre = txtPaciente.getText().trim();
    String edadTexto = txtEdad.getText().trim();
    String cedulaTexto = txtCedula.getText().trim();
    String medico = txtMedico.getText().trim();
    String turnoEntradaTexto = txtTentrada.getText().trim();
    String turnoSalidaTexto = txtSalida.getText().trim();

    if (nombre.isEmpty() || edadTexto.isEmpty() || cedulaTexto.isEmpty() || 
        medico.isEmpty() || turnoEntradaTexto.isEmpty() || turnoSalidaTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return; 
    }

    try {
        int edad = Integer.parseInt(edadTexto);
        int cedula = Integer.parseInt(cedulaTexto);
        int turnoEntrada = Integer.parseInt(turnoEntradaTexto);
        int turnoSalida = Integer.parseInt(turnoSalidaTexto);

        modeloListaTabla1.addRow(new Object[]{nombre, edad, cedula, medico, turnoEntrada, turnoSalida});

        txtPaciente.setText("");
        txtEdad.setText("");
        txtCedula.setText("");
        txtMedico.setText("");
        txtTentrada.setText("");
        txtSalida.setText("");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Edad, cédula, turno entrada y turno salida deben ser valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSubirDatosActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        int filaSeleccionada = tablaDatos.getSelectedRow(); 
        
     
     if (filaSeleccionada != -1 && tablaDatos.getRowCount() > 0) { 
            String Nombre = (String) modeloListaTabla1.getValueAt(filaSeleccionada, 0);
            int Edad = (int) modeloListaTabla1.getValueAt(filaSeleccionada, 1);
            int Cedula = (int) modeloListaTabla1.getValueAt(filaSeleccionada, 2);
            String Medico = (String) modeloListaTabla1.getValueAt(filaSeleccionada, 3);
            int TurnoEntrada = (int) modeloListaTabla1.getValueAt(filaSeleccionada, 4);
            int TurnoSalida = (int) modeloListaTabla1.getValueAt(filaSeleccionada, 5);

            txtPaciente.setText(Nombre);
            txtEdad.setText(String.valueOf(Edad));
            txtCedula.setText(String.valueOf(Cedula));
            txtMedico.setText(Medico);
            txtTentrada.setText(String.valueOf(TurnoEntrada));
            txtSalida.setText(String.valueOf(TurnoSalida));
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila válida.");
        }
    }//GEN-LAST:event_tablaDatosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaDatos.getSelectedRow();
        if (filaSeleccionada != -1) { 

            gestion.eliminarMensajePorIndice(filaSeleccionada);

            modeloListaTabla1.removeRow(filaSeleccionada);
        }
        txtPaciente.setText("");
        txtEdad.setText("");
        txtCedula.setText("");
        txtMedico.setText("");
        txtTentrada.setText("");
        txtSalida.setText("");

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (modeloListaTabla1.getRowCount() > 0) {

            int filaSeleccionada = tablaDatos.getSelectedRow();
        if (filaSeleccionada != -1) {
            String nombre = txtPaciente.getText();
            String edadStr = txtEdad.getText();
            String cedulaStr = txtCedula.getText();
            String medico = txtMedico.getText();
            String turnoEntradaStr = txtTentrada.getText();
            String turnoSalidaStr = txtSalida.getText();
            
            if (nombre.isEmpty() || edadStr.isEmpty() || cedulaStr.isEmpty() || medico.isEmpty() || turnoEntradaStr.isEmpty() || turnoSalidaStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados", "Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            
            try {
                int edad = Integer.parseInt(edadStr);
                int cedula = Integer.parseInt(cedulaStr);
                int turnoEntrada = Integer.parseInt(turnoEntradaStr);
                int turnoSalida = Integer.parseInt(turnoSalidaStr);

                modeloListaTabla1.setValueAt(nombre, filaSeleccionada, 0);
                modeloListaTabla1.setValueAt(edad, filaSeleccionada, 1);
                modeloListaTabla1.setValueAt(cedula, filaSeleccionada, 2);
                modeloListaTabla1.setValueAt(medico, filaSeleccionada, 3);
                modeloListaTabla1.setValueAt(turnoEntrada, filaSeleccionada, 4);
                modeloListaTabla1.setValueAt(turnoSalida, filaSeleccionada, 5);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos para edad, cédula y turnos", "Error de formato", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para actualizar.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No hay datos para actualizar.");
    }
    
    txtPaciente.setText("");
    txtEdad.setText("");
    txtCedula.setText("");
    txtMedico.setText("");
    txtTentrada.setText("");
    txtSalida.setText("");

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPacienteKeyTyped
char c = evt.getKeyChar();
if(Character.isDigit(c)){
evt.consume();
}


    }//GEN-LAST:event_txtPacienteKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
char c = evt.getKeyChar();
if(!Character.isDigit(c)){
evt.consume();
}    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
char c = evt.getKeyChar();
if(!Character.isDigit(c)){
evt.consume();
}    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicoKeyTyped
char c = evt.getKeyChar();
if(Character.isDigit(c)){
evt.consume();
}    }//GEN-LAST:event_txtMedicoKeyTyped

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
            java.util.logging.Logger.getLogger(PantallaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSubirDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JTextField txtTentrada;
    // End of variables declaration//GEN-END:variables
}
