package consultas;

// @author Software_Max M_O
import clases.conectar;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import modelo.tours_J;

public class consTours_J {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean guardarTours(tours_J trs) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO tours (doc_resp, nombre, valor, cascada, miel, amor, cafe, esplan, cabal, panora, fecha,registra ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, trs.getNumdoc());
            ps.setString(2, trs.getNombre());
            ps.setInt(3, trs.getValor());
            ps.setString(4, trs.getCascadas());
            ps.setString(5, trs.getMiel());
            ps.setString(6, trs.getAmor());
            ps.setString(7, trs.getCafe());
            ps.setString(8, trs.getEsplandor());
            ps.setString(9, trs.getCabalgata());
            ps.setString(10, trs.getPanoramico());
            ps.setString(11, trs.getFecha());
            ps.setString(12, trs.getRegistra());

            ps.execute();
            return true;

        } catch (NumberFormatException | SQLException e) {

            System.err.println(e);
            return false;
        } finally {

            try {
                con.close();
                System.out.println("Conexion cerrada");

            } catch (SQLException e) {

                System.err.println(e);
            }
        }

    }
    
//**************************************************BUSCAR CLIENTE*****************************************************************************
    public boolean BuscaCliNuevo(tours_J trs) {
       
        try {
            
            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT nombre FROM clientes WHERE num_doc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, trs.getNumdoc());

            rs = ps.executeQuery();
            
            if (rs.next()){
                
                trs.setNombre(rs.getString("nombre"));
                return true;
            }

            con.close();
            System.out.println("conex cerrada");
            
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
        }
        
        return false;
        

    }

}
