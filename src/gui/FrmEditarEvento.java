package gui;

import dao.Factory;
import dao.IDAOEventos;
import entidades.Eventos;
import javax.swing.JOptionPane;

 // @author David Elier Campa Chaparro 245178 - Maximiliano Reyna Aguilar 244877
public class FrmEditarEvento extends javax.swing.JFrame {
    private IDAOEventos eventos;
    
    public FrmEditarEvento() {
        initComponents();
        eventos = Factory.getEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        eventoLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        lugarLabel = new javax.swing.JLabel();
        horaLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        horasCulturalesLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lugarTextField = new javax.swing.JTextField();
        eventoTextField = new javax.swing.JTextField();
        fechaTextField = new javax.swing.JTextField();
        horaTextField = new javax.swing.JTextField();
        lugarTextField1 = new javax.swing.JTextField();
        horasCulturalesTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionTextArea = new javax.swing.JTextArea();
        cancelarBoton = new javax.swing.JButton();
        crearBoton = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eventoLabel.setBackground(new java.awt.Color(0, 0, 0));
        eventoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eventoLabel.setForeground(new java.awt.Color(0, 0, 0));
        eventoLabel.setText("Evento:");
        jPanel1.add(eventoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        descripcionLabel.setBackground(new java.awt.Color(0, 0, 0));
        descripcionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descripcionLabel.setForeground(new java.awt.Color(0, 0, 0));
        descripcionLabel.setText("Descripción del evento:");
        jPanel1.add(descripcionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        lugarLabel.setBackground(new java.awt.Color(0, 0, 0));
        lugarLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lugarLabel.setForeground(new java.awt.Color(0, 0, 0));
        lugarLabel.setText("Lugar:");
        jPanel1.add(lugarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        horaLabel.setBackground(new java.awt.Color(0, 0, 0));
        horaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        horaLabel.setForeground(new java.awt.Color(0, 0, 0));
        horaLabel.setText("Hora");
        jPanel1.add(horaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        fechaLabel.setBackground(new java.awt.Color(0, 0, 0));
        fechaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(0, 0, 0));
        fechaLabel.setText("Fecha:");
        jPanel1.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        horasCulturalesLabel.setBackground(new java.awt.Color(0, 0, 0));
        horasCulturalesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        horasCulturalesLabel.setForeground(new java.awt.Color(0, 0, 0));
        horasCulturalesLabel.setText("Horas culturales:");
        jPanel1.add(horasCulturalesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel1.setText("(tiene que ser un número fijo)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, -1, -1));

        lugarTextField.setText("Escriba el lugar donde será el evento");
        lugarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugarTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(lugarTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 510, 30));

        eventoTextField.setText("Escriba el nombre del evento");
        eventoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(eventoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 510, 30));

        fechaTextField.setText("Escriba la fecha o fechas del evento");
        fechaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(fechaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 510, 30));

        horaTextField.setText("Escriba la hora o los horarios del evento");
        horaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(horaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 510, 30));

        lugarTextField1.setText("jTextField1");
        lugarTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugarTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(lugarTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 510, 30));
        jPanel1.add(horasCulturalesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 90, -1));

        descripcionTextArea.setColumns(20);
        descripcionTextArea.setRows(5);
        descripcionTextArea.setText("Descripción del evento (opcional)");
        jScrollPane1.setViewportView(descripcionTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 510, 340));

        cancelarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarBoton.setText("Cancelar");
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 190, 80));

        crearBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crearBoton.setText("Crear");
        crearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBotonActionPerformed(evt);
            }
        });
        jPanel1.add(crearBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 190, 80));

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

    private void lugarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugarTextFieldActionPerformed

    private void eventoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventoTextFieldActionPerformed

    private void fechaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTextFieldActionPerformed

    private void horaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaTextFieldActionPerformed

    private void lugarTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugarTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugarTextField1ActionPerformed

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelarBotonActionPerformed

    private void crearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBotonActionPerformed
        if(horasCulturalesTextField.getText() == null || "".equals(horasCulturalesTextField.getText())){
            JOptionPane.showMessageDialog(null, "Inserte todos los campos incluyendo horas culturales");
        }
        Eventos evento = new Eventos(eventoTextField.getText(), fechaTextField.getText(), horaTextField.getText(), lugarTextField.getText(), descripcionTextArea.getText(), horasCulturalesTextField.getText());
        eventos.insertarEvento(evento);
        this.dispose();
    }//GEN-LAST:event_crearBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JButton crearBoton;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JTextArea descripcionTextArea;
    private javax.swing.JLabel eventoLabel;
    private javax.swing.JTextField eventoTextField;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JTextField fechaTextField;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JTextField horaTextField;
    private javax.swing.JLabel horasCulturalesLabel;
    private javax.swing.JTextField horasCulturalesTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lugarLabel;
    private javax.swing.JTextField lugarTextField;
    private javax.swing.JTextField lugarTextField1;
    // End of variables declaration//GEN-END:variables
}