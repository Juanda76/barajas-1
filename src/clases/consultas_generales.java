
package clases;

//@author Software_Max(JDV)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class consultas_generales {
  
    PreparedStatement ps;
    ResultSet rs;
    
//********************************************************************************************************************************************
   public void llenarHabitDisponChk(JComboBox hbDisp) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        String est = "DISPONIBLE";
        String est1 = "RESERVA";
        
        
        String sql = "SELECT numero FROM habitaciones WHERE estado = '"+est+"' OR est_aux = '"+est1+"' ";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                hbDisp.addItem(rs.getString("numero"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }  
//********************************************************************************************************************************************
   public void llenarHabitDisponResv(JComboBox hbDisp) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        String est = "DISPONIBLE";
        
        
        String sql = "SELECT numero FROM habitaciones WHERE estado = '"+est+"' AND est_aux = '"+est+"' ";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                hbDisp.addItem(rs.getString("numero"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }  
//********************************************************************************************************************************************
   public boolean validarEstado(JComboBox hbDisp) {
        String resp = null;
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        String est = "RESERVA";
        
        String sql = "SELECT estado FROM habitaciones WHERE estado = '"+est+"'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                
               resp =(rs.getString("estado"));

            }
            if(resp.equals("RESERVA")){
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }  
   
}
