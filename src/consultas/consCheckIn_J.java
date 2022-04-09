package consultas;

// @author Software_Max(JDV)
import clases.conectar;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.checkin_J;

public class consCheckIn_J {

    Frame JInternalFrame;
    PreparedStatement ps;
    public static int res;
    ResultSet rs;

    public boolean guardarCheckin(checkin_J chki) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO checkin (num_habit,fec_entra, fec_sale, tiemp_estan, doc_resp, nom_resp, reserv_por, valor, desayuno, tours, num_acomp,"
                + "doc_acomp1, nom_acomp1, doc_acomp2, nom_acomp2, doc_acomp3, nom_acomp3, doc_acomp4, nom_acomp4, registra,viene,va) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, chki.getNumHabit());
            ps.setString(2, chki.getFecEntra());
            ps.setString(3, chki.getFecSale());
            ps.setString(4, chki.getTiemEstadia());
            ps.setString(5, chki.getDocResp());
            ps.setString(6, chki.getNomResp());
            ps.setString(7, chki.getReservPor());
            ps.setInt(8, chki.getValor());
            ps.setString(9, chki.getDesayuno());
            ps.setString(10, chki.getTours());
            ps.setString(11, chki.getNumAcomp());
            ps.setString(12, chki.getDocAcomp1());
            ps.setString(13, chki.getNomAcomp1());
            ps.setString(14, chki.getDocAcomp2());
            ps.setString(15, chki.getNomAcomp2());
            ps.setString(16, chki.getDocAcomp3());
            ps.setString(17, chki.getNomAcomp3());
            ps.setString(18, chki.getDocAcomp4());
            ps.setString(19, chki.getNomAcomp4());
            ps.setString(20, chki.getRegistra());
            ps.setString(21, chki.getViene());
            ps.setString(22, chki.getVa());

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

//************************************************** BUSCAR CLIENTE *****************************************************************************
    public boolean BuscaCliNuevo(checkin_J chki) {

        try {

            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT nombre FROM clientes WHERE num_doc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, chki.getDocResp());

            rs = ps.executeQuery();
            if (rs.next()) {

                chki.setNomResp(rs.getString("nombre"));
                return true;
            }

            con.close();

            System.out.println("conex cerrada");

        } catch (SQLException e) {

            System.out.println("ERROR: " + e);
        }

        return false;

    }
//************************************************** BUSCAR CHECKIN *****************************************************************************

    public int buscaChekinNuevo() {

        int resId;
        try {

            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT id_checkin FROM checkin ORDER BY id_checkin DESC LIMIT 1";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            if (rs.next()) {

                resId = (rs.getInt("id_checkin"));
                return resId;
            }

            con.close();

            System.out.println("conex cerrada");

        } catch (SQLException e) {

            System.out.println("ERROR: " + e);
        }

        return resId = 0;

    }

//************************************************* CAMBIO DE ESTADO HAB. DE RESV A OCUP *******************************************
// Cambiamos el estado de una habitacion que esta reservada y su fecha permite usarla como disponible mientras no falte 1 dia para esa fecha
    
    public boolean cambEstHabResvDisp(String est, int ckId, int n) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "UPDATE habitaciones SET estado = ?, chek_id = ? WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, est);
            ps.setInt(2, ckId);
            ps.setInt(3, n);

            ps.execute();

            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        } finally {

            try {

                con.close();
                System.out.println("Conexion cerrada");

            } catch (SQLException e) {

                System.err.println(e);

            }
        }
        return false;
    }

//************************************************* CAMBIO DE ESTADO HAB. DE DISP A OCUP *******************************************
// Cambiamos el estado de una habitacion que esta disponble- disponible a ocupado-ocupado o viceversa   
    public boolean cambEstHabChk( String est, int ckId, int n) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "UPDATE habitaciones SET estado = ?, chek_id = ?, est_aux = ?, id_aux = ?  WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, est);
            ps.setInt(2, ckId);
            ps.setString(3, est);
            ps.setInt(4, ckId);
            ps.setInt(5, n);

            ps.execute();

            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        } finally {

            try {

                con.close();
                System.out.println("Conexion cerrada");

            } catch (SQLException e) {

                System.err.println(e);

            }
        }
        return false;
    }

}
