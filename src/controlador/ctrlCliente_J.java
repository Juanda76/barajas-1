package controlador;

import alertas.AlertaDelete;
import alertas.Exito;
import alertas.Error;
import consultas.consCliente_J;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.cliente_J;
import rsscalelabel.RSScaleLabel;
import vistas.FrmAClientes_J;
import static alertas.AlertaDelete.res;
import static controlador.ctrlHotel_J.mensajeALDEL;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;

// @author Software_Max(JDV)
public class ctrlCliente_J implements MouseListener, KeyListener {
    
    Frame JInternalFrame;
    private final cliente_J modCli;
    private final consCliente_J consCli;
    private final FrmAClientes_J frmCli;
    
    public ctrlCliente_J(cliente_J modCli, consCliente_J consCli, FrmAClientes_J frmCli) {
        
        this.modCli = modCli;
        this.consCli = consCli;
        this.frmCli = frmCli;
        
        frmCli.btnActualHuesp.addMouseListener(this);
        frmCli.btnGuarHuesp.addMouseListener(this);
        frmCli.btnLimpHusped.addMouseListener(this);
        frmCli.btnElimHusped.addMouseListener(this);
        
    }
//**************************************************** EVENTO DE UN LABEL QUE SE DESEMPEÑA COMO BOTON *******************************************

    @Override
    public void mouseClicked(MouseEvent e) {
//********************************************************BTN GUARDAR*****************************************************************************

        if (e.getSource() == frmCli.btnGuarHuesp) {
            
            resBtnG();
            modCli.setNombre(frmCli.txtNomHusp.getText());
            modCli.setApellido(frmCli.txtApellHuesp.getText());
            modCli.setTipo_doc(frmCli.cbxTipoDcto.getSelectedItem().toString());
            modCli.setNum_doc(frmCli.txtNumDocHuesp.getText());
            modCli.setInstagram(frmCli.txtInstagHuesp.getText());
            modCli.setContacto(frmCli.txtContactHuesp.getText());
            modCli.setPais(frmCli.cbxPaises.getSelectedItem().toString());
            modCli.setRegistra(frmCli.txtRegistra.getText());
            
            
            if (frmCli.txtNomHusp.getText().equals("") || frmCli.txtApellHuesp.getText().equals("") || frmCli.cbxTipoDcto.getSelectedItem().equals("Seleccione") || frmCli.txtNumDocHuesp.getText().equals("")
                    || frmCli.txtInstagHuesp.getText().equals("") || frmCli.txtContactHuesp.getText().equals("") || frmCli.cbxPaises.getSelectedItem().equals("Seleccione")) {
                
                mensajeER = "<html><center>Todos los campos deben<p> tener informacion, verifique<p> e intente de nuevo ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                
            } else if (consCli.registrarCliente(modCli)) {
                
                limpiar();
                mensajeExit = "<html><center>El registro del huesped<p> ha sido exitoso ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);
                frmCli.dispose();
                
            } else {
                
                mensajeER = "<html><center>Hubo un error al<p> guardar el registro ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                limpiar();
            }
            
        }

//********************************************************BTN ACTUALIZAR*****************************************************************************
        if (e.getSource() == frmCli.btnActualHuesp) {
            
            resBtnA();
            if (frmCli.txtID.getText().equals("")) {
                
                mensajeER = "<html><center>No hay datos para actualizar, <p> verifique e intente de nuevo ¡¡¡";
                new alertas.Error(JInternalFrame, true).setVisible(true);
                
            } else {
                
                modCli.setNombre(frmCli.txtNomHusp.getText());
                modCli.setApellido(frmCli.txtApellHuesp.getText());
                modCli.setTipo_doc(frmCli.cbxTipoDcto.getSelectedItem().toString());
                modCli.setNum_doc(frmCli.txtNumDocHuesp.getText());
                modCli.setInstagram(frmCli.txtInstagHuesp.getText());
                modCli.setContacto(frmCli.txtContactHuesp.getText());
                modCli.setPais(frmCli.cbxPaises.getSelectedItem().toString());
                modCli.setRegistra(frmCli.txtRegistra.getText());
                modCli.setId(Integer.valueOf(frmCli.txtID.getText()));
                
                if (consCli.modificarCliente(modCli)) {
                    
                    limpiar();
                    mensajeExit = "<html><center>El registro se ha<p> actualizado con exito ¡¡¡ ¡¡¡";
                    new Exito(JInternalFrame, true).setVisible(true);
                    frmCli.dispose();
                } else {
                    
                    mensajeER = "<html><center>Hubo un error al<p> actualizar el registro ¡¡¡";
                    new Error(JInternalFrame, true).setVisible(true);
                    limpiar();
                }
                
            }
        }

//********************************************************BTN ELIMINAR*****************************************************************************
        if (e.getSource() == frmCli.btnElimHusped) {
            
            resBtnE();
            if (frmCli.txtID.getText().equals("")) {
                
                mensajeER = "<html><center>No hay datos para eliminar, <p> verifique e intente de nuevo ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                
            } else {
                
                mensajeALDEL = "<html><center>Esta seguro que<p> desea eliminar el registro?";
                new AlertaDelete(JInternalFrame, true).setVisible(true);
                
            }
            
            if (res.equals("si")) {
                
                modCli.setId(Integer.parseInt(frmCli.txtID.getText()));
                
                if (consCli.eliminarCliente(modCli)) {
                    
                    limpiar();
                    mensajeExit = "<html><center>El registro se ha<p> eliminado con exito ¡¡¡";
                    new Exito(JInternalFrame, true).setVisible(true);
                    
                } else {
                    
                    mensajeER = "<html><center>Hubo un error al<p> eliminar el registro ¡¡¡";
                    new Error(JInternalFrame, true).setVisible(true);
                    limpiar();
                }
                
            }
        }

//********************************************************BTN LIMPIAR*****************************************************************************
        if (e.getSource() == frmCli.btnLimpHusped) {
            
            resBtnL();
            limpiar();
            frmCli.activarBtn();
            
        }
        
    }

//*************************************************************************************************************************************************    
//********************************************************RESTAURAR COLOR BTN'S*****************************************************************************
    void resBtnG() {
        
        frmCli.btnGuarHuesp.setBackground(new Color(4, 153, 193));
        frmCli.btnGuarHuesp.setForeground(new Color(255, 255, 255));
        
    }
    
    void resBtnL() {
        
        frmCli.btnLimpHusped.setBackground(new Color(4, 153, 193));
        frmCli.btnLimpHusped.setForeground(new Color(255, 255, 255));
        
    }
    
    void resBtnE() {
        
        frmCli.btnElimHusped.setBackground(new Color(4, 153, 193));
        frmCli.btnElimHusped.setForeground(new Color(255, 255, 255));
        
    }
    
    void resBtnA() {
        
        frmCli.btnActualHuesp.setBackground(new Color(4, 153, 193));
        frmCli.btnActualHuesp.setForeground(new Color(255, 255, 255));
        
    }
//********************************************************METODO LIMPIAR*****************************************************************************

    public void limpiar() {
        
        frmCli.txtNomHusp.setText("");
        frmCli.txtApellHuesp.setText("");
        frmCli.cbxTipoDcto.setSelectedIndex(0);
        frmCli.txtNumDocHuesp.setText("");
        frmCli.txtInstagHuesp.setText("");
        frmCli.txtContactHuesp.setText("");
        frmCli.cbxPaises.setSelectedIndex(0);
        frmCli.txtID.setText("");
        frmCli.lblValidCLI.setText("");
        RSScaleLabel.setScaleLabel(frmCli.lblImgOkNoCLI, "");
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
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
    }
    
}
