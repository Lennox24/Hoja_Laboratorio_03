/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_02;

public class Ejercicio_02 extends javax.swing.JFrame {

    public Ejercicio_02() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXT_cc = new javax.swing.JTextField();
        TXT_p = new javax.swing.JTextField();
        TXT_imp = new javax.swing.JTextField();
        TXT_desc = new javax.swing.JTextField();
        TXT_tp = new javax.swing.JTextField();
        BTN_calcular = new javax.swing.JButton();
        BTN_nuevo = new javax.swing.JButton();
        BTN_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CANTIDAD DE CALZONCILLOS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 27, -1, -1));

        jLabel2.setText("PRECIO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, -1, -1));

        jLabel3.setText("IMPORTE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 215, -1, -1));

        jLabel4.setText("DESCUENTO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, -1, -1));

        jLabel5.setText("TOTAL A PAGAR:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 360, -1, -1));
        getContentPane().add(TXT_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 27, 90, -1));
        getContentPane().add(TXT_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 90, 90, -1));
        getContentPane().add(TXT_imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 213, 90, -1));
        getContentPane().add(TXT_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 288, 90, -1));
        getContentPane().add(TXT_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 358, 90, -1));

        BTN_calcular.setText("CALCULAR");
        BTN_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, -1, -1));

        BTN_nuevo.setText("NUEVO");
        BTN_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 146, -1, -1));

        BTN_salir.setText("SALIR");
        BTN_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_salirActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 146, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TXT_imp.setEditable(false);
        TXT_desc.setEditable(false);
        TXT_tp.setEditable(false);
    }//GEN-LAST:event_formWindowActivated

    private void BTN_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_calcularActionPerformed
        
        int cc = 0;
        double p = 0, imp = 0, desc = 0, tp = 0;
        
        cc = Integer.parseInt(TXT_cc.getText());
        p = Double.parseDouble(TXT_p.getText());
        
        imp = cc * p;
        
        if (cc >= 6) 
        {
          desc = imp * 0.1;  
        }
        
        else
        {
            desc = 0;
        }
        
        tp = imp - desc;
        
        TXT_imp.setText(String.valueOf(imp));
        TXT_desc.setText(String.valueOf(desc));
        TXT_tp.setText(String.valueOf(tp));
        
    }//GEN-LAST:event_BTN_calcularActionPerformed

    private void BTN_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_nuevoActionPerformed
        TXT_cc.setText("");
        TXT_p.setText("");
        TXT_imp.setText("");
        TXT_desc.setText("");
        TXT_tp.setText("");
        TXT_cc.requestFocus();
    }//GEN-LAST:event_BTN_nuevoActionPerformed

    private void BTN_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_calcular;
    private javax.swing.JButton BTN_nuevo;
    private javax.swing.JButton BTN_salir;
    private javax.swing.JTextField TXT_cc;
    private javax.swing.JTextField TXT_desc;
    private javax.swing.JTextField TXT_imp;
    private javax.swing.JTextField TXT_p;
    private javax.swing.JTextField TXT_tp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
