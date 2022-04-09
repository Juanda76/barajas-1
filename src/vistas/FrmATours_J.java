package vistas;

import alertas.Error;
import alertas.Exito;
import clases.conectar;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import rojerusan.RSAnimation;
import rsscalelabel.RSScaleLabel;
import modelo.cliente_J;
import static controlador.ctrlHotel_J.mensajeER;

// @author Software_Max(JDV)
public class FrmATours_J extends javax.swing.JDialog {

    PreparedStatement ps;
    ResultSet rs;
    String time;
    Frame JDialog = null;
    String mensaje;
    String mensaje1;
    cliente_J cli = new cliente_J();

    public FrmATours_J(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        RSAnimation.setBajar(-300, 200, 1, 3, this);
        setLocationRelativeTo(null);
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPPAL = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        chbxCascadas = new javax.swing.JCheckBox();
        chbxDelamor = new javax.swing.JCheckBox();
        chbxLamiel = new javax.swing.JCheckBox();
        chbxEsplandor = new javax.swing.JCheckBox();
        chbxPanoramico = new javax.swing.JCheckBox();
        chbxCabalgata = new javax.swing.JCheckBox();
        chbxDecafe = new javax.swing.JCheckBox();
        lblTextoInfo = new javax.swing.JLabel();
        btnGuardarTours = new java.awt.Label();
        txtRegistra = new javax.swing.JTextField();
        pnlDatosCli = new javax.swing.JPanel();
        lblNumIdent = new javax.swing.JLabel();
        txtNumIdent = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblValidRESP = new javax.swing.JLabel();
        lblImgOkNoRESP = new javax.swing.JLabel();
        lblNomResponsable = new javax.swing.JLabel();
        btnRegResp = new java.awt.Label();
        txtFecha = new javax.swing.JTextField();
        btnLimpiarTours = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlPPAL.setBackground(new java.awt.Color(255, 255, 255));
        pnlPPAL.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(4, 153, 193)));
        pnlPPAL.setForeground(new java.awt.Color(4, 153, 193));
        pnlPPAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHead.setBackground(new java.awt.Color(4, 153, 193));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SERVICIO DE TOURS ");

        btnSalir.setPreferredSize(new java.awt.Dimension(30, 30));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPPAL.add(pnlHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 748, -1));

        chbxCascadas.setBackground(new java.awt.Color(255, 255, 255));
        chbxCascadas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        chbxCascadas.setForeground(new java.awt.Color(4, 153, 193));
        chbxCascadas.setText("CASCADAS");
        pnlPPAL.add(chbxCascadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        chbxDelamor.setBackground(new java.awt.Color(255, 255, 255));
        chbxDelamor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        chbxDelamor.setForeground(new java.awt.Color(4, 153, 193));
        chbxDelamor.setText("DEL AMOR");
        pnlPPAL.add(chbxDelamor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        chbxLamiel.setBackground(new java.awt.Color(255, 255, 255));
        chbxLamiel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        chbxLamiel.setForeground(new java.awt.Color(4, 153, 193));
        chbxLamiel.setText("DE LA MIEL");
        pnlPPAL.add(chbxLamiel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        chbxEsplandor.setBackground(new java.awt.Color(255, 255, 255));
        chbxEsplandor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        chbxEsplandor.setForeground(new java.awt.Color(4, 153, 193));
        chbxEsplandor.setText("CUEVA DEL ESPLANDOR");
        pnlPPAL.add(chbxEsplandor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        chbxPanoramico.setBackground(new java.awt.Color(255, 255, 255));
        chbxPanoramico.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        chbxPanoramico.setForeground(new java.awt.Color(4, 153, 193));
        chbxPanoramico.setText("PANORAMICO");
        pnlPPAL.add(chbxPanoramico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        chbxCabalgata.setBackground(new java.awt.Color(255, 255, 255));
        chbxCabalgata.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        chbxCabalgata.setForeground(new java.awt.Color(4, 153, 193));
        chbxCabalgata.setText("CABALGATA");
        pnlPPAL.add(chbxCabalgata, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        chbxDecafe.setBackground(new java.awt.Color(255, 255, 255));
        chbxDecafe.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        chbxDecafe.setForeground(new java.awt.Color(4, 153, 193));
        chbxDecafe.setText("DEL CAFE");
        pnlPPAL.add(chbxDecafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        lblTextoInfo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblTextoInfo.setForeground(new java.awt.Color(4, 153, 193));
        lblTextoInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoInfo.setText("SELECCIONE LOS TOURS QUE REALIZARA EL HUESPED");
        pnlPPAL.add(lblTextoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 361, -1));

        btnGuardarTours.setAlignment(java.awt.Label.CENTER);
        btnGuardarTours.setBackground(new java.awt.Color(4, 153, 193));
        btnGuardarTours.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarTours.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGuardarTours.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarTours.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGuardarTours.setText("GUARDAR");
        btnGuardarTours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarToursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarToursMouseExited(evt);
            }
        });
        pnlPPAL.add(btnGuardarTours, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));
        pnlPPAL.add(txtRegistra, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 90, -1));

        pnlDatosCli.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumIdent.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNumIdent.setForeground(new java.awt.Color(4, 153, 193));
        lblNumIdent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumIdent.setText("N° IDENTIFICACION:");
        pnlDatosCli.add(lblNumIdent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 180, -1));

        txtNumIdent.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNumIdent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumIdent.setBorder(null);
        txtNumIdent.setPreferredSize(new java.awt.Dimension(180, 30));
        txtNumIdent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumIdentKeyReleased(evt);
            }
        });
        pnlDatosCli.add(txtNumIdent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlDatosCli.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, 10));

        lblValor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblValor.setForeground(new java.awt.Color(4, 153, 193));
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("VALOR:");
        pnlDatosCli.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 180, -1));

        txtValor.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.setText("0");
        txtValor.setBorder(null);
        txtValor.setPreferredSize(new java.awt.Dimension(180, 30));
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        pnlDatosCli.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlDatosCli.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, 10));

        lblValidRESP.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidRESP.setForeground(new java.awt.Color(0, 51, 255));
        lblValidRESP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlDatosCli.add(lblValidRESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 70, 30));

        lblImgOkNoRESP.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlDatosCli.add(lblImgOkNoRESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        lblNomResponsable.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNomResponsable.setForeground(new java.awt.Color(0, 153, 255));
        lblNomResponsable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlDatosCli.add(lblNomResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 20));

        btnRegResp.setAlignment(java.awt.Label.CENTER);
        btnRegResp.setBackground(new java.awt.Color(4, 153, 193));
        btnRegResp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegResp.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegResp.setForeground(new java.awt.Color(255, 255, 255));
        btnRegResp.setPreferredSize(new java.awt.Dimension(30, 20));
        btnRegResp.setText("REG.");
        pnlDatosCli.add(btnRegResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        pnlPPAL.add(pnlDatosCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 350, 280));
        pnlPPAL.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        btnLimpiarTours.setAlignment(java.awt.Label.CENTER);
        btnLimpiarTours.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarTours.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarTours.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarTours.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarTours.setPreferredSize(new java.awt.Dimension(130, 30));
        btnLimpiarTours.setText("LIMPIAR");
        btnLimpiarTours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarToursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarToursMouseExited(evt);
            }
        });
        pnlPPAL.add(btnLimpiarTours, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPPAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPPAL, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusGained
        txtValor.setText("");
    }//GEN-LAST:event_txtValorFocusGained

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            
            mensajeER = "<html><center>Este campo solo acepta números ¡¡¡";
            new Error(JDialog, true).setVisible(true);
            evt.consume();
            
        } else if (txtValor.getText().length() >= 8) {
            
            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido ¡¡¡";
            new Error(JDialog, true).setVisible(true);
            txtValor.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/cerrar.png");
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnGuardarToursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarToursMouseEntered
        btnGuardarTours.setBackground(new Color(0, 204, 204));
        btnGuardarTours.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGuardarToursMouseEntered

    private void btnGuardarToursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarToursMouseExited
        btnGuardarTours.setBackground(new Color(4, 153, 193));
        btnGuardarTours.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGuardarToursMouseExited

    private void txtNumIdentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumIdentKeyReleased
        String res = BuscarIdentif(txtNumIdent.getText());

        if (txtNumIdent.getText().equals("")) {

            lblValidRESP.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "");
            btnRegResp.setVisible(false);

        } else if (res.equals("si")) {

            lblValidRESP.setText("<html><center>Cliente <p> registrado");
            lblValidRESP.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "src/img/ok.png");
            lblNomResponsable.setText(cli.getNombre());
            btnRegResp.setVisible(false);

        } else {

            lblValidRESP.setText("<html><center>Cliente sin <p>registrar");
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "src/img/alert.gif");
            lblValidRESP.setForeground(new Color(0, 0, 0));
            lblNomResponsable.setText("");
            btnRegResp.setVisible(true);

        }
    }//GEN-LAST:event_txtNumIdentKeyReleased

    private void btnLimpiarToursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarToursMouseEntered
        btnGuardarTours.setBackground(new Color(0, 204, 204));
        btnGuardarTours.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLimpiarToursMouseEntered

    private void btnLimpiarToursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarToursMouseExited
        btnGuardarTours.setBackground(new Color(4, 153, 193));
        btnGuardarTours.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLimpiarToursMouseExited

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        if (txtValor.getText().equals("")) {
            txtValor.setText("0");
        }
    }//GEN-LAST:event_txtValorFocusLost

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
                FrmATours_J dialogI = new FrmATours_J(new javax.swing.JFrame(), true);
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

//******************************************************* TODOS LOS METODOS *******************************************************************
//*********************************************************************************************************************************************
//******************************************************* METODO MOSTRAR  *********************************************************************
    void mostrar() {
        
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        txtFecha.setText(formato.format(sistFecha));
        txtRegistra.setVisible(false);
        txtFecha.setVisible(false);
        btnRegResp.setVisible(false);
    }

//************************************************** BUSCAR CLIENTE *****************************************************************************
    public String BuscarIdentif(String iden) {
      
        try {
            
            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT nombre,id_clientes FROM clientes WHERE num_doc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, iden);

            rs = ps.executeQuery();
            if (rs.next()) {

                cli.setId(rs.getInt("id_clientes"));
                cli.setNombre(rs.getString("nombre"));
                mensaje = "si";
                
            } else {
                
                mensaje = "no";
            }

            con.close();
            
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
        }
        
        return mensaje;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnGuardarTours;
    public java.awt.Label btnLimpiarTours;
    public java.awt.Label btnRegResp;
    public javax.swing.JLabel btnSalir;
    public javax.swing.JCheckBox chbxCabalgata;
    public javax.swing.JCheckBox chbxCascadas;
    public javax.swing.JCheckBox chbxDecafe;
    public javax.swing.JCheckBox chbxDelamor;
    public javax.swing.JCheckBox chbxEsplandor;
    public javax.swing.JCheckBox chbxLamiel;
    public javax.swing.JCheckBox chbxPanoramico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JLabel lblImgOkNoRESP;
    public javax.swing.JLabel lblNomResponsable;
    private javax.swing.JLabel lblNumIdent;
    private javax.swing.JLabel lblTextoInfo;
    public javax.swing.JLabel lblValidRESP;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlDatosCli;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlPPAL;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtNumIdent;
    public javax.swing.JTextField txtRegistra;
    public javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
