package clases;

// @author Software_Max(JDV)
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSTableMetro;
import vistas.FrmReservas_J;

public class recursividad {

//*********************************************** CONVERTIR FECHA A STRING **********************************************************
    public String convertirFecha(JDateChooser fecha) {

        int anio = fecha.getCalendar().get(Calendar.YEAR);
        int mes = fecha.getCalendar().get(Calendar.MONTH) + 1;
        int dia = fecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        String a, m, d;
        a = String.valueOf(anio);
        m = String.valueOf(mes);
        d = String.valueOf(dia);
        if (m.length() == 1) {
            m = "0" + m;
        }
        if (d.length() == 1) {
            d = "0" + d;
        }
        String fecOk = (a + "-" + m + "-" + d);
        return fecOk;

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

//************************************* LIMPIAR TABLA DOCUMENTOS************************************************************************
   
    public void limpiarTabla(RSTableMetro tabla, DefaultTableModel modelo) {

        for (int i = 0; i < tabla.getRowCount(); i++) {

            modelo.removeRow(i);
            i -= 1;
        }
    }

}
