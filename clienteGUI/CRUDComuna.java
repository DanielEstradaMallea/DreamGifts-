/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteGUI;

import application.comunaUsecase;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableRowSorter;
import model.comuna;
import recurso.util.renderButton;

/**
 *
 * @author danie
 */
public class CRUDComuna extends javax.swing.JInternalFrame {

    DefaultTableModel dtmComuna;
    TableRowSorter trs;

    public CRUDComuna() throws Exception {
        initComponents();
        listarComunas();
        this.getContentPane().setBackground(new Color (72,70,92));
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
               if (frameUI != null) frameUI.setNorthPane(null); 
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
        tblComunas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtComuna = new javax.swing.JTextField();
        btnGuardarComuna = new javax.swing.JButton();
        btnCancelarComuna = new javax.swing.JButton();
        txtBuscarComuna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblComunas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblComunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComunasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblComunas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, 590, 257));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Comuna");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        txtComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComunaActionPerformed(evt);
            }
        });
        getContentPane().add(txtComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 252, -1));

        btnGuardarComuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/cheque.png"))); // NOI18N
        btnGuardarComuna.setText("Agregar");
        btnGuardarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComunaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        btnCancelarComuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/cancelar.png"))); // NOI18N
        btnCancelarComuna.setText("Cancelar");
        btnCancelarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarComunaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        txtBuscarComuna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarComunaKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 99, 270, 41));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion de comunas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/buscar.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 99, 44, 41));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComunaActionPerformed

    private void btnGuardarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComunaActionPerformed
        comunaUsecase comuna = new comunaUsecase();
        comuna comunaRequest = new comuna();
        comunaRequest.setComuna(txtComuna.getText());

        try {
            boolean respuesta = comuna.registrarComuna(comunaRequest);
            if (respuesta) {

                listarComunas();
            }
        } catch (Exception ex) {
            System.out.println("boton agregar comunas con problemas");
            Logger.getLogger(CRUDComuna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarComunaActionPerformed

    private void btnCancelarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarComunaActionPerformed
        clear();
    }//GEN-LAST:event_btnCancelarComunaActionPerformed

    private void tblComunasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComunasMouseClicked
        comunaUsecase updateComuna = new comunaUsecase();
        int fila = tblComunas.rowAtPoint(evt.getPoint());
        int columna = tblComunas.columnAtPoint(evt.getPoint());
        JTable r = (JTable) evt.getSource();
        if (columna == 3) {
            int op = JOptionPane.showConfirmDialog(null, "Desea cambiar el estado", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
            if (op == 0) {

                String codigo = r.getModel().getValueAt(r.getSelectedRow(), 1).toString();
                String estado = r.getModel().getValueAt(r.getSelectedRow(), 2).toString();

                try {
                    updateComuna.updateEstadoComuna(codigo, estado);
                    listarComunas();
                } catch (Exception ex) {
                    Logger.getLogger(CRUDComuna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (columna == 4) {
            System.out.println("Click en el boton editar");
            editarBanco.setVisible(true);

            txtEditarNombre.setText(r.getModel().getValueAt(r.getSelectedRow(), 0).toString());
        }
        txtEditarCodigo.setText(r.getModel().getValueAt(r.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tblComunasMouseClicked

    private void txtBuscarComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarComunaKeyTyped
        txtBuscarComuna.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtBuscarComuna.getText(), 0));
            }

        });
        trs = new TableRowSorter(dtmComuna);
        tblComunas.setRowSorter(trs);
        if (txtBuscarComuna.getText().equals("")) {
            try {
                listarComunas();
            } catch (Exception ex) {
                Logger.getLogger(CRUDComuna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtBuscarComunaKeyTyped

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        editarBanco.setVisible(false);
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String nombre = txtEditarNombre.getText();
        String codigo = txtEditarCodigo.getText();
    }//GEN-LAST:event_btnAceptarActionPerformed

    public void listarComunas() throws Exception {

        comunaUsecase listComuna = new comunaUsecase();
        dtmComuna = listComuna.listarComunas();
        tblComunas.setDefaultRenderer(Object.class, new renderButton());
        tblComunas.setModel(dtmComuna);

    }

    public void clear() {
        txtComuna.setText("");
        txtBuscarComuna.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelarComuna;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnGuardarComuna;
    private javax.swing.JDialog editarBanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblComunas;
    private javax.swing.JTextField txtBuscarComuna;
    private javax.swing.JTextField txtComuna;
    private javax.swing.JTextField txtEditarCodigo;
    private javax.swing.JTextField txtEditarNombre;
    // End of variables declaration//GEN-END:variables
}
