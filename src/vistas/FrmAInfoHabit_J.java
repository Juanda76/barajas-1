package vistas;

import alertas.Exito;
import alertas.Error;
import clases.conectar;
import consultas.consEstadoHabit_J;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojerusan.RSAnimation;
import static consultas.consEstadoHabit_J.acompR;
import static consultas.consEstadoHabit_J.ingR;
import static consultas.consEstadoHabit_J.salR;
import static consultas.consEstadoHabit_J.nomresR;
import static consultas.consEstadoHabit_J.acompA;
import static consultas.consEstadoHabit_J.idA;
import static consultas.consEstadoHabit_J.idR;
import static consultas.consEstadoHabit_J.ingA;
import static consultas.consEstadoHabit_J.salA;
import static consultas.consEstadoHabit_J.nomresA;
import static controlador.ctrlEstadoHabit_J.numHab;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

// @author Software_Max(JDV)
public final class FrmAInfoHabit_J extends javax.swing.JDialog {

    public static String puerta;
    public static int dias, idRj;
    public static String diasf;
    public static Date fecIn, fecOut;
    consEstadoHabit_J consEstHab = new consEstadoHabit_J();
    FrmEstadoHabit_J frmEstHab = new FrmEstadoHabit_J();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    Frame JInternalFrame;
    PreparedStatement ps;
    ResultSet rs;
    String estate = null;
    String aux = null;
    String dr;

    public FrmAInfoHabit_J(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        dcResFecIngreso.getCalendarButton().setEnabled(false);// Desactivamos el calendario
        dcResFecSalida.getCalendarButton().setEnabled(false);// Desactivamos el calendario
        Date fechaDelSistema = new Date();
        lblResFecActual.setText(formatoFecha.format(fechaDelSistema));
        RSAnimation.setBajar(-300, 150, 1, 3, this);
        setLocationRelativeTo(null);
        lblResFecActual.setVisible(false);
        verInfoEstado(numHab);
        dcResFecIngreso.requestFocus(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        pnlCabeInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblInfoHabitNum = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblResEstado = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        lblDiasRestantes = new javax.swing.JLabel();
        lblResDiasRest = new javax.swing.JLabel();
        lblResponsable = new javax.swing.JLabel();
        lblResResponsable = new javax.swing.JLabel();
        lblNumAcompñ = new javax.swing.JLabel();
        lblResNumAcomp = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAmplEstadia = new javax.swing.JButton();
        btnCambHabit = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        dcResFecIngreso = new com.toedter.calendar.JDateChooser();
        dcResFecSalida = new com.toedter.calendar.JDateChooser();
        lblResFecActual = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        pnlInfo.setPreferredSize(new java.awt.Dimension(380, 265));
        pnlInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCabeInfo.setBackground(new java.awt.Color(4, 153, 193));
        pnlCabeInfo.setPreferredSize(new java.awt.Dimension(380, 85));
        pnlCabeInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("INFORMACION HABITACION  N°");
        pnlCabeInfo.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 283, -1));

        lblInfoHabitNum.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblInfoHabitNum.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoHabitNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoHabitNum.setText("N");
        pnlCabeInfo.add(lblInfoHabitNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 45, -1));

        pnlInfo.add(pnlCabeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 400, 50));

        lblEstado.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(4, 153, 193));
        lblEstado.setText("ESTADO:");
        pnlInfo.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        lblResEstado.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblResEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblResEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResEstado.setText("RESPUESTA");
        pnlInfo.add(lblResEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 140, 20));

        lblFechaIngreso.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblFechaIngreso.setForeground(new java.awt.Color(4, 153, 193));
        lblFechaIngreso.setText("FECHA INGRESO:");
        pnlInfo.add(lblFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        lblFechaSalida.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblFechaSalida.setForeground(new java.awt.Color(4, 153, 193));
        lblFechaSalida.setText("FECHA SALIDA:");
        pnlInfo.add(lblFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        lblDiasRestantes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblDiasRestantes.setForeground(new java.awt.Color(4, 153, 193));
        lblDiasRestantes.setText("DIAS RESTANTES:");
        pnlInfo.add(lblDiasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        lblResDiasRest.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblResDiasRest.setForeground(new java.awt.Color(0, 0, 0));
        lblResDiasRest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResDiasRest.setText("RESPUESTA");
        pnlInfo.add(lblResDiasRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, 20));

        lblResponsable.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblResponsable.setForeground(new java.awt.Color(4, 153, 193));
        lblResponsable.setText("RESPONSABLE:");
        pnlInfo.add(lblResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 20));

        lblResResponsable.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblResResponsable.setForeground(new java.awt.Color(0, 0, 0));
        lblResResponsable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResResponsable.setText("RESPUESTA");
        lblResResponsable.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlInfo.add(lblResResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 140, 20));

        lblNumAcompñ.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNumAcompñ.setForeground(new java.awt.Color(4, 153, 193));
        lblNumAcompñ.setText("N° DE ACOMPAÑANTES:");
        pnlInfo.add(lblNumAcompñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 20));

        lblResNumAcomp.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblResNumAcomp.setForeground(new java.awt.Color(0, 0, 0));
        lblResNumAcomp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResNumAcomp.setText("RESPUESTA");
        lblResNumAcomp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlInfo.add(lblResNumAcomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 140, 20));

        btnSalir.setBackground(new java.awt.Color(4, 153, 193));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        pnlInfo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 180, -1));

        btnAmplEstadia.setBackground(new java.awt.Color(4, 153, 193));
        btnAmplEstadia.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnAmplEstadia.setForeground(new java.awt.Color(255, 255, 255));
        btnAmplEstadia.setText("AMPLIAR ESTADIA");
        btnAmplEstadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmplEstadiaActionPerformed(evt);
            }
        });
        pnlInfo.add(btnAmplEstadia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, -1));

        btnCambHabit.setBackground(new java.awt.Color(4, 153, 193));
        btnCambHabit.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnCambHabit.setForeground(new java.awt.Color(255, 255, 255));
        btnCambHabit.setText("CAMBIO HABITACION");
        btnCambHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambHabitActionPerformed(evt);
            }
        });
        pnlInfo.add(btnCambHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 180, -1));

        btnFinal.setBackground(new java.awt.Color(4, 153, 193));
        btnFinal.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnFinal.setForeground(new java.awt.Color(255, 255, 255));
        btnFinal.setText("FINALIZAR ESTADIA");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });
        pnlInfo.add(btnFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, -1));

        dcResFecIngreso.setBackground(new java.awt.Color(255, 255, 255));
        dcResFecIngreso.setForeground(new java.awt.Color(0, 0, 0));
        dcResFecIngreso.setDateFormatString("yyyy-MM-dd ");
        pnlInfo.add(dcResFecIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, -1));

        dcResFecSalida.setBackground(new java.awt.Color(255, 255, 255));
        dcResFecSalida.setForeground(new java.awt.Color(0, 0, 0));
        dcResFecSalida.setDateFormatString("YYYY-MM-dd\n");
        dcResFecSalida.setFocusable(false);
        pnlInfo.add(dcResFecSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, -1));

        lblResFecActual.setText("jLabel1");
        pnlInfo.add(lblResFecActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, -1));

        lblID.setText("jLabel1");
        pnlInfo.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmAInfoHabit_J.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed

        datosEstadiaHabit();
        JOptionPane.showMessageDialog(null, "ppal-> " + estate + "aux-> " + aux);
            if (aux.equals(estate)) {

                if (finalEstadiaChek()) {
                    mensajeExit = "<html><center>El check-out CHEK se ha<p> registrado con exito.";
                    new Exito(JInternalFrame, true).setVisible(true);
                    this.dispose();
                } else {
                    mensajeER = "<html><center>Hubo un error al <p>registrar el check-out.";
                    new Error(JInternalFrame, true).setVisible(true);
                    this.dispose();
                }
            } else {
                if (finalEstadiaChkResv()) {
                    mensajeExit = "<html><center>El check-out ChekReserv se ha<p> registrado con exito.";
                    new Exito(JInternalFrame, true).setVisible(true);
                    this.dispose();
                } else {
                    mensajeER = "<html><center>Hubo un error al <p>registrar el check-out.";
                    new Error(JInternalFrame, true).setVisible(true);
                    this.dispose();
                }
            }
        
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnAmplEstadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmplEstadiaActionPerformed
        this.dispose();
        new FrmAAmpliarEstad_J(JInternalFrame, true).setVisible(true);
    }//GEN-LAST:event_btnAmplEstadiaActionPerformed

    private void btnCambHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambHabitActionPerformed
        diasf = dr;
        this.dispose();
        new FrmACambioHabit_J(JInternalFrame, true).setVisible(true);
    }//GEN-LAST:event_btnCambHabitActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmAInfoHabit_J dialogI = new FrmAInfoHabit_J(new javax.swing.JFrame(), true);
                dialogI.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialogI.setVisible(true);
            }
        });
    }

//************************************************** METODOS *******************************************************************************
//******************************************************************************************************************************************
    public void datosEstadiaHabit() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        int num = Integer.parseInt(lblInfoHabitNum.getText());

        String sql = "SELECT estado, est_aux FROM habitaciones  WHERE id_habitaciones = '" + num + "'";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                estate = (rs.getString("estado"));
                aux = (rs.getString("est_aux"));

            }

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        } finally {

            try {

                con.close();
                System.out.println("Conexion cerrada");

            } catch (SQLException e) {

                System.err.println(e);

            }
        }
    }
//******************************************************************************************************************************************

    public boolean finalEstadiaChek() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        int num = Integer.parseInt(lblInfoHabitNum.getText());
        String est = "DISPONIBLE";
        int chek_id = 0;

        String sql = "UPDATE habitaciones SET  estado = ?, chek_id = ?, est_aux = ?, id_aux = ? WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, est);
            ps.setInt(2, chek_id);
            ps.setString(3, est);
            ps.setInt(4, chek_id);
            ps.setInt(5, num);

            ps.execute();

            return true;

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        } finally {

            try {

                con.close();
                System.out.println("Conexion cerrada");

            } catch (SQLException e) {

                System.err.println(e);

            }
        }
        return false;
    }
//******************************************************************************************************************************************

    public boolean finalEstadiaChkResv() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        int num = Integer.parseInt(lblInfoHabitNum.getText());
        String est = "DISPONIBLE";
        int chek_id = 0;

        String sql = "UPDATE habitaciones SET  estado = ?, chek_id = ?  WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, est);
            ps.setInt(2, chek_id);
            ps.setInt(3, num);

            ps.execute();

            return true;

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        } finally {

            try {

                con.close();
                System.out.println("Conexion cerrada");

            } catch (SQLException e) {

                System.err.println(e);

            }
        }
        return false;
    }

//************************************** METODO MOSTRAR DATOS HABITACION ***********************************************************
    public void mostrarDatosHabitacionR(String estad, String numPu) {

        if (consEstHab.datosHabitInfoRoja(estad, numPu)) {

            lblResEstado.setText(estad);
            lblInfoHabitNum.setText(numPu);
            lblID.setText(idR);

            String fecha1 = (ingR);
            Date f1 = setearFechas(fecha1);
            dcResFecIngreso.setDate(f1);

            String fecha2 = (salR);
            Date f2 = setearFechas(fecha2);
            dcResFecSalida.setDate(f2);

            String fecha3 = lblResFecActual.getText();
            Date f3 = setearFechas(fecha3);

            lblResResponsable.setText(nomresR);
            lblResNumAcomp.setText(acompR);

            int diasRestantes = (numeroDiasEntreDosFechas(f3, f2));
            dr = String.valueOf(diasRestantes);
            lblResDiasRest.setText("PARA LA SALIDA -> " + dr );

            dias = diasRestantes;
            fecIn = f1;
            fecOut = f2;
            puerta = numPu;
            idRj = Integer.parseInt(lblID.getText());
        }
    }

//************************************** METODO MOSTRAR DATOS HABITACION ***********************************************************
    public void mostrarDatosHabitacionA(String estad, String numPu) {

        if (consEstHab.datosHabitInfoAmarilla(estad, numPu)) {

            lblResEstado.setText(estad);
            lblInfoHabitNum.setText(numPu);
            lblID.setText(idA);

            String fecha1 = (ingA);
            Date f1 = setearFechas(fecha1);
            dcResFecIngreso.setDate(f1);

            String fecha2 = (salA);
            Date f2 = setearFechas(fecha2);
            dcResFecSalida.setDate(f2);

            String fecha3 = lblResFecActual.getText();
            Date f3 = setearFechas(fecha3);

            lblResResponsable.setText(nomresA);
            lblResNumAcomp.setText(acompA);

            int diasRestantes = (numeroDiasEntreDosFechas(f3, f1));
             dr = String.valueOf(diasRestantes);
            lblResDiasRest.setText("PARA EL INGRESO -> " + dr);
        }
    }

//*************************************************************************************
    public static int numeroDiasEntreDosFechas(Date fecha1, Date fecha2) {

        long startTime = fecha1.getTime();
        long endTime = fecha2.getTime();
        long diffTime = endTime - startTime;
        long diffDays = diffTime / (1000 * 60 * 60 * 24);
        return (int) diffDays;
    }

//*********************************************************************************************************************************************
    public Date setearFechas(String fec) {

        Date fechaSetDate = null;

        try {
            fechaSetDate = formatoFecha.parse(fec);

        } catch (ParseException ex) {

            Logger.getLogger(FrmReservas_J.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaSetDate;

    }

//*********************************************************************************************************************************************
    public void verInfoEstado(String numHab) {

        String resEst = consEstHab.verEstadoPpal(numHab);
        
        if (resEst.equals("OCUPADO")) {
            mostrarDatosHabitacionR(resEst, numHab);

        } else if (resEst.equals("RESERVA")) {
            mostrarDatosHabitacionA(resEst, numHab);
        }

    }

//*********************************************************************************************************************************************

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAmplEstadia;
    public javax.swing.JButton btnCambHabit;
    public javax.swing.JButton btnFinal;
    public javax.swing.JButton btnSalir;
    public com.toedter.calendar.JDateChooser dcResFecIngreso;
    public com.toedter.calendar.JDateChooser dcResFecSalida;
    private javax.swing.JLabel lblDiasRestantes;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblInfo;
    public javax.swing.JLabel lblInfoHabitNum;
    private javax.swing.JLabel lblNumAcompñ;
    public javax.swing.JLabel lblResDiasRest;
    public javax.swing.JLabel lblResEstado;
    public javax.swing.JLabel lblResFecActual;
    public javax.swing.JLabel lblResNumAcomp;
    public javax.swing.JLabel lblResResponsable;
    private javax.swing.JLabel lblResponsable;
    private javax.swing.JPanel pnlCabeInfo;
    private javax.swing.JPanel pnlInfo;
    // End of variables declaration//GEN-END:variables
}
