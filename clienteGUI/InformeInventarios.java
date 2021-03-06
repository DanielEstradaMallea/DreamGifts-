/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteGUI;

import conexion.conexion;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author danie
 */
public class InformeInventarios extends javax.swing.JInternalFrame {

    DefaultTableModel dtmBanco;
    TableRowSorter trs;
    DefaultTableModel modeloDespachos;
    int nroPedido = 0;
    conexion con = new conexion();

    public InformeInventarios() throws Exception {
        initComponents();

        this.getContentPane().setBackground(new Color(72, 70, 92));
        modeloDespachos = new DefaultTableModel();

        modeloDespachos.addColumn("Id Articulo");
        modeloDespachos.addColumn("Nombre Articulo");
        modeloDespachos.addColumn("Stock");
        modeloDespachos.addColumn("Categoria");
        this.tblDespachos.setModel(modeloDespachos);
        categorias();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

//    private void listarPendientes() {
//
//        try {
//
//            con.connections();
//            PreparedStatement pstm = con.conexion.prepareStatement("select * from venta,cliente,pack where EST_ID_ESTADO  ='" + 2 + "' and"
//                    + " venta.CLI_ID_CLIENTE=cliente.id_cliente and venta.PCK_ID_PACK=pack.id_pack ");
//            ResultSet respuesta1 = pstm.executeQuery();
//
//            while (respuesta1.next()) {
//
////                if (respuesta1.getInt("EST_ID_ESTADO") == 1) {
//                Object[] dato = {
//                    respuesta1.getInt("vta_id_venta"),
//                    respuesta1.getString("VTA_FECHA_ENTREGA"),
//                    respuesta1.getString("cli_nombre"),
//                    respuesta1.getString("cli_telefono"),
//                    respuesta1.getString("VTA_TOTAL"),
//                    respuesta1.getString("pack_nombre")};
//
//                modeloDespachos.addRow(dato);
////                }
//
//            }
//
//        } catch (Exception e) {
//            System.out.println("no se listo pendientes por error : " + e);
//        }
//
//    }
    @Override
    public void setUI(InternalFrameUI ui) {
        super.setUI(ui);

        BasicInternalFrameUI frameUI = (BasicInternalFrameUI) getUI();
        if (frameUI != null) {
            frameUI.setNorthPane(null);
        }
    }

    private void categorias() {

        try {
            con.connections();
            PreparedStatement pstm = con.conexion.prepareStatement("select * from categoria");
            ResultSet respuesta = pstm.executeQuery();

            while (respuesta.next()) {

                cmbCategorias.addItem(respuesta.getString("cat_descripcion"));
            }

        } catch (SQLException e) {
        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDespachos = new javax.swing.JTable();
        BuscarInformeComuna = new javax.swing.JButton();
        cmbCategorias = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SpinnerStock = new javax.swing.JSpinner();

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

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Posicion de Inventario");

        tblDespachos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblDespachos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDespachos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDespachosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDespachos);

        BuscarInformeComuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/buscar.png"))); // NOI18N
        BuscarInformeComuna.setText("Buscar");
        BuscarInformeComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarInformeComunaActionPerformed(evt);
            }
        });

        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas" }));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/icons/excel-icon.png"))); // NOI18N
        jButton2.setText("Exportar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categorias");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Stock Minimo");

        SpinnerStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BuscarInformeComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarInformeComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(SpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDespachosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDespachosMouseClicked

    }//GEN-LAST:event_tblDespachosMouseClicked

    private void BuscarInformeComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarInformeComunaActionPerformed

        modeloDespachos.setRowCount(0);

        if (cmbCategorias.getSelectedIndex() == 0) {
            try {
                con.connections();

                String sql = ("SELECT\n"
                        + "    articulo.art_id,\n"
                        + "    articulo.art_descripcion,\n"
                        + "    articulo.art_stock,\n"
                        + "    categoria.cat_descripcion\n"
                        + "\n"
                        + "FROM\n"
                        + "    articulo\n"
                        + "INNER JOIN categoria ON articulo.cat_id_cat = categoria.id_cat \n"
                        + "WHERE articulo.art_stock>='" + SpinnerStock.getValue() + "'  "
                        + "ORDER BY articulo.art_stock desc");
                PreparedStatement pstm = con.conexion.prepareStatement(sql);
                ResultSet respuesta1 = pstm.executeQuery();

                while (respuesta1.next()) {

//                if (respuesta1.getInt("EST_ID_ESTADO") == 1) {
                    Object[] dato = {
                        respuesta1.getInt("art_id"),
                        respuesta1.getString("art_descripcion"),
                        respuesta1.getInt("art_stock"),
                        respuesta1.getString("cat_descripcion"),};

                    modeloDespachos.addRow(dato);
//                }

                }
            } catch (SQLException e) {
                System.out.println("no se listo pendientes por error : " + e);

            }

        } else {

            try {
                con.connections();

                String sql = ("SELECT\n"
                        + "    articulo.art_id,\n"
                        + "    articulo.art_descripcion,\n"
                        + "    articulo.art_stock,\n"
                        + "    categoria.cat_descripcion\n"
                        + "\n"
                        + "FROM\n"
                        + "    articulo\n"
                        + "INNER JOIN categoria ON articulo.cat_id_cat = categoria.id_cat \n"
                        + "WHERE categoria.cat_descripcion='" + cmbCategorias.getSelectedItem() + "' "
                        + "AND articulo.art_stock>='" + SpinnerStock.getValue() + "'  "
                        + "ORDER BY articulo.art_stock desc");
                PreparedStatement pstm = con.conexion.prepareStatement(sql);
                ResultSet respuesta1 = pstm.executeQuery();

                while (respuesta1.next()) {

//                if (respuesta1.getInt("EST_ID_ESTADO") == 1) {
                    Object[] dato = {
                        respuesta1.getInt("art_id"),
                        respuesta1.getString("art_descripcion"),
                        respuesta1.getInt("art_stock"),
                        respuesta1.getString("cat_descripcion"),};

                    modeloDespachos.addRow(dato);
//                }

                }
            } catch (SQLException e) {
                System.out.println("no se listo pendientes por error : " + e);

            }
        }
    }//GEN-LAST:event_BuscarInformeComunaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("Dream Informes");
                XSSFSheet sheet1 = (XSSFSheet) wb.createSheet("new sheet");
                Header header = sheet1.getFirstHeader();
                header.setCenter("Center First Page Header");
                Font font = wb.createFont();
                font.setFontHeightInPoints((short) 18);
                font.setFontName("Courier New");
                font.setItalic(true);
                CellStyle style = wb.createCellStyle();
                style.setFont(font);
                style.setFillBackgroundColor(IndexedColors.PLUM.getIndex());
                style.setFillPattern(FillPatternType.FINE_DOTS);

                style.setBorderBottom(BorderStyle.THIN);
                style.setBorderLeft(BorderStyle.THIN);
                style.setBorderRight(BorderStyle.THIN);
                style.setBorderBottom(BorderStyle.THIN);

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < tblDespachos.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tblDespachos.getColumnName(i));
                    cell.setCellStyle(style);

                }

                for (int j = 0; j < tblDespachos.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < tblDespachos.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);

                        if (tblDespachos.getValueAt(j, k) != null) {
                            cell.setCellValue(tblDespachos.getValueAt(j, k).toString());
                            style = wb.createCellStyle();
                            style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
                            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                             style.setBorderBottom(BorderStyle.THIN);
                style.setBorderLeft(BorderStyle.THIN);
                style.setBorderRight(BorderStyle.THIN);
                style.setBorderBottom(BorderStyle.THIN);

                            
                            
                            cell.setCellStyle(style);
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Error al generar archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException io) {
            System.out.println(io);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public void clear() {

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarInformeComuna;
    private javax.swing.JSpinner SpinnerStock;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDespachos;
    // End of variables declaration//GEN-END:variables
}
