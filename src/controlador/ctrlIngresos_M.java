package controlador;

// @author Software_Max M_O
import alertas.Exito;
import alertas.Alerta;
import consultas.consIngresos_M;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.ingresos_M;
import vistas.FrmIngresos_M;
import static controlador.ctrlGastos_M.mensajeAL;
import static controlador.ctrlHotel_J.mensajeExit;
import static controlador.ctrlHotel_J.mensajeER;

public class ctrlIngresos_M implements MouseListener {

    Frame JInternalFrame;
    private final ingresos_M mod;
    private final consIngresos_M consIng;
    private final FrmIngresos_M frmIng;

    public ctrlIngresos_M(ingresos_M mod, consIngresos_M consIng, FrmIngresos_M frmIng) {

        this.mod = mod;
        this.consIng = consIng;
        this.frmIng = frmIng;
        
        this.frmIng.btnAgregarE.addMouseListener(this);
        this.frmIng.btnLimpiarE.addMouseListener(this);
        this.frmIng.btnListarE.addMouseListener(this);
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
//********************************************************BTN GUARDAR*****************************************************************************
        
        if (e.getSource() == frmIng.btnAgregarE) {
        resBtnAg();

            mod.setFecha(frmIng.txtFechaE.getText());
            mod.setConcepto(frmIng.txtConceptoE.getText());
            mod.setValor(Integer.parseInt(frmIng.txtValorE.getText()));
            mod.setRegistra(frmIng.lblNomUser.getText());

            if (frmIng.txtConceptoE.getText().equals("") || frmIng.txtValorE.getText().equals("0")) {
                mensajeER = "<html><center>Todos los campos deben tener <p>informacion, verifique e intente de nuevo ¡¡¡";
                new alertas.Error(JInternalFrame, true).setVisible(true);
                
            } else if (consIng.guardar(mod)) {
                
                limpiar();
                mensajeExit = "<html><center>El ingreso ha sido <p> guardado con exito ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);
                consIng.listarIngresos(mod);
                
            } else {
                
                mensajeER = "<html><center>Hubo un error al <p> registrar el ingreso ¡¡¡";
                new alertas.Error(JInternalFrame, true).setVisible(true);
                limpiar();
            }

        }
        
//********************************************************BTN GUARDAR*****************************************************************************
        
        if (e.getSource() == frmIng.btnLimpiarE) {
            
            resBtnLim();
            limpiar();
        }
        
//********************************************************BTN GUARDAR*****************************************************************************

        if (e.getSource() == frmIng.btnListarE) {
            
            resBtnLis();
            mod.setFecha(frmIng.txtFechaE.getText());
            
            if (consIng.verifIngHoy(mod)) {
                
                consIng.listarIngresos(mod);
            } else {
                
                 mensajeAL = "<html><center>Aun no hay ingresos <p>registrados el dia de hoy ¡¡¡";
                new Alerta(JInternalFrame, true).setVisible(true);
            }
        }
    }

//********************************************************BTN GUARDAR*****************************************************************************

    public void limpiar() {

        frmIng.txtConceptoE.setText("");
        frmIng.txtValorE.setText("0");
        frmIng.txtConceptoE.requestFocus();
    }
    
//********************************************************BTN GUARDAR*****************************************************************************

    void resBtnAg() {
        
        frmIng.btnAgregarE.setBackground(new Color(4, 153, 193));
        frmIng.btnAgregarE.setForeground(new Color(255, 255, 255));
    }
    
//********************************************************BTN GUARDAR*****************************************************************************

    void resBtnLim() {
        
        frmIng.btnLimpiarE.setBackground(new Color(4, 153, 193));
        frmIng.btnLimpiarE.setForeground(new Color(255, 255, 255));
    }
    
    
//********************************************************BTN GUARDAR*****************************************************************************

    void resBtnLis() {
        
        frmIng.btnListarE.setBackground(new Color(4, 153, 193));
        frmIng.btnListarE.setForeground(new Color(255, 255, 255));
    }
    
    
    
//************************************************************************************************************************************************

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
