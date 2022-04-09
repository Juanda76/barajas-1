package alertas;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojerusan.RSAnimation;
import rsscalelabel.RSScaleLabel;
import static controlador.ctrlEstadoHabit_J.mensajeINFCheck;

// @author Software_Max(JDV)

public class InfChekSiNo extends javax.swing.JDialog {

    public static String resCheck = null;
    
    public InfChekSiNo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        RSAnimation.setBajar(-300, 250, 1, 3, this);
        setLocationRelativeTo(null);
        RSScaleLabel.setScaleLabel(lblImgInf, "src/imgAlert/if.png");
        lblMsgINF.setText(mensajeINFCheck);
        


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        pnlCabeInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblImgInf = new javax.swing.JLabel();
        lblMsgINF = new javax.swing.JLabel();
        btnNo = new java.awt.Label();
        btnSi = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        pnlInfo.setPreferredSize(new java.awt.Dimension(380, 265));

        pnlCabeInfo.setBackground(new java.awt.Color(0, 118, 222));
        pnlCabeInfo.setPreferredSize(new java.awt.Dimension(380, 85));

        lblInfo.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("INFORMACION  !!");

        lblImgInf.setPreferredSize(new java.awt.Dimension(70, 70));

        javax.swing.GroupLayout pnlCabeInfoLayout = new javax.swing.GroupLayout(pnlCabeInfo);
        pnlCabeInfo.setLayout(pnlCabeInfoLayout);
        pnlCabeInfoLayout.setHorizontalGroup(
            pnlCabeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeInfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblImgInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCabeInfoLayout.setVerticalGroup(
            pnlCabeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeInfoLayout.createSequentialGroup()
                .addGroup(pnlCabeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCabeInfoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblInfo))
                    .addGroup(pnlCabeInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImgInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        lblMsgINF.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lblMsgINF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsgINF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMsgINF.setPreferredSize(new java.awt.Dimension(370, 120));

        btnNo.setAlignment(java.awt.Label.CENTER);
        btnNo.setBackground(new java.awt.Color(255, 255, 255));
        btnNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnNo.setForeground(new java.awt.Color(0, 118, 222));
        btnNo.setMinimumSize(new java.awt.Dimension(30, 30));
        btnNo.setPreferredSize(new java.awt.Dimension(150, 28));
        btnNo.setText("NO");
        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNoMouseExited(evt);
            }
        });

        btnSi.setAlignment(java.awt.Label.CENTER);
        btnSi.setBackground(new java.awt.Color(255, 255, 255));
        btnSi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSi.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSi.setForeground(new java.awt.Color(0, 118, 222));
        btnSi.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSi.setPreferredSize(new java.awt.Dimension(150, 28));
        btnSi.setText("SI");
        btnSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsgINF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addComponent(pnlCabeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMsgINF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, 267, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseClicked
        resCheck = "no";
         try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(InfChekSiNo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNoMouseClicked

    private void btnNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseEntered
        btnNo.setBackground(new Color(0, 118, 222));
        btnNo.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnNoMouseEntered

    private void btnNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseExited
         btnNo.setBackground(Color.WHITE);
        btnNo.setForeground(new Color(0, 118, 222));
    }//GEN-LAST:event_btnNoMouseExited

    private void btnSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseClicked
        resCheck = "si"; 
        try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(InfChekSiNo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiMouseClicked

    private void btnSiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseEntered
        btnSi.setBackground(new Color(0, 118, 222));
        btnSi.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSiMouseEntered

    private void btnSiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseExited
        btnSi.setBackground(Color.WHITE);
        btnSi.setForeground(new Color(0, 118, 222));
    }//GEN-LAST:event_btnSiMouseExited

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
                InfChekSiNo dialogI = new InfChekSiNo(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnNo;
    public java.awt.Label btnSi;
    private javax.swing.JLabel lblImgInf;
    private javax.swing.JLabel lblInfo;
    public static javax.swing.JLabel lblMsgINF;
    private javax.swing.JPanel pnlCabeInfo;
    private javax.swing.JPanel pnlInfo;
    // End of variables declaration//GEN-END:variables
}
