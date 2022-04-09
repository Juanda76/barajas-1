package alertas;

//import static FormAdmin.FI_Tarifas.mensajeALDEL;
import static controlador.ctrlHotel_J.mensajeALDEL;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojerusan.RSAnimation;
import rsscalelabel.RSScaleLabel;

// @author Software_Max(JDV)

public class AlertaDelete extends javax.swing.JDialog {

    public static String res = null;
    
    public AlertaDelete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        RSAnimation.setBajar(-300, 250, 1, 3, this);
        setLocationRelativeTo(null);
        RSScaleLabel.setScaleLabel(lblimg, "src/imgAlert/alert.gif");
        lblMsgAlertaDEL.setText(mensajeALDEL);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        btnSI = new java.awt.Label();
        lblMsgAlertaDEL = new javax.swing.JLabel();
        btnNO = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALERTA!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        btnSI.setAlignment(java.awt.Label.CENTER);
        btnSI.setBackground(new java.awt.Color(255, 255, 255));
        btnSI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSI.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSI.setForeground(new java.awt.Color(255, 204, 0));
        btnSI.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSI.setText("ACEPTAR");
        btnSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSIMouseExited(evt);
            }
        });

        lblMsgAlertaDEL.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lblMsgAlertaDEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnNO.setAlignment(java.awt.Label.CENTER);
        btnNO.setBackground(new java.awt.Color(255, 255, 255));
        btnNO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNO.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnNO.setForeground(new java.awt.Color(255, 204, 0));
        btnNO.setMinimumSize(new java.awt.Dimension(30, 30));
        btnNO.setText("CANCELAR");
        btnNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNOMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsgAlertaDEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnNO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMsgAlertaDEL, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSIMouseClicked
       res="si";
        try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(AlertaDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSIMouseClicked

    private void btnSIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSIMouseEntered
        btnSI.setBackground(new Color(255, 204, 0));
        btnSI.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSIMouseEntered

    private void btnSIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSIMouseExited
        btnSI.setBackground(Color.WHITE);
        btnSI.setForeground(new Color(255, 204, 0));
    }//GEN-LAST:event_btnSIMouseExited

    private void btnNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOMouseClicked
       res="no";
        try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(AlertaDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNOMouseClicked

    private void btnNOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOMouseEntered
        btnNO.setBackground(new Color(255, 204, 0));
        btnNO.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnNOMouseEntered

    private void btnNOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOMouseExited
        btnNO.setBackground(Color.WHITE);
        btnNO.setForeground(new Color(255, 204, 0));
    }//GEN-LAST:event_btnNOMouseExited

    /**
     * @param args the command line arguments
     */
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
                AlertaDelete dialogA = new AlertaDelete(new javax.swing.JFrame(), true);
                dialogA.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialogA.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label btnNO;
    private java.awt.Label btnSI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblMsgAlertaDEL;
    private javax.swing.JLabel lblimg;
    // End of variables declaration//GEN-END:variables
}
