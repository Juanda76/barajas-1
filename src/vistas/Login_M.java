package vistas;

//@author Software_Max M_O
import consultas.consUsuario_M;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import modelo.usuario_M;
import PlaceHolder.TextHolder;
import static consultas.consUsuario_M.res;
import static consultas.consUsuario_M.rol;
import static controlador.ctrlHotel_J.mensajeER;

public final class Login_M extends javax.swing.JFrame {

    Frame JInternalFrame;

    public Login_M() {

        initComponents();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        Lblimg = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        txtpasword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lbldeco1 = new javax.swing.JLabel();
        lbldeco2 = new javax.swing.JLabel();
        BtnCerrar = new rsbuttoncustom.RSButtonCustom();
        lblRecupContraseña = new java.awt.Label();
        lblEnterParaIngresar = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl1.setBackground(new java.awt.Color(4, 153, 193));
        pnl1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnl1.add(Lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 468, 385));

        getContentPane().add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 600));

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        pnl2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(4, 153, 193));
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.setBorder(null);
        pnl2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 263, 23));

        txtpasword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtpasword.setForeground(new java.awt.Color(4, 153, 193));
        txtpasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasword.setBorder(null);
        txtpasword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpaswordFocusGained(evt);
            }
        });
        txtpasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpaswordKeyPressed(evt);
            }
        });
        pnl2.add(txtpasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 263, 22));

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnl2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 263, 10));

        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnl2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 263, 11));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 153, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIAR SESION");
        pnl2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 127, 430, 39));

        lbldeco1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnl2.add(lbldeco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 263, 66));

        lbldeco2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnl2.add(lbldeco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 263, 66));

        BtnCerrar.setForeground(new java.awt.Color(4, 153, 193));
        BtnCerrar.setText("X");
        BtnCerrar.setColorMaterial(new java.awt.Color(255, 255, 255));
        BtnCerrar.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        BtnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCerrar.setPreferredSize(new java.awt.Dimension(35, 35));
        BtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCerrarMouseExited(evt);
            }
        });
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        pnl2.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 2, -1, -1));

        lblRecupContraseña.setAlignment(java.awt.Label.CENTER);
        lblRecupContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRecupContraseña.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblRecupContraseña.setForeground(new java.awt.Color(4, 153, 193));
        lblRecupContraseña.setText("Olvide mi contraseña ");
        lblRecupContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecupContraseñaMouseClicked(evt);
            }
        });
        pnl2.add(lblRecupContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 160, -1));

        lblEnterParaIngresar.setAlignment(java.awt.Label.CENTER);
        lblEnterParaIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEnterParaIngresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblEnterParaIngresar.setForeground(new java.awt.Color(51, 51, 51));
        lblEnterParaIngresar.setText("Presione ENTER para ingresar");
        pnl2.add(lblEnterParaIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 430, -1));

        getContentPane().add(pnl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 430, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        Fondo fdo = new Fondo();
        fdo.dispose();
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMouseEntered
        BtnCerrar.setBackground(new Color(4, 153, 193));
        BtnCerrar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BtnCerrarMouseEntered

    private void BtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMouseExited
        BtnCerrar.setBackground(new Color(255, 255, 255));
        BtnCerrar.setForeground(new Color(4, 153, 193));
    }//GEN-LAST:event_BtnCerrarMouseExited

    private void txtpaswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaswordKeyPressed
        consUsuario_M consUs = new consUsuario_M();
        usuario_M modUs = new usuario_M();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            modUs.setUser(txtusuario.getText());
            modUs.setPas(txtpasword.getText());

            if (txtusuario.getText().equals("") || txtpasword.getText().equals("")) {

                mensajeER = "<html><center>Todos los campos deben tener informacion,<p>por favor verifique e intente de nuevo.";
                new alertas.Error(JInternalFrame, true).setVisible(true);

            } else {
                consUs.login(modUs);

                if (res.equals("si")) {

                    switch (rol) {

                        case "Administrador":
                            FrmMenuAdmin_J frmAd = new FrmMenuAdmin_J();
                            frmAd.setVisible(true);
                            this.dispose();
                            break;

                        case "Empleado":
                            FrmMenuAdmin_J frmEmp = new FrmMenuAdmin_J();
                            frmEmp.btnDatosHotel.setVisible(false);
                            frmEmp.btnRegEmpleados.setVisible(false);
                            frmEmp.setVisible(true);
                            this.dispose();
                            break;
                        default:

                            break;
                    }
                } else {
                    mensajeER = "<html><center>El usuario o la contraseña son incorrectos, <p> verifique e intente de nuevo.";
                    new alertas.Error(JInternalFrame, true).setVisible(true);
                    limpiar();
                }
            }

        }
    }//GEN-LAST:event_txtpaswordKeyPressed

    private void lblRecupContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecupContraseñaMouseClicked
        FrmARecupContraseña frmPasw = new FrmARecupContraseña(JInternalFrame, rootPaneCheckingEnabled);
        frmPasw.setVisible(true);
    }//GEN-LAST:event_lblRecupContraseñaMouseClicked

    private void txtpaswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpaswordFocusGained
        lblEnterParaIngresar.setVisible(true);
    }//GEN-LAST:event_txtpaswordFocusGained

    public static void main(String args[]) {

        usuario_M modUs = new usuario_M();
        consUsuario_M consUs = new consUsuario_M();
        Login_M frmLog = new Login_M();
        frmLog.setVisible(true);
    }

//***************************************************************** METODOS *************************************************************************
//***************************************************************************************************************************************************
//*************************************************************** METODO LOGIN **********************************************************************
    void mostrar() {

        rsscalelabel.RSScaleLabel.setScaleLabel(Lblimg, "src/img/hotelb5.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbldeco1, "src/img/decorhba.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbldeco2, "src/img/decorhb.png");
        TextHolder usuario = new TextHolder("Ingrese su Usuario", txtusuario);
        TextHolder pasword = new TextHolder("Ingrese su Contraseña", txtpasword);
        setLocationRelativeTo(null);
        txtusuario.requestFocus();
        lblEnterParaIngresar.setVisible(false);

    }
    
     public void limpiar(){
       txtpasword.setText("");
       txtusuario.setText("");
       txtusuario.requestFocus();
       lblEnterParaIngresar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rsbuttoncustom.RSButtonCustom BtnCerrar;
    private javax.swing.JLabel Lblimg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public java.awt.Label lblEnterParaIngresar;
    public java.awt.Label lblRecupContraseña;
    private javax.swing.JLabel lbldeco1;
    private javax.swing.JLabel lbldeco2;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    public javax.swing.JPasswordField txtpasword;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}
