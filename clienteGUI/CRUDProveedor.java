package clienteGUI;

import application.proveedorUsecase;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableRowSorter;
import model.proveedor;
import recurso.util.renderButton;

public class CRUDProveedor extends javax.swing.JInternalFrame {

    DefaultTableModel dtmproveedor;
    TableRowSorter trs;

    public CRUDProveedor() throws Exception {
        initComponents();
        listarproveedors();
        this.getContentPane().setBackground(new Color(72, 70, 92));
    }

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

        editarProveedor = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        txtEditarCodigo = new javax.swing.JTextField();
        txtEditarNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelarEditar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarProveedor = new javax.swing.JButton();
        btnCancelarProveedor = new javax.swing.JButton();
        txtBuscarProveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRUTProveedor = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        editarProveedor.setLocation(new java.awt.Point(540, 360));
        editarProveedor.setMinimumSize(new java.awt.Dimension(325, 200));

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

        javax.swing.GroupLayout editarProveedorLayout = new javax.swing.GroupLayout(editarProveedor.getContentPane());
        editarProveedor.getContentPane().setLayout(editarProveedorLayout);
        editarProveedorLayout.setHorizontalGroup(
            editarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editarProveedorLayout.setVerticalGroup(
            editarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proveedor", "Estado"
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
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, 590, 257));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/cheque.png"))); // NOI18N
        btnGuardarProveedor.setText("Agregar");
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        btnCancelarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/cancelar.png"))); // NOI18N
        btnCancelarProveedor.setText("Cancelar");
        btnCancelarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        txtBuscarProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarProveedorKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 270, 41));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion de proveedores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/buscar.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 99, 44, 41));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtRUTProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRUTProveedorFocusLost(evt);
            }
        });
        txtRUTProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUTProveedorActionPerformed(evt);
            }
        });
        txtRUTProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRUTProveedorKeyTyped(evt);
            }
        });
        getContentPane().add(txtRUTProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 250, -1));

        txtRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonSocialActionPerformed(evt);
            }
        });
        getContentPane().add(txtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 250, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 250, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 250, -1));
        txtTelefono.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 250, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 250, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rut Proveedor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre Contacto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dirección");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Razón Social");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Teléfono (+56)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("E-mail");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("(formato: xxxxxxxx-x)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRUTProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUTProveedorActionPerformed

    }//GEN-LAST:event_txtRUTProveedorActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed

        proveedorUsecase proveedor = new proveedorUsecase();
        proveedor proveedorRequest = new proveedor();
        boolean valido = true, errorrut = false, errorrs = false, errorpn = false, errortlf = false, errorm = false, errordir = false;
        //--------------------------
        //VALIDACIÓN RUT START
        if (!txtRUTProveedor.getText().equals("") && validacionRUT(txtRUTProveedor.getText()) == true) {//Si el rut está vacio o no es valido
            proveedorRequest.setprovrut(txtRUTProveedor.getText());
        } else {
            valido = false;
            errorrut = true;
        }
        //VALIDACIÓN RUT END
        //--------------------------
        //VALIDACIÓN RAZÓN SOCIAL START
        if (!txtRazonSocial.getText().equals("")) {
            proveedorRequest.setproveedor(txtRazonSocial.getText());
        } else {
            valido = false;
            errorrs = true;
        }
        //VALIDACIÓN RAZÓN SOCIAL END
        //--------------------------
        //VALIDACIÓN PROVNOMBRE START
        if (!txtNombre.getText().equals("")) {
            proveedorRequest.setprovnombre(txtNombre.getText());
        } else {
            valido = false;
            errorpn = true;
        }
        //VALIDACIÓN PROVNOMBRE END
        //--------------------------
        //VALIDACIÓN NUMERO START
        if (txtTelefono.getText().length() == 9) {

            proveedorRequest.setprovfono(txtTelefono.getText());
        } else {
            valido = false;
            errortlf = true;
        }
        //VALIDACIÓN NUMERO END
        //--------------------------
        //VALIDACIÓN MAIL START
        if (!txtEmail.getText().equals("")) {
            Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher mat = patron.matcher(txtEmail.getText());
            if (mat.find()) {
                proveedorRequest.setprovmail(txtEmail.getText());
            } else {
                valido = false;
                errorm = true;
            }
        } else {
            valido = false;
            errorm = true;
        }
        //VALIDACIÓN MAIL END
        //--------------------------
        //VALIDACIÓN DIRECCIÓN START
        if (!txtDireccion.getText().equals("")) {
            proveedorRequest.setprovdireccion(txtDireccion.getText());
        } else {
            valido = false;
            errordir = true;
            //VALIDACIÓN DIRECCIÓN END
            //--------------------------

            if (valido) {
                try {
                    boolean respuesta = proveedor.registrarproveedor(proveedorRequest);
                    if (respuesta) {
                        listarproveedors();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CRUDProveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                String ERROR = "";
                //errorrut = 0, errorrs = 0, errorpn = 0, errortlf = 0, errorm = 0, errordir = 0;
                if (errorrut) {
                    ERROR += "\n|**CAMPO RUT NO VALIDO**|";
                }
                if (errorrs) {
                    ERROR += "\n|**CAMPO RAZÓN SOCIAL NO VALIDO**|";
                }
                if (errorpn) {
                    ERROR += "\n|**CAMPO NOMBRE PROVEEDOR NO VALIDO**|";
                }
                if (errortlf) {
                    ERROR += "\n|**CAMPO TELÉFONO NO VALIDO**|";
                }
                if (errorm) {
                    ERROR += "\n|**CAMPO MAIL NO VALIDO**|";
                }
                if (errordir) {
                    ERROR += "\n|**CAMPO DIRECCIÓN NO VALIDO**|";
                }
                JOptionPane.showMessageDialog(null, ERROR);
            }
        }

    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnCancelarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProveedorActionPerformed
        clear();
    }//GEN-LAST:event_btnCancelarProveedorActionPerformed

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        proveedorUsecase updateproveedor = new proveedorUsecase();
        int fila = tblProveedor.rowAtPoint(evt.getPoint());
        int columna = tblProveedor.columnAtPoint(evt.getPoint());
        JTable r = (JTable) evt.getSource();
        if (columna == 6) {
            int op = JOptionPane.showConfirmDialog(null, "Desea cambiar el estado", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
            if (op == 0) {

                String codigo = r.getModel().getValueAt(r.getSelectedRow(), 1).toString();
                String estado = r.getModel().getValueAt(r.getSelectedRow(), 2).toString();

                try {
                    updateproveedor.updateEstadoproveedor(codigo, estado);
                    listarproveedors();
                } catch (Exception ex) {
                    Logger.getLogger(CRUDProveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (columna == 7) {
            System.out.println("Click en el boton editar");
            editarProveedor.setVisible(true);

            txtEditarNombre.setText(r.getModel().getValueAt(r.getSelectedRow(), 0).toString());
        }
        txtEditarCodigo.setText(r.getModel().getValueAt(r.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tblProveedorMouseClicked

    private void txtBuscarProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProveedorKeyTyped
        txtBuscarProveedor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtBuscarProveedor.getText(), 1));
            }

        });
        trs = new TableRowSorter(dtmproveedor);
        tblProveedor.setRowSorter(trs);
        if (txtBuscarProveedor.getText().equals("")) {
            try {
                listarproveedors();
            } catch (Exception ex) {
                Logger.getLogger(CRUDProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtBuscarProveedorKeyTyped

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        editarProveedor.setVisible(false);
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String nombre = txtEditarNombre.getText();
        String codigo = txtEditarCodigo.getText();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazonSocialActionPerformed

    private void txtRUTProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUTProveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRUTProveedorKeyTyped

    private void txtRUTProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRUTProveedorFocusLost

    }//GEN-LAST:event_txtRUTProveedorFocusLost

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtTelefono.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    public void listarproveedors() throws Exception {

        proveedorUsecase listproveedor = new proveedorUsecase();
        dtmproveedor = listproveedor.listarproveedors();
        tblProveedor.setDefaultRenderer(Object.class, new renderButton());
        tblProveedor.setModel(dtmproveedor);

    }

    public void clear() {
        txtRUTProveedor.setText("");
        txtBuscarProveedor.setText("");
    }

    public boolean validacionRUT(String RUT) {

        Boolean lDevuelve = false;
        int Ult = RUT.length(); // |1 |8 |2 |1 |6 |5 |7 |1 |- |9 | = 10? = 9
        int Largo = RUT.length() - 3;
        int Constante = 2;
        int Suma = 0;
        int Digito = 0;
        for (int i = Largo; i >= 0; i--) {

            Suma = Suma + Integer.parseInt(RUT.substring(i, i + 1)) * Constante;
            Constante = Constante + 1;
            if (Constante == 8) {
                Constante = 2;
            }
        }
        String Ultimo = RUT.substring(Ult - 1).toUpperCase();
        Digito = 11 - (Suma % 11);
        if (Digito == 10 && Ultimo.equals("K")) {
            lDevuelve = true;
        } else {
            if (Digito == 11 && Ultimo.equals("0")) {
                lDevuelve = true;
            } else {
                if (Digito == Integer.parseInt(Ultimo)) {
                    lDevuelve = true;
                }
            }
        }
        return lDevuelve;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnCancelarProveedor;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JDialog editarProveedor;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtBuscarProveedor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEditarCodigo;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUTProveedor;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
