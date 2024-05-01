/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author crazy
 */
public class FrmPerfil extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    public FrmPerfil() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idLabel1 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        horasCulturalesLabel = new javax.swing.JLabel();
        horasCulturaTextField = new javax.swing.JTextField();
        idTextField1 = new javax.swing.JTextField();
        nombreTextField1 = new javax.swing.JTextField();
        okBoton = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel1.setBackground(new java.awt.Color(255, 255, 255));
        idLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idLabel1.setText("Horas cultura:");
        jPanel1.add(idLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        nombreLabel.setBackground(new java.awt.Color(255, 255, 255));
        nombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreLabel.setText("Nombre");
        jPanel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        horasCulturalesLabel.setBackground(new java.awt.Color(255, 255, 255));
        horasCulturalesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        horasCulturalesLabel.setText("ID");
        jPanel1.add(horasCulturalesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        horasCulturaTextField.setEditable(false);
        horasCulturaTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        horasCulturaTextField.setText("jTextField1");
        horasCulturaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasCulturaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(horasCulturaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 440, -1));

        idTextField1.setEditable(false);
        idTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idTextField1.setText("jTextField1");
        jPanel1.add(idTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 440, -1));

        nombreTextField1.setEditable(false);
        nombreTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreTextField1.setText("jTextField1");
        nombreTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(nombreTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 440, -1));

        okBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        okBoton.setText("OK!");
        okBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBotonActionPerformed(evt);
            }
        });
        jPanel1.add(okBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 220, 90));

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        jPanel1.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void horasCulturaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasCulturaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasCulturaTextFieldActionPerformed

    private void nombreTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextField1ActionPerformed

    private void okBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBotonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_okBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JTextField horasCulturaTextField;
    private javax.swing.JLabel horasCulturalesLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JTextField idTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField1;
    private javax.swing.JButton okBoton;
    // End of variables declaration//GEN-END:variables
}
