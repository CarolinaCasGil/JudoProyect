/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.judo;

import static com.mycompany.judo.Judo.*;

/**
 *
 * @author Alumno Mañana
 */
public class Competir extends javax.swing.JFrame {

    
    /**
     * Creates new form Competir
     */
    public Competir() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        copas = new javax.swing.JComboBox<>();
        atras = new javax.swing.JButton();
        competir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana Pro Cond Black", 3, 36)); // NOI18N
        jLabel1.setText("COMPETIR");

        copas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Copa Alicante", "Copa Galicia", "Copa Asturias", "Copa Castilla y Leon", "Copa Cataluña", "Copa Navarra" }));
        copas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copasActionPerformed(evt);
            }
        });

        atras.setText("<");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        competir.setText("COMPETIR");
        competir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                competirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(copas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(competir)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atras)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(copas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(competir)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copasActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        Menu ventana = new Menu();
        ventana.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void competirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_competirActionPerformed
        // TODO add your handling code here:

        switch (copas.getSelectedIndex()) {

            case 0:
                copa = "Copa Alicante";
                break;

            case 1:
                copa = "Copa Galicia";
                break;

            case 2:
                copa = "Copa Asturias";
                break;

            case 3:
                copa = "Copa Castilla y Leon";
                break;

            case 4:
                copa = "Copa Cataluña";
                break;

            case 5:
                copa = "Copa Navarra";
                break;
        }

        
        
        
        
        this.setVisible(false);
        CompetirLucha1 ventana = new CompetirLucha1();
        ventana.setVisible(true);


    }//GEN-LAST:event_competirActionPerformed

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
            java.util.logging.Logger.getLogger(Competir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Competir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Competir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Competir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Competir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton competir;
    private javax.swing.JComboBox<String> copas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
