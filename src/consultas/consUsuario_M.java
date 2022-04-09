package consultas;

// @author Software_Max(JDV)
import clases.conectar;
import java.awt.Frame;
import vistas.Login_M;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.usuario_M;

public class consUsuario_M {

    PreparedStatement ps;
    ResultSet rs;
    public static String nom;
    public static String rol;
    public static String res;
    Login_M log = new Login_M();
    Frame JInternalFrame;

   
    public String login(usuario_M user) {

        String us1 = user.getUser();
        String pas1 = user.getPas();
        String us;
        String pas;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "SELECT  nombre,rol,user,pas FROM usuario  WHERE user= '" + us1 + "' AND pas= '" + pas1 + "'";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                nom = rs.getString("nombre");
                rol = rs.getString("rol");
                us = rs.getString("user");
                pas = rs.getString("pas");

                if (us1.equals(us)&& pas1.equals(pas)) {
                    
                    return res = "si";
                        
                }else {
                   
                    return res = "no";                
                } 
            }
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
        return res = "no";

    }
}
