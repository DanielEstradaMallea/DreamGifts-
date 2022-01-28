/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso.util;


import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author claudio
 */
public class renderButton extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object ob, boolean isSelected, boolean hasFocus, int row, int column) {
//
//        if (ob instanceof JButton) {
//            return (JButton) ob;
//        }

        if (ob instanceof JButton) {
            JButton btn = (JButton) ob;
            if (isSelected) {
                btn.setForeground(table.getSelectionForeground());
                btn.setBackground(table.getSelectionBackground());
            } else {
                btn.setForeground(table.getForeground());
                btn.setBackground(UIManager.getColor("Button.background"));
            }
            return btn;
        }
        return super.getTableCellRendererComponent(table, ob, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

}
