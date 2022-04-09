package vistas;

import alertas.Exito;
import clases.conectar;
import clases.validarCorreo;
import static controlador.ctrlHotel_J.mensajeER;
import static vistas. FrmReservas_J.mensajeINF;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import rojerusan.RSAnimation;
import rsscalelabel.RSScaleLabel;
import modelo.cliente_J;

// @author Software_Max(JDV)
public class FrmARecupContraseña extends javax.swing.JDialog {

    PreparedStatement ps;
    ResultSet rs;
    String time;
    Frame JDialog = null;
    String user;
    String pasw;
    cliente_J cli = new cliente_J();
    Frame JInternalFrame;

    public FrmARecupContraseña(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        RSAnimation.setBajar(-300, 200, 1, 3, this);
        setLocationRelativeTo(null);
        mostrar();
    }
//***************************************************** NO TOCAR ****************************************************************************************
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPPAL = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnEnviarEmail = new java.awt.Label();
        lblNumIdent = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblValidCorreo = new javax.swing.JLabel();
        lblImgOkyNo = new javax.swing.JLabel();
        lblNumIdent1 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlPPAL.setBackground(new java.awt.Color(255, 255, 255));
        pnlPPAL.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(4, 153, 193)));
        pnlPPAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHead.setBackground(new java.awt.Color(4, 153, 193));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECUPERAR  CONTRASEÑA");

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
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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

        pnlPPAL.add(pnlHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        btnEnviarEmail.setAlignment(java.awt.Label.CENTER);
        btnEnviarEmail.setBackground(new java.awt.Color(4, 153, 193));
        btnEnviarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarEmail.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEnviarEmail.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarEmail.setPreferredSize(new java.awt.Dimension(130, 30));
        btnEnviarEmail.setText("ENVIAR");
        btnEnviarEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarEmailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarEmailMouseExited(evt);
            }
        });
        pnlPPAL.add(btnEnviarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        lblNumIdent.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNumIdent.setForeground(new java.awt.Color(4, 153, 193));
        lblNumIdent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumIdent.setText("INGRESE SU CORREO");
        pnlPPAL.add(lblNumIdent, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 290, 20));

        txtCorreo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(null);
        txtCorreo.setPreferredSize(new java.awt.Dimension(290, 30));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        pnlPPAL.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 290, 30));

        jSeparator3.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlPPAL.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 290, 10));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menwork.png"))); // NOI18N
        pnlPPAL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 80));

        lblValidCorreo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidCorreo.setForeground(new java.awt.Color(0, 51, 255));
        lblValidCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlPPAL.add(lblValidCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 70, 30));

        lblImgOkyNo.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlPPAL.add(lblImgOkyNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        lblNumIdent1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNumIdent1.setForeground(new java.awt.Color(4, 153, 193));
        lblNumIdent1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumIdent1.setText("INGRESE SU NUMERO DE DOCUMENTO");
        pnlPPAL.add(lblNumIdent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 290, 20));

        txtDocumento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocumento.setBorder(null);
        txtDocumento.setPreferredSize(new java.awt.Dimension(290, 30));
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyReleased(evt);
            }
        });
        pnlPPAL.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 290, 30));

        jSeparator4.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlPPAL.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 290, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPPAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPPAL, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//***************************************************** NO TOCAR ****************************************************************************************

    
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/cerrar.png");
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnEnviarEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarEmailMouseEntered
        btnEnviarEmail.setBackground(new Color(0, 204, 204));
        btnEnviarEmail.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEnviarEmailMouseEntered

    private void btnEnviarEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarEmailMouseExited
        btnEnviarEmail.setBackground(new Color(4, 153, 193));
        btnEnviarEmail.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEnviarEmailMouseExited

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased

        String email = txtCorreo.getText();

        validarCorreo valCor = new validarCorreo();

        if (txtCorreo.getText().equals("")) {

            lblValidCorreo.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkyNo, "");

        } else if (valCor.validEmail(email)) {

            lblValidCorreo.setText("<html><center>Correo <p> valido");
            lblValidCorreo.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkyNo, "src/img/ok.png");

        } else {

            lblValidCorreo.setText("<html><center>Correo <p>invalido");
            RSScaleLabel.setScaleLabel(lblImgOkyNo, "src/img/alert.gif");
            lblValidCorreo.setForeground(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyReleased
       
 char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo acepta letras ¡¡¡";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            evt.consume();

        }

    }//GEN-LAST:event_txtDocumentoKeyReleased

    private void btnEnviarEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarEmailMouseClicked
        if (txtCorreo.getText().isEmpty()||txtDocumento.getText().isEmpty()) {
            mensajeER = "<html><center>La informacion esta incompleta, por favor verifique.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
        }else{
            this.dispose();
          String res = recpContraseña();
            if (res.equals("si")) {
            mensajeINF = "<html><center>Su usuario es : <b> " + user + "</b>, <p> y su contraseña es : <b> " + pasw + "</b>,<p> por favor guardelas en un lugar seguro.";
            new alertas.Inf(JInternalFrame, true).setVisible(true);  
            }else if(res.equals("no")){
               mensajeER = "<html><center>No hay un registro con estos datos,<p> por favor verifique e intente nuevamente.";
            new alertas.Error(JInternalFrame, true).setVisible(true); 
            }
        }
    }//GEN-LAST:event_btnEnviarEmailMouseClicked

//***************************************************** NO TOCAR ****************************************************************************************
//***************************************************** MAIN ********************************************************************************************

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
                FrmARecupContraseña dialogI = new FrmARecupContraseña(new javax.swing.JFrame(), true);
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
        
    }

//************************************* RECUPERAR CONTRASEÑA *************************************************************
    
  public  String recpContraseña(){

        String doc = txtDocumento.getText();
        String email = txtCorreo.getText();
        
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String sql = "SELECT user,pas FROM usuario  WHERE documento = '" + doc+ "' AND correo = '" + email + "'";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                
                user = rs.getString("user");
                pasw = rs.getString("pas");
                return "si";
               
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
        return "no";

    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnEnviarEmail;
    public javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JLabel lblImgOkyNo;
    private javax.swing.JLabel lblNumIdent;
    private javax.swing.JLabel lblNumIdent1;
    public javax.swing.JLabel lblValidCorreo;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlPPAL;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDocumento;
    // End of variables declaration//GEN-END:variables
}
