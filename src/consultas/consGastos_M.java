package consultas;

//@author Software_Max M_0
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import clases.conectar;
import modelo.gastos_M;
import javax.swing.table.DefaultTableModel;
import static vistas.FrmGastos_M.tblListaGastos;
import java.sql.ResultSetMetaData;

public class consGastos_M {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean guardar(gastos_M gas) { 
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO gastos (fecha, concepto, valor, registra) VALUES(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, gas.getFecha());
            ps.setString(2, gas.getConcepto());
            ps.setInt(3, gas.getValor());
            ps.setString(4, gas.getRegistra());

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
    
//***********************************************************************************************
   
    public void listarGastos(gastos_M gas) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        String fec = gas.getFecha();
        
        DefaultTableModel modelo = new DefaultTableModel();
        tblListaGastos.setModel(modelo);
        
        try {

            ps = con.prepareStatement(" SELECT fecha,concepto,valor,registra FROM  gastos WHERE fecha ='" + fec + "' ");

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
    
 //***********************************************************************************************
    
    public boolean verifGastHoy(gastos_M gas) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String fec = gas.getFecha();
        
        
        try {

            ps = con.prepareStatement(" SELECT fecha FROM  gastos WHERE fecha ='" + fec + "' ");

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
}
