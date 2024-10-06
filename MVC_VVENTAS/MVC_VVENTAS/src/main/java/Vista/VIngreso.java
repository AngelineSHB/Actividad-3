package Vista;

import javax.swing.JButton;

/**
 *
 * @author USER 17
 */
public class VIngreso extends javax.swing.JFrame {
    // Variable para contar cuántas veces se ha abierto VCredito
    private int creditoCounter = 0;
    
    // Variable para controlar si ya se ha abierto alguna ventana
    private boolean ventanaAbierta = false;
    /**
     * Creates new form VIngreso
     */
    public VIngreso() {
        initComponents();
    }
    
    // Métodos para exponer los botones
    public JButton getBtnCredito() {
        return btnCredito;
    }

    public JButton getBtnContado() {
        return btnContado;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCredito = new javax.swing.JButton();
        btnContado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("VENTA DE PRODUCTOS");

        btnCredito.setBackground(new java.awt.Color(51, 102, 255));
        btnCredito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnCredito.setText("VENTA AL CREDITO");
        btnCredito.setActionCommand("btnCredito");
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });

        btnContado.setBackground(new java.awt.Color(51, 102, 255));
        btnContado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnContado.setForeground(new java.awt.Color(255, 255, 255));
        btnContado.setText("VENTA AL CONTADO");
        btnContado.setActionCommand("btnContado");
        btnContado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(btnContado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed
        // Limitar el número de veces que se puede abrir VCredito
        if (creditoCounter < 2 && !ventanaAbierta) {
            VCredito credito = new VCredito();
            credito.setVisible(true);
            
            // Aumentar el contador de VCredito
            creditoCounter++;

            // Marcar que una ventana ya está abierta
            ventanaAbierta = true;

            // Deshabilitar ambos botones
            btnCredito.setEnabled(false);
            btnContado.setEnabled(false);
            
            // Agregar un listener para reactivar los botones cuando se cierre la ventana
            credito.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    ventanaAbierta = false;
                    btnCredito.setEnabled(true);
                    btnContado.setEnabled(true);
                }
            });
        } else {
            System.out.println("No se puede abrir VCredito más de dos veces.");
        }
    }//GEN-LAST:event_btnCreditoActionPerformed

    private void btnContadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContadoActionPerformed
       // Solo abrir VContado si no hay ninguna ventana abierta
        if (!ventanaAbierta) {
            VContado contado = new VContado();
            contado.setVisible(true);

            // Marcar que una ventana ya está abierta
            ventanaAbierta = true;

            // Deshabilitar ambos botones
            btnCredito.setEnabled(false);
            btnContado.setEnabled(false);
            
            // Agregar un listener para reactivar los botones cuando se cierre la ventana
            contado.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    ventanaAbierta = false;
                    btnCredito.setEnabled(true);
                    btnContado.setEnabled(true);
                }
            });
        } else {
            System.out.println("No se puede abrir VContado hasta que la otra ventana se cierre.");
        }
    }//GEN-LAST:event_btnContadoActionPerformed

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
            java.util.logging.Logger.getLogger(VIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContado;
    private javax.swing.JButton btnCredito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
