/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteGUI;

import application.articuloUsecase;
import application.packUsecase;
import conexion.conexion;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableRowSorter;
import recurso.util.renderButton;

/**
 *
 * @author danie
 */
public class CRUDpack extends javax.swing.JInternalFrame {

    int primerIngreso = 0;
    int sumaprecio=0;

    conexion con = new conexion();

    DefaultTableModel dtmArticulo;
    DefaultTableModel modeloCarrito;
    TableRowSorter trs;

    public CRUDpack() throws Exception {
        initComponents();
        listarArticulos();
        listarPacks();
        txtPrecioPack.setEnabled(false);
        txtPrecioSugerido.setEnabled(false);
        modeloCarrito = new DefaultTableModel();
        modeloCarrito.addColumn("ID");
        modeloCarrito.addColumn("Articulo");
        modeloCarrito.addColumn("Cantidad");
        modeloCarrito.addColumn("Precio");
        this.tblCarritoPack.setModel(modeloCarrito);
//        tblCarritoPack.getColumnModel().getColumn(0).setPreferredWidth(17);
//        tblCarritoPack.getColumnModel().getColumn(1).setPreferredWidth(107);
//        tblCarritoPack.getColumnModel().getColumn(1).setPreferredWidth(17);
//        tblCarritoPack.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        btnAgregarCarrito.setEnabled(false);
        btnQuitarCarrito.setEnabled(false);

        this.getContentPane().setBackground(new Color(72, 70, 92));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    @Override
    public void setUI(InternalFrameUI ui) {
        super.setUI(ui);

        BasicInternalFrameUI frameUI = (BasicInternalFrameUI) getUI();
        if (frameUI != null) {
            frameUI.setNorthPane(null);
        }
    }

    public int encontrarID(String nombre) {

        try {
            con.connections();;
            int idPack = 0;

            PreparedStatement pstm = con.conexion.prepareStatement("select (id_pack) from pack where pack_nombre='" + nombre + "'");
            ResultSet respuesta1 = pstm.executeQuery();

            while (respuesta1.next()) {

                idPack = respuesta1.getInt("id_pack");
                System.out.println(idPack);
            }

            System.out.println(idPack);
            return idPack;

        } catch (Exception e) {
            return 8888;

        }

    }

//    public void listarArticulos() {
//
//        try {
//
//            con.connections();
//            PreparedStatement pstm = con.conexion.prepareStatement("select * from articulo");
//            ResultSet respuesta = pstm.executeQuery();
//
//            DefaultTableModel modelo = new DefaultTableModel();
//
//            modelo.addColumn("Id");
//            modelo.addColumn("Articulo");
//            modelo.addColumn("Stock");
//
//            tblCarritoArticulos.setModel(modelo);
//
//            String[] dato = new String[2];
//
//            while (respuesta.next()) {
//                           
//                 System.out.println(respuesta.getString(1));
//                 System.out.println(respuesta.getString(2));
//                 System.out.println(respuesta.getString(3));
//
//                dato[0]=respuesta.getString(1);
//                dato[1]=respuesta.getString(2);
//                dato[2]=respuesta.getString(3);
//                
//                modelo.addRow(dato);
//            }
//
//        } catch (Exception e) {
//            System.out.println("no carga carrito de articulos");
//        }
//
//    }
    public void listarArticulos() throws Exception {

        articuloUsecase listArticulo = new articuloUsecase();
        dtmArticulo = listArticulo.carritoArticulos();
        tblCarritoArticulos.setModel(dtmArticulo);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarBanco = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        txtEditarCodigo = new javax.swing.JTextField();
        txtEditarNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelarEditar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPacks = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarPack = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarritoArticulos = new javax.swing.JTable();
        btnAgregarCarrito = new javax.swing.JButton();
        btnQuitarCarrito = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCarritoPack = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombrePack = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioPack = new javax.swing.JTextField();
        spinerCarritos = new javax.swing.JSpinner();
        btnGuardarPack = new javax.swing.JButton();
        btnCancelarComuna = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioSugerido = new javax.swing.JTextField();

        editarBanco.setLocation(new java.awt.Point(540, 360));
        editarBanco.setMinimumSize(new java.awt.Dimension(325, 200));

        jPanel1.setMinimumSize(new java.awt.Dimension(193, 193));

        jLabel3.setText("Nombre :");

        jLabel4.setText("Codigo :");

        jLabel5.setText("Editar Banco");

        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEditarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarEditar)
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtEditarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEditar)
                    .addComponent(btnAceptar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editarBancoLayout = new javax.swing.GroupLayout(editarBanco.getContentPane());
        editarBanco.getContentPane().setLayout(editarBancoLayout);
        editarBancoLayout.setHorizontalGroup(
            editarBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editarBancoLayout.setVerticalGroup(
            editarBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(102, 102, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(1006, 611));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        jPanel3.setBackground(new java.awt.Color(72, 70, 94));
        jPanel3.setPreferredSize(new java.awt.Dimension(1006, 611));

        tblPacks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacksMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPacks);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");

        txtBuscarPack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarPack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarPackKeyTyped(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addComponent(txtBuscarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtBuscarPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestion Packs", jPanel3);

        jPanel2.setBackground(new java.awt.Color(72, 70, 94));
        jPanel2.setPreferredSize(new java.awt.Dimension(1006, 611));

        tblCarritoArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Articulo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarritoArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarritoArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarritoArticulos);

        btnAgregarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/sign-add-icon.png"))); // NOI18N
        btnAgregarCarrito.setText("Agregar");
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });

        btnQuitarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/sign-delete-icon.png"))); // NOI18N
        btnQuitarCarrito.setText("Quitar");
        btnQuitarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCarritoActionPerformed(evt);
            }
        });

        tblCarritoPack.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Articulo", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarritoPack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarritoPackMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCarritoPack);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre pack");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Costo Pack");

        spinerCarritos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        btnGuardarPack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/cheque.png"))); // NOI18N
        btnGuardarPack.setText("Crear Pack");
        btnGuardarPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPackActionPerformed(evt);
            }
        });

        btnCancelarComuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/cancelar.png"))); // NOI18N
        btnCancelarComuna.setText("Cancelar");
        btnCancelarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarComunaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio Sugerido(+30%)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinerCarritos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarCarrito, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQuitarCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardarPack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarComuna))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombrePack, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(txtPrecioPack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioSugerido, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtNombrePack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPrecioPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioSugerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnAgregarCarrito)
                            .addGap(39, 39, 39)
                            .addComponent(spinerCarritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuitarCarrito)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPack)
                    .addComponent(btnCancelarComuna))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Crear Pack", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        editarBanco.setVisible(false);
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String nombre = txtEditarNombre.getText();
        String codigo = txtEditarCodigo.getText();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tblCarritoArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarritoArticulosMouseClicked

        btnAgregarCarrito.setEnabled(true);
        btnQuitarCarrito.setEnabled(false);
//        int fila = tblCarritoArticulos.getSelectedRow();
//        int stock = Integer.parseInt((String) tblCarritoArticulos.getValueAt(fila, 2).toString());
//        spinerCarritos.setValue(stock);


    }//GEN-LAST:event_tblCarritoArticulosMouseClicked

    @SuppressWarnings("empty-statement")
    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed

        
        
        int buscador = 0;
        int fila = tblCarritoArticulos.getSelectedRow();
        Object[] dato = {(tblCarritoArticulos.getValueAt(fila, 0)), (tblCarritoArticulos.getValueAt(fila, 1)), (spinerCarritos.getValue()),(tblCarritoArticulos.getValueAt(fila, 2))};
        int precio = (int)tblCarritoArticulos.getValueAt(fila,2);
         precio=((int)spinerCarritos.getValue())*precio;
         sumaprecio=precio+sumaprecio;

//        int stockArt = (int) (tblCarritoArticulos.getValueAt(fila, 2));
//        int StockIngresar = (int) spinerCarritos.getValue();
        

        if (primerIngreso < 1) {

            modeloCarrito.addRow(dato);            
           
            primerIngreso++;
            System.out.println("agrego primer item");
            txtPrecioPack.setText(String.valueOf("$"+sumaprecio));
            txtPrecioSugerido.setText(String.valueOf("$"+sumaprecio*1.3));
            spinerCarritos.setValue(1);

        } else {

            for (int i = 0; i < tblCarritoPack.getRowCount(); i++) {
                

                if ((tblCarritoArticulos.getValueAt(fila, 0)).equals(tblCarritoPack.getValueAt(i, 0))) {

                    int a = (int) ((spinerCarritos.getValue()));
                    int b = (int) (tblCarritoPack.getValueAt(i, 2));

                    Object sumaStock = (Object) (a + b);

                    tblCarritoPack.setValueAt(sumaStock, i, 2);
                    spinerCarritos.setValue(1);
                    buscador++;
                    
                    
                   

                }
                txtPrecioPack.setText(String.valueOf("$"+sumaprecio));
                txtPrecioSugerido.setText(String.valueOf("$"+sumaprecio*1.3));
                
            }

            if (buscador < 1) {

                modeloCarrito.addRow(dato);
                spinerCarritos.setValue(1);
                

            }
        }


    }//GEN-LAST:event_btnAgregarCarritoActionPerformed

    private void tblCarritoPackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarritoPackMouseClicked
        btnAgregarCarrito.setEnabled(false);
        btnQuitarCarrito.setEnabled(true);
    }//GEN-LAST:event_tblCarritoPackMouseClicked

    private void btnQuitarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCarritoActionPerformed

        int fila = tblCarritoPack.getSelectedRow();

        
        System.out.println(tblCarritoPack.getValueAt(fila, 2));
        System.out.println(tblCarritoPack.getValueAt(fila,3));
        int restarPrecio = ((int)tblCarritoPack.getValueAt(fila, 2))*((int)tblCarritoPack.getValueAt(fila,3));
        System.out.println(restarPrecio);
        sumaprecio=sumaprecio-restarPrecio;
        txtPrecioPack.setText(String.valueOf(sumaprecio));
        txtPrecioSugerido.setText(String.valueOf(sumaprecio*1.3));
        modeloCarrito.removeRow(fila);
        

    }//GEN-LAST:event_btnQuitarCarritoActionPerformed

    private void btnGuardarPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPackActionPerformed

        try {

            con.connections();
            String query = String.format("insert into pack (pack_nombre,pack_costo,pack_stock,pack_estado) values"
                    + " ('%s', '%s', '%s', %s)", txtNombrePack.getText(), txtPrecioSugerido.getText(), 0, true);

            PreparedStatement respuesta = con.conexion.prepareStatement(query);
            respuesta.execute();
            con.cerrar();

            int idPack = encontrarID(txtNombrePack.getText());
            con.connections();

            for (int i = 0; i < tblCarritoPack.getRowCount(); i++) {

                String query11 = String.format("insert into pack_has_articulo (pck_id_pack,art_id_articulo,cantidad) values"
                        + " ('%s', '%s', '%s')", idPack, tblCarritoPack.getValueAt(i, 0), tblCarritoPack.getValueAt(i, 2));

                PreparedStatement respuesta2 = con.conexion.prepareStatement(query11);
                respuesta2.execute();

            }

            System.out.println("btnpack sucessfull");
            con.cerrar();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Pack ya existente");
        }


    }//GEN-LAST:event_btnGuardarPackActionPerformed

    private void btnCancelarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarComunaActionPerformed
//        clear();
    }//GEN-LAST:event_btnCancelarComunaActionPerformed

    private void tblPacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacksMouseClicked

        packUsecase updatePack = new packUsecase();
        int fila = tblPacks.rowAtPoint(evt.getPoint());
        int columna = tblPacks.columnAtPoint(evt.getPoint());
        JTable r = (JTable) evt.getSource();
        if (columna == 5) {
            int op = JOptionPane.showConfirmDialog(null, "Desea cambiar el estado", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
            if (op == 0) {

                String codigo = r.getModel().getValueAt(r.getSelectedRow(), 1).toString();
                String estado = r.getModel().getValueAt(r.getSelectedRow(), 4).toString();

                try {
                    updatePack.updateEstadoPack(codigo, estado);
                    listarPacks();
                } catch (Exception ex) {
//                    Logger.getLogger(CRUDBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (columna == 4) {
//            System.out.println("Click en el boton editar");
//            editarBanco.setVisible(true);
//
//            txtEditarNombre.setText(r.getModel().getValueAt(r.getSelectedRow(), 0).toString());
        }
        txtEditarCodigo.setText(r.getModel().getValueAt(r.getSelectedRow(), 1).toString());


    }//GEN-LAST:event_tblPacksMouseClicked

    private void txtBuscarPackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPackKeyTyped
        txtBuscarPack.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtBuscarPack.getText(), 0));
            }

        });
        trs = new TableRowSorter(dtmArticulo);
        tblPacks.setRowSorter(trs);
        if (txtBuscarPack.getText().equals("")) {
            try {
                listarPacks();
            } catch (Exception ex) {
                Logger.getLogger(CRUDComuna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtBuscarPackKeyTyped

    public void listarPacks() throws Exception {

        packUsecase listPacks = new packUsecase();
        dtmArticulo = listPacks.listarPacks();
        tblPacks.setDefaultRenderer(Object.class, new renderButton());
        tblPacks.setModel(dtmArticulo);

    }
//    public void clear() {
//        txtNombreArticulo.setText("");
//        txtBuscarArticulo.setText("");
//        txtStock.setText("");
//        JFechaVencimiento.setText("");
//       
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnCancelarComuna;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnGuardarPack;
    private javax.swing.JButton btnQuitarCarrito;
    private javax.swing.JDialog editarBanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spinerCarritos;
    private javax.swing.JTable tblCarritoArticulos;
    private javax.swing.JTable tblCarritoPack;
    private javax.swing.JTable tblPacks;
    private javax.swing.JTextField txtBuscarPack;
    private javax.swing.JTextField txtEditarCodigo;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtNombrePack;
    private javax.swing.JTextField txtPrecioPack;
    private javax.swing.JTextField txtPrecioSugerido;
    // End of variables declaration//GEN-END:variables
}
