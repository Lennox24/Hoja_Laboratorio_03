/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_03;

public class Ejercicio_03 extends javax.swing.JFrame {

    public Ejercicio_03() {
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
        TXT_pk = new javax.swing.JTextField();
        TXT_ck = new javax.swing.JTextField();
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

        jLabel1.setText("PRECIO POR KILOGRAMO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 27, -1, -1));

        jLabel2.setText("CANTIDAD DE KILOS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, -1, -1));

        jLabel3.setText("IMPORTE TOTAL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 195, -1, -1));

        jLabel4.setText("DESCUENTO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 272, -1, -1));

        jLabel5.setText("TOTAL A PAGAR:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 346, -1, -1));
        getContentPane().add(TXT_pk, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 25, 90, -1));
        getContentPane().add(TXT_ck, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 78, 90, -1));
        getContentPane().add(TXT_imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 193, 90, -1));
        getContentPane().add(TXT_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 270, 90, -1));
        getContentPane().add(TXT_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 344, 90, -1));

        BTN_calcular.setText("CALCULAR");
        BTN_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 138, -1, -1));

        BTN_nuevo.setText("NUEVO");
        BTN_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 138, -1, -1));

        BTN_salir.setText("SALIR");
        BTN_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_salirActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 138, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


     /*

  █████╗ ██╗   ██╗ ██████╗ ██╗██╗     ███████╗███╗   ███╗██████╗ ██╗███████╗███████╗
 ██╔══██╗██║   ██║██╔═══██╗██║██║     ██╔════╝████╗ ████║██╔══██╗██║██╔════╝██╔════╝
 ███████║██║   ██║██║   ██║██║██║     █████╗  ██╔████╔██║██████╔╝██║█████╗  ███████╗
 ██╔══██║██║   ██║██║   ██║██║██║     ██╔══╝  ██║╚██╔╝██║██╔═══╝ ██║██╔══╝  ╚════██║
 ██║  ██║╚██████╔╝╚██████╔╝██║███████╗███████╗██║ ╚═╝ ██║██║     ██║███████╗███████║
 ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝╚══════╝╚══════╝╚═╝     ╚═╝╚═╝     ╚═╝╚══════╝╚══════╝

                                >> AQUI EMPIEZA <<

    
    */

    private void BTN_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_calcularActionPerformed
        
        int ck = 0;
        double pk = 0, imp = 0, desc = 0, tp = 0;
        
        ck = Integer.parseInt(TXT_ck.getText());
        pk = Double.parseDouble(TXT_pk.getText());
        
        imp = ck * pk;
        
        if (pk > 10) 
        {
            desc = 0.15;
        } 
        
        else if (pk >= 5 && pk <= 10)
        {
            desc = 0.10;
        }
        
        else if (pk < 5)
        {
            desc = 0;
        }
        
        tp = imp - desc;
        
        TXT_imp.setText(String.valueOf(imp));
        TXT_desc.setText(String.valueOf(desc));
        TXT_tp.setText(String.valueOf(tp));
        
    }//GEN-LAST:event_BTN_calcularActionPerformed

    private void BTN_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_nuevoActionPerformed
        TXT_ck.setText("");
        TXT_pk.setText("");
        TXT_imp.setText("");
        TXT_desc.setText("");
        TXT_tp.setText("");
        TXT_pk.requestFocus();
    }//GEN-LAST:event_BTN_nuevoActionPerformed

    private void BTN_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_salirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TXT_imp.setEditable(false);
        TXT_desc.setEditable(false);
        TXT_tp.setEditable(false);
    }//GEN-LAST:event_formWindowActivated


    /*

  █████╗  ██████╗ ██╗   ██╗██╗████████╗███████╗██████╗ ███╗   ███╗██╗███╗   ██╗ █████╗ 
 ██╔══██╗██╔═══██╗██║   ██║██║╚══██╔══╝██╔════╝██╔══██╗████╗ ████║██║████╗  ██║██╔══██╗
 ███████║██║   ██║██║   ██║██║   ██║   █████╗  ██████╔╝██╔████╔██║██║██╔██╗ ██║███████║
 ██╔══██║██║   ██║██║   ██║██║   ██║   ██╔══╝  ██╔══██╗██║╚██╔╝██║██║██║╚██╗██║██╔══██║
 ██║  ██║╚██████╔╝╚██████╔╝██║   ██║   ███████╗██║  ██║██║ ╚═╝ ██║██║██║ ╚████║██║  ██║
 ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝

                                << AQUI TERMINA >>

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
            java.util.logging.Logger.getLogger(Ejercicio_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_calcular;
    private javax.swing.JButton BTN_nuevo;
    private javax.swing.JButton BTN_salir;
    private javax.swing.JTextField TXT_ck;
    private javax.swing.JTextField TXT_desc;
    private javax.swing.JTextField TXT_imp;
    private javax.swing.JTextField TXT_pk;
    private javax.swing.JTextField TXT_tp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
