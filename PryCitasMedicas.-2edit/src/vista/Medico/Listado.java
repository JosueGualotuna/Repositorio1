package vista.Medico;

import controlador.MedicoControlador;
import vista.pacientes.*;
import controlador.PacienteControlador;
import javax.swing.table.DefaultTableModel;
import modelo.MedicoModelo;
import modelo.PacienteModelo;

public class Listado extends javax.swing.JInternalFrame {
    public DefaultTableModel tableModel= new DefaultTableModel();
    MedicoControlador controlador = MedicoControlador.getInstancia();
    
    public Listado() {
        initComponents();
        
    tbl_TablaListado.setModel(tableModel);
    String columnas []= {"CEDULA","NOMBRES","EDAD","SEXO","ESPECIALIDAD"};
    tableModel.setColumnIdentifiers(columnas);
        listar();

    }
    public void listar(){
    for (MedicoModelo medic :  controlador.RetornarListaMedico()) {
            Object[] fila={medic.getCedula(),medic.getNombres()
                    ,medic.getEdad(), medic.getSexo(),medic.getEspecialidad().getNombre()};
            tableModel.addRow(fila);
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_buscarCedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TablaListado = new javax.swing.JTable();

        jLabel1.setText("BUSCAR POR CEDULA:");

        txt_buscarCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarCedulaKeyReleased(evt);
            }
        });

        tbl_TablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_TablaListado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscarCedula)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_buscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarCedulaKeyReleased
        String cedula = txt_buscarCedula.getText();
        tableModel.setRowCount(0);
 
        controlador.ListadoCompletoPorCedula(cedula);
        for (MedicoModelo medic :  controlador.ListadoCompletoPorCedula(cedula)) {
            Object[] fila={medic.getCedula(),medic.getNombres()
                    ,medic.getEdad(), medic.getSexo(),medic.getEspecialidad().getNombre()};
            tableModel.addRow(fila);
        }
    }//GEN-LAST:event_txt_buscarCedulaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_TablaListado;
    private javax.swing.JTextField txt_buscarCedula;
    // End of variables declaration//GEN-END:variables
}
