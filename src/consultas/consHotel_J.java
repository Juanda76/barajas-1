package consultas;

import clases.conectar;
import java.awt.Frame;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import modelo.hotel_J;
import static vistas.FrmDatosHotel_J.tblDatosHotel;

// @author Software_Max(JDV)

public class consHotel_J {

    Frame JInternalFrame;
    PreparedStatement ps;
    ResultSet rs;
    int filas;

    public boolean registrarHotel(hotel_J ht) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        String sql = "INSERT INTO empresa (nombre,insta,telefono,municipio) VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, ht.getNombre());
            ps.setString(2, ht.getInstagram());
            ps.setString(3, ht.getTelefono());
            ps.setString(4, ht.getMunicipio());

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
    
    public boolean modificarHotel(hotel_J ht) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "UPDATE  empresa  SET nombre = ?,insta = ?,telefono = ?,municipio = ?  WHERE id_empresa = ?";

        try {
            
            ps = con.prepareStatement(sql);

            ps.setString(1, ht.getNombre());
            ps.setString(2, ht.getInstagram());
            ps.setString(3, ht.getTelefono());
            ps.setString(4, ht.getMunicipio());
            ps.setInt(5, ht.getId());

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
    
    public boolean eliminarHotel(hotel_J ht) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String sql = "DELETE FROM  empresa   WHERE id_empresa = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, ht.getId());

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
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }

    }
//********************************************************************************************************************

    public void listar() {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblDatosHotel.setModel(modelo);

            ps = con.prepareStatement(" SELECT * FROM  empresa ");

            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("INSTAGRAM");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("MUNICIPIO");

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
            
            Logger.getLogger(consHotel_J.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR " + ex);
            
        } finally {
            
            try {
                
                con.close();
                
            } catch (SQLException e) {
            }
        }

    }

//****************************************************** FECHA DEL SISTEMA (dia-mes-año) ******************************************************
    public static String fechaActual() {
//LocalDate date=LocalDate. now();
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE dd MMMM YYYY ");

        return formatoFecha.format(fecha);

    }

//****************************************************** VERIFICAR SI HAY HOTEL REGISTARDOS ******************************************************
    public boolean existeHot() {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        try {

            ps = con.prepareStatement(" SELECT * FROM  empresa ");
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            
            Logger.getLogger(consHotel_J.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR " + ex);
            
        } finally {
            
            try {
                
                con.close();
                
            } catch (SQLException e) {
            }
        }
        return false;

    }

}
