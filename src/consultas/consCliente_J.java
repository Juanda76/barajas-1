package consultas;

// @author Software_Max(JDV)
import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.cliente_J;
import modelo.hotel_J;

public class consCliente_J {

    PreparedStatement ps;
    ResultSet rs;
    cliente_J cli = new cliente_J();
    public static String mensaje;
    public static String mensaje1;

    public boolean registrarCliente(cliente_J cli) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String sql = "INSERT INTO clientes (nombre,apellido,tipo_doc,num_doc,instagram,contacto,pais,registra) VALUES(?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getTipo_doc());
            ps.setString(4, cli.getNum_doc());
            ps.setString(5, cli.getInstagram());
            ps.setString(6, cli.getContacto());
            ps.setString(7, cli.getPais());
            ps.setString(8, cli.getRegistra());

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

//*********************************************************************************************************************************
    public boolean modificarCliente(cliente_J cli) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "UPDATE clientes SET  nombre=?,apellido=?,tipo_doc=?,num_doc=?,instagram=?,contacto=?,pais=?,registra=?  WHERE id_clientes = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getTipo_doc());
            ps.setString(4, cli.getNum_doc());
            ps.setString(5, cli.getInstagram());
            ps.setString(6, cli.getContacto());
            ps.setString(7, cli.getPais());
            ps.setString(8, cli.getRegistra());
            ps.setInt(9, cli.getId());

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

//*************************************************************************************************************************************
    public boolean eliminarCliente(cliente_J cli) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "DELETE FROM  clientes WHERE id_clientes = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, cli.getId());

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



//*****************************************CONSULTA HOTEL**************************************************************************************
//NOS TRAE EL NOMBRE Y EL MNCPIO DEL HOTEL PARA MOSTRAR EN EL PANEL INFORMACION, DEBE IR EN TODOS LOS FRM'S
    public void datosHotel(hotel_J ht) {

        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();

            ps = con.prepareStatement(" SELECT nombre,municipio FROM  empresa");
            rs = ps.executeQuery();

            while (rs.next()) {

                ht.setNombre(rs.getString("nombre"));
                ht.setMunicipio(rs.getString("municipio"));

            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }

    }

//****************************************************** FECHA DEL SISTEMA (dia-mes-año) ******************************************************
    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat(" dd / MMMM / YYYY ");

        return formatoFecha.format(fecha);

    }

}
