package consultas;

import clases.conectar;
import java.util.Date;
import java.awt.Frame;
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
import modelo.pagosPend_J;
import static vistas.FrmPagosPend_J.tblPagosPendien;

// @author Software_Max(JDV)
public class consPagPend_J {

    PreparedStatement ps;
    Frame JInternalFrame;
    ResultSet rs;
    int filas;
    public static String pagPendi;

//********************************************************************************************************************
    public boolean registrarPago(pagosPend_J pgp) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO pagos (doc_resp, nom_resp,fec_pago, form_pago, valor, concepto, pago, registra) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, pgp.getDocResp());
            ps.setString(2, pgp.getNomResp());
            ps.setString(3, pgp.getFecPago());
            ps.setString(4, pgp.getFormPago());
            ps.setInt(5, pgp.getValor());
            ps.setString(6, pgp.getConcepto());
            ps.setString(7, pgp.getPago());
            ps.setString(8, pgp.getRegistra());

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

    public boolean actualizarPago(pagosPend_J pgp) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "UPDATE pagos SET  fec_pago=?, form_pago=?, pago=?, registra=? WHERE id_pagos =?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, pgp.getFecPago());
            ps.setString(2, pgp.getFormPago());
            ps.setString(3, pgp.getPago());
            ps.setString(4, pgp.getRegistra());
            ps.setInt(5, pgp.getId());

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
    public void listarPagos() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String r = "LUEGO";
        DefaultTableModel modelo = new DefaultTableModel(); 
        tblPagosPendien.setModel(modelo);
        
        try {
          
            ps = con.prepareStatement(" SELECT id_pagos ,doc_resp, nom_resp,fec_pago, form_pago, valor, concepto, pago FROM  pagos WHERE pago='" + r + "' ");

            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("N° IDEN");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("FECHA");
            modelo.addColumn("FOR.PAGO");
            modelo.addColumn("VALOR");
            modelo.addColumn("CONCEPTO");
            modelo.addColumn("PAGO");

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
    public int pagosPend() {
        
        int num = 0;
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String r = "LUEGO";
        
        try {

            String sql = "SELECT COUNT(*) tot FROM pagos WHERE pago = '" + r + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                num = rs.getInt("tot");
            }
            
        } catch (SQLException ex) {
            
            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            
            try {
                
                con.close();
                
            } catch (SQLException e) {
            }
        }

        return num;

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
            
            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
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
        SimpleDateFormat formatoFecha = new SimpleDateFormat(" dd-MMMM-YYYY ");

        return formatoFecha.format(fecha);

    }

//****************************************************** FECHA DEL SISTEMA (año-mes-dia) ******************************************************
   
    public static String fechaActualRegis() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");

        return formatoFecha.format(fecha);

    }
    
//********************************************************************************************
    
     public boolean guardarIngreso(pagosPend_J pag, String concpto) {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        
        String sql = "INSERT INTO ingresos (fecha, concepto, valor, registra) VALUES(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, pag.getFecPago());
            ps.setString(2, concpto);
            ps.setInt(3, pag.getValor());
            ps.setString(4, pag.getRegistra());

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
