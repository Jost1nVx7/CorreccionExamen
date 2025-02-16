
package pampara.jostinexamen.vista;

import pampara.jostinexamen.controlador.Controlador;

public class VistaSistema extends javax.swing.JFrame {
    
    private Controlador controlador;
    private Listar listar;
    
    public VistaSistema() {
        initComponents();
        this.listar= new Listar();
        this.controlador = new Controlador(this, listar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBoolean = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblRellenoDisponible = new javax.swing.JLabel();
        rbtDisponible = new javax.swing.JRadioButton();
        rbtAgotado = new javax.swing.JRadioButton();
        rbtGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPrecio = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuListar = new javax.swing.JMenu();
        jMenuItemListar = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Sistema de Gestion de Productos");

        lblNombre.setText("Nombre del producto: ");

        lblPrecio.setText("Precio del producto: ");

        lblRellenoDisponible.setText("Disponibilidad");

        btgBoolean.add(rbtDisponible);
        rbtDisponible.setText("Disponible");

        btgBoolean.add(rbtAgotado);
        rbtAgotado.setText("Agotado");

        rbtGuardar.setText("Guardar");
        rbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblError.setText("__________________");

        jScrollPane1.setViewportView(txtPrecio);

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jMenuListar.setText("Listar");

        jMenuItemListar.setText("Listar Producto");
        jMenuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarActionPerformed(evt);
            }
        });
        jMenuListar.add(jMenuItemListar);

        jMenuBar2.add(jMenuListar);

        jMenuSalir.setText("Salir");
        jMenuBar2.add(jMenuSalir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblError)
                .addGap(195, 195, 195))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(rbtGuardar)
                        .addGap(103, 103, 103)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(lblRellenoDisponible))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbtDisponible)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrecio)
                                .addComponent(lblNombre)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(rbtAgotado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtProducto))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(lblRellenoDisponible)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtDisponible)
                    .addComponent(rbtAgotado))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtGuardar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtGuardarActionPerformed
        // TODO add your handling code here:
        this.controlador.agregarTarea();
    }//GEN-LAST:event_rbtGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jMenuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarActionPerformed
        // TODO add your handling code here:
        listar.setVisible(true);
        controlador.listarProductos(); 
    }//GEN-LAST:event_jMenuItemListarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    public String getProducto(){
        return txtProducto.getText();
    }
    
    public String getPrecio(){
        return txtPrecio.getText();
    }
    
    public boolean getDisponible(){
        return rbtDisponible.isSelected();        
    }
    
    public void error(String text){
        lblError.setText(text);
    }
    
    public void limpiar(){
    
    txtProducto.setText("");
    txtPrecio.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBoolean;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemListar;
    private javax.swing.JMenu jMenuListar;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRellenoDisponible;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtAgotado;
    private javax.swing.JRadioButton rbtDisponible;
    private javax.swing.JButton rbtGuardar;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
