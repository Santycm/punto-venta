package interfaz;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class JInventario extends javax.swing.JFrame {

    static String user;
    static String pass;
    public DefaultTableModel datos = new DefaultTableModel();
    
    
    int IDProduct;
    
    public JInventario(String User, String Pass) {
        this.user = User;
        this.pass = Pass;
        Conexion con = new Conexion(user, pass, "FerreteriaDB");
        initComponents();
        con.establecerConexion();
        TablaInventario.setModel(datos);
        
        try {
            Statement st = con.conectar.createStatement();
            String query = "SELECT * FROM tblInventario";

            PreparedStatement ps = con.conectar.prepareStatement(query);
            ResultSetMetaData meta = ps.getMetaData();

            int nColumnas = meta.getColumnCount();

            Vector<String> ids = new Vector<>();

            for (int i = 1; i <= nColumnas; i++) {
                ids.add(meta.getColumnName(i));
            }
            datos.setColumnIdentifiers(ids);

            ResultSet res = st.executeQuery(query);

            while (res.next()) {
                Vector<String> Fila = new Vector<>();
                for (int i = 1; i <= nColumnas; i++) {
                    Fila.add(res.getString(i));
                }
                datos.addRow(Fila);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FModificar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DescripcionJ1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ValorJ1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CantidadJ1 = new javax.swing.JTextField();
        btnModificarC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnInsertarCat = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnPuntoVenta = new javax.swing.JButton();

        FModificar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        FModificar.setMinimumSize(new java.awt.Dimension(294, 494));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(294, 494));
        jPanel2.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inventario");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setText("Descripción");

        DescripcionJ1.setBackground(new java.awt.Color(255, 255, 255));
        DescripcionJ1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionJ1.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("Valor Unitario");

        ValorJ1.setBackground(new java.awt.Color(255, 255, 255));
        ValorJ1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ValorJ1.setForeground(new java.awt.Color(0, 0, 0));
        ValorJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Cantidad Stock");

        CantidadJ1.setBackground(new java.awt.Color(255, 255, 255));
        CantidadJ1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CantidadJ1.setForeground(new java.awt.Color(0, 0, 0));
        CantidadJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        btnModificarC.setBackground(new java.awt.Color(51, 51, 255));
        btnModificarC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarC.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarC.setText("MODIFICAR");
        btnModificarC.setBorder(null);
        btnModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CantidadJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(DescripcionJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(ValorJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarC, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescripcionJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValorJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantidadJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnModificarC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FModificarLayout = new javax.swing.GroupLayout(FModificar.getContentPane());
        FModificar.getContentPane().setLayout(FModificarLayout);
        FModificarLayout.setHorizontalGroup(
            FModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FModificarLayout.setVerticalGroup(
            FModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaInventario);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inventario");

        btnInsertar.setBackground(new java.awt.Color(0, 153, 0));
        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("Ingresar Producto");
        btnInsertar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnInsertarCat.setBackground(new java.awt.Color(0, 153, 0));
        btnInsertarCat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertarCat.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarCat.setText("Registrar Categoría");
        btnInsertarCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        btnInsertarCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarCatActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 153, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 153, 0));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar Producto");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnPuntoVenta.setBackground(new java.awt.Color(204, 0, 0));
        btnPuntoVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPuntoVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnPuntoVenta.setText("Volver a punto de venta");
        btnPuntoVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        btnPuntoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPuntoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(btnInsertarCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(btnPuntoVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPuntoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCActionPerformed
        Conexion con = new Conexion(user, pass, "FerreteriaDB");
        con.establecerConexion();
        try {
            String query = "EXEC sp_ModificarProducto " + IDProduct + ", '" + DescripcionJ1.getText() + "', " + ValorJ1.getText() + ", " + CantidadJ1.getText() ;
            Statement st = con.conectar.createStatement();
            st.execute(query);
            
            try{
                int t = datos.getRowCount();
                int in = 0;
                while (in < t) {
                    datos.removeRow(in);
                    t--;
                }

                String refresh = "SELECT * FROM tblInventario";
                PreparedStatement ps = con.conectar.prepareStatement(refresh);
                ResultSetMetaData meta = ps.getMetaData();

                int nColumnas = meta.getColumnCount();

                Vector<String> ids = new Vector<>();

                for (int i = 1; i <= nColumnas; i++) {
                    ids.add(meta.getColumnName(i));
                }
                datos.setColumnIdentifiers(ids);

                ResultSet res = st.executeQuery(refresh);

                while (res.next()) {
                    Vector<String> Fila = new Vector<>();
                    for (int i = 1; i <= nColumnas; i++){
                        Fila.add(res.getString(i));
                    }
                    datos.addRow(Fila);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModificarCActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        FModificar.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion con = new Conexion(user, pass, "FerreteriaDB");
        con.establecerConexion();
        try {
            String query = "EXEC sp_EliminarProducto " + IDProduct;
            Statement st = con.conectar.createStatement();
            st.execute(query);
            try{
                int t = datos.getRowCount();
                int in = 0;
                while (in < t) {
                    datos.removeRow(in);
                    t--;
                }

                String refresh = "SELECT * FROM tblInventario";
                PreparedStatement ps = con.conectar.prepareStatement(refresh);
                ResultSetMetaData meta = ps.getMetaData();

                int nColumnas = meta.getColumnCount();

                Vector<String> ids = new Vector<>();

                for (int i = 1; i <= nColumnas; i++) {
                    ids.add(meta.getColumnName(i));
                }
                datos.setColumnIdentifiers(ids);

                ResultSet res = st.executeQuery(refresh);

                while (res.next()) {
                    Vector<String> Fila = new Vector<>();
                    for (int i = 1; i <= nColumnas; i++){
                        Fila.add(res.getString(i));
                    }
                    datos.addRow(Fila);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInsertarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarCatActionPerformed
        FInsertarCategoria ventana = new FInsertarCategoria(user, pass);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnInsertarCatActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        FInsertarProducto ventana = new FInsertarProducto(user, pass);
        ventana.setVisible(true);

    }//GEN-LAST:event_btnInsertarActionPerformed

    private void TablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInventarioMouseClicked
        IDProduct = Integer.parseInt(String.valueOf(datos.getValueAt(TablaInventario.getSelectedRow(), 0)));
    }//GEN-LAST:event_TablaInventarioMouseClicked

    private void btnPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoVentaActionPerformed
        PuntoDeVenta ventana = new PuntoDeVenta(user,pass);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPuntoVentaActionPerformed

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
            java.util.logging.Logger.getLogger(JInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JInventario(user, pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CantidadJ1;
    public javax.swing.JTextField DescripcionJ1;
    private javax.swing.JFrame FModificar;
    private javax.swing.JTable TablaInventario;
    public javax.swing.JTextField ValorJ1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnInsertarCat;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarC;
    private javax.swing.JButton btnPuntoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
