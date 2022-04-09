package controlador;

// @author Software_Max(JDV)
import alertas.AlertaDelete;
import alertas.Exito;
import alertas.Error;
import consultas.consCheckIn_J;
import consultas.consCliente_J;
import consultas.consHotel_J;
import consultas.consReservas_J;
import clases.consultas_generales;
import clases.recursividad;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import modelo.checkin_J;
import modelo.cliente_J;
import modelo.reservas_J;
import rsscalelabel.RSScaleLabel;
import vistas.FrmCheckin_J;
import vistas.FrmReservas_J;
import vistas.FrmAClientes_J;
import static controlador.ctrlHotel_J.mensajeALDEL;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;
import static alertas.AlertaDelete.res;
import alertas.InfVerFrmEstHab;
import static alertas.InfVerFrmEstHab.resInfo;
import consultas.consEstadoHabit_J;
import static controlador.ctrlPagosPend_J.mensajeINFOEstHab;
import java.util.Date;
import modelo.estadoHab;
import vistas.FrmEstadoHabit_J;

public class ctrlReservas_J implements MouseListener, KeyListener {

    Frame JInternalFrame;
    private final reservas_J modResv;
    private final consReservas_J consResv;
    private final FrmReservas_J frmResv;
    consHotel_J ch = new consHotel_J();
    consultas_generales consGen = new consultas_generales();
    recursividad rec = new recursividad();
    public int dias = 0;
    public static int respIdReserv;
    public static String tipPag;

    public ctrlReservas_J(reservas_J modResv, consReservas_J consResv, FrmReservas_J frmResv) {

        this.modResv = modResv;
        this.consResv = consResv;
        this.frmResv = frmResv;

        frmResv.btnGuardarReserv.addMouseListener(this);
        frmResv.btnChequear.addMouseListener(this);
        frmResv.btnEliminarResv.addMouseListener(this);
        frmResv.btnLimpiarResv1.addMouseListener(this);
        frmResv.btnRegResp.addMouseListener(this);
        frmResv.lblImgOkNoRESP.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == frmResv.btnGuardarReserv) {
            resBtnG();
            int val;
             String type;
            if (frmResv.txtDocResp.getText().equals("") || frmResv.txtNombreResp.getText().equals("") || frmResv.txtApellidoResp.getText().equals("") || frmResv.txtTelefono.getText().equals("")
                    || frmResv.cbxHabitDisponible.getSelectedIndex() == 0 || frmResv.cbxNumAcomp.getSelectedIndex() == 0 || frmResv.cbxFormaPago.getSelectedIndex() == 0 || frmResv.cbxresPor.getSelectedIndex() == 0
                    || frmResv.txtValorPagar.getText().equals("0") || frmResv.dcFecLlega.getDate() == null || frmResv.dcFecSale.getDate() == null || frmResv.txtValorAbono.equals("0")) {

                mensajeER = "<html><center>Todos los campos deben tener<p>la informacion requerida para registrar<p> la reserva, por favor verifique.";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                modResv.setNumdoc(frmResv.txtDocResp.getText());
                modResv.setNombre(frmResv.txtNombreResp.getText());
                modResv.setApellido(frmResv.txtApellidoResp.getText());
                modResv.setTel(frmResv.txtTelefono.getText());
                modResv.setNumHabit(frmResv.cbxHabitDisponible.getSelectedItem().toString());
                modResv.setLlegada(rec.convertirFecha(frmResv.dcFecLlega));
                modResv.setSalida(rec.convertirFecha(frmResv.dcFecSale));
                modResv.setNumAcomp(frmResv.cbxNumAcomp.getSelectedItem().toString());
                modResv.setFormPag(frmResv.cbxFormaPago.getSelectedItem().toString());
                if (frmResv.txtValorResta.getText().equals("0")) {
                    modResv.setTipoPago("TOTAL");
                } else {
                    modResv.setTipoPago("PARCIAL");
                }
                modResv.setResvPor(frmResv.cbxresPor.getSelectedItem().toString());
                modResv.setTotal(Integer.parseInt(frmResv.txtValorPagar.getText()));
                modResv.setRegistra(frmResv.lblNomUser.getText());
                modResv.setAbono(Integer.parseInt(frmResv.txtValorAbono.getText()));
                modResv.setResta(Integer.parseInt(frmResv.txtValorResta.getText()));
                modResv.setFecResv(frmResv.lblFecAct.getText());

                String num = modResv.getNumHabit();
                int n = Integer.parseInt(num);
                String tip = modResv.getTipoPago();

                if (consResv.guardarReserva(modResv)) {

                    String tp = "" ;
                    modResv.setFecResv(frmResv.lblFecAct.getText());
                    modResv.setRegistra(frmResv.lblNomUser.getText());

                    if (frmResv.txtValorResta.equals("0")) {
                        val = Integer.parseInt(frmResv.txtValorPagar.getText());
                    } else {
                        val = Integer.parseInt(frmResv.txtValorAbono.getText());
                    }
                    
                    if (tip.equals("TOTAL")) {
                        tp = "PAGO TOTAL RESV";
                    } else if(tip.equals("PARCIAL")) {
                        tp = "PAGO PARCIAL RESV";
                    }

                    if (consResv.guardarIngreso(modResv, tp, val)) {

                        limpiarResv();
                        mensajeExit = "<html><center>La reserva se ha<p> registrado con exito.";
                        new Exito(JInternalFrame, true).setVisible(true);
                        consResv.listarReservas();

                        respIdReserv = consResv.buscaReserNew();

                        if (consResv.cambiarEstadHabResrv(num, "RESERVA", respIdReserv, n) != true) {

                            mensajeER = "<html><center>Hubo un error al registrar la habitacion<p> porfavor intente nuevamente.";
                            new Error(JInternalFrame, true).setVisible(true);
                        }

                        mensajeINFOEstHab = "<html><center>Desea ver el estado de las habitaciones?";
                        new InfVerFrmEstHab(JInternalFrame, true).setVisible(true);

                        if (resInfo.equals("ver")) {

                            consEstadoHabit_J consEstHab = new consEstadoHabit_J();
                            FrmEstadoHabit_J frmEstHab = new FrmEstadoHabit_J();
                            estadoHab modEstHab = new estadoHab();
                            ctrlEstadoHabit_J ctrlEstHab = new ctrlEstadoHabit_J(consEstHab, frmEstHab, modEstHab);
                            frmEstHab.setVisible(true);
                            frmResv.dispose();

                        }

                    } else {

                        mensajeER = "<html><center>Hubo un error al<p> registrar el ingreso.";
                        new Error(JInternalFrame, true).setVisible(true);

                    }

                } else {

                    mensajeER = "<html><center>Hubo un error al<p> registrar la reserva.";
                    new Error(JInternalFrame, true).setVisible(true);

                }
            }
        }

//********************************************************************************************************************************************
        if (e.getSource() == frmResv.btnChequear) {
            resBtnCK();

            modResv.setNumdoc(frmResv.txtDocResp.getText());
            modResv.setNombre(frmResv.txtNombreResp.getText());
            modResv.setApellido(frmResv.txtApellidoResp.getText());
            modResv.setTel(frmResv.txtTelefono.getText());
            modResv.setNumHabit(frmResv.txtHabitacion.getText());
            modResv.setLlegada(rec.convertirFecha(frmResv.dcFecLlega));
            modResv.setSalida(rec.convertirFecha(frmResv.dcFecSale));
            modResv.setNumAcomp(frmResv.cbxNumAcomp.getSelectedItem().toString());
            modResv.setFormPag(frmResv.cbxFormaPago.getSelectedItem().toString());
            modResv.setResvPor(frmResv.cbxresPor.getSelectedItem().toString());
            modResv.setTotal(Integer.parseInt(frmResv.txtValorPagar.getText()));
            modResv.setPendiente(frmResv.cbxResvPendiente.getSelectedItem().toString());
            modResv.setRegistra(frmResv.lblNomUser.getText());
            modResv.setResta(Integer.parseInt(frmResv.txtValorResta.getText()));
            modResv.setId(Integer.parseInt(frmResv.txtID.getText()));

            if (frmResv.txtValorResta.equals("0")) {
                modResv.setTipoPago("TOTAL");
            } else {
                modResv.setTipoPago("PARCIAL");
            }
            tipPag = modResv.getTipoPago();
            String docRespResv = modResv.getNumdoc();
            String nHa = modResv.getNumHabit();
            String nAc = modResv.getNumAcomp();
            int valor = modResv.getTotal();
            int resta = modResv.getResta();
            String por = modResv.getResvPor();
            String llega = modResv.getLlegada();
            String sale = modResv.getSalida();
            String dias = String.valueOf(calcularDias(frmResv.dcFecLlega, frmResv.dcFecSale));
            String val = String.valueOf(valor);
            String rest = String.valueOf(resta);

            if (frmResv.txtDocResp.getText().equals("") || frmResv.txtNombreResp.getText().equals("") || frmResv.txtApellidoResp.getText().equals("") || frmResv.txtTelefono.getText().equals("")
                    || frmResv.txtHabitacion.getText().equals("") || frmResv.cbxNumAcomp.getSelectedIndex() == 0 || frmResv.cbxFormaPago.getSelectedIndex() == 0 || frmResv.cbxresPor.getSelectedIndex() == 0
                    || frmResv.txtValorPagar.getText().equals("0") || frmResv.dcFecLlega.getDate() == null || frmResv.dcFecSale.getDate() == null) {

                mensajeER = "<html><center>Todos los campos deben tener<p>la informacion requerida para registrar<p> la reserva, por favor verifique.";
                new Error(JInternalFrame, true).setVisible(true);

            } else if (consResv.checarReserva(modResv)) {

                mensajeExit = "<html><center>La reserva se ha<p> Checado con exito.";
                new Exito(JInternalFrame, true).setVisible(true);

                limpiarResv();

                checkin_J modChki = new checkin_J();
                consCheckIn_J consChki = new consCheckIn_J();
                FrmCheckin_J frmChki = new FrmCheckin_J();
                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
                frmChki.setVisible(true);

                frmChki.txtHabitacionNum.setVisible(true);
                frmChki.txtNumDocResp.setText(docRespResv);
                RSScaleLabel.setScaleLabel(frmChki.lblImgOkNoRESP, "src/img/recarga.png");
                frmChki.cbxNumAcomp.setSelectedItem(nAc);
                frmChki.txtHabitacionNum.setText(nHa);

                Date f1 = frmResv.setearFechas(llega);
                frmChki.dcFecEntra.setDate(f1);
                Date f2 = frmResv.setearFechas(sale);
                frmChki.dcFecSale.setDate(f2);
                frmChki.lblNumDias.setText(dias);
                frmChki.btnVerNumDias.setVisible(false);
                frmChki.cbxReservoPor.setSelectedItem(por);
                frmChki.txtValorPagar.setText(val);
                frmChki.txtValorResta.setText(rest);
                frmChki.btnGuarChecResrv.setVisible(true);
                frmChki.btnGuarCheckin.setVisible(false);
                frmChki.btnGuarChkProv.setVisible(false);
                frmResv.dispose();

            } else {

                mensajeER = "<html><center>Hubo un error al<p> Checar la reserva.";
                new Error(JInternalFrame, true).setVisible(true);

            }
        }

//********************************************************************************************************************************************
        if (e.getSource() == frmResv.btnEliminarResv) {
            resBtnE();

            if (frmResv.txtID.getText().isEmpty()) {

                mensajeER = "<html><center>No hay datos para eliminar, <p> verifique e intente de nuevo.";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                mensajeALDEL = "<html><center>Esta seguro que<p> desea eliminar el registro?";
                new AlertaDelete(JInternalFrame, true).setVisible(true);

            }

            if (res.equals("si")) {

                modResv.setId(Integer.parseInt(frmResv.txtID.getText()));
                String nh = frmResv.txtHabitacion.getText();
                int n = Integer.parseInt(nh);
                int id = modResv.getId();

                if (consResv.eliminarReserva(modResv)) {

                    modResv.setFecResv(frmResv.lblFecAct.getText());
                    modResv.setTotal(Integer.parseInt(frmResv.txtValorPagar.getText()));
                    modResv.setRegistra(frmResv.lblNomUser.getText());

                    if (consResv.guardarSalida(modResv, "RESV.CANCELADA")) {

                        mensajeExit = "<html><center>La reserva se ha<p> eliminado con exito.";
                        new Exito(JInternalFrame, true).setVisible(true);
                        consResv.listarReservas();
                        limpiarResv();

                        if (consResv.cambiarEstadHabResrv(nh, "DISPONIBLE", id, n) != true) {

                            mensajeER = "<html><center>Hubo un error al actualizar <p>el estado de la habitacion.";
                            new Error(JInternalFrame, true).setVisible(true);

                        }
                    } else {

                        mensajeER = "<html><center>Hubo un error al<p> registrar la salida de dinero.";
                        new Error(JInternalFrame, true).setVisible(true);

                    }

                } else {

                    mensajeER = "<html><center>Hubo un error al<p> eliminar la reserva.";
                    new Error(JInternalFrame, true).setVisible(true);
                    limpiarResv();
                }

            }

        }

//********************************************************************************************************************************************
        if (e.getSource() == frmResv.btnRegResp) {

            modResv.setNumdoc(frmResv.txtDocResp.getText());
            modResv.setRegistra(frmResv.lblNomUser.getText());
            String docRe = modResv.getNumdoc();
            String nomReg = modResv.getRegistra();

            cliente_J modCli = new cliente_J();
            consCliente_J consCli = new consCliente_J();
            FrmAClientes_J frmCli = new FrmAClientes_J(JInternalFrame, true);
            ctrlCliente_J ctrCli = new ctrlCliente_J(modCli, consCli, frmCli);

            frmCli.txtNumDocHuesp.setText(docRe);
            frmCli.txtRegistra.setText(nomReg);
            frmCli.btnActualHuesp.setVisible(false);
            frmCli.btnElimHusped.setVisible(false);
            frmCli.setVisible(true);

            RSScaleLabel.setScaleLabel(frmResv.lblImgOkNoRESP, "src/img/recarga.png");
            frmResv.lblValidRESP.setText("");
            frmResv.btnRegResp.setVisible(false);
        }

//********************************************************************************************************************************************
        if (e.getSource() == frmResv.lblImgOkNoRESP) {

            modResv.setNumdoc(frmResv.txtDocResp.getText());

            if (consResv.BuscaCliNuevo(modResv)) {

                frmResv.txtNombreResp.setText(modResv.getNombre());
                frmResv.txtApellidoResp.setText(modResv.getApellido());
                frmResv.txtTelefono.setText(modResv.getTel());
                frmResv.lblImgOkNoRESP.setIcon(null);

            }
        }

//********************************************************************************************************************************************
        if (e.getSource() == frmResv.btnLimpiarResv1) {

            limpiarResv();
            consResv.listarReservas();
        }

    }
//********************************************************RESTAURAR COLOR BTN'S*****************************************************************************

    void resBtnG() {

        frmResv.btnGuardarReserv.setBackground(new Color(4, 153, 193));
        frmResv.btnGuardarReserv.setForeground(new Color(255, 255, 255));

    }
//*************************************************************************************************************************************

    void resBtnL1() {

        frmResv.btnLimpiarResv1.setBackground(new Color(4, 153, 193));
        frmResv.btnLimpiarResv1.setForeground(new Color(255, 255, 255));

    }

//*************************************************************************************************************************************
    void resBtnE() {

        frmResv.btnEliminarResv.setBackground(new Color(4, 153, 193));
        frmResv.btnEliminarResv.setForeground(new Color(255, 255, 255));

    }

//*************************************************************************************************************************************
    void resBtnCK() {

        frmResv.btnChequear.setBackground(new Color(4, 153, 193));
        frmResv.btnChequear.setForeground(new Color(255, 255, 255));

    }
    //*************************************************************************************************************************************

    public void limpiarResv() {

        frmResv.txtDocResp.setText("");
        frmResv.txtNombreResp.setText("");
        frmResv.txtApellidoResp.setText("");
        frmResv.txtTelefono.setText("");
        frmResv.cbxHabitDisponible.setVisible(true);
        frmResv.cbxHabitDisponible.setSelectedIndex(0);
        frmResv.dcFecLlega.setDate(null);
        frmResv.dcFecSale.setDate(null);
        frmResv.cbxNumAcomp.setSelectedIndex(0);
        frmResv.cbxFormaPago.setSelectedIndex(0);
        frmResv.cbxresPor.setSelectedIndex(0);
        frmResv.txtValorPagar.setText("0");
        frmResv.cbxResvPendiente.setSelectedIndex(0);
        frmResv.txtDocResp.requestFocus();
        frmResv.txtID.setText("");
        frmResv.lblValidRESP.setText("");
        frmResv.lblFRg.setText("");
        frmResv.lblTipo.setText("");
        frmResv.lblRegUser.setText("");
        frmResv.lblImgOkNoRESP.setIcon(null);
        frmResv.btnRegResp.setVisible(false);
        frmResv.btnGrupPagoes.clearSelection();
        frmResv.txtHabitacion.setText("");
        frmResv.txtValorAbono.setText("");
        frmResv.txtValorResta.setText("");
        frmResv.txtHabitacion.setVisible(false);
        actvBtnGuarda();

    }

//**************************************************************************************************************************
    public void actvBtnGuarda() {

        frmResv.btnGuardarReserv.setVisible(true);
        frmResv.btnEliminarResv.setVisible(false);
    }

//**************************************************************************************************************************
    public void actvBtnElimAct() {

        frmResv.btnGuardarReserv.setVisible(false);
        frmResv.btnEliminarResv.setVisible(true);
    }


//***************************************************************************************************************************

    public int calcularDias(JDateChooser Llega, JDateChooser Sale) {

        if (frmResv.dcFecLlega.getDate() == null || frmResv.dcFecSale.getDate() == null) {
            System.out.println("los campos estan vacios");
            return 0;

        } else {

            Calendar in = Llega.getCalendar();
            Calendar out = Sale.getCalendar();
            int day = -1;

            while (in.before(out) || in.equals(out)) {

                day++;
                in.add(Calendar.DATE, 1);
            }
            return dias = day;
        }

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

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
