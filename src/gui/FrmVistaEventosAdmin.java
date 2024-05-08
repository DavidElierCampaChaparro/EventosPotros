package gui;

import crud.IDAOEventos;
import crud.Factory;
import objetosNegocio.Evento;
import javax.swing.table.DefaultTableModel;


/**
* @author David Elier Campa Chaparro 245178
* @author Maximiliano Reyna Aquilar 244877
*/ 
public class FrmVistaEventosAdmin extends javax.swing.JFrame {
    private int personaID;
    private IDAOEventos eventos;
    
    // recibe el id de la persona con la que se inició sesión 
    // para poder consultarla en el FrmPerfil
    public FrmVistaEventosAdmin(int personaID) {
        initComponents();
        this.personaID = personaID;
        eventos = Factory.getEventos();
        inicializarTabla();
    }

    /**
    * Método para meter los datos de los eventos a la tabla
    */
    public void inicializarTabla(){
        DefaultTableModel modelo = eventos.mostrarEventos();
        eventosTable.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventosTable = new javax.swing.JTable();
        fondoLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuPerfil = new javax.swing.JMenu();
        menuItemVerPerfil = new javax.swing.JMenuItem();
        menuCerrarSesion = new javax.swing.JMenu();
        menuItemCerrarSesión = new javax.swing.JMenuItem();
        menuCrearEvento = new javax.swing.JMenu();
        menuItemCrearEvento = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eventosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha", "Hora", "Lugar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventosTable.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        eventosTable.setFocusable(false);
        eventosTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        eventosTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        eventosTable.getTableHeader().setReorderingAllowed(false);
        eventosTable.setUpdateSelectionOnSort(false);
        eventosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventosTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(eventosTable);
        if (eventosTable.getColumnModel().getColumnCount() > 0) {
            eventosTable.getColumnModel().getColumn(0).setResizable(false);
            eventosTable.getColumnModel().getColumn(1).setResizable(false);
            eventosTable.getColumnModel().getColumn(2).setResizable(false);
            eventosTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 990, 580));

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        jPanel1.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        menuPerfil.setText("Perfil");

        menuItemVerPerfil.setText("Ver mi perfil");
        menuItemVerPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerPerfilActionPerformed(evt);
            }
        });
        menuPerfil.add(menuItemVerPerfil);

        menuBar.add(menuPerfil);

        menuCerrarSesion.setText("Cerrar Sesión");
        menuCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        menuItemCerrarSesión.setText("Cerrar tu sesión actual");
        menuItemCerrarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesiónActionPerformed(evt);
            }
        });
        menuCerrarSesion.add(menuItemCerrarSesión);

        menuBar.add(menuCerrarSesion);

        menuCrearEvento.setText("Crear Evento");

        menuItemCrearEvento.setText("Crear un nuevo evento");
        menuItemCrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearEventoActionPerformed(evt);
            }
        });
        menuCrearEvento.add(menuItemCrearEvento);

        menuBar.add(menuCrearEvento);

        menuAcercaDe.setText("Acerca de");

        menuItemAcercaDe.setText("Ver más información acerca del software");
        menuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercaDeActionPerformed(evt);
            }
        });
        menuAcercaDe.add(menuItemAcercaDe);

        menuBar.add(menuAcercaDe);

        setJMenuBar(menuBar);

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

    private void menuItemCrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearEventoActionPerformed
        FrmCrearEvento fce = new FrmCrearEvento();
        fce.setVisible(true);
    }//GEN-LAST:event_menuItemCrearEventoActionPerformed

    private void menuItemVerPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerPerfilActionPerformed
        FrmPerfil fp = new FrmPerfil(personaID);
        fp.setVisible(true);
    }//GEN-LAST:event_menuItemVerPerfilActionPerformed

    private void menuItemCerrarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesiónActionPerformed
        FrmInicio fi = new FrmInicio();
        fi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemCerrarSesiónActionPerformed

    private void menuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercaDeActionPerformed
        FrmAcercaDe fad = new FrmAcercaDe();
        fad.setVisible(true);
    }//GEN-LAST:event_menuItemAcercaDeActionPerformed

   /**
    * Extrae los datos de la fila en la que se clickeó el evento para después
    * crear un frame que lo muestre
    */
    private void eventosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventosTableMouseClicked
        int fila = eventosTable.getSelectedRow();
        Evento evento;
        String nombreEvento;
        String fechaEvento;
        String horaEvento;
        String lugarEvento;
        
        // el metodo getSelectedRow regresa -1 si no se clickeó en ninguna fila,
        // por ende si no es -1, procederemos a extraer los datos de las celdas para
        // crear un frame para vizualizar una consulta de ese evento
        if (fila != -1){
            nombreEvento = (String) eventosTable.getValueAt(fila, 0);
            fechaEvento = (String) eventosTable.getValueAt(fila, 1);
            horaEvento = (String) eventosTable.getValueAt(fila, 2);
            lugarEvento = (String) eventosTable.getValueAt(fila, 3);
            evento = new Evento(nombreEvento, fechaEvento, horaEvento, lugarEvento);
            
            FrmEditarEvento fee = new FrmEditarEvento(evento);
            fee.setModal(true);// para que se actualize la lista de eventos automaticamente al momento de realizar la accion
            fee.setVisible(true);
        
            
        }
    }//GEN-LAST:event_eventosTableMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable eventosTable;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuAcercaDe;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCerrarSesion;
    private javax.swing.JMenu menuCrearEvento;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemCerrarSesión;
    private javax.swing.JMenuItem menuItemCrearEvento;
    private javax.swing.JMenuItem menuItemVerPerfil;
    private javax.swing.JMenu menuPerfil;
    // End of variables declaration//GEN-END:variables
}
