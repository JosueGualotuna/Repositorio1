/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.Especialidades.ingresar2;
import vista.pacientes.Ingresar;
import vista.pacientes.Listado;

/**
 *
 * @author Laboratorios DCCO
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_Principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menu_IngresarPaciente = new javax.swing.JMenuItem();
        menu_ListadoPaciente = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuIngresarEspecialidad = new javax.swing.JMenuItem();
        menuListadoEspecialidad = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuIngresarMedico = new javax.swing.JMenuItem();
        MenuListarMedico = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuIngresarCita = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        contenedor_Principal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedor_PrincipalLayout = new javax.swing.GroupLayout(contenedor_Principal);
        contenedor_Principal.setLayout(contenedor_PrincipalLayout);
        contenedor_PrincipalLayout.setHorizontalGroup(
            contenedor_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        contenedor_PrincipalLayout.setVerticalGroup(
            contenedor_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        jMenu1.setText("INICION");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("PACIENTES");

        menu_IngresarPaciente.setText("PACIENTES");
        menu_IngresarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_IngresarPacienteActionPerformed(evt);
            }
        });
        jMenu2.add(menu_IngresarPaciente);

        menu_ListadoPaciente.setText("LISTADO");
        menu_ListadoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ListadoPacienteActionPerformed(evt);
            }
        });
        jMenu2.add(menu_ListadoPaciente);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("ESPECIALIDAD");

        menuIngresarEspecialidad.setText("INGRESAR");
        menuIngresarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIngresarEspecialidadActionPerformed(evt);
            }
        });
        jMenu5.add(menuIngresarEspecialidad);

        menuListadoEspecialidad.setText("LISTADO");
        menuListadoEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListadoEspecialidadActionPerformed(evt);
            }
        });
        jMenu5.add(menuListadoEspecialidad);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("MEDICOS");

        MenuIngresarMedico.setText("INGRESAR");
        MenuIngresarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngresarMedicoActionPerformed(evt);
            }
        });
        jMenu3.add(MenuIngresarMedico);

        MenuListarMedico.setText("LISTADO");
        MenuListarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarMedicoActionPerformed(evt);
            }
        });
        jMenu3.add(MenuListarMedico);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("CITAS");

        menuIngresarCita.setText("INGRESAR");
        menuIngresarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIngresarCitaActionPerformed(evt);
            }
        });
        jMenu6.add(menuIngresarCita);

        jMenuItem6.setText("LISTADO");
        jMenu6.add(jMenuItem6);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_Principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_Principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void DespejarPantalla(){
        contenedor_Principal.revalidate();
contenedor_Principal.repaint();

}
    private void menu_IngresarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_IngresarPacienteActionPerformed
         contenedor_Principal.removeAll();
        contenedor_Principal.add(new Ingresar()).setVisible(true);
        DespejarPantalla();
    
    }//GEN-LAST:event_menu_IngresarPacienteActionPerformed

    private void menu_ListadoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ListadoPacienteActionPerformed
        contenedor_Principal.removeAll();
        contenedor_Principal.add(new Listado()).setVisible(true);
        DespejarPantalla();

    }//GEN-LAST:event_menu_ListadoPacienteActionPerformed

    private void menuIngresarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIngresarEspecialidadActionPerformed

        
        contenedor_Principal.removeAll();
contenedor_Principal.add(new ingresar2()).setVisible(true);
        DespejarPantalla();

    }//GEN-LAST:event_menuIngresarEspecialidadActionPerformed

    private void menuListadoEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListadoEspecialidadActionPerformed
contenedor_Principal.removeAll();
contenedor_Principal.add(new vista.Especialidades.Listado()).setVisible(true);
        DespejarPantalla();


    }//GEN-LAST:event_menuListadoEspecialidadActionPerformed

    private void MenuIngresarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIngresarMedicoActionPerformed
contenedor_Principal.removeAll();
contenedor_Principal.add(new vista.Medico.Ingresar()).setVisible(true);
        DespejarPantalla();

    }//GEN-LAST:event_MenuIngresarMedicoActionPerformed

    private void MenuListarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarMedicoActionPerformed
contenedor_Principal.removeAll();

contenedor_Principal.add(new vista.Medico.Listado()).setVisible(true);
        DespejarPantalla();

    }//GEN-LAST:event_MenuListarMedicoActionPerformed

    private void menuIngresarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIngresarCitaActionPerformed

contenedor_Principal.removeAll();
contenedor_Principal.add(new vista.Citas.Ingresar()).setVisible(true);
        DespejarPantalla();

    }//GEN-LAST:event_menuIngresarCitaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuIngresarMedico;
    private javax.swing.JMenuItem MenuListarMedico;
    private javax.swing.JDesktopPane contenedor_Principal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem menuIngresarCita;
    private javax.swing.JMenuItem menuIngresarEspecialidad;
    private javax.swing.JMenuItem menuListadoEspecialidad;
    private javax.swing.JMenuItem menu_IngresarPaciente;
    private javax.swing.JMenuItem menu_ListadoPaciente;
    // End of variables declaration//GEN-END:variables
}
