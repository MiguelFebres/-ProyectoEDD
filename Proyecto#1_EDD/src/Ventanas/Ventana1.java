/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import main.Auxiliares;
import main.Grafo;

public class Ventana1 extends javax.swing.JFrame {
    public static Grafo grafito;
    Auxiliares func_txt;
    public static String dir_txt;
    /**
     * Creates new form Ventana1
     */
    public Ventana1(Grafo grafo, String direccion_archivo) {
        initComponents();
        this.setVisible(true);
        this.grafito = grafo;
        func_txt = new Auxiliares();
        dir_txt = direccion_archivo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        seguidor = new javax.swing.JButton();
        a_user = new javax.swing.JTextField();
        a_seg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        el_us = new javax.swing.JTextField();
        ver_us = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        añadir = new javax.swing.JButton();
        a_us = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gen_g = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(40, 115, 145));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("sigue a");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, 30));

        seguidor.setText("Añadir Seguidor");
        seguidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguidorActionPerformed(evt);
            }
        });
        jPanel3.add(seguidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        a_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_userActionPerformed(evt);
            }
        });
        jPanel3.add(a_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 110, -1));

        a_seg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_segActionPerformed(evt);
            }
        });
        jPanel3.add(a_seg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, -1));

        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Añadir relacion Seguidor - Usuario");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 200, 30));

        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Seguidor");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 30));

        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("Usuario");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 70, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 330, 240));

        jPanel2.setBackground(new java.awt.Color(40, 115, 145));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Eliminar Usuario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, 30));

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        el_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                el_usActionPerformed(evt);
            }
        });
        jPanel2.add(el_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 320, 240));

        ver_us.setText("Ver Usuarios");
        ver_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_usActionPerformed(evt);
            }
        });
        getContentPane().add(ver_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Añadir Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        jPanel1.add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        a_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_usActionPerformed(evt);
            }
        });
        jPanel1.add(a_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 240));

        jLabel2.setText("Ver Usuarios Registrados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        jLabel5.setText("Mostrar Grafo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        gen_g.setText("Generar Grafo");
        gen_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_gActionPerformed(evt);
            }
        });
        getContentPane().add(gen_g, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        // TODO add your handling code here:
        String user = func_txt.validacion_nombre(a_us.getText());
        grafito.ampliar_list(user);
        func_txt.modificarArchivo(grafito, dir_txt);
        
    }//GEN-LAST:event_añadirActionPerformed

    private void a_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_usActionPerformed

    private void el_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_el_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_el_usActionPerformed

    private void a_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_userActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        String user = func_txt.validacion_nombre(el_us.getText());
        grafito.eliminar_vertice(user);
        func_txt.modificarArchivo(grafito, dir_txt);
    }//GEN-LAST:event_eliminarActionPerformed

    private void seguidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguidorActionPerformed
        // TODO add your handling code here:
        String user = func_txt.validacion_nombre(a_user.getText());
        String seguidor = func_txt.validacion_nombre(a_seg.getText());
        
        grafito.nueva_arista(seguidor, user);
        func_txt.modificarArchivo(grafito, dir_txt);
    }//GEN-LAST:event_seguidorActionPerformed

    private void a_segActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_segActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_segActionPerformed

    private void ver_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_usActionPerformed
        // TODO add your handling code here:
        Ventana2 v2 = new Ventana2(grafito);
    }//GEN-LAST:event_ver_usActionPerformed

    private void gen_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_gActionPerformed
        // TODO add your handling code here:
//        grafito.generarGrafo();
grafito.dibujar();
    }//GEN-LAST:event_gen_gActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1(grafito, dir_txt).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_seg;
    private javax.swing.JTextField a_us;
    private javax.swing.JTextField a_user;
    private javax.swing.JButton añadir;
    private javax.swing.JTextField el_us;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton gen_g;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton seguidor;
    private javax.swing.JButton ver_us;
    // End of variables declaration//GEN-END:variables
}
