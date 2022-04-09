package controlador;

import alertas.Error;
import alertas.Exito;
import consultas.consHotel_J;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.hotel_J;
import vistas.FrmDatosHotel_J;
import static alertas.AlertaDelete.res;

// @author Software_Max(JDV)
public class ctrlHotel_J implements MouseListener, KeyListener {

    Frame JInternalFrame;
    consHotel_J ch = new consHotel_J();
    public static String mensajeER;
    public static String mensajeExit;
    public static String mensajeALDEL;
    private final hotel_J modHot;
    private final consHotel_J consHot;
    private final FrmDatosHotel_J frmHot;

    public ctrlHotel_J(hotel_J modHot, consHotel_J consHot, FrmDatosHotel_J frmHot) {
        
        this.modHot = modHot;
        this.consHot = consHot;
        this.frmHot = frmHot;
        
        frmHot.btnGuardar.addMouseListener(this);
        frmHot.btnActualizar.addMouseListener(this);
        frmHot.btnEliminar.addMouseListener(this);
        frmHot.btnLimpiar.addMouseListener(this);
        frmHot.txtTelefonoHot.addKeyListener(this);
        frmHot.txtNombreHot.addKeyListener(this);
        frmHot.txtInstagramHot.addKeyListener(this);
        frmHot.txtMunicipioHot.addKeyListener(this);

    }

//**************************************************** EVENTO DE UN LABEL QUE SE DESEMPEÑA COMO BOTON *******************************************
    @Override
    public void mouseClicked(MouseEvent e) {

//********************************************************BTN GUARDAR*****************************************************************************
        if (e.getSource() == frmHot.btnGuardar) {
            resBtnG();

            modHot.setNombre(frmHot.txtNombreHot.getText());
            modHot.setInstagram(frmHot.txtInstagramHot.getText());
            modHot.setTelefono(frmHot.txtTelefonoHot.getText());
            modHot.setMunicipio(frmHot.txtMunicipioHot.getText());

            if (frmHot.txtNombreHot.getText().equals("") || frmHot.txtInstagramHot.getText().equals("") || frmHot.txtTelefonoHot.getText().equals("") || frmHot.txtMunicipioHot.getText().equals("")) {

                mensajeER = "<html><center>Todos los campos deben tener <p>informacion, verifique e intente de nuevo¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                limpiar();

            } else if (consHot.existeHot()) {

                mensajeER = "<html><center>Este Software solo acepta<p> un hotel registrado ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                limpiar();
                
            } else if (consHot.registrarHotel(modHot)) {
                
                limpiar();
                mensajeExit = "<html><center>El registro se ha<p> guardado con exito ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);
                frmHot.mostrarDatosHot();
                ch.listar();

            } else {

                mensajeER = "<html><center>Hubo un error al<p> guardar el registro ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                limpiar();
            }
        }

//********************************************************BTN ACTUALIZAR*****************************************************************************
        if (e.getSource() == frmHot.btnActualizar) {

            resBtnA();
            if (frmHot.lblID.getText().equals("")) {

                mensajeER = "<html><center>No hay datos para actualizar, <p> verifique e intente de nuevo ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                modHot.setId(Integer.parseInt(frmHot.lblID.getText()));
                modHot.setNombre(frmHot.txtNombreHot.getText());
                modHot.setInstagram(frmHot.txtInstagramHot.getText());
                modHot.setTelefono(frmHot.txtTelefonoHot.getText());
                modHot.setMunicipio(frmHot.txtMunicipioHot.getText());

                if (consHot.modificarHotel(modHot)) {

                    limpiar();
                    mensajeExit = "<html><center>El registro se ha<p> actualizado con exito ¡¡¡ ¡¡¡";
                    new Exito(JInternalFrame, true).setVisible(true);
                    frmHot.mostrarDatosHot();
                    ch.listar();

                } else {

                    mensajeER = "<html><center>Hubo un error al<p> actualizar el registro ¡¡¡";
                    new Error(JInternalFrame, true).setVisible(true);
                    limpiar();
                }

            }
        }

//********************************************************BTN ELIMINAR*****************************************************************************
        if (e.getSource() == frmHot.btnEliminar) {

            resBtnE();
            if (frmHot.lblID.getText().equals("")) {

                mensajeER = "<html><center>No hay datos para eliminar, <p> verifique e intente de nuevo ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                mensajeALDEL = "<html><center>Esta seguro que<p> desea eliminar el registro?";
                new alertas.AlertaDelete(JInternalFrame, true).setVisible(true);

            }

            if (res.equals("si")) {

                modHot.setId(Integer.parseInt(frmHot.lblID.getText()));

                if (consHot.eliminarHotel(modHot)) {

                    limpiar();
                    mensajeExit = "<html><center>El registro se ha<p> eliminado con exito ¡¡¡";
                    new Exito(JInternalFrame, true).setVisible(true);
                    frmHot.mostrarDatosHot();
                    ch.listar();

                } else {

                    mensajeER = "<html><center>Hubo un error al<p> eliminar el registro ¡¡¡";
                    new Error(JInternalFrame, true).setVisible(true);
                    limpiar();
                }

            }
        }

//********************************************************BTN LIMPIAR*****************************************************************************
        if (e.getSource() == frmHot.btnLimpiar) {

            limpiar();
            resBtnL();
            
        }
    }

//********************************************************METODO LIMPIAR*****************************************************************************
    public void limpiar() {

        frmHot.lblID.setText("");
        frmHot.txtNombreHot.setText("");
        frmHot.txtInstagramHot.setText("");
        frmHot.txtTelefonoHot.setText("");
        frmHot.txtMunicipioHot.setText("");
        frmHot.pnlFormularioHotel.requestFocus();
        activarBtn();

    }

//********************************************************METODO ACTIVAR BTN*****************************************************************************
    void activarBtn() {

        frmHot.btnGuardar.setVisible(true);
        frmHot.btnActualizar.setVisible(true);
        frmHot.btnEliminar.setVisible(true);

    }

//********************************************************RESTAURAR COLOR BTN'S*****************************************************************************
    void resBtnG() {

        frmHot.btnGuardar.setBackground(new Color(4, 153, 193));
        frmHot.btnGuardar.setForeground(new Color(255, 255, 255));

    }

    void resBtnL() {

        frmHot.btnLimpiar.setBackground(new Color(4, 153, 193));
        frmHot.btnLimpiar.setForeground(new Color(255, 255, 255));

    }

    void resBtnE() {

        frmHot.btnEliminar.setBackground(new Color(4, 153, 193));
        frmHot.btnEliminar.setForeground(new Color(255, 255, 255));

    }

    void resBtnA() {

        frmHot.btnActualizar.setBackground(new Color(4, 153, 193));
        frmHot.btnActualizar.setForeground(new Color(255, 255, 255));

    }

//************************************************************ EVENT MOUSE ********************************************************************
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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//************************************************* KEYPRESSED GUARDAR ***************************************************************************

    @Override
    public void keyPressed(KeyEvent evt) {

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER && evt.getSource() == frmHot.txtTelefonoHot && frmHot.btnGuardar.isVisible()) {
            resBtnG();

            if (consHot.existeHot()) {

                mensajeER = "<html><center>Este Software solo acepta<p> un hotel registrado ¡¡¡";
                new Error(JInternalFrame, true).setVisible(true);
                limpiar();

            } else {

                modHot.setNombre(frmHot.txtNombreHot.getText());
                modHot.setInstagram(frmHot.txtInstagramHot.getText());
                modHot.setTelefono(frmHot.txtTelefonoHot.getText());
                modHot.setMunicipio(frmHot.txtMunicipioHot.getText());

                if (consHot.registrarHotel(modHot)) {

                    mensajeExit = "<html><center>El registro se ha<p> guardado con exito ¡¡¡";
                    new Exito(JInternalFrame, true).setVisible(true);
                    limpiar();
                    frmHot.mostrarDatosHot();
                    ch.listar();

                } else {

                    mensajeER = "<html><center>Hubo un error al<p> guardar el registro ¡¡¡";
                    new Error(JInternalFrame, true).setVisible(true);
                    limpiar();

                }

            }

        }

    }

    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
