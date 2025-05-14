/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_01;

public class Ejercicio_01 extends javax.swing.JFrame {

    public Ejercicio_01() {
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
        jLabel6 = new javax.swing.JLabel();
        TXT_cl = new javax.swing.JTextField();
        TXT_impt = new javax.swing.JTextField();
        TXT_desc = new javax.swing.JTextField();
        TXT_md = new javax.swing.JTextField();
        TXT_IGV = new javax.swing.JTextField();
        TXT_tp = new javax.swing.JTextField();
        BTN_calcular = new javax.swing.JButton();
        BTN_nuevo = new javax.swing.JButton();
        BTN_salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TXT_p = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CANTIDAD:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 28, -1, -1));

        jLabel2.setText("IMPORTE TOTAL:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 218, -1, -1));

        jLabel3.setText("DESCUENTO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 285, -1, -1));

        jLabel4.setText("MONTO A PAGAR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 351, -1, -1));

        jLabel5.setText("IGV:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 415, -1, -1));

        jLabel6.setText("TOTAL A PAGAR:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 490, -1, -1));

        TXT_cl.setText("200");
        getContentPane().add(TXT_cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 28, 80, -1));
        getContentPane().add(TXT_impt, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 216, 80, -1));
        getContentPane().add(TXT_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 283, 80, -1));
        getContentPane().add(TXT_md, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 349, 80, -1));
        getContentPane().add(TXT_IGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 413, 80, -1));
        getContentPane().add(TXT_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 488, 80, -1));

        BTN_calcular.setText("CALCULAR");
        BTN_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 148, -1, -1));

        BTN_nuevo.setText("NUEVO");
        BTN_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 148, -1, -1));

        BTN_salir.setText("SALIR");
        BTN_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_salirActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 148, -1, -1));

        jLabel7.setText("PRECIO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, -1, -1));
        getContentPane().add(TXT_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 82, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_calcularActionPerformed
        
        final int cl = 200;
        double p = 0, impt = 0, desc = 0, md = 0, IGV = 0, tp = 0;
        
        p = Double.parseDouble(TXT_p.getText());
        
        impt = cl * p;
        
        if (impt > 500)
        {
            desc = impt * 0.10;
        }
        
        else
        {
            desc = 0;
        }
        
        md = impt - desc;
        
        IGV = md * 0.18;
        
        tp = md + IGV;
        
        TXT_impt.setText(String.valueOf(impt));
        TXT_desc.setText(String.valueOf(desc));
        TXT_md.setText(String.valueOf(md));
        TXT_IGV.setText(String.valueOf(IGV));
        TXT_tp.setText(String.valueOf(tp));
    }//GEN-LAST:event_BTN_calcularActionPerformed

    private void BTN_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_nuevoActionPerformed
        TXT_p.setText("");
        TXT_impt.setText("");
        TXT_desc.setText("");
        TXT_md.setText("");
        TXT_IGV.setText("");
        TXT_tp.setText("");
        TXT_p.requestFocus();
    }//GEN-LAST:event_BTN_nuevoActionPerformed

    private void BTN_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_salirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TXT_cl.setText("200");
        TXT_cl.setEditable(false);
        TXT_impt.setEditable(false);
        TXT_desc.setEditable(false);
        TXT_md.setEditable(false);
        TXT_IGV.setEditable(false);
        TXT_tp.setEditable(false);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Ejercicio_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_calcular;
    private javax.swing.JButton BTN_nuevo;
    private javax.swing.JButton BTN_salir;
    private javax.swing.JTextField TXT_IGV;
    private javax.swing.JTextField TXT_cl;
    private javax.swing.JTextField TXT_desc;
    private javax.swing.JTextField TXT_impt;
    private javax.swing.JTextField TXT_md;
    private javax.swing.JTextField TXT_p;
    private javax.swing.JTextField TXT_tp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
