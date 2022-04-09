package vistas;

import alertas.Exito;
import clases.conectar;
import clases.recursividad;
import com.toedter.calendar.JDateChooser;
import consultas.consPagPend_J;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rojerusan.RSAnimation;
import rsscalelabel.RSScaleLabel;
import static vistas.FrmAInfoHabit_J.*;

// @author Software_Max(JDV)
public final class FrmAAmpliarEstad_J extends javax.swing.JDialog {

    PreparedStatement ps;
    ResultSet rs;
    Frame JInternalFrame;
    String llegada, estAux;
    FrmEstadoHabit_J frmEstHab = new FrmEstadoHabit_J();
    recursividad rec = new recursividad();
     int days,ds;

    public FrmAAmpliarEstad_J(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        RSAnimation.setBajar(-300, 150, 1, 3, this);
        setLocationRelativeTo(null);
        mostrarDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        pnlCabeInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblInfoHabitNum = new javax.swing.JLabel();
        lblDiasRestantes = new javax.swing.JLabel();
        lblResDiasRest = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        dcFecLlegada = new com.toedter.calendar.JDateChooser();
        lblFechaSalida = new javax.swing.JLabel();
        dcFecSalida = new com.toedter.calendar.JDateChooser();
        lblValor = new javax.swing.JLabel();
        lblSignoPesos = new javax.swing.JLabel();
        txtValorPagar = new javax.swing.JTextField();
        sepValor = new javax.swing.JSeparator();
        btnRegCambio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVerNumDias = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        dcFecActual = new com.toedter.calendar.JDateChooser();
        lblRestriccion = new javax.swing.JLabel();
        lblFecAct = new javax.swing.JLabel();
        lblDiasAdd = new javax.swing.JLabel();
        lblResDiasAdic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(4, 153, 193)));
        pnlInfo.setMinimumSize(new java.awt.Dimension(401, 550));
        pnlInfo.setPreferredSize(new java.awt.Dimension(380, 265));
        pnlInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCabeInfo.setBackground(new java.awt.Color(4, 153, 193));
        pnlCabeInfo.setPreferredSize(new java.awt.Dimension(380, 85));

        lblInfo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("AMPLIAR ESTADIA HABITACION");

        lblInfoHabitNum.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblInfoHabitNum.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoHabitNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoHabitNum.setText("N");

        javax.swing.GroupLayout pnlCabeInfoLayout = new javax.swing.GroupLayout(pnlCabeInfo);
        pnlCabeInfo.setLayout(pnlCabeInfoLayout);
        pnlCabeInfoLayout.setHorizontalGroup(
            pnlCabeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeInfoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfoHabitNum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlCabeInfoLayout.setVerticalGroup(
            pnlCabeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlCabeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo)
                    .addComponent(lblInfoHabitNum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInfo.add(pnlCabeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 400, 50));

        lblDiasRestantes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblDiasRestantes.setForeground(new java.awt.Color(4, 153, 193));
        lblDiasRestantes.setText("DIAS RESTANTES:");
        pnlInfo.add(lblDiasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 140, 20));

        lblResDiasRest.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblResDiasRest.setForeground(new java.awt.Color(0, 0, 0));
        lblResDiasRest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResDiasRest.setText("0");
        lblResDiasRest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlInfo.add(lblResDiasRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, 20));

        lblFechaIngreso.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblFechaIngreso.setForeground(new java.awt.Color(4, 153, 193));
        lblFechaIngreso.setText("FECHA INGRESO:");
        pnlInfo.add(lblFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        dcFecLlegada.setForeground(new java.awt.Color(0, 0, 0));
        dcFecLlegada.setDateFormatString("yyyy-MM-dd");
        dcFecLlegada.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlInfo.add(dcFecLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        lblFechaSalida.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblFechaSalida.setForeground(new java.awt.Color(4, 153, 193));
        lblFechaSalida.setText("FECHA SALIDA:");
        pnlInfo.add(lblFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 20));

        dcFecSalida.setBackground(java.awt.Color.lightGray);
        dcFecSalida.setForeground(new java.awt.Color(0, 0, 0));
        dcFecSalida.setDateFormatString("yyyy-MM-dd");
        dcFecSalida.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlInfo.add(dcFecSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        lblValor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblValor.setForeground(new java.awt.Color(4, 153, 193));
        lblValor.setText("VALOR:");
        pnlInfo.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 20));

        lblSignoPesos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblSignoPesos.setForeground(new java.awt.Color(4, 153, 193));
        lblSignoPesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoPesos.setText("$");
        pnlInfo.add(lblSignoPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 30, 30));

        txtValorPagar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtValorPagar.setForeground(new java.awt.Color(0, 0, 0));
        txtValorPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorPagar.setText("0");
        txtValorPagar.setBorder(null);
        txtValorPagar.setPreferredSize(new java.awt.Dimension(150, 30));
        txtValorPagar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorPagarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorPagarFocusLost(evt);
            }
        });
        pnlInfo.add(txtValorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 120, -1));

        sepValor.setForeground(new java.awt.Color(4, 153, 193));
        sepValor.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlInfo.add(sepValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 150, 10));

        btnRegCambio.setBackground(new java.awt.Color(4, 153, 193));
        btnRegCambio.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnRegCambio.setForeground(new java.awt.Color(255, 255, 255));
        btnRegCambio.setText("REGISTRAR CAMBIO");
        btnRegCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCambioActionPerformed(evt);
            }
        });
        pnlInfo.add(btnRegCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 180, -1));

        btnSalir.setBackground(new java.awt.Color(4, 153, 193));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        pnlInfo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 110, -1));

        btnVerNumDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerNumDias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recarga.png"))); // NOI18N
        btnVerNumDias.setPreferredSize(new java.awt.Dimension(50, 50));
        btnVerNumDias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerNumDiasMouseClicked(evt);
            }
        });
        pnlInfo.add(btnVerNumDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 40, 40));

        lblID.setText("jLabel1");
        pnlInfo.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        dcFecActual.setDateFormatString("yyyy-MM-dd");
        pnlInfo.add(dcFecActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 80, -1));

        lblRestriccion.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblRestriccion.setForeground(new java.awt.Color(0, 102, 255));
        lblRestriccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestriccion.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlInfo.add(lblRestriccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 40));

        lblFecAct.setText("jLabel1");
        pnlInfo.add(lblFecAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblDiasAdd.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblDiasAdd.setForeground(new java.awt.Color(4, 153, 193));
        lblDiasAdd.setText("DIAS ADICION:");
        pnlInfo.add(lblDiasAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 20));

        lblResDiasAdic.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblResDiasAdic.setForeground(new java.awt.Color(0, 0, 0));
        lblResDiasAdic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResDiasAdic.setText("0");
        lblResDiasAdic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlInfo.add(lblResDiasAdic, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmAAmpliarEstad_J.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtValorPagarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusGained
        txtValorPagar.setText("");

    }//GEN-LAST:event_txtValorPagarFocusGained

    private void txtValorPagarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusLost
        if (txtValorPagar.getText().equals(""))
            txtValorPagar.setText("0");
    }//GEN-LAST:event_txtValorPagarFocusLost

    private void btnRegCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCambioActionPerformed
        modificarEstadia();
       guardarIngreso();
    }//GEN-LAST:event_btnRegCambioActionPerformed

    private void btnVerNumDiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerNumDiasMouseClicked
     
        lblRestriccion.setText("");
        String eax = lblInfoHabitNum.getText();

        if (estadoAux(eax) && estAux.equals("RESERVA")) {
            int drv = diasParaResv();
            if (drv > 1) {
                drv = drv - 1;
            }
            ds = (1 + calcularDias(dcFecActual, dcFecSalida));
            System.out.println(ds);
            lblResDiasRest.setText(String.valueOf(ds));
            

            int dsf =(ds);

            if (dsf > drv && dsf > 0 && drv > 0) {

                lblRestriccion.setVisible(true);
                lblRestriccion.setForeground(Color.red);
                lblRestriccion.setText("<html><center>Habitacion no diponible<p> excede los dias. ");
                btnRegCambio.setVisible(false);
                lblSignoPesos.setVisible(false);
                sepValor.setVisible(false);
                txtValorPagar.setVisible(false);

            } else if (dsf <= drv && dsf > 0 && drv > 0) {

                lblRestriccion.setVisible(true);
                lblRestriccion.setForeground(new Color(0, 118, 222));
                lblRestriccion.setText("<html><center>Puede usar la habitacion <p>solo por " + drv + " dias");
                btnRegCambio.setVisible(true);
                lblSignoPesos.setVisible(true);
                sepValor.setVisible(true);
                txtValorPagar.setVisible(true);

            }
        } else if (!eax.equals("RESERVA")) {

            String dys = String.valueOf(1 + calcularDias(dcFecActual, dcFecSalida));
            lblResDiasRest.setText(dys);
            lblSignoPesos.setVisible(true);
            sepValor.setVisible(true);
            txtValorPagar.setVisible(true);
            btnRegCambio.setVisible(true);
        }
        int dr = Integer.parseInt(lblResDiasRest.getText());
        int res = dr - days;
        lblResDiasAdic.setText(String.valueOf(res));
        lblDiasAdd.setVisible(true);
        lblResDiasAdic.setVisible(true);
        
    }//GEN-LAST:event_btnVerNumDiasMouseClicked

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
                FrmAAmpliarEstad_J dialogI = new FrmAAmpliarEstad_J(new javax.swing.JFrame(), true);
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

//***************************************************************************************************************
    public int diasParaResv() {

        String est = "RESERVA";
        String n = lblInfoHabitNum.getText();
        String fec = lblFecAct.getText();
        System.out.println("hab select " + n);
        int dy = mostrarDiasParaReserva(est, n, fec);
        return dy;

    }

//********************************************************************************************
    
     public boolean guardarIngreso() {
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String fecPago = lblFecAct.getText();
        String registra = frmEstHab.lblNomUser.getText();
        String concpto = ("AMPLIAR ESTADIA");
        int valor =  Integer.parseInt( txtValorPagar.getText());
        
        String sql = "INSERT INTO ingresos (fecha, concepto, valor, registra) VALUES(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, fecPago);
            ps.setString(2, concpto);
            ps.setInt(3, valor);
            ps.setString(4,registra);

            ps.execute();
            return true;

        } catch (SQLException e) {

            System.err.println(e);
            return false;

        } finally {

            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }
//************************************** METODO MOSTRAR DATOS HABITACION ***********************************************************
    public int mostrarDiasParaReserva(String estad, String n, String fec) {

        if (fechaLlegaReserva(estad, n)) {

            String fecha1 = (llegada);
            Date f1 = setearFechas(fecha1);
            String fecha2 = fec;
            Date f2 = setearFechas(fecha2);
            System.out.println("f1 llegada " + f1 + " y f2 hoy " + f2);
            int diasRestantes = (numeroDiasEntreDosFechas(f2, f1));
            return diasRestantes;
        }
        return 0;
    }
//************************************** METODO MOSTRAR DATOS HABITACION ***********************************************************

    public int mostrarDiasfalt(String sal, String hoy) {

        String fecha1 = (sal);
        Date f1 = setearFechas(fecha1);
        String fecha2 = hoy;
        Date f2 = setearFechas(fecha2);
        System.out.println("f1 llegada " + f1 + " y f2 hoy " + f2);
        int diasRestantes = (numeroDiasEntreDosFechas(f2, f1));
        if (diasRestantes > 0) {
            return diasRestantes;
        } else {
            return 0;
        }
    }

//****************************************************************************************************************************    
    public boolean fechaLlegaReserva(String est, String n) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT llegada FROM reservas INNER JOIN habitaciones ON reservas.id_reservas = habitaciones.id_aux  WHERE est_aux = '" + est + "' AND numero = '" + n + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                llegada = rs.getString("llegada");
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return false;

    }
//****************************************************************************************************************************    

    public boolean estadoAux(String n) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            String sql = "SELECT est_aux FROM habitaciones  WHERE  numero = '" + n + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {

                estAux = rs.getString("est_aux");
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(consPagPend_J.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                con.close();

            } catch (SQLException e) {
            }
        }

        return false;

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
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaSetDate = null;

        try {
            fechaSetDate = formatoFecha.parse(fec);

        } catch (ParseException ex) {

            Logger.getLogger(FrmReservas_J.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaSetDate;

    }

//******************************************************************************************************************************    
    public void mostrarDatos() {
        Calendar c2 = new GregorianCalendar();
        dcFecActual.setCalendar(c2);
        RSScaleLabel.setScaleLabel(btnVerNumDias, "src/img/up.png");
        dcFecLlegada.getCalendarButton().setEnabled(false);// Desactivamos el calendario
        lblResDiasRest.setText(String.valueOf(dias));
        days = dias;
        dcFecLlegada.setDate(fecIn);
        dcFecLlegada.requestFocus(false);
        dcFecSalida.setDate(fecOut);
        lblInfoHabitNum.setText(puerta);
        lblID.setText(String.valueOf(idRj));
        btnRegCambio.setVisible(false);
        lblSignoPesos.setVisible(false);
        sepValor.setVisible(false);
        txtValorPagar.setVisible(false);
        dcFecActual.setVisible(false);
        lblID.setVisible(false);
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        lblFecAct.setText(formato.format(sistFecha));
        lblFecAct.setVisible(false);
        lblDiasAdd.setVisible(false);
        lblResDiasAdic.setVisible(false);

    }

//******************************************************************************************************************************    
    public void limpiarTodo() {

        lblResDiasRest.setText("");
        dcFecLlegada.setDate(null);
        dcFecSalida.setDate(null);
        lblInfoHabitNum.setText("");
        lblID.setText("");

    }

////****************************************** CMETODO CALCULAR DIAS***************************************************************    
    public int calcularDias(JDateChooser hoy, JDateChooser Sale) { // revisra clases recursividad

        if (hoy.getDate() == null || Sale.getDate() == null) {
            System.out.println("los campos estan vacios");
            return 0;

        } else {

            Calendar in = hoy.getCalendar();
            Calendar out = Sale.getCalendar();
            int day = -1;

            while (in.before(out) || in.equals(out)) {

                day++;
                in.add(Calendar.DATE, 1);
            }
            return day;
        }

    }



////****************************************** CMETODO CALCULAR DIAS***************************************************************  
    public void modificarEstadia() {

        PreparedStatement ps;
        ResultSet rs;

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("UPDATE checkin SET fec_sale = ?, tiemp_estan = ?, valor = ? WHERE id_checkin = ? ");

            ps.setString(1, rec.convertirFecha(dcFecSalida));
            ps.setString(2, lblResDiasRest.getText());
            ps.setString(3, txtValorPagar.getText());
            ps.setInt(4, Integer.parseInt(lblID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                mensajeExit = "<html><center>La estadia se ha<p> modificado con exito ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);
                limpiarTodo();
                this.dispose();

            } else {
                mensajeER = "<html><center>Hubo un error para ampliar <p> la estadia, intente nuevamente ¡¡¡";
                new alertas.Error(JInternalFrame, true).setVisible(true);
                limpiarTodo();
                this.dispose();
            }
            con.close();
        } catch (NumberFormatException | SQLException e) {
            System.err.println(e);
        }

    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegCambio;
    private javax.swing.JButton btnSalir;
    public javax.swing.JLabel btnVerNumDias;
    private com.toedter.calendar.JDateChooser dcFecActual;
    public com.toedter.calendar.JDateChooser dcFecLlegada;
    public com.toedter.calendar.JDateChooser dcFecSalida;
    private javax.swing.JLabel lblDiasAdd;
    private javax.swing.JLabel lblDiasRestantes;
    private javax.swing.JLabel lblFecAct;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfoHabitNum;
    private javax.swing.JLabel lblResDiasAdic;
    private javax.swing.JLabel lblResDiasRest;
    public javax.swing.JLabel lblRestriccion;
    private javax.swing.JLabel lblSignoPesos;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlCabeInfo;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JSeparator sepValor;
    public javax.swing.JTextField txtValorPagar;
    // End of variables declaration//GEN-END:variables
}
