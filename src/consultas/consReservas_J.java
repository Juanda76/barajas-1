package consultas;

import clases.conectar;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.hotel_J;
import modelo.reservas_J;
import vistas.FrmReservas_J;
import static vistas.FrmReservas_J.tblReservPend;

// @author Software_Max(JDV)
public class consReservas_J {

    PreparedStatement ps;
    Frame JInternalFrame;
    ResultSet rs;
    int filas;
    public static String pagPendi;
    String llegada;

//********************************************************************************************************************
    public boolean guardarReserva(reservas_J resv) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO reservas (num_doc, nombre, apellido, telefono, num_habit, llegada, salida, num_acomp, for_pag, tipo_pago, res_por, val_tot, pendiente, registra, abono, resta, fec_res) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, resv.getNumdoc());
            ps.setString(2, resv.getNombre());
            ps.setString(3, resv.getApellido());
            ps.setString(4, resv.getTel());
            ps.setString(5, resv.getNumHabit());
            ps.setString(6, resv.getLlegada());
            ps.setString(7, resv.getSalida());
            ps.setString(8, resv.getNumAcomp());
            ps.setString(9, resv.getFormPag());
            ps.setString(10, resv.getTipoPago());
            ps.setString(11, resv.getResvPor());
            ps.setInt(12, resv.getTotal());
            ps.setString(13, "SI");
            ps.setString(14, resv.getRegistra());
            ps.setInt(15, resv.getAbono());
            ps.setInt(16, resv.getResta());
            ps.setString(17, resv.getFecResv());

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

//********************************************************************************************************************
    public boolean checarReserva(reservas_J resv) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "UPDATE reservas SET  pendiente=?, registra=?  WHERE id_reservas =?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, resv.getPendiente());
            ps.setString(2, resv.getRegistra());
            ps.setInt(3, resv.getId());

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
//********************************************************************************************************************

    public boolean eliminarReserva(reservas_J resv) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "DELETE  FROM reservas  WHERE id_reservas =?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, resv.getId());

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

//********************************************************************************************************************
    public void listarReservas() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String respuseta = "SI";

        DefaultTableModel modelo = new DefaultTableModel();
        tblReservPend.setModel(modelo);
        try {

            ps = con.prepareStatement(" SELECT * FROM  reservas WHERE pendiente='" + respuseta + "' ");

            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("IDEN");
            modelo.addColumn("NOM");
            modelo.addColumn("APE");
            modelo.addColumn("TEL");
            modelo.addColumn("HAB");
            modelo.addColumn("LLEG");
            modelo.addColumn("SALE");
            modelo.addColumn("ACOMP");
            modelo.addColumn("PAGA");
            modelo.addColumn("TIPO");
            modelo.addColumn("RESV");
            modelo.addColumn("TOTAL");
            modelo.addColumn("PEND");
            modelo.addColumn("REG");
            modelo.addColumn("F_REG");
            modelo.addColumn("ABONO");
            modelo.addColumn("DEBE");

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

//********************************************************************************************************************
    public int numReservasPend() {

        int numReservas = 0;
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String respuesta = "SI";

        try {

            String sql = "SELECT COUNT(*) tot FROM reservas WHERE pendiente = '" + respuesta + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                numReservas = rs.getInt("tot");
            }

        } catch (SQLException ex) {
            Logger.getLogger(consReservas_J.class.getName()).log(Level.SEVERE, null, ex);
        }

        return numReservas;

    }

//**************************************************BUSCAR CLIENTE*****************************************************************************
    public boolean BuscaCliNuevo(reservas_J resv) {

        try {

            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT nombre,apellido,contacto FROM clientes WHERE num_doc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, resv.getNumdoc());

            rs = ps.executeQuery();

            if (rs.next()) {

                resv.setNombre(rs.getString("nombre"));
                resv.setApellido(rs.getString("apellido"));
                resv.setTel(rs.getString("contacto"));
                return true;
            }

            con.close();
            System.out.println("conex cerrada");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
        }
        return false;

    }

//************************************************** BUSCAR RESERVA *****************************************************************************
    public int buscaReserNew() {

        int resId;
        try {

            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT id_reservas  FROM reservas ORDER BY id_reservas  DESC LIMIT 1";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            if (rs.next()) {

                resId = (rs.getInt("id_reservas"));
                return resId;
            }

            con.close();

            System.out.println("conex cerrada");

        } catch (SQLException e) {

            System.out.println("ERROR: " + e);
        }

        return resId = 0;

    }

//************************************************* CAMBIO DE ESTADO HAB. DE DISP A RESV *******************************************
// Cambiamos el estado y estado auxiliar de una habitacion que esta diponible-disponible a reserva-reserva o viceversa
    public boolean cambiarEstadHabResrv(String num, String est, int ckId, int n) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "UPDATE habitaciones SET  numero = ? ,estado = ?, chek_id = ?, est_aux = ?, id_aux = ? WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, num);
            ps.setString(2, est);
            ps.setInt(3, ckId);
            ps.setString(4, est);
            ps.setInt(5, ckId);
            ps.setInt(6, n);

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

//********************************************************************************************************************
    public void nombreHot(hotel_J ht) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement(" SELECT nombre,municipio FROM  empresa ");
            rs = ps.executeQuery();

            while (rs.next()) {

                ht.setNombre(rs.getString("nombre"));
                ht.setMunicipio(rs.getString("municipio"));

            }

        } catch (SQLException ex) {

            Logger.getLogger(consReservas_J.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR " + ex);
        } finally {

            try {
                con.close();
            } catch (SQLException e) {
            }
        }

    }

//****************************************************** FECHA DEL SISTEMA (dia-mes-año) ******************************************************
    public static String fechaActualInfo() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat(" dd / MMMM / YYYY ");

        return formatoFecha.format(fecha);

    }

    //************************************** METODO MOSTRAR DATOS HABITACION ***********************************************************
    public int mostrarDiasParaReserva(String estad, String numPu, String fecAct) {

        if (fechaLlegaReserva(estad, numPu)) {
        
        String fecha1 = (llegada);
        Date f1 = setearFechas(fecha1);
        String fecha2 = (fecAct);
        Date f2 = setearFechas(fecha2);

        int diasRestantes = (numeroDiasEntreDosFechas(f2, f1));
        return diasRestantes;
        
        }
        return 0;

    }

    //****************************************************************************************************************************    
    public boolean fechaLlegaReserva(String estAux, String num) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT llegada FROM reservas INNER JOIN habitaciones ON reservas.id_reservas = habitaciones.id_aux WHERE est_aux = '" + estAux + "' AND numero = '" + num + "'";

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

//*********************************************************************************************************************************************
    public Date setearFechas(String fec) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaSetDate = null;

        try {
            fechaSetDate = formatoFecha.parse(fec);

        } catch (ParseException ex) {

            Logger.getLogger(FrmReservas_J.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaSetDate;

    }

//********************************************************************************************
    public boolean guardarIngreso(reservas_J resv, String concepto, int val) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO ingresos (fecha, concepto, valor, registra) VALUES(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, resv.getFecResv());
            ps.setString(2, concepto);
            ps.setInt(3, val);
            ps.setString(4, resv.getRegistra());

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
//********************************************************************************************

    public boolean guardarSalida(reservas_J resv, String concepto) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO gastos (fecha, concepto, valor, registra) VALUES(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, resv.getFecResv());
            ps.setString(2, concepto);
            ps.setInt(3, resv.getTotal());
            ps.setString(4, resv.getRegistra());

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

}
