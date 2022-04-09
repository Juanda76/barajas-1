package controlador;

// @author Software_Max(JDV)
import alertas.Inf;
import alertas.InfChekSiNo;
import static alertas.InfChekSiNo.resCheck;
import consultas.consCheckIn_J;
import consultas.consEstadoHabit_J;
import consultas.consReservas_J;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.checkin_J;
import modelo.estadoHab;
import modelo.reservas_J;
import vistas.FrmAInfoHabit_J;
import vistas.FrmCheckin_J;
import vistas.FrmEstadoHabit_J;
import vistas.FrmReservas_J;
import static vistas.FrmReservas_J.mensajeINF;

public class ctrlEstadoHabit_J implements MouseListener, KeyListener {

    Frame JInternalFrame;
    private final consEstadoHabit_J consEstHab;
    private final FrmEstadoHabit_J frmEstHab;
    private final estadoHab modEsthab;
    public static String numHab, estadHab, tomadoDe;
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    PreparedStatement ps;
    ResultSet rs;
    String llegada;
    int dt;
    public static int d = 0;
    public static String mensajeINFCheck;
    FrmAInfoHabit_J infHab;

    @SuppressWarnings("LeakingThisInConstructor")
    public ctrlEstadoHabit_J(consEstadoHabit_J consEstHab, FrmEstadoHabit_J frmEstHab, estadoHab modEsthab) {

        this.consEstHab = consEstHab;
        this.frmEstHab = frmEstHab;
        this.modEsthab = modEsthab;

        frmEstHab.btnVerH1.addMouseListener(this);
        frmEstHab.btnVerH2.addMouseListener(this);
        frmEstHab.btnVerH3.addMouseListener(this);
        frmEstHab.btnVerH4.addMouseListener(this);
        frmEstHab.btnVerH5.addMouseListener(this);
        frmEstHab.btnVerH6.addMouseListener(this);
        frmEstHab.btnVerH7.addMouseListener(this);
        frmEstHab.btnVerH8.addMouseListener(this);
        frmEstHab.btnVerH9.addMouseListener(this);
        frmEstHab.btnVerH10.addMouseListener(this);
        frmEstHab.btnVerH11.addMouseListener(this);
        frmEstHab.btnVerH12.addMouseListener(this);

        frmEstHab.btnIrChekinH1.addMouseListener(this);
        frmEstHab.btnIrChekinH2.addMouseListener(this);
        frmEstHab.btnIrChekinH3.addMouseListener(this);
        frmEstHab.btnIrChekinH4.addMouseListener(this);
        frmEstHab.btnIrChekinH5.addMouseListener(this);
        frmEstHab.btnIrChekinH6.addMouseListener(this);
        frmEstHab.btnIrChekinH7.addMouseListener(this);
        frmEstHab.btnIrChekinH8.addMouseListener(this);
        frmEstHab.btnIrChekinH9.addMouseListener(this);
        frmEstHab.btnIrChekinH10.addMouseListener(this);
        frmEstHab.btnIrChekinH11.addMouseListener(this);
        frmEstHab.btnIrChekinH12.addMouseListener(this);
    }
//   -----------   JOptionPane.showMessageDialog(null, estH1);    ------------------------------

    @Override
    @SuppressWarnings("ConvertToStringSwitch")
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == frmEstHab.btnVerH1) {

            String estH1 = validarEstIgual("1");// verificamos que los estados sean igualas y cual es el estado
            JOptionPane.showMessageDialog(null, estH1);
            switch (estH1) {

                case "RESERVA":
                    dt = consEstHab.mostrarDiasParaReserva(estH1, "1", frmEstHab.lblFecAct.getText());
                    if (dt == 0) {
                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
                        new InfChekSiNo(JInternalFrame, true).setVisible(true);

                        if (resCheck.equals("si")) {

                            mensajeINF = "<html><center>Debe seleccionar la habitacion <p><b>1</b><p> en la tabla de reservas";
                            new Inf(JInternalFrame, true).setVisible(true);

                            reservas_J modRes = new reservas_J();
                            consReservas_J consRes = new consReservas_J();
                            FrmReservas_J frmRes = new FrmReservas_J();
                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
                            frmRes.setVisible(true);
                            frmEstHab.dispose();

                        } else if (resCheck.equals("no")) {
                            estadHab = "RESERVA";
                            numHab = "1";
                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
                            bloquearBTN();

                        } else {
                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
                            new Inf(JInternalFrame, true).setVisible(true);
                        }
                    } else if (dt == 1) {
                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
                        new Inf(JInternalFrame, true).setVisible(true);

                    }
                    break;

                case "OCUPADO":
                    estadHab = "OCUPADO";
                    numHab = "1";
                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
                    break;

                default:
                    break;
            }

        }

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
        if (e.getSource() == frmEstHab.btnIrChekinH1) {

            String estH1 = validarEstIgual("1");// verificamos que los estados sean igualas y cual es el estado

            switch (estH1) {

                case "RESERVA":
                    dt = consEstHab.mostrarDiasParaReserva("RESERVA", "1", frmEstHab.lblFecAct.getText());
                    if (dt != 0) {
                        d = dt - 1;
                    }
                    if (dt > 1) {

                        mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
                        new InfChekSiNo(JInternalFrame, true).setVisible(true);

                        if (resCheck.equals("si")) {
                            tomadoDe = "prov";
                            numHab = "1";
                            checkin_J modChki = new checkin_J();
                            consCheckIn_J consChki = new consCheckIn_J();
                            FrmCheckin_J frmChki = new FrmCheckin_J();
                            ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
                            frmChki.btnGuarCheckin.setVisible(false);
                            frmChki.btnGuarChecResrv.setVisible(false);
                            frmChki.btnGuarChkProv.setVisible(true);
                            frmChki.setVisible(true);
                            frmEstHab.dispose();
                        }
                    }
                case "DISPONIBLE":

                    tomadoDe = "norm";
                    numHab = "1";
                    checkin_J modChki = new checkin_J();
                    consCheckIn_J consChki = new consCheckIn_J();
                    FrmCheckin_J frmChki = new FrmCheckin_J();
                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
                    frmChki.btnGuarChecResrv.setVisible(false);
                    frmChki.btnGuarChkProv.setVisible(false);
                    frmChki.btnGuarCheckin.setVisible(true);
                    frmChki.setVisible(true);
                    frmEstHab.dispose();
            }

        }
 if (e.getSource() == frmEstHab.btnIrChekinH2) {
     String r = consEstHab.verEstadoPpal("2");
     JOptionPane.showMessageDialog(null, r);
 }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++    
//        if (e.getSource() == frmEstHab.btnVerH2) {
//
//            String estH2 = consEstHab.verEstadoAuxHabit("2");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "2", frmEstHab.lblFecAct.getText());
//            JOptionPane.showMessageDialog(null, estH2 + " est2 --  dias " + dt);
//
//            switch (estH2) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>2</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "2";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "2";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
//
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        if (e.getSource() == frmEstHab.btnIrChekinH2) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "2", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "2";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//            } else {
//                tomadoDe = "norm";
//                numHab = "2";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//
//        }
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++       
//        if (e.getSource() == frmEstHab.btnVerH3) {
//
//            String estH3 = consEstHab.verEstadoAuxHabit("3");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "3", frmEstHab.lblFecAct.getText());
//            JOptionPane.showMessageDialog(null, estH3 + " est3 --  dias " + dt);
//
//            switch (estH3) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>3</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "3";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "3";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH3) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "3", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "3";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.setVisible(true);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmEstHab.dispose();
//                }
//            } else {
//                tomadoDe = "norm";
//                numHab = "3";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++       
//
//        if (e.getSource() == frmEstHab.btnVerH4) {
//
//            String estH4 = consEstHab.verEstadoAuxHabit("4");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "4", frmEstHab.lblFecAct.getText());
//            JOptionPane.showMessageDialog(null, estH4 + " est4 --  dias " + dt);
//
//            switch (estH4) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>4</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "4";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "4";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH4) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "4", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "4";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//            } else {
//                tomadoDe = "norm";
//                numHab = "4";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//
//        }
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++       
//        if (e.getSource() == frmEstHab.btnVerH5) {
//
//            String estH5 = consEstHab.verEstadoPpalHabit("5");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "5", frmEstHab.lblFecAct.getText());
//
//            switch (estH5) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>5</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "5";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "5";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH5) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "5", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "5";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//            } else {
//                tomadoDe = "norm";
//                numHab = "5";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++       
//
//        if (e.getSource() == frmEstHab.btnVerH6) {
//
//            String estH6 = consEstHab.verEstadoPpalHabit("6");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "6", frmEstHab.lblFecAct.getText());
//
//            switch (estH6) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>6</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "6";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "6";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH6) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "6", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "6";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//            } else {
//                tomadoDe = "norm";
//                numHab = "6";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();;
//            }
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnVerH7) {
//
//            String estH7 = consEstHab.verEstadoPpalHabit("7");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "7", frmEstHab.lblFecAct.getText());
//
//            switch (estH7) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>7</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "7";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "7";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH7) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "7", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "7";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//
//            } else {
//                tomadoDe = "norm";
//                numHab = "7";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnVerH8) {
//
//            String estH8 = consEstHab.verEstadoPpalHabit("8");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "8", frmEstHab.lblFecAct.getText());
//
//            switch (estH8) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>8</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "8";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "8";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH8) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "8", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "8";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//
//            } else {
//                tomadoDe = "norm";
//                numHab = "8";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnVerH9) {
//
//            String estH9 = consEstHab.verEstadoPpalHabit("9");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "9", frmEstHab.lblFecAct.getText());
//
//            switch (estH9) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>9</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "9";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "9";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH9) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "9", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "9";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//            } else {
//                tomadoDe = "norm";
//                numHab = "9";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnVerH10) {
//
//            String estH10 = consEstHab.verEstadoPpalHabit("10");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "10", frmEstHab.lblFecAct.getText());
//
//            switch (estH10) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>10</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "10";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "10";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH10) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "10", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "10";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//            } else {
//                tomadoDe = "norm";
//                numHab = "10";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnVerH11) {
//
//            String estH11 = consEstHab.verEstadoPpalHabit("11");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "11", frmEstHab.lblFecAct.getText());
//
//            switch (estH11) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>11</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "11";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "11";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH11) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "11", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "11";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//
//            } else {
//                tomadoDe = "norm";
//                numHab = "11";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnVerH12) {
//
//            String estH12 = consEstHab.verEstadoPpalHabit("12");
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "12", frmEstHab.lblFecAct.getText());
//
//            switch (estH12) {
//
//                case "RESERVA":
//                    if (dt == 0) {
//                        mensajeINFCheck = "<html><center>Desea registrar el check-in ahora?";
//                        new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                        if (resCheck.equals("si")) {
//
//                            mensajeINF = "<html><center>Debe seleccionar la habitacion <b>12</b> en la tabla de reservas";
//                            new Inf(JInternalFrame, true).setVisible(true);
//
//                            reservas_J modRes = new reservas_J();
//                            consReservas_J consRes = new consReservas_J();
//                            FrmReservas_J frmRes = new FrmReservas_J();
//                            ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
//                            frmRes.setVisible(true);
//                            frmEstHab.dispose();
//
//                        } else if (resCheck.equals("no")) {
//                            estadHab = "RESERVA";
//                            numHab = "12";
//                            new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                            bloquearBTN();
//                        } else {
//                            mensajeINF = "<html><center>Hubo un error interno, por favor reintente nuevamente";
//                            new Inf(JInternalFrame, true).setVisible(true);
//                        }
//                    } else {
//                        mensajeINF = "<html><center>Esta habitacion esta reservada para el dia de mañana";
//                        new Inf(JInternalFrame, true).setVisible(true);
//                    }
//                    break;
//
//                case "OCUPADO":
//                    estadHab = "OCUPADO";
//                    numHab = "12";
//                    new FrmAInfoHabit_J(JInternalFrame, true).setVisible(true);
//                    break;
//
//                default:
//                    break;
//            }
//
//        }
////+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        if (e.getSource() == frmEstHab.btnIrChekinH12) {
//
//            dt = consEstHab.mostrarDiasParaReserva("RESERVA", "12", frmEstHab.lblFecAct.getText());
//            if (dt != 0) {
//                d = dt - 1;
//            }
//            if (dt > 1) {
//
//                mensajeINFCheck = "<html><center>Esta habitacion esta disponible solo por " + d + " dias, <p> desea continuar?";
//                new InfChekSiNo(JInternalFrame, true).setVisible(true);
//
//                if (resCheck.equals("si")) {
//                    tomadoDe = "prov";
//                    numHab = "12";
//                    checkin_J modChki = new checkin_J();
//                    consCheckIn_J consChki = new consCheckIn_J();
//                    FrmCheckin_J frmChki = new FrmCheckin_J();
//                    ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                    frmChki.btnGuarCheckin.setVisible(false);
//                    frmChki.btnGuarChecResrv.setVisible(false);
//                    frmChki.btnGuarChkProv.setVisible(true);
//                    frmChki.setVisible(true);
//                    frmEstHab.dispose();
//                }
//
//            } else {
//                tomadoDe = "norm";
//                numHab = "12";
//                checkin_J modChki = new checkin_J();
//                consCheckIn_J consChki = new consCheckIn_J();
//                FrmCheckin_J frmChki = new FrmCheckin_J();
//                ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.btnGuarChecResrv.setVisible(false);
//                frmChki.btnGuarChkProv.setVisible(false);
//                frmChki.btnGuarCheckin.setVisible(true);
//                frmChki.setVisible(true);
//                frmEstHab.dispose();
//            }
//        }
    }
//************************************* METODOS *********************************************************
//************************************* METODO BLOQUEAR BTN *********************************************************

    public void bloquearBTN() {
        infHab.btnAmplEstadia.setEnabled(false);
        infHab.btnCambHabit.setEnabled(false);
        infHab.btnFinal.setEnabled(false);
    }
//************************************* METODO BLOQUEAR BTN *********************************************************
    public String validarEstIgual(String n){
     String a=   consEstHab.verEstadoAux(n);
     String p=   consEstHab.verEstadoPpal(n);
        if (p.equals(a)) {
            return p;
        }  
        return null;
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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
