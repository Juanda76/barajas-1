package consultas;

// @author Software_Max M_O

import clases.conectar;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import modelo.ingresos_M;
import static vistas.FrmIngresos_M.tblListaIngresos;
//import static vistas.FrmRepIngresos.tblRepIngresoso;

public class consIngresos_M {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean guardar(ingresos_M ing) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        String sql = "INSERT INTO ingresos (fecha, concepto, valor, registra) VALUES(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, ing.getFecha());
            ps.setString(2, ing.getConcepto());
            ps.setInt(3, ing.getValor());
            ps.setString(4, ing.getRegistra());

            ps.execute();
            return true;

        } catch (SQLException e) {

            Logger.getLogger(consGastos_M.class.getName()).log(Level.SEVERE, null, e);
            System.err.println(e);
            return false;

        } finally {

            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

//********************************************************BTN GUARDAR*****************************************************************************

    public void listarIngresos(ingresos_M ing) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        String fec = ing.getFecha();
        DefaultTableModel modelo = new DefaultTableModel();
        tblListaIngresos.setModel(modelo);
        
        try {

            ps = con.prepareStatement(" SELECT fecha,concepto,valor,registra FROM  ingresos WHERE fecha = '" + fec + "'");

            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("FECHA");
            modelo.addColumn("CONCEPTO");
            modelo.addColumn("VALOR");
            modelo.addColumn("REGISTRA");

            while (rs.next()) {
                
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                
                modelo.addRow(filas);

            }
            
        } catch (SQLException e) {
            
            System.out.println("Error " + (e));

        } finally {
            
            try {
                
                con.close();
                
            } catch (SQLException e) {
            }
        }
    }

//********************************************************BTN GUARDAR*****************************************************************************
    
      public boolean verifIngHoy(ingresos_M ing) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String fec = ing.getFecha();
        
        
        try {

            ps = con.prepareStatement(" SELECT fecha FROM  ingresos WHERE fecha ='" + fec + "' ");

            rs = ps.executeQuery();
           
            if(rs.next()){
                
              return true;
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error " + (e));

        } finally {
            
            try {
                
                con.close();
                
            } catch (SQLException e) {
            }
        }
        return false;
    }
      
//********************************************************BTN GUARDAR*****************************************************************************

//   public void ingresosXFechas( String fec1, String fec2) {
//        
//        conectar conn = new conectar();
//        Connection con = conn.getConnection();
//        
//        DefaultTableModel modelo = new DefaultTableModel();
//        tblListaIngresosRep.setModel(modelo);
//        
//        try {
//
//            ps = con.prepareStatement("CALL VER_INGRESOS ('"+fec1+"' , '"+fec2+"') ");
//
//            rs = ps.executeQuery();
//
//            ResultSetMetaData rsMD = rs.getMetaData();
//            int cantidadColumnas = rsMD.getColumnCount();
//
//            modelo.addColumn("FECHA");
//            modelo.addColumn("CONCEPTO");
//            modelo.addColumn("VALOR");
//            modelo.addColumn("REGISTRA");
//
//            while (rs.next()) {
//                
//                Object[] filas = new Object[cantidadColumnas];
//
//                for (int i = 0; i < cantidadColumnas; i++) {
//                    filas[i] = rs.getObject(i + 1);
//
//                }
//                
//                modelo.addRow(filas);
//
//            }
//            
//        } catch (SQLException e) {
//            
//            System.out.println("Error " + (e));
//
//        } finally {
//            
//            try {
//                
//                con.close();
//                
//            } catch (SQLException e) {
//            }
//        }
//    }
 
      
}
