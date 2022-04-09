package vistas;

import alertas.Exito;
import clases.conectar;
import clases.consultas_generales;
import clases.propiedadesCBX;
import consultas.consEstadoHabit_J;
import consultas.consPagPend_J;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojerusan.RSAnimation;
import static controlador.ctrlEstadoHabit_J.numHab;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import static vistas.FrmAInfoHabit_J.idRj;
import static vistas.FrmAInfoHabit_J.diasf;

// @author Software_Max(JDV)
public final class FrmACambioHabit_J extends javax.swing.JDialog {

    consultas_generales consGen = new consultas_generales();
    PreparedStatement ps;
    ResultSet rs;
    Frame JInternalFrame;
    String es, ea, llegada, estAux;
    consultas.consEstadoHabit_J consEst = new consEstadoHabit_J();
    FrmEstadoHabit_J frmEstHab = new FrmEstadoHabit_J();

    public FrmACambioHabit_J(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        RSAnimation.setBajar(-300, 150, 1, 3, this);
        setLocationRelativeTo(null);
        consGen.llenarHabitDisponChk(cbxNumHabDisp);
        mostrarDatos();
        cbxPers();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        pnlCabeInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblInfoHabitNum = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblResFecha = new javax.swing.JLabel();
        lblParaHabit = new javax.swing.JLabel();
        cbxNumHabDisp = new javax.swing.JComboBox<>();
        lblValor = new javax.swing.JLabel();
        txtValorPagar = new javax.swing.JTextField();
        lblSignoPesos = new javax.swing.JLabel();
        sepPagar = new javax.swing.JSeparator();
        lblMotivo = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JScrollPane();
        textoMotivo = new javax.swing.JTextPane();
        btnSalir = new javax.swing.JButton();
        btnRegCambio = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblRestriccion = new javax.swing.JLabel();
        btnVerNumDias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        pnlInfo.setPreferredSize(new java.awt.Dimension(380, 265));
        pnlInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCabeInfo.setBackground(new java.awt.Color(4, 153, 193));
        pnlCabeInfo.setPreferredSize(new java.awt.Dimension(380, 85));

        lblInfo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("CAMBIO DE HABITACION");

        lblInfoHabitNum.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblInfoHabitNum.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoHabitNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoHabitNum.setText("N");

        javax.swing.GroupLayout pnlCabeInfoLayout = new javax.swing.GroupLayout(pnlCabeInfo);
        pnlCabeInfo.setLayout(pnlCabeInfoLayout);
        pnlCabeInfoLayout.setHorizontalGroup(
            pnlCabeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeInfoLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfoHabitNum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(4, 153, 193));
        lblFecha.setText("FECHA :");
        pnlInfo.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));

        lblResFecha.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        lblResFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblResFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResFecha.setText("RESPUESTA");
        pnlInfo.add(lblResFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, 30));

        lblParaHabit.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblParaHabit.setForeground(new java.awt.Color(4, 153, 193));
        lblParaHabit.setText(" HABITACION:");
        pnlInfo.add(lblParaHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 90, 20));

        cbxNumHabDisp.setBackground(new java.awt.Color(4, 153, 193));
        cbxNumHabDisp.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxNumHabDisp.setForeground(new java.awt.Color(255, 255, 255));
        cbxNumHabDisp.setMaximumRowCount(6);
        cbxNumHabDisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxNumHabDisp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxNumHabDisp.setPreferredSize(new java.awt.Dimension(150, 28));
        pnlInfo.add(cbxNumHabDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        lblValor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblValor.setForeground(new java.awt.Color(4, 153, 193));
        lblValor.setText("VALOR: ");
        pnlInfo.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 20));

        txtValorPagar.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
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
        pnlInfo.add(txtValorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 120, 30));

        lblSignoPesos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblSignoPesos.setForeground(new java.awt.Color(4, 153, 193));
        lblSignoPesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignoPesos.setText("$");
        pnlInfo.add(lblSignoPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 30, 30));

        sepPagar.setForeground(new java.awt.Color(4, 153, 193));
        sepPagar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlInfo.add(sepPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 150, 10));

        lblMotivo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblMotivo.setForeground(new java.awt.Color(4, 153, 193));
        lblMotivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotivo.setText("MOTIVO:");
        pnlInfo.add(lblMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 70, 20));

        textoMotivo.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        textoMotivo.setAutoscrolls(false);
        textoMotivo.setMaximumSize(new java.awt.Dimension(62, 20));
        txtMotivo.setViewportView(textoMotivo);

        pnlInfo.add(txtMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 200, 60));

        btnSalir.setBackground(new java.awt.Color(4, 153, 193));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        pnlInfo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 120, -1));

        btnRegCambio.setBackground(new java.awt.Color(4, 153, 193));
        btnRegCambio.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnRegCambio.setForeground(new java.awt.Color(255, 255, 255));
        btnRegCambio.setText("REGISTRAR CAMBIO");
        btnRegCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCambioActionPerformed(evt);
            }
        });
        pnlInfo.add(btnRegCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 170, -1));

        lblID.setText("jLabel1");
        pnlInfo.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblRestriccion.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblRestriccion.setForeground(new java.awt.Color(0, 102, 255));
        lblRestriccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestriccion.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlInfo.add(lblRestriccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 40));

        btnVerNumDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerNumDias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recarga.png"))); // NOI18N
        btnVerNumDias.setPreferredSize(new java.awt.Dimension(50, 50));
        btnVerNumDias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerNumDiasMouseClicked(evt);
            }
        });
        pnlInfo.add(btnVerNumDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorPagarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusLost
        if (txtValorPagar.getText().equals("")) {
            txtValorPagar.setText("0");
        }

    }//GEN-LAST:event_txtValorPagarFocusLost

    private void txtValorPagarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusGained
        txtValorPagar.setText("");


    }//GEN-LAST:event_txtValorPagarFocusGained

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmACambioHabit_J.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnRegCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCambioActionPerformed
        int nh = Integer.parseInt(lblInfoHabitNum.getText());

        guardarIngreso();
        
        if (verEstadosHab(nh) && es.equals(ea) && !es.equals("RESERVA") && !ea.equals("RESERVA")) {

            finalEstadiaCheck();

        } else {

            finalEstadiaChkResv();

        }

        nh = Integer.parseInt(cbxNumHabDisp.getSelectedItem().toString());

        if (verEstadosHab(nh) && es.equals(ea) && !es.equals("RESERVA") && !ea.equals("RESERVA")) {

            CambiarHabitChk();

        } else {

            CambiarHabitChkResv();

        }
    }//GEN-LAST:event_btnRegCambioActionPerformed

    private void btnVerNumDiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerNumDiasMouseClicked

        lblRestriccion.setText("");
        int dsf = Integer.parseInt(diasf);
        String eax = cbxNumHabDisp.getSelectedItem().toString();

        if (estadoAux(eax) && estAux.equals("RESERVA")) {
            int d = diasParaResv();
            if (d > 1) {
                d = d - 1;
            }

            System.out.println("dias para resv " + d + " y dias faltan para salida " + dsf);

            if (dsf >= d && dsf > 0 && d > 0) {

                lblRestriccion.setForeground(new Color(255, 0, 0));
                lblRestriccion.setText("<html><center>Habitacion no diponible,<p> excede los dias. ");
                lblRestriccion.setVisible(true);
                btnRegCambio.setVisible(false);
                lblSignoPesos.setVisible(false);
                txtValorPagar.setVisible(false);
                sepPagar.setVisible(false);

            } else if (dsf < d && dsf > 0 && d > 0) {

                lblRestriccion.setForeground(new Color(0, 118, 222));
                lblRestriccion.setText("<html><center>Puede usar la habitacion <p>por " + d + " dias");
                lblRestriccion.setVisible(true);
                btnRegCambio.setVisible(true);
                lblSignoPesos.setVisible(true);
                txtValorPagar.setVisible(true);
                sepPagar.setVisible(true);

            }
        } else if (!eax.equals("RESERVA")) {

            lblSignoPesos.setVisible(true);
            sepPagar.setVisible(true);
            txtValorPagar.setVisible(true);
            btnRegCambio.setVisible(true);
        }


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
                FrmACambioHabit_J dialogI = new FrmACambioHabit_J(new javax.swing.JFrame(), true);
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
        String n = cbxNumHabDisp.getSelectedItem().toString();
        String fec = lblResFecha.getText();
        System.out.println("hab select " + n);
        int dy = mostrarDiasParaReserva(est, n, fec);
        return dy;

    }
//********************************************************************************************

    public boolean guardarIngreso() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();
        String fecPago = lblResFecha.getText();
        String registra = frmEstHab.lblNomUser.getText();
        String concpto = ("CAMBIO HABITACION");
        int valor = Integer.parseInt(txtValorPagar.getText());
        JOptionPane.showMessageDialog(null, valor);

        String sql = "INSERT INTO ingresos (fecha, concepto, valor, registra) VALUES(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, fecPago);
            ps.setString(2, concpto);
            ps.setInt(3, valor);
            ps.setString(4, registra);

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
//*************************************************************************************    

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
//***************************************************************************************************************

    public void mostrarDatos() {
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        lblResFecha.setText(formato.format(sistFecha));
        lblInfoHabitNum.setText(numHab);
        lblID.setText(String.valueOf(idRj));
        lblSignoPesos.setVisible(false);
        txtValorPagar.setVisible(false);
        sepPagar.setVisible(false);
        btnRegCambio.setVisible(false);
    }

//************************************** METODO MOSTRAR DATOS HABITACION ***********************************************************
    public int mostrarDiasParaReserva(String estad, String n, String fec) {

        if (fechaLlegaReserva(estad, n)) {

            String fecha1 = (llegada);
            Date f1 = setearFechas(fecha1);
            String fecha2 = fec;
            Date f2 = setearFechas(fecha2);
            int diasRestantes = (numeroDiasEntreDosFechas(f2, f1));
            return diasRestantes;
        }
        return 0;
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
//***************************************************************************************************************

    public void CambiarHabitChk() {

        if (regCambioHabit()) {

            if (EstadHabOcupChk()) {

                mensajeExit = "<html><center>El cambio de habitacion CHK se ha<p> modificado con exito.";
                new Exito(JInternalFrame, true).setVisible(true);
                limpiar();
                this.dispose();

            } else {

                mensajeER = "<html><center>Hubo un error con el cambio de <p> estado CHK de habitacion, intente nuevamente.";
                new alertas.Error(JInternalFrame, true).setVisible(true);
                limpiar();
                this.dispose();
            }

        } else {
            mensajeER = "<html><center>Hubo un error con el cambio de <p> habitacion,CHK intente nuevamente.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            limpiar();
            this.dispose();
        }

    }
//***************************************************************************************************************

    public void CambiarHabitChkResv() {

        if (regCambioHabit()) {

            if (EstadHabOcupChkResv()) {

                mensajeExit = "<html><center>El cambio de habitacion CHKREV se ha<p> modificado con exito ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);
                limpiar();
                this.dispose();

            } else {

                mensajeER = "<html><center>Hubo un error con el cambio de <p> estado CHKREV de habitacion, intente nuevamente ¡¡¡";
                new alertas.Error(JInternalFrame, true).setVisible(true);
                limpiar();
                this.dispose();
            }

        } else {
            mensajeER = "<html><center>Hubo un error con el cambio de <p> habitacion,CHKREV intente nuevamente ¡¡¡";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            limpiar();
            this.dispose();
        }

    }

//****************************************** COMBOBOX PERSONALIZADOS ***********************************************    
    void cbxPers() {
        //Le damos las propiedadesCBX de la clase a los cbx

        cbxNumHabDisp.setUI(propiedadesCBX.createUI(rootPane));

    }

//****************************************** LIMPIAR ***************************************************************    
    void limpiar() {

        cbxNumHabDisp.setSelectedItem("Seleccione");
        txtValorPagar.setText("0");
        textoMotivo.setText("");
        lblID.setText("");
    }

//****************************************** CREG CAMBIO DE HAB **************************************************  
    public boolean regCambioHabit() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("UPDATE checkin SET num_habit = ?,  valor = ?, fec_cambio = ?, motivo = ?  WHERE id_checkin = ? ");

            ps.setString(1, cbxNumHabDisp.getSelectedItem().toString());
            ps.setInt(2, Integer.parseInt(txtValorPagar.getText()));
            ps.setString(3, lblResFecha.getText());
            ps.setString(4, textoMotivo.getText());
            ps.setInt(5, Integer.parseInt(lblID.getText()));

            ps.executeUpdate();

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
//****************************************** VER EST HAB SALIDA **************************************************  

    public boolean verEstadosHab(int num) {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("SELECT estado, est_aux FROM habitaciones WHERE id_habitaciones = '" + num + "'");

            rs = ps.executeQuery();

            if (rs.next()) {

                es = (rs.getString("estado"));
                ea = (rs.getString("est_aux"));

//                JOptionPane.showMessageDialog(null, "res busqueda BD " + es + "--" + ea);

                return true;
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
        return false;
    }

//*********************************************************SALIDA**************************************************************
    public boolean finalEstadiaCheck() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        int num = Integer.parseInt(lblInfoHabitNum.getText());
        String estd = "DISPONIBLE";
        int chek_id = 0;

        String sql = "UPDATE habitaciones SET  estado = ?, chek_id = ?, est_aux = ?, id_aux = ?  WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, estd);
            ps.setInt(2, chek_id);
            ps.setString(3, estd);
            ps.setInt(4, chek_id);
            ps.setInt(5, num);

            int res = ps.executeUpdate();

            return res > 0;

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
//****************************************************SALIDA*******************************************************************

    public boolean finalEstadiaChkResv() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        int num = Integer.parseInt(lblInfoHabitNum.getText());
        String estd = "DISPONIBLE";
        int chek_id = 0;

        String sql = "UPDATE habitaciones SET  estado = ?, chek_id = ?  WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, estd);
            ps.setInt(2, chek_id);
            ps.setInt(3, num);

            int res = ps.executeUpdate();

            return res > 0;

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

//*************************************************************INGRESO*****************************************************************************
    public boolean EstadHabOcupChk() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String est = "OCUPADO";
        int ckId = Integer.parseInt(lblID.getText());
        int idHab = Integer.parseInt(cbxNumHabDisp.getSelectedItem().toString());

        String sql = "UPDATE habitaciones SET  estado = ?, chek_id = ?,est_aux = ?, id_aux = ? WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, est);
            ps.setInt(2, ckId);
            ps.setString(3, est);
            ps.setInt(4, ckId);
            ps.setInt(5, idHab);

            int res = ps.executeUpdate();

            return res > 0;

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
//**********************************************************INGRESO********************************************************************************

    public boolean EstadHabOcupChkResv() {

        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String est = "OCUPADO";
        int ckId = Integer.parseInt(lblID.getText());
        int idHab = Integer.parseInt(cbxNumHabDisp.getSelectedItem().toString());

        String sql = "UPDATE habitaciones SET  estado = ?, chek_id = ? WHERE id_habitaciones = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, est);
            ps.setInt(2, ckId);
            ps.setInt(3, idHab);

            int res = ps.executeUpdate();

            return res > 0;

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegCambio;
    private javax.swing.JButton btnSalir;
    public javax.swing.JLabel btnVerNumDias;
    public javax.swing.JComboBox<String> cbxNumHabDisp;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfoHabitNum;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblParaHabit;
    private javax.swing.JLabel lblResFecha;
    public javax.swing.JLabel lblRestriccion;
    private javax.swing.JLabel lblSignoPesos;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlCabeInfo;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JSeparator sepPagar;
    private javax.swing.JTextPane textoMotivo;
    private javax.swing.JScrollPane txtMotivo;
    public javax.swing.JTextField txtValorPagar;
    // End of variables declaration//GEN-END:variables
}
