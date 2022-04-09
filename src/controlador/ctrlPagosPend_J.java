package controlador;

import alertas.Error;
import alertas.Exito;
import static controlador.ctrlCheckin_J.resTours;
import consultas.consHotel_J;
import consultas.consIngresos_M;
import consultas.consPagPend_J;
import static controlador.ctrlCheckin_J.vieneDe;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import modelo.pagosPend_J;
import vistas.FrmPagosPend_J;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;
import static controlador.ctrlReservas_J.tipPag;
import javax.swing.JOptionPane;

// @author Software_Max(JDV)
public class ctrlPagosPend_J implements MouseListener, KeyListener {

    Frame JInternalFrame;
    private final pagosPend_J modPagpen;
    private final consPagPend_J consPagPen;
    private final FrmPagosPend_J frmPagPend;
    consHotel_J ch = new consHotel_J();
    public static String mensajeINFOEstHab;
    consIngresos_M consIng = new consIngresos_M();

    public ctrlPagosPend_J(pagosPend_J modPagpen, consPagPend_J consPagPen, FrmPagosPend_J frmPagPend) {

        this.modPagpen = modPagpen;
        this.consPagPen = consPagPen;
        this.frmPagPend = frmPagPend;

        frmPagPend.btnRegistPago.addMouseListener(this);
        frmPagPend.btnLimpiar.addMouseListener(this);
        frmPagPend.btnActualiPago.addMouseListener(this);
        frmPagPend.btnPagaYa.addMouseListener(this);
    }

//**************************************************** EVENTO DE UN LABEL QUE SE DESEMPEÑA COMO BOTON *******************************************
    @Override
    public void mouseClicked(MouseEvent e) {

//******************************************************** BTN GUARDAR PAGO *****************************************************************************
        if (e.getSource() == frmPagPend.btnRegistPago) {
            resBtnRP();

            if (frmPagPend.txtDocResp.getText().isEmpty() || frmPagPend.txtNomResp.getText().isEmpty() || frmPagPend.txtValorPago.getText().isEmpty() || frmPagPend.cbxPago.getSelectedItem().equals("Seleccione") || frmPagPend.cbxFormaPago.getSelectedItem().equals("Seleccione")) {

                mensajeER = "<html><center>La informacion esta incompleta<p>para registrar el pago.";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                modPagpen.setDocResp(frmPagPend.txtDocResp.getText());
                modPagpen.setNomResp(frmPagPend.txtNomResp.getText());
                modPagpen.setFecPago(frmPagPend.txtFecPago.getText());
                modPagpen.setFormPago(frmPagPend.cbxFormaPago.getSelectedItem().toString());
                modPagpen.setValor(Integer.parseInt(frmPagPend.txtValorPago.getText()));
                if (resTours.equals("SI")) {
                    modPagpen.setConcepto("HOSPD + TOURS");
                } else {
                    modPagpen.setConcepto("HOSPD");
                }

                modPagpen.setPago(frmPagPend.cbxPago.getSelectedItem().toString());
                modPagpen.setRegistra(frmPagPend.lblNomUser.getText());

                if (consPagPen.registrarPago(modPagpen)) {

                    limpiar();
                    mensajeExit = "<html><center>El pago se ha<p> registrado con exito.";
                    new Exito(JInternalFrame, true).setVisible(true);
                    consPagPen.listarPagos();

                } else {

                    mensajeER = "<html><center>Hubo un error al<p> registrar el pago.";
                    new Error(JInternalFrame, true).setVisible(true);

                }
            }

        }
//******************************************************** BTN GUARDAR *****************************************************************************
        if (e.getSource() == frmPagPend.btnPagaYa) {
            resBtnPY();

            if (frmPagPend.txtDocResp.getText().equals("") || frmPagPend.txtNomResp.getText().equals("") || frmPagPend.txtValorPago.getText().equals("0") || frmPagPend.cbxPago.getSelectedItem() != "PAGA-YA" || frmPagPend.cbxFormaPago.getSelectedItem().equals("Seleccione")) {

                mensajeER = "<html><center>La informacion esta incompleta<p>para completar el registro del pago inmediato.";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                modPagpen.setDocResp(frmPagPend.txtDocResp.getText());
                modPagpen.setNomResp(frmPagPend.txtNomResp.getText());
                modPagpen.setFecPago(frmPagPend.txtFecPago.getText());
                modPagpen.setFormPago(frmPagPend.cbxFormaPago.getSelectedItem().toString());
                modPagpen.setValor(Integer.parseInt(frmPagPend.txtValorPago.getText()));

                if (resTours.equals("SI")) {
                    modPagpen.setConcepto("HOSPD + TOURS");
                } else {
                    modPagpen.setConcepto("HOSPEDAJE");
                }

                modPagpen.setPago(frmPagPend.cbxPago.getSelectedItem().toString());
                modPagpen.setRegistra(frmPagPend.lblNomUser.getText());

                if (frmPagPend.cbxPago.getSelectedItem().equals("PAGA-YA") && frmPagPend.cbxFormaPago.getSelectedItem() != ("Seleccione") && consPagPen.registrarPago(modPagpen)) {

                    modPagpen.setFecPago(frmPagPend.txtFecPago.getText());
                    modPagpen.setConcepto("HOSPEDAJE");
                    modPagpen.setValor(Integer.parseInt(frmPagPend.txtValorPago.getText()));
                    modPagpen.setRegistra(frmPagPend.lblNomUser.getText());
                    
                    JOptionPane.showMessageDialog(null, vieneDe+"--"+tipPag);
                    
                    if (vieneDe.equals("btnChkResv")) {

                        if (tipPag.equals("PARCIAL")) {// aca dice que esta el error
                            if (consPagPen.guardarIngreso(modPagpen, "RESTANTE RESERVA")) {

                                mensajeExit = "<html><center>El pago inmediato se ha<p> registrado con exito.";
                                new Exito(JInternalFrame, true).setVisible(true);
                                consPagPen.listarPagos();
                                limpiar();

                            } else {

                                mensajeER = "<html><center>Hubo un error al<p> registrar el ingreso.";
                                new Error(JInternalFrame, true).setVisible(true);

                            }
                        }

                    } else if (vieneDe.equals("btnChek")) {

                        if (consPagPen.guardarIngreso(modPagpen, "HOSPEDAJE")) {

                            mensajeExit = "<html><center>El pago inmediato se ha<p> registrado con exito.";
                            new Exito(JInternalFrame, true).setVisible(true);
                            consPagPen.listarPagos();
                            limpiar();

                        } else {

                            mensajeER = "<html><center>Hubo un error al<p> registrar el ingreso.";
                            new Error(JInternalFrame, true).setVisible(true);

                        }
                    }else if (vieneDe.equals("btnChkProv")) {

                        if (consPagPen.guardarIngreso(modPagpen, "HOSPEDAJE")) {

                            mensajeExit = "<html><center>El pago inmediato se ha<p> registrado con exito.";
                            new Exito(JInternalFrame, true).setVisible(true);
                            consPagPen.listarPagos();
                            limpiar();

                        } else {

                            mensajeER = "<html><center>Hubo un error al<p> registrar el ingreso.";
                            new Error(JInternalFrame, true).setVisible(true);

                        }
                    }
                } else {

                    mensajeER = "<html><center>Hubo un error al<p> registrar el pago inmediato.";
                    new Error(JInternalFrame, true).setVisible(true);

                }

            }
        }

//******************************************************** BTN PAGAR *****************************************************************************
        if (e.getSource() == frmPagPend.btnActualiPago) {

            resBtnP();

            if (frmPagPend.txtDocResp.getText().equals("") || frmPagPend.txtNomResp.getText().equals("") || frmPagPend.txtValorPago.getText().equals(0)) {

                mensajeER = "<html><center>No hay pagos<p>para actualizar.";
                new Error(JInternalFrame, true).setVisible(true);

            } else if (frmPagPend.cbxPago.getSelectedItem() != "SALDAR" || frmPagPend.cbxFormaPago.getSelectedItem().equals("Seleccione")) {

                mensajeER = "<html><center>Debe diligenciar PAGÓ o FORMA DE PAGO<p>para continuar con el registro.";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                modPagpen.setId(Integer.parseInt(frmPagPend.txtID.getText()));
                modPagpen.setFecPago(frmPagPend.txtFecPago.getText());
                modPagpen.setFormPago(frmPagPend.cbxFormaPago.getSelectedItem().toString());
                modPagpen.setPago(frmPagPend.cbxPago.getSelectedItem().toString());
                modPagpen.setRegistra(frmPagPend.lblNomUser.getText());

                if (consPagPen.actualizarPago(modPagpen)) {

                    modPagpen.setFecPago(frmPagPend.txtFecPago.getText());
                    modPagpen.setConcepto("HOSPEDAJE");
                    modPagpen.setValor(Integer.parseInt(frmPagPend.txtValorPago.getText()));
                    modPagpen.setRegistra(frmPagPend.lblNomUser.getText());

                    if (consPagPen.guardarIngreso(modPagpen, "HOSPEDAJE")) {

                        mensajeExit = "<html><center>El pago-pendiente se ha<p> actualizado con exito.";
                        new Exito(JInternalFrame, true).setVisible(true);
                        consPagPen.listarPagos();
                        frmPagPend.cbxPago.addItem("LUEGO");
                        limpiar();

                    } else {

                        mensajeER = "<html><center>Hubo un error al<p> registrar el ingreso.";
                        new Error(JInternalFrame, true).setVisible(true);

                    }

                } else {

                    mensajeER = "<html><center>Hubo un error al<p> actualizar el pago.";
                    new Error(JInternalFrame, true).setVisible(true);

                }
            }
        }
//******************************************************** BTN LIMPIAR *****************************************************************************

        if (e.getSource() == frmPagPend.btnLimpiar) {

            limpiar();
            resBtnL();

        }
    }
    //******************************************************** METODO LIMPIAR *****************************************************************************

    public void limpiar() {

        frmPagPend.txtID.setText("");
        frmPagPend.txtDocResp.setText("");
        frmPagPend.txtNomResp.setText("");
        frmPagPend.txtValorPago.setText("0");
        frmPagPend.cbxFormaPago.setSelectedIndex(0);
        frmPagPend.cbxFormaPago.removeItem("Sin pago");
        frmPagPend.cbxPago.setSelectedIndex(0);
        frmPagPend.cbxFormaPago.setEnabled(true);
        frmPagPend.btnActualiPago.setVisible(false);
        frmPagPend.btnRegistPago.setVisible(false);
        frmPagPend.btnPagaYa.setVisible(false);

    }

//******************************************************** RESTAURAR COLOR BTN'S *****************************************************************************
    void resBtnRP() {

        frmPagPend.btnRegistPago.setBackground(new Color(4, 153, 193));
        frmPagPend.btnRegistPago.setForeground(new Color(255, 255, 255));

    }

    void resBtnL() {

        frmPagPend.btnLimpiar.setBackground(new Color(4, 153, 193));
        frmPagPend.btnLimpiar.setForeground(new Color(255, 255, 255));

    }

    void resBtnP() {

        frmPagPend.btnActualiPago.setBackground(new Color(4, 153, 193));
        frmPagPend.btnActualiPago.setForeground(new Color(255, 255, 255));

    }

    void resBtnPY() {

        frmPagPend.btnPagaYa.setBackground(new Color(4, 153, 193));
        frmPagPend.btnPagaYa.setForeground(new Color(255, 255, 255));

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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

}
