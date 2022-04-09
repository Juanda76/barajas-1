package clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

// @author Software_Max(JDV)

public class propiedadesCBX extends BasicComboBoxUI {

    Color c = new Color(4,153,193);//declaramos color que se usara muchas veces(recursividad)
    Color c1 = new Color(51, 102, 255);//declaramos color que se usara muchas veces(recursividad)

    public static ComboBoxUI createUI(JComponent com) {

        return new propiedadesCBX();

    }

    //ponemos una imagen al btn del cbx
    @Override
    protected JButton createArrowButton() {

        JButton btn = new JButton();//creamos un btn
        btn.setIcon(new ImageIcon(getClass().getResource("/img/mano.png")));//ponemos imagen al boton
        btn.setBorder(BorderFactory.createLineBorder(c, 2));//damos color a la linea del cbx, y le damos una distancia entre txt y btn
        btn.setContentAreaFilled(false);// ponemos el btn transparente
        return btn;//retornamos el btn

    }

    //damos color al borde del cbx
    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {

        g.setColor(c);//damos color al cbx
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);//dibujamos el borde del cbx

    }

    //pintar el cbx y la seleccion del cbx
    @Override
    protected ListCellRenderer createRenderer() {

        return new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.

                list.setSelectionBackground(c1);//damos color a la seleccion del cbx

                return this;

            }

        };

    }

}
