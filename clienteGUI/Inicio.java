/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteGUI;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        cerrar();
       
        

    }

    /* metodo para confirmar el cierre de ventanas¨*/
    public void cerrar() {

        try {

            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* metodo para confirmar la salida*/
    public void confirmarSalida() {

        int valor = JOptionPane.showConfirmDialog(this, "¿Desea salir de DreamGifts ERP?", "Adventencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (valor == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por usar DreamGifts ERP", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/recurso/icons/fondo-2.png"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public  void  paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);

            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MenuBarra = new javax.swing.JMenuBar();
        optionEstadoDespachos = new javax.swing.JMenu();
        optionModuloVentas = new javax.swing.JMenuItem();
        optionConfirmacionVentas = new javax.swing.JMenuItem();
        optionDespachos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        optionVentasTotal = new javax.swing.JMenuItem();
        optionVentasXcomuna = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        optionClientes = new javax.swing.JMenuItem();
        optionProveedor = new javax.swing.JMenuItem();
        optionArticulos = new javax.swing.JMenuItem();
        optionPack = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        optionCategorias = new javax.swing.JMenuItem();
        optionComunas = new javax.swing.JMenuItem();
        optionBancos = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DreamGifts");
        setLocationByPlatform(true);
        setResizable(false);

        jToggleButton1.setBackground(new java.awt.Color(0, 102, 102));
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(72, 70, 92));

        escritorio.setOpaque(false);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE GESTION DREAMGIFTS");

        jLabel5.setText("Dev Top Code 2021");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/Dream-gifts-logo-g1.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/Dream-gifts-logo-g1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(216, 216, 216))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(376, 376, 376))
        );

        MenuBarra.setBackground(new java.awt.Color(204, 204, 255));
        MenuBarra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        optionEstadoDespachos.setBackground(new java.awt.Color(255, 255, 255));
        optionEstadoDespachos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/Ventas-Icon.png"))); // NOI18N
        optionEstadoDespachos.setText("Ventas");

        optionModuloVentas.setText("Modulo Ventas");
        optionModuloVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionModuloVentasActionPerformed(evt);
            }
        });
        optionEstadoDespachos.add(optionModuloVentas);

        optionConfirmacionVentas.setText("Confirmacion Ventas");
        optionConfirmacionVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionConfirmacionVentasActionPerformed(evt);
            }
        });
        optionEstadoDespachos.add(optionConfirmacionVentas);

        optionDespachos.setText("Despachos");
        optionDespachos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDespachosActionPerformed(evt);
            }
        });
        optionEstadoDespachos.add(optionDespachos);

        jMenuItem1.setText("Estado Despachos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        optionEstadoDespachos.add(jMenuItem1);

        MenuBarra.add(optionEstadoDespachos);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/Compras-icon.png"))); // NOI18N
        jMenu2.setText("Compras");
        MenuBarra.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/Informes-icon.png"))); // NOI18N
        jMenu3.setText("Informes");

        jMenuItem2.setText("Informe de Ventas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Informe de Vencimiento");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Informe de Inventario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        optionVentasTotal.setText("Informe de Packs");
        optionVentasTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionVentasTotalActionPerformed(evt);
            }
        });
        jMenu3.add(optionVentasTotal);

        optionVentasXcomuna.setText("Informe por Comunas");
        optionVentasXcomuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionVentasXcomunaActionPerformed(evt);
            }
        });
        jMenu3.add(optionVentasXcomuna);

        MenuBarra.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/Master-Icon.png"))); // NOI18N
        jMenu4.setText("Maestro");

        optionClientes.setText("Clientes");
        optionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionClientesActionPerformed(evt);
            }
        });
        jMenu4.add(optionClientes);

        optionProveedor.setText("Proveedores");
        optionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionProveedorActionPerformed(evt);
            }
        });
        jMenu4.add(optionProveedor);

        optionArticulos.setText("Articulos");
        optionArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionArticulosActionPerformed(evt);
            }
        });
        jMenu4.add(optionArticulos);

        optionPack.setText("Pack");
        optionPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionPackActionPerformed(evt);
            }
        });
        jMenu4.add(optionPack);

        jMenuItem5.setText("Canal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        optionCategorias.setText("Categoria Art.");
        optionCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCategoriasActionPerformed(evt);
            }
        });
        jMenu4.add(optionCategorias);

        optionComunas.setText("Comunas");
        optionComunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionComunasActionPerformed(evt);
            }
        });
        jMenu4.add(optionComunas);

        optionBancos.setText("Bancos");
        optionBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBancosActionPerformed(evt);
            }
        });
        jMenu4.add(optionBancos);

        jMenuItem9.setText("Estado Ventas");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Usuarios");
        jMenu4.add(jMenuItem10);

        MenuBarra.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(153, 153, 153));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/logout-icon.png"))); // NOI18N
        jMenu5.setText("Cerrar Sesion");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        MenuBarra.add(jMenu5);

        setJMenuBar(MenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(479, 479, 479)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionProveedorActionPerformed
        try {
            escritorio.removeAll();
            CRUDProveedor verProveedor = new CRUDProveedor();
            this.escritorio.add(verProveedor);   
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verProveedor.getSize();
            verProveedor.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) /3);
            verProveedor.show();

        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionProveedorActionPerformed

    private void optionBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionBancosActionPerformed

        try {
            escritorio.removeAll();
            CRUDBanco verbanco = new CRUDBanco();
            this.escritorio.add(verbanco);   
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verbanco.getSize();
            verbanco.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) /3);
            verbanco.show();

        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionBancosActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void optionComunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionComunasActionPerformed
        try {
            escritorio.removeAll();
            CRUDComuna vercomuna = new CRUDComuna();
            escritorio.add(vercomuna);
           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = vercomuna.getSize();
            vercomuna.setLocation((desktopSize.width - FrameSize.width) /4, (desktopSize.height - FrameSize.height) / 3);
            vercomuna.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionComunasActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            escritorio.removeAll();
            CRUDCanal vercanal = new CRUDCanal();
            escritorio.add(vercanal);
           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = vercanal.getSize();
            vercanal.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            vercanal.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void optionCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCategoriasActionPerformed
         try {
            escritorio.removeAll();
            CRUDCategoria vercategoria = new CRUDCategoria();
            escritorio.add(vercategoria);
           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = vercategoria.getSize();
            vercategoria.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            vercategoria.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionCategoriasActionPerformed

    private void optionArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionArticulosActionPerformed
        try {
            escritorio.removeAll();
            CRUDArticulo verarticulos = new CRUDArticulo();
            escritorio.add(verarticulos);
           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verarticulos.getSize();
            verarticulos.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verarticulos.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionArticulosActionPerformed

    private void optionPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionPackActionPerformed
        try {
            escritorio.removeAll();
            CRUDpack verpack = new CRUDpack();
            escritorio.add(verpack);
           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verpack.getSize();
            verpack.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verpack.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionPackActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked

        try {

            int valor = JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesion?", "Adventencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (valor == JOptionPane.YES_OPTION) {
                //            JOptionPane.showMessageDialog(null, "Gracias por usar DreamGifts ERP","Gracias",JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                Login S1 = new Login();
                S1.setVisible(true);
                dispose();
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void optionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionClientesActionPerformed
        try {
            escritorio.removeAll();
            CRUDCliente verCliente = new CRUDCliente();
            escritorio.add(verCliente);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verCliente.getSize();
            verCliente.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verCliente.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionClientesActionPerformed

    private void optionModuloVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionModuloVentasActionPerformed
        try {
            escritorio.removeAll();
            VentaPreparacion verVentas = new VentaPreparacion();
            escritorio.add(verVentas);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verVentas.getSize();
            verVentas.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verVentas.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionModuloVentasActionPerformed

    private void optionConfirmacionVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionConfirmacionVentasActionPerformed
        try {
            escritorio.removeAll();
            VentaConfirmacion verConfirmacion = new VentaConfirmacion();
            escritorio.add(verConfirmacion);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verConfirmacion.getSize();
            verConfirmacion.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verConfirmacion.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionConfirmacionVentasActionPerformed

    private void optionDespachosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionDespachosActionPerformed
        try {
            escritorio.removeAll();
            VentaDespachosPorDia verDespachos = new VentaDespachosPorDia();
            escritorio.add(verDespachos);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verDespachos.getSize();
            verDespachos.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verDespachos.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionDespachosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       try {
            escritorio.removeAll();
            VentaEstadoDespachos verDespachos = new VentaEstadoDespachos();
            escritorio.add(verDespachos);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verDespachos.getSize();
            verDespachos.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verDespachos.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void optionVentasXcomunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionVentasXcomunaActionPerformed
         try {
            escritorio.removeAll();
            InformePackComunas verInformeComuna = new InformePackComunas();
            escritorio.add(verInformeComuna);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verInformeComuna.getSize();
            verInformeComuna.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verInformeComuna.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionVentasXcomunaActionPerformed

    private void optionVentasTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionVentasTotalActionPerformed
          try {
            escritorio.removeAll();
              InformePackCantidad verInformaCantidad = new InformePackCantidad();
            escritorio.add(verInformaCantidad);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verInformaCantidad.getSize();
            verInformaCantidad.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verInformaCantidad.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optionVentasTotalActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            escritorio.removeAll();
            InformeVentas verInformeVentas = new InformeVentas();
            escritorio.add(verInformeVentas);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verInformeVentas.getSize();
            verInformeVentas.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verInformeVentas.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            escritorio.removeAll();
            InformeVencimientos verInformeVencimientos = new InformeVencimientos();
            escritorio.add(verInformeVencimientos);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verInformeVencimientos.getSize();
            verInformeVencimientos.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verInformeVencimientos.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       try {
            escritorio.removeAll();
            InformeInventarios verInformeInventario = new InformeInventarios();
            escritorio.add(verInformeInventario);           
            Dimension desktopSize = escritorio.getSize();
            Dimension FrameSize = verInformeInventario.getSize();
            verInformeInventario.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 3);
            verInformeInventario.show();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Inicio().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarra;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem optionArticulos;
    private javax.swing.JMenuItem optionBancos;
    private javax.swing.JMenuItem optionCategorias;
    private javax.swing.JMenuItem optionClientes;
    private javax.swing.JMenuItem optionComunas;
    private javax.swing.JMenuItem optionConfirmacionVentas;
    private javax.swing.JMenuItem optionDespachos;
    private javax.swing.JMenu optionEstadoDespachos;
    private javax.swing.JMenuItem optionModuloVentas;
    private javax.swing.JMenuItem optionPack;
    private javax.swing.JMenuItem optionProveedor;
    private javax.swing.JMenuItem optionVentasTotal;
    private javax.swing.JMenuItem optionVentasXcomuna;
    // End of variables declaration//GEN-END:variables
}
