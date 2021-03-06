/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteGUI;
import application.clienteUsercase;
import conexion.conexion;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
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
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableRowSorter;
import model.cliente;
import recurso.util.comboBoxes;
import recurso.util.renderButton;

/**
 *
 * @author danie
 */
public class CRUDCliente extends javax.swing.JInternalFrame {

    conexion con = new conexion();
    

    DefaultTableModel dtmCliente;
    TableRowSorter trs;

    public CRUDCliente() throws Exception {
        initComponents();
        listarClientes();
        this.getContentPane().setBackground(new Color(72, 70, 92));
        canal();
        comuna();
//        cmb1.boxCategoria(cmbCategoria);
//        cmb1.boxProveedores(cmbProveedor);

    }

    void canal () {
        
     
        
        try {
            con.connections();
            PreparedStatement pstm = con.conexion.prepareStatement("select * from canal");
            ResultSet respuesta = pstm.executeQuery();
            
            while (respuesta.next()) {
                
               cmbCanal.addItem(respuesta.getString("can_nombre")) ;
            }
            
            
            
            
        } catch (SQLException e) {
        }
        
    }
    
    void comuna () {
        
     
        
        try {
            con.connections();
            PreparedStatement pstm = con.conexion.prepareStatement("select * from comuna");
            ResultSet respuesta = pstm.executeQuery();
            
            while (respuesta.next()) {
                
               cmbComuna.addItem(respuesta.getString("com_nombre")) ;
            }
            
            
            
            
        } catch (SQLException e) {
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtBuscarCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbComuna = new javax.swing.JComboBox<>();
        cmbCanal = new javax.swing.JComboBox<>();
        btnGuardarArticulo = new javax.swing.JButton();
        btnCancelarArticulo = new javax.swing.JButton();
        txtRutCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        IntTelefonoCliente = new javax.swing.JTextField();

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

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Banco", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        txtBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyTyped(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/buscar.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");

        jPanel2.setBackground(new java.awt.Color(72, 70, 92));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion de Clientes");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Cliente");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RUT");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Direccion");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("E-mail");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Apellido");

        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una comuna" }));
        cmbComuna.setToolTipText("");

        cmbCanal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un canal" }));
        cmbCanal.setToolTipText("Seleccione Proveedor");
        cmbCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCanalActionPerformed(evt);
            }
        });

        btnGuardarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/cheque.png"))); // NOI18N
        btnGuardarArticulo.setText("Agregar");
        btnGuardarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArticuloActionPerformed(evt);
            }
        });

        btnCancelarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/cancelar.png"))); // NOI18N
        btnCancelarArticulo.setText("Cancelar");
        btnCancelarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarArticuloActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Telefono");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Comuna");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Canal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelarArticulo)
                                .addGap(98, 98, 98)
                                .addComponent(btnGuardarArticulo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRutCliente)
                                    .addComponent(txtNombreCliente)
                                    .addComponent(cmbCanal, 0, 223, Short.MAX_VALUE)
                                    .addComponent(IntTelefonoCliente))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmailCliente)
                                    .addComponent(txtApellidoCliente)
                                    .addComponent(txtDireccionCliente)
                                    .addComponent(cmbComuna, 0, 223, Short.MAX_VALUE))))
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarArticulo)
                            .addComponent(btnGuardarArticulo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(IntTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(cmbCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnGuardarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArticuloActionPerformed
        clienteUsercase clienteObject = new clienteUsercase();
        cliente clienteRequest = new cliente();

        System.out.println(cmbComuna.getSelectedIndex());
        System.out.println(cmbCanal.getSelectedIndex());
        System.out.println(txtNombreCliente.getText());
        
        System.out.println((IntTelefonoCliente.getText()));
//
        clienteRequest.setNombreCliente(txtNombreCliente.getText());
        clienteRequest.setApellidoCliente(txtApellidoCliente.getText());
        clienteRequest.setRutCliente(txtRutCliente.getText());
        clienteRequest.setDireccionCliente(txtDireccionCliente.getText());
        clienteRequest.setTelefonoCliente(Integer.parseInt(IntTelefonoCliente.getText()));
        clienteRequest.setEmailCliente(txtEmailCliente.getText());
        clienteRequest.setIdComunaCliente(cmbComuna.getSelectedIndex());
        clienteRequest.setIdCanalCliente(cmbCanal.getSelectedIndex());       
       
                                                  
        try {
            boolean respuesta = clienteObject.registrarCliente(clienteRequest);
            if (respuesta) {

                listarClientes();
                clear();
                 
            }
        } catch (Exception ex) {

            System.out.println("boton guardar con problemas");
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarArticuloActionPerformed

    private void btnCancelarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarArticuloActionPerformed
        clear();
    }//GEN-LAST:event_btnCancelarArticuloActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        clienteUsercase updateArticulo = new clienteUsercase();
        int fila = tblClientes.rowAtPoint(evt.getPoint());
        int columna = tblClientes.columnAtPoint(evt.getPoint());
        JTable r = (JTable) evt.getSource();
        if (columna == 7) {
            int op = JOptionPane.showConfirmDialog(null, "Desea cambiar el estado", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
            if (op == 0) {

                String codigo = r.getModel().getValueAt(r.getSelectedRow(), 1).toString();
                String estado = r.getModel().getValueAt(r.getSelectedRow(), 6).toString();

                try {
                    updateArticulo.updateEstadoCliente(codigo, estado);
                    listarClientes();
                } catch (Exception ex) {
                    Logger.getLogger(CRUDBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (columna == 8) {

        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void txtBuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyTyped
        txtBuscarCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtBuscarCliente.getText(), 0));
            }

        });
        trs = new TableRowSorter(dtmCliente);
        tblClientes.setRowSorter(trs);
        if (txtBuscarCliente.getText().equals("")) {
            try {
                listarClientes();
            } catch (Exception ex) {
                Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtBuscarClienteKeyTyped

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        editarBanco.setVisible(false);
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String nombre = txtEditarNombre.getText();
        String codigo = txtEditarCodigo.getText();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cmbCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCanalActionPerformed

   

    public void listarClientes() throws Exception {

        clienteUsercase listCliente = new clienteUsercase();
        dtmCliente = listCliente.ListarCliente();
        tblClientes.setDefaultRenderer(Object.class, new renderButton());
        tblClientes.setModel(dtmCliente);

    }

    public void clear() {
        txtNombreCliente.setText("");
        txtBuscarCliente.setText("");
        txtRutCliente.setText("");
        IntTelefonoCliente.setText("");
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IntTelefonoCliente;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelarArticulo;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnGuardarArticulo;
    private javax.swing.JComboBox<String> cmbCanal;
    private javax.swing.JComboBox<String> cmbComuna;
    private javax.swing.JDialog editarBanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEditarCodigo;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtRutCliente;
    // End of variables declaration//GEN-END:variables
}
