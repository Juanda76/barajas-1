package consultas;

// @author Software_Max(JDV)
import clases.conectar;
import clases.recursividad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.estadoHabit;

public class consEstadoHabit_J {

    public static String nomresR, ingR, salR, acompR, tiempR;
    public static String nomresA, ingA, salA, acompA, tiempA;
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    public static String idR;
    public static String idA;
    PreparedStatement ps;
    ResultSet rs;
    String llegada;
    recursividad rec = new recursividad();
    estadoHabit est = new estadoHabit();

//***************************************************************************************************************
    public void verEstadoPHabt(String num) {

        

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "SELECT estado FROM habitaciones WHERE numero = '" + num + "'";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                est.setEstado(rs.getString("estado"));
                
                
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
        
    }

//***************************************************************************************************************
    public String verEstadoPpalHabit(String num) {

        String estado = null;

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "SELECT estado FROM habitaciones WHERE numero = '" + num + "'";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                estado = rs.getString("estado");

                return estado;
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
        return null;
    }


//****************************************** METODO CALCULAR DIAS ***************************************************************  
    
    public int numeroDiasParaReserva(Date fecha1, Date fecha2) {
        
        long startTime = fecha1.getTime();
        long endTime = fecha2.getTime();
        long diffTime = endTime - startTime;
        long diffDays = diffTime / (1000 * 60 * 60 * 24);
        return (int) diffDays;
    }

        
//****************************************************************************************************************************    
    public int cantEstados(String estado) {

        int num = 0;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT COUNT(*) tot FROM habitaciones WHERE estado = '" + estado + "' OR est_aux = '" + estado + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                num = rs.getInt("tot");
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return num;

    }

//****************************************************************************************************************************    
    public boolean datosHabitPuertaRoja(String est, String num) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT   nom_resp, num_acomp FROM checkin INNER JOIN habitaciones ON checkin.id_checkin = habitaciones.chek_id WHERE estado = '" + est + "' AND numero = '" + num + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                nomresR = rs.getString("nom_resp");
                acompR = rs.getString("num_acomp");

                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return false;

    }
//****************************************************************************************************************************    

    public boolean datosHabitInfoRoja(String est, String num) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT  id_checkin, nom_resp, fec_entra, fec_sale, tiemp_estan, num_acomp FROM checkin INNER JOIN habitaciones ON checkin.id_checkin = habitaciones.chek_id WHERE estado = '" + est + "' AND numero = '" + num + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                idR = rs.getString("id_checkin");
                nomresR = rs.getString("nom_resp");
                ingR = rs.getString("fec_entra");
                salR = rs.getString("fec_sale");
                tiempR = rs.getString("tiemp_estan");
                acompR = rs.getString("num_acomp");

                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return false;

    }
//****************************************************************************************************************************    

    public boolean datosHabitPuertaAmarilla(String est, String num) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT  nombre, num_acomp FROM reservas INNER JOIN habitaciones ON reservas.id_reservas  = habitaciones.chek_id WHERE estado = '" + est + "' AND numero = '" + num + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                nomresA = rs.getString("nombre");
                acompA = rs.getString("num_acomp");

                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return false;

    }
//****************************************************************************************************************************    

    public boolean datosHabitInfoAmarilla(String est, String num) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT  id_reservas, nombre, llegada, salida, num_acomp FROM reservas INNER JOIN habitaciones ON reservas.id_reservas = habitaciones.chek_id WHERE estado = '" + est + "' AND numero = '" + num + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                idA = rs.getString("id_reservas");
                nomresA = rs.getString("nombre");
                ingA = rs.getString("llegada");
                salA = rs.getString("salida");
                acompA = rs.getString("num_acomp");

                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return false;

    }
//****************************************************************************************************************************    

    public String fechaHabAmarilla(String est, String num) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT llegada FROM reservas INNER JOIN habitaciones ON reservas.id_reservas = habitaciones.chek_id WHERE estado = '" + est + "' AND numero = '" + num + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
              
                ingA = rs.getString("llegada");
               
                return ingA;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return "";

    }
//****************************************************************************************************************************    

    public int numActualHuespedes() {

        String est = "OCUPADO";
        int numHuespedes = 0;

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = ("SELECT SUM(checkin.num_acomp +1) AS 'total_visit' FROM checkin, habitaciones WHERE checkin.id_checkin = habitaciones.chek_id AND estado = '" + est + "'");

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                numHuespedes = rs.getInt("total_visit");

                return numHuespedes;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return numHuespedes = 0;

    }
    
    
//************************************** METODO MOSTRAR DATOS HABITACION ***********************************************************
   
    public int mostrarDiasParaReserva(String estad, String numPu, String fec) {

        if (fechaLlegaReserva(estad, numPu)) {

            String fecha1 = (llegada);
            Date f1 = rec.setearFechas(fecha1);
            String fecha2 = fec;
            Date f2 = rec.setearFechas(fecha2);

            int diasRestantes = (numeroDiasEntreDosFechas(f2, f1));
            return diasRestantes;
        }
        return 0;
    }
 
    
//****************************************************************************************************************************    
    public boolean fechaLlegaReserva(String est, String num) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT llegada FROM reservas INNER JOIN habitaciones ON reservas.id_reservas = habitaciones.id_aux  WHERE est_aux = '" + est + "' AND numero = '" + num + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                llegada = rs.getString("llegada");
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return false;

    }

//*************************************************************************************

    public static int numeroDiasEntreDosFechas(Date fecha1, Date fecha2) {

        long startTime = fecha1.getTime();
        long endTime = fecha2.getTime();
        long diffTime = endTime - startTime;
        long diffDays = diffTime / (1000 * 60 * 60 * 24);
        return (int) diffDays;
    }

////*********************************************************************************************************************************************
//    public Date setearFechas(String fec) {
//
//        Date fechaSetDate = null;
//
//        try {
//            fechaSetDate = formatoFecha.parse(fec);
//
//        } catch (ParseException ex) {
//
//            Logger.getLogger(FrmReservas_J.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return fechaSetDate;
//
//    }    

}
