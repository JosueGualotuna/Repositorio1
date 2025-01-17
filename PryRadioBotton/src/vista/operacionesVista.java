/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.OperacionesControlador;

/**
 *
 * @author Laboratorios DCCO
 */
public class operacionesVista extends javax.swing.JFrame {

    /**
     * Creates new form operacionesVista
     */
    public OperacionesControlador opcontrolador = new OperacionesControlador();
public int num1,num2;
    public operacionesVista() {
        initComponents();
    }

    
 public void obtenerNumVista(){
 num1 = Integer.parseInt(txt_1.getText());
 num2 =Integer.parseInt(txt_2.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txt_1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_2 = new javax.swing.JTextField();
        op_suma = new javax.swing.JRadioButton();
        op_resta = new javax.swing.JRadioButton();
        op_multiplicar = new javax.swing.JRadioButton();
        op_dividir = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_resultado = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        op_combobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("INGRESE NUMERO 1: ");

        txt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_1ActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE NUMERO 2: ");

        op_suma.setText("SUMAR");
        op_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumar(evt);
            }
        });

        op_resta.setText("RESTAR");
        op_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restar(evt);
            }
        });

        op_multiplicar.setText("MULTIPLICAR");
        op_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicar(evt);
            }
        });

        op_dividir.setText("DIVIDIR");
        op_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                division(evt);
            }
        });

        jLabel3.setText("RESULTADO: ");

        lbl_resultado.setText("0.00");

        jCheckBox1.setText("SUMAR");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarCheckBox(evt);
            }
        });

        jCheckBox2.setText("MULTIPLICAR");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarCheckBox(evt);
            }
        });

        jCheckBox3.setText("DIVIDIR");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirCheckBox(evt);
            }
        });

        jCheckBox4.setText("RESTAR");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarcCheckBox(evt);
            }
        });

        op_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR" }));
        op_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_comboboxActionPerformed(evt);
            }
        });

        jLabel4.setText("SELECCIONE UNA OPERACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op_resta)
                            .addComponent(op_multiplicar)
                            .addComponent(op_dividir)
                            .addComponent(op_suma))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_resultado))
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox4))
                                .addGap(177, 177, 177)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(op_suma)
                            .addGap(18, 18, 18)
                            .addComponent(op_resta))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(op_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_multiplicar)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_dividir)
                    .addComponent(jCheckBox3))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resultado)
                    .addComponent(jLabel3))
                .addGap(18, 86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_1ActionPerformed

    private void restar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restar
int resultado = opcontrolador.restar(num1,num2);

lbl_resultado.setText(String.valueOf(resultado));
op_suma.setSelected(false);
op_multiplicar.setSelected(false);
op_dividir.setSelected(false);


    }//GEN-LAST:event_restar

    private void sumar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumar
// captura de datos
obtenerNumVista();

int resultado = opcontrolador.sumar(num1,num2);

lbl_resultado.setText(String.valueOf(resultado));
op_multiplicar.setSelected(false);
op_dividir.setSelected(false);
op_resta.setSelected(false);
    }//GEN-LAST:event_sumar

    private void multiplicar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicar
/*
        int num1= Integer.parseInt(txt_1.getText());
int num2= Integer.parseInt(txt_2.getText());
int resultado = opcontrolador.restar(num2, num2);
lbl_resultado.setText(String.valueOf(resultado));
  */

obtenerNumVista();

int resultado = opcontrolador.multiplicar(num1,num2);

lbl_resultado.setText(String.valueOf(resultado));
op_suma.setSelected(false);;
op_dividir.setSelected(false);
op_resta.setSelected(false);

    }//GEN-LAST:event_multiplicar

    private void division(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_division
obtenerNumVista();

int resultado = opcontrolador.dividir(num1,num2);
lbl_resultado.setText(String.valueOf(resultado));
op_suma.setSelected(false);;
op_resta.setSelected(false);
op_multiplicar.setSelected(false);
            }//GEN-LAST:event_division

    private void sumarCheckBox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarCheckBox
sumar(evt);

    }//GEN-LAST:event_sumarCheckBox

    private void restarcCheckBox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarcCheckBox
restar(evt);

    }//GEN-LAST:event_restarcCheckBox

    private void multiplicarCheckBox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarCheckBox
multiplicar(evt);
    }//GEN-LAST:event_multiplicarCheckBox

    private void dividirCheckBox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirCheckBox
division(evt);
    }//GEN-LAST:event_dividirCheckBox

    private void op_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_comboboxActionPerformed
String nombreOpciones = op_combobox.getSelectedItem().toString();
switch(nombreOpciones){
    case "SUMAR":    
    sumar(evt);
    break;
  case "RESTAR":    
    restar(evt);
    break;   
     case "MULTIPLICAR":    
    multiplicar(evt);
    break;   
   case "DIVIDIR":    
    division(evt);
    break;   
}
    }//GEN-LAST:event_op_comboboxActionPerformed

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
            java.util.logging.Logger.getLogger(operacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(operacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(operacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(operacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operacionesVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JComboBox<String> op_combobox;
    private javax.swing.JRadioButton op_dividir;
    private javax.swing.JRadioButton op_multiplicar;
    private javax.swing.JRadioButton op_resta;
    private javax.swing.JRadioButton op_suma;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    // End of variables declaration//GEN-END:variables
}
