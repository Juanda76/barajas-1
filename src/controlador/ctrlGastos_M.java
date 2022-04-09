package controlador;

// @author Software_Max M_O
import alertas.Alerta;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import consultas.consGastos_M;
import modelo.gastos_M;
import vistas.FrmGastos_M;
import alertas.Error;
import java.awt.Frame;
import alertas.Exito;
import java.awt.Color;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;

public class ctrlGastos_M implements MouseListener {

    Frame JInternalFrame;
    private final gastos_M mod;
    private final consGastos_M conGas;
    private final FrmGastos_M frmGas;
    public static String mensajeAL;

    public ctrlGastos_M(gastos_M mod, consGastos_M conGas, FrmGastos_M frmGas) {

        this.mod = mod;
        this.conGas = conGas;
        this.frmGas = frmGas;
        frmGas.btnAgregarG.addMouseListener(this);
        frmGas.btnLimpiarG.addMouseListener(this);
        frmGas.btnListarG.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        resBtnAg();
        if (e.getSource() == frmGas.btnAgregarG) {

            mod.setFecha(frmGas.txtFechaG.getText());
            mod.setConcepto(frmGas.txtConceptoG.getText());
            mod.setValor(Integer.parseInt(frmGas.txtValorG.getText()));
            mod.setRegistra(frmGas.lblNomUser.getText());

            if (frmGas.txtConceptoG.getText().equals("") || frmGas.txtValorG.getText().equals("0")) {
                
                mensajeER = "<html><center>Todos los campos deben tener <p>informacion, verifique e intente de nuevo ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                
            } else if (conGas.guardar(mod)) {
                
                limpiar();
                mensajeExit = "<html><center>El gasto ha sido <p> guardado con exito ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);
                conGas.listarGastos(mod);
                
            } else {
                
                mensajeER = "<html><center>Hubo un error al <p> registrar el gasto ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                limpiar();
            }

        }
//*********************************************************************************************************************
        
        if (e.getSource() == frmGas.btnLimpiarG) {
            
            resBtnLim();
            limpiar();
        }
//*********************************************************************************************************************

        if (e.getSource() == frmGas.btnListarG) {
            
            resBtnLis();
            mod.setFecha(frmGas.txtFechaG.getText());
            
            if (conGas.verifGastHoy(mod)) {
                
                conGas.listarGastos(mod);
                
            } else {
                
                mensajeAL = "<html><center>Aun no hay gastos <p>registrados el dia de hoy ¡¡¡";
                new Alerta(JInternalFrame, true).setVisible(true);
            }
        }
    }
//*********************************************************************************************************************
    
    public void limpiar() {
        frmGas.txtConceptoG.setText("");
        frmGas.txtValorG.setText("0");
        frmGas.txtConceptoG.requestFocus();
    }

//*********************************************************************************************************************
    void resBtnAg() {
        frmGas.btnAgregarG.setBackground(new Color(4, 153, 193));
        frmGas.btnAgregarG.setForeground(new Color(255, 255, 255));
    }

//*********************************************************************************************************************
    void resBtnLim() {
        frmGas.btnLimpiarG.setBackground(new Color(4, 153, 193));
        frmGas.btnLimpiarG.setForeground(new Color(255, 255, 255));
    }

//*********************************************************************************************************************
    void resBtnLis() {
        frmGas.btnListarG.setBackground(new Color(4, 153, 193));
        frmGas.btnListarG.setForeground(new Color(255, 255, 255));
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
