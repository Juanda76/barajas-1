package controlador;

// @author Software_Max(JDV)
import alertas.Error;
import alertas.Exito;
import clases.consultas_generales;
import clases.recursividad;
import consultas.consCheckIn_J;
import consultas.consCliente_J;
import consultas.consEstadoHabit_J;
import consultas.consPagPend_J;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.checkin_J;
import modelo.cliente_J;
import modelo.pagosPend_J;
import rsscalelabel.RSScaleLabel;
import vistas.FrmCheckin_J;
import vistas.FrmMenuAdmin_J;
import vistas.FrmPagosPend_J;
import vistas.FrmAClientes_J;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;

public class ctrlCheckin_J implements MouseListener, KeyListener {

    public static int respId;
    public static int llamadoDe1;
    public static String resTours;
    public static String vieneDe;
    Frame JInternalFrame;
    FrmMenuAdmin_J frmAdm = new FrmMenuAdmin_J();
    consEstadoHabit_J consEstHab = new consEstadoHabit_J();
    consultas_generales consGen = new consultas_generales();
    recursividad rec = new recursividad();

    private final checkin_J modChki;
    private final consCheckIn_J consChki;
    private final FrmCheckin_J frmChki;
     String debe;

    public ctrlCheckin_J(checkin_J modChki, consCheckIn_J consChki, FrmCheckin_J frmChki) {

        this.modChki = modChki;
        this.consChki = consChki;
        this.frmChki = frmChki;

        frmChki.btnGuarCheckin.addMouseListener(this);
        frmChki.btnGuarChecResrv.addMouseListener(this);
        frmChki.btnGuarChkProv.addMouseListener(this);
        frmChki.btnLimpiarIngreso.addMouseListener(this);
        frmChki.btnRegResp.addMouseListener(this);
        frmChki.btnRegAc1.addMouseListener(this);
        frmChki.btnRegAc2.addMouseListener(this);
        frmChki.btnRegAc3.addMouseListener(this);
        frmChki.btnRegAc4.addMouseListener(this);
        frmChki.lblImgOkNoRESP.addMouseListener(this);
        frmChki.lblImgOkNo1.addMouseListener(this);
        frmChki.lblImgOkNo2.addMouseListener(this);
        frmChki.lblImgOkNo3.addMouseListener(this);
        frmChki.lblImgOkNo4.addMouseListener(this);

    }

//**************************************************METODOS ABSTRACTOS DE MOUSE ****************************************************************
    
    
    @Override
    public void mouseClicked(MouseEvent e) {

 //*************************************************************** BTN GUARDAR CHKIN NORMAL ******************************************************
        
        if (e.getSource() == frmChki.btnGuarCheckin) {
            vieneDe = "btnChek";
            restBtnG();

            if (frmChki.txtHabitacionNum.getText().isEmpty() || frmChki.dcFecSale.getDate() == null || frmChki.dcFecEntra.getDate() == null
                    || frmChki.cbxReservoPor.getSelectedItem().equals("Seleccione") || frmChki.txtValorPagar.getText().equals("0")|| frmChki.txtValorResta.getText().equals("") ||
                    frmChki.cbxNumAcomp.getSelectedItem().equals("Seleccione")|| frmChki.txtVieneDe.getText().isEmpty()||frmChki.txtVaPara.getText().isEmpty()) {

                mensajeER = "<html><center>Todos los campos deben<p> tener informacion, verifique <p>e intente de nuevo.";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                modChki.setNumHabit(frmChki.txtHabitacionNum.getText());
                modChki.setFecEntra(rec.convertirFecha(frmChki.dcFecEntra));
                modChki.setFecSale(rec.convertirFecha(frmChki.dcFecSale));
                modChki.setTiemEstadia(frmChki.lblNumDias.getText());
                modChki.setDocResp(frmChki.txtNumDocResp.getText());
                modChki.setNomResp(frmChki.lblNomResponsable.getText());
                modChki.setReservPor(frmChki.cbxReservoPor.getSelectedItem().toString());
                 if(frmChki.txtValorResta.getText().equals("0")){
                modChki.setValor(Integer.parseInt(frmChki.txtValorPagar.getText()));
                    
                }else{
                    modChki.setValor(Integer.parseInt(frmChki.txtValorResta.getText()));   
                }

                if (frmChki.rbtDesaySi.isSelected()) {
                    modChki.setDesayuno("SI");
                } else {
                    modChki.setDesayuno("NO");
                }

                if (frmChki.rbtToursSi.isSelected()) {
                    modChki.setTours("SI");
                } else {
                    modChki.setTours("NO");
                }

                modChki.setNumAcomp(frmChki.cbxNumAcomp.getSelectedItem().toString());
                modChki.setDocAcomp1(frmChki.txtAcom1.getText());
                modChki.setNomAcomp1(frmChki.lblNomAcom1.getText());
                modChki.setDocAcomp2(frmChki.txtAcom2.getText());
                modChki.setNomAcomp2(frmChki.lblNomAcom2.getText());
                modChki.setDocAcomp3(frmChki.txtAcom3.getText());
                modChki.setNomAcomp3(frmChki.lblNomAcom3.getText());
                modChki.setDocAcomp4(frmChki.txtAcom4.getText());
                modChki.setNomAcomp4(frmChki.lblNomAcom4.getText());
                modChki.setRegistra(frmChki.lblNomUser.getText());
                modChki.setViene(frmChki.txtVieneDe.getText());
                modChki.setVa(frmChki.txtVaPara.getText());

            }

            resTours = modChki.getTours();
            String nomRes = modChki.getNomResp();
            String docRes = modChki.getDocResp();
            int n = Integer.parseInt(modChki.getNumHabit());
            String est = "OCUPADO";
            String val = String.valueOf(modChki.getValor());

            if (consChki.guardarCheckin(modChki)) {

                limpiarChki();
                mensajeExit = "<html><center>El CheckIn se ha<p> guardado con exito.";
                new Exito(JInternalFrame, true).setVisible(true);

                respId = consChki.buscaChekinNuevo();

                if (consChki.cambEstHabChk(est, respId, n) != true) {

                    mensajeER = "<html><center>Hubo un error al registrar la habitacion<p> porfavor intente de nuevo.";
                    new Error(JInternalFrame, true).setVisible(true);

                } else {

                    pagosPend_J modPagPen = new pagosPend_J();
                    consPagPend_J consPagPen = new consPagPend_J();
                    FrmPagosPend_J frmPagPen = new FrmPagosPend_J();
                    ctrlPagosPend_J ctrlPagPen = new ctrlPagosPend_J(modPagPen, consPagPen, frmPagPen);
                    frmPagPen.setVisible(true);

                    frmPagPen.txtDocResp.setText(docRes);
                    frmPagPen.txtValorPago.setText(val);
                    frmPagPen.txtNomResp.setText(nomRes);
                    frmPagPen.cbxPago.removeItem("SALDAR");
                    frmPagPen.cbxPago.setSelectedItem("Seleccione");

                    frmChki.dispose();
                }
            } else {

                mensajeER = "<html><center>Hubo un error al<p> guardar el CheckIn.";
                new Error(JInternalFrame, true).setVisible(true);
                limpiarChki();
            }

        }
       
 //*************************************************************** BTN GUARDAR CHKIN RESERVA ******************************************************


        if (e.getSource() == frmChki.btnGuarChecResrv) {
            vieneDe = "btnChkResv";
            restBtnGRCK();

            if (frmChki.txtHabitacionNum.getText().isEmpty() || frmChki.dcFecSale.getDate() == null || frmChki.dcFecEntra.getDate() == null
                    || frmChki.cbxReservoPor.getSelectedItem().equals("Seleccione") || frmChki.txtValorPagar.getText().equals("0") || frmChki.txtValorResta.getText().equals("")||
                    frmChki.cbxNumAcomp.getSelectedItem().equals("Seleccione")|| frmChki.txtVieneDe.getText().isEmpty()||frmChki.txtVaPara.getText().isEmpty()) {

                mensajeER = "<html><center>Todos los campos deben<p> tener informacion, verifique <p>e intente de nuevo.";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                modChki.setNumHabit(frmChki.txtHabitacionNum.getText());
                modChki.setFecEntra(rec.convertirFecha(frmChki.dcFecEntra));
                modChki.setFecSale(rec.convertirFecha(frmChki.dcFecSale));
                modChki.setTiemEstadia(frmChki.lblNumDias.getText());
                modChki.setDocResp(frmChki.txtNumDocResp.getText());
                modChki.setNomResp(frmChki.lblNomResponsable.getText());
                modChki.setReservPor(frmChki.cbxReservoPor.getSelectedItem().toString());
                
                if(frmChki.txtValorResta.getText().equals("0")){
                modChki.setValor(Integer.parseInt(frmChki.txtValorPagar.getText()));
                    
                }else{
                    modChki.setValor(Integer.parseInt(frmChki.txtValorResta.getText()));   
                }

                if (frmChki.rbtDesaySi.isSelected()) {
                    modChki.setDesayuno("SI");
                } else {
                    modChki.setDesayuno("NO");
                }

                if (frmChki.rbtToursSi.isSelected()) {
                    modChki.setTours("SI");
                } else {
                    modChki.setTours("NO");
                }

                modChki.setNumAcomp(frmChki.cbxNumAcomp.getSelectedItem().toString());
                modChki.setDocAcomp1(frmChki.txtAcom1.getText());
                modChki.setNomAcomp1(frmChki.lblNomAcom1.getText());
                modChki.setDocAcomp2(frmChki.txtAcom2.getText());
                modChki.setNomAcomp2(frmChki.lblNomAcom2.getText());
                modChki.setDocAcomp3(frmChki.txtAcom3.getText());
                modChki.setNomAcomp3(frmChki.lblNomAcom3.getText());
                modChki.setDocAcomp4(frmChki.txtAcom4.getText());
                modChki.setNomAcomp4(frmChki.lblNomAcom4.getText());
                modChki.setRegistra(frmChki.lblNomUser.getText());
                modChki.setViene(frmChki.txtVieneDe.getText());
                modChki.setVa(frmChki.txtVaPara.getText());

            }

            resTours = modChki.getTours();
            String nomRes = modChki.getNomResp();
            String docRes = modChki.getDocResp();
            int n = Integer.parseInt(modChki.getNumHabit());
            String est = "OCUPADO";
            String val = String.valueOf(modChki.getValor());

            if (consChki.guardarCheckin(modChki)) {

                limpiarChki();
                mensajeExit = "<html><center>El CheckIn se ha<p> guardado con exito ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);

                respId = consChki.buscaChekinNuevo();

                if (consChki.cambEstHabChk( est, respId, n) != true) {

                    mensajeER = "<html><center>Hubo un error al registrar la habitacion<p> porfavor intente de nuevo.";
                    new Error(JInternalFrame, true).setVisible(true);

                } else {

                    pagosPend_J modPagPen = new pagosPend_J();
                    consPagPend_J consPagPen = new consPagPend_J();
                    FrmPagosPend_J frmPagPen = new FrmPagosPend_J();
                    ctrlPagosPend_J ctrlPagPen = new ctrlPagosPend_J(modPagPen, consPagPen, frmPagPen);
                    frmPagPen.setVisible(true);

                    frmPagPen.txtDocResp.setText(docRes);
                    frmPagPen.txtValorPago.setText(val);
                    frmPagPen.txtNomResp.setText(nomRes);
                    frmPagPen.cbxPago.removeItem("SALDAR");
                    frmPagPen.cbxPago.setSelectedItem("Seleccione");

                    frmChki.dispose();
                }
            } else {

                mensajeER = "<html><center>Hubo un error al<p> guardar el CheckIn.";
                new Error(JInternalFrame, true).setVisible(true);
                limpiarChki();
            }

        }


        
 //*************************************************************** BTN GUARDAR CHKIN PROVICIONAL ******************************************************
 
 
        if (e.getSource() == frmChki.btnGuarChkProv) {
            vieneDe = "btnChkProv";
            restBtnGCPV();

            if (frmChki.txtHabitacionNum.getText().isEmpty() || frmChki.dcFecSale.getDate() == null || frmChki.dcFecEntra.getDate() == null
                    || frmChki.cbxReservoPor.getSelectedItem().equals("Seleccione") || frmChki.txtValorPagar.getText().equals("0") || frmChki.txtValorResta.getText().equals("")||
                    frmChki.cbxNumAcomp.getSelectedItem().equals("Seleccione")|| frmChki.txtVieneDe.getText().isEmpty()||frmChki.txtVaPara.getText().isEmpty()) {

                mensajeER = "<html><center>Todos los campos deben<p> tener informacion, verifique <p>e intente de nuevo.";
                new Error(JInternalFrame, true).setVisible(true);

            } else {

                modChki.setNumHabit(frmChki.txtHabitacionNum.getText());
                modChki.setFecEntra(rec.convertirFecha(frmChki.dcFecEntra));
                modChki.setFecSale(rec.convertirFecha(frmChki.dcFecSale));
                modChki.setTiemEstadia(frmChki.lblNumDias.getText());
                modChki.setDocResp(frmChki.txtNumDocResp.getText());
                modChki.setNomResp(frmChki.lblNomResponsable.getText());
                modChki.setReservPor(frmChki.cbxReservoPor.getSelectedItem().toString());
                
                if(frmChki.txtValorResta.getText().equals("0")){
                modChki.setValor(Integer.parseInt(frmChki.txtValorPagar.getText()));
                    
                }else{
                    modChki.setValor(Integer.parseInt(frmChki.txtValorResta.getText()));   
                }

                if (frmChki.rbtDesaySi.isSelected()) {
                    modChki.setDesayuno("SI");
                } else {
                    modChki.setDesayuno("NO");
                }

                if (frmChki.rbtToursSi.isSelected()) {
                    modChki.setTours("SI");
                } else {
                    modChki.setTours("NO");
                }

                modChki.setNumAcomp(frmChki.cbxNumAcomp.getSelectedItem().toString());
                modChki.setDocAcomp1(frmChki.txtAcom1.getText());
                modChki.setNomAcomp1(frmChki.lblNomAcom1.getText());
                modChki.setDocAcomp2(frmChki.txtAcom2.getText());
                modChki.setNomAcomp2(frmChki.lblNomAcom2.getText());
                modChki.setDocAcomp3(frmChki.txtAcom3.getText());
                modChki.setNomAcomp3(frmChki.lblNomAcom3.getText());
                modChki.setDocAcomp4(frmChki.txtAcom4.getText());
                modChki.setNomAcomp4(frmChki.lblNomAcom4.getText());
                modChki.setRegistra(frmChki.lblNomUser.getText());
                modChki.setViene(frmChki.txtVieneDe.getText());
                modChki.setVa(frmChki.txtVaPara.getText());

            }

            resTours = modChki.getTours();
            String nomRes = modChki.getNomResp();
            String docRes = modChki.getDocResp();
            int n = Integer.parseInt(modChki.getNumHabit());
            String est = "OCUPADO";
            String val = String.valueOf(modChki.getValor());

            if (consChki.guardarCheckin(modChki)) {

                limpiarChki();
                mensajeExit = "<html><center>El CheckIn se ha<p> guardado con exito ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);

                respId = consChki.buscaChekinNuevo();

                if (consChki.cambEstHabResvDisp( est, respId, n) != true) {

                    mensajeER = "<html><center>Hubo un error al registrar la habitacion<p> porfavor intente de nuevo.";
                    new Error(JInternalFrame, true).setVisible(true);

                } else {

                    pagosPend_J modPagPen = new pagosPend_J();
                    consPagPend_J consPagPen = new consPagPend_J();
                    FrmPagosPend_J frmPagPen = new FrmPagosPend_J();
                    ctrlPagosPend_J ctrlPagPen = new ctrlPagosPend_J(modPagPen, consPagPen, frmPagPen);
                    frmPagPen.setVisible(true);

                    frmPagPen.txtDocResp.setText(docRes);
                    frmPagPen.txtValorPago.setText(val);
                    frmPagPen.txtNomResp.setText(nomRes);
                    frmPagPen.cbxPago.removeItem("SALDAR");
                    frmPagPen.cbxPago.setSelectedItem("Seleccione");

                    frmChki.dispose();
                }
            } else {

                mensajeER = "<html><center>Hubo un error al<p> guardar el CheckIn.";
                new Error(JInternalFrame, true).setVisible(true);
                limpiarChki();
            }

        }



//----------------------------------------------------------------------------------------------------------------------------------------------
        if (e.getSource() == frmChki.btnRegResp) {

            modChki.setDocResp(frmChki.txtNumDocResp.getText());
            modChki.setRegistra(frmChki.lblNomUser.getText());
            String docRe = modChki.getDocResp();
            String nomReg = modChki.getRegistra();

            cliente_J modCli = new cliente_J();
            consCliente_J consCli = new consCliente_J();
            FrmAClientes_J frmCli = new FrmAClientes_J(JInternalFrame, true);
            ctrlCliente_J ctrCli = new ctrlCliente_J(modCli, consCli, frmCli);

            frmCli.txtNumDocHuesp.setText(docRe);
            frmCli.txtRegistra.setText(nomReg);
            frmCli.btnActualHuesp.setVisible(false);
            frmCli.btnElimHusped.setVisible(false);
            frmCli.setVisible(true);

            RSScaleLabel.setScaleLabel(frmChki.lblImgOkNoRESP, "src/img/recarga.png");
            frmChki.lblValidRESP.setText("");
            frmChki.btnRegResp.setVisible(false);

        }

//----------------------------------------------------------------------------------------------------------------------------------------------
        if (e.getSource() == frmChki.btnRegAc1) {

            modChki.setDocAcomp1(frmChki.txtAcom1.getText());
            modChki.setRegistra(frmChki.lblNomUser.getText());
            String docRe = modChki.getDocAcomp1();
            String nomReg = modChki.getRegistra();

            cliente_J modCli = new cliente_J();
            consCliente_J consCli = new consCliente_J();
            FrmAClientes_J frmCli = new FrmAClientes_J(JInternalFrame, true);
            ctrlCliente_J ctrCli = new ctrlCliente_J(modCli, consCli, frmCli);
            frmCli.setVisible(true);

            frmCli.txtNumDocHuesp.setText(docRe);
            frmCli.txtRegistra.setText(nomReg);
            frmCli.btnActualHuesp.setVisible(false);
            frmCli.btnElimHusped.setVisible(false);
            RSScaleLabel.setScaleLabel(frmChki.lblImgOkNo1, "src/img/recarga.png");
            frmChki.lblValidacion1.setText("");
            frmChki.btnRegAc1.setVisible(false);

        }

//----------------------------------------------------------------------------------------------------------------------------------------------
        if (e.getSource() == frmChki.btnRegAc2) {

            modChki.setDocAcomp2(frmChki.txtAcom2.getText());
            modChki.setRegistra(frmChki.lblNomUser.getText());
            String docRe = modChki.getDocAcomp2();
            String nomReg = modChki.getRegistra();

            cliente_J modCli = new cliente_J();
            consCliente_J consCli = new consCliente_J();
            FrmAClientes_J frmCli = new FrmAClientes_J(JInternalFrame, true);
            ctrlCliente_J ctrCli = new ctrlCliente_J(modCli, consCli, frmCli);
            frmCli.setVisible(true);

            frmCli.txtNumDocHuesp.setText(docRe);
            frmCli.txtRegistra.setText(nomReg);
            frmCli.btnActualHuesp.setVisible(false);
            frmCli.btnElimHusped.setVisible(false);
            RSScaleLabel.setScaleLabel(frmChki.lblImgOkNo2, "src/img/recarga.png");
            frmChki.lblValidacion2.setText("");
            frmChki.btnRegAc2.setVisible(false);

        }

//----------------------------------------------------------------------------------------------------------------------------------------------
        if (e.getSource() == frmChki.btnRegAc3) {

            modChki.setDocAcomp3(frmChki.txtAcom3.getText());
            modChki.setRegistra(frmChki.lblNomUser.getText());
            String docRe = modChki.getDocAcomp3();
            String nomReg = modChki.getRegistra();

            cliente_J modCli = new cliente_J();
            consCliente_J consCli = new consCliente_J();
            FrmAClientes_J frmCli = new FrmAClientes_J(JInternalFrame, true);
            ctrlCliente_J ctrCli = new ctrlCliente_J(modCli, consCli, frmCli);
            frmCli.setVisible(true);

            frmCli.txtNumDocHuesp.setText(docRe);
            frmCli.txtRegistra.setText(nomReg);
            frmCli.btnActualHuesp.setVisible(false);
            frmCli.btnElimHusped.setVisible(false);
            RSScaleLabel.setScaleLabel(frmChki.lblImgOkNo3, "src/img/recarga.png");
            frmChki.lblValidacion3.setText("");
            frmChki.btnRegAc3.setVisible(false);

        }

//----------------------------------------------------------------------------------------------------------------------------------------------
        if (e.getSource() == frmChki.btnRegAc4) {

            modChki.setDocAcomp4(frmChki.txtAcom4.getText());
            modChki.setRegistra(frmChki.lblNomUser.getText());
            String docRe = modChki.getDocAcomp4();
            String nomReg = modChki.getRegistra();

            cliente_J modCli = new cliente_J();
            consCliente_J consCli = new consCliente_J();
            FrmAClientes_J frmCli = new FrmAClientes_J(JInternalFrame, true);
            ctrlCliente_J ctrCli = new ctrlCliente_J(modCli, consCli, frmCli);
            frmCli.setVisible(true);

            frmCli.txtNumDocHuesp.setText(docRe);
            frmCli.txtRegistra.setText(nomReg);
            frmCli.btnActualHuesp.setVisible(false);
            frmCli.btnElimHusped.setVisible(false);
            RSScaleLabel.setScaleLabel(frmChki.lblImgOkNo4, "src/img/recarga.png");
            frmChki.lblValidacion4.setText("");
            frmChki.btnRegAc4.setVisible(false);

        }

//----------------------------------------------------------------------------------------------------------------------------------------------
        if (e.getSource() == frmChki.lblImgOkNoRESP) {

            modChki.setDocResp(frmChki.txtNumDocResp.getText());

            if (consChki.BuscaCliNuevo(modChki)) {

                frmChki.lblNomResponsable.setText(modChki.getNomResp());
                frmChki.lblImgOkNoRESP.setIcon(null);

            }
        }

        if (e.getSource() == frmChki.lblImgOkNo1) {

            modChki.setDocResp(frmChki.txtAcom1.getText());

            if (consChki.BuscaCliNuevo(modChki)) {

                frmChki.lblNomAcom1.setText(modChki.getNomResp());
                frmChki.lblImgOkNo1.setIcon(null);

            }
        }

        if (e.getSource() == frmChki.lblImgOkNo2) {

            modChki.setDocResp(frmChki.txtAcom2.getText());

            if (consChki.BuscaCliNuevo(modChki)) {

                frmChki.lblNomAcom2.setText(modChki.getNomResp());
                frmChki.lblImgOkNo2.setIcon(null);

            }
        }

        if (e.getSource() == frmChki.lblImgOkNo3) {

            modChki.setDocResp(frmChki.txtAcom3.getText());

            if (consChki.BuscaCliNuevo(modChki)) {

                frmChki.lblNomAcom3.setText(modChki.getNomResp());
                frmChki.lblImgOkNo3.setIcon(null);

            }
        }

        if (e.getSource() == frmChki.lblImgOkNo4) {

            modChki.setDocResp(frmChki.txtAcom4.getText());

            if (consChki.BuscaCliNuevo(modChki)) {

                frmChki.lblNomAcom4.setText(modChki.getNomResp());
                frmChki.lblImgOkNo4.setIcon(null);

            }
        }
//---------------------------------------------------------------------------------------------------------------------------------------------
        if (e.getSource() == frmChki.btnLimpiarIngreso) {

            restBtnL();
            limpiarChki();
        }
    }

//************************************************** RESTAURAR COLOR BOTONES *******************************************************************
    public void restBtnG() {

        frmChki.btnGuarCheckin.setBackground(new Color(4, 153, 193));
        frmChki.btnGuarCheckin.setForeground(Color.WHITE);

    }
    public void restBtnGRCK() {

        frmChki.btnGuarChecResrv.setBackground(new Color(4, 153, 193));
        frmChki.btnGuarChecResrv.setForeground(Color.WHITE);

    }
    public void restBtnGCPV() {

        frmChki.btnGuarChkProv.setBackground(new Color(4, 153, 193));
        frmChki.btnGuarChkProv.setForeground(Color.WHITE);

    }

    public void restBtnL() {

        frmChki.btnLimpiarIngreso.setBackground(new Color(4, 153, 193));
        frmChki.btnLimpiarIngreso.setForeground(Color.WHITE);

    }



//**************************************************LIMPIAR CHECKIN*****************************************************************************
    public void limpiarChki() {

        frmChki.dcFecSale.setDate(null);
        frmChki.txtNumDocResp.setText("");
        frmChki.lblNumDias.setText("");
        frmChki.lblNomResponsable.setText("");
        frmChki.cbxReservoPor.setSelectedIndex(0);
        frmChki.txtValorPagar.setText("0");
        frmChki.btnGrupDesayuno.clearSelection();
        frmChki.btnGrupTours.clearSelection();
        frmChki.cbxNumAcomp.setSelectedIndex(0);
        frmChki.txtVieneDe.setText("");
        frmChki.txtVaPara.setText("");
        frmChki.txtAcom1.setText("");
        frmChki.lblNomAcom1.setText("");
        frmChki.txtAcom2.setText("");
        frmChki.lblNomAcom2.setText("");
        frmChki.txtAcom3.setText("");
        frmChki.lblNomAcom3.setText("");
        frmChki.txtAcom4.setText("");
        frmChki.lblNomAcom4.setText("");
        frmChki.lblImgOkNoRESP.setIcon(null);
        frmChki.lblValidRESP.setText("");
        frmChki.lblImgOkNo1.setIcon(null);
        frmChki.lblValidacion1.setText("");
        frmChki.lblImgOkNo2.setIcon(null);
        frmChki.lblValidacion2.setText("");
        frmChki.lblImgOkNo3.setIcon(null);
        frmChki.lblValidacion3.setText("");
        frmChki.lblImgOkNo4.setIcon(null);
        frmChki.lblValidacion4.setText("");
        frmChki.btnVerNumDias.setVisible(true);

    }
//************************************************************************************************************************************

    @Override
    public void mousePressed(MouseEvent e) {

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void mouseReleased(MouseEvent e) {

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void mouseEntered(MouseEvent e) {

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void mouseExited(MouseEvent e) {

    }
//***********************************************************************************************************************************
//**************************************************METODOS ABSTRACTOS DE KEY *******************************************************

    @Override
    public void keyTyped(KeyEvent e) {

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void keyPressed(KeyEvent e) {

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void keyReleased(KeyEvent e) {

    }

}
