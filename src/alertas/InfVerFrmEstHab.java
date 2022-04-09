package alertas;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojerusan.RSAnimation;
import rsscalelabel.RSScaleLabel;
import static controlador.ctrlPagosPend_J.mensajeINFOEstHab;

// @author Software_Max(JDV)

public class InfVerFrmEstHab extends javax.swing.JDialog {

    public static String resInfo = null;
    
    public InfVerFrmEstHab(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnOK.setVisible(false);
        RSAnimation.setBajar(-300, 250, 1, 3, this);
        setLocationRelativeTo(null);
        RSScaleLabel.setScaleLabel(lblImgInf, "src/imgAlert/if.png");
        lblMsgINF.setText(mensajeINFOEstHab);
        


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        pnlCabeInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblImgInf = new javax.swing.JLabel();
        btnAceptInfo = new java.awt.Label();
        lblMsgINF = new javax.swing.JLabel();
        btnCancelar = new java.awt.Label();
        btnOK = new java.awt.Label();

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

        btnAceptInfo.setAlignment(java.awt.Label.CENTER);
        btnAceptInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptInfo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAceptInfo.setForeground(new java.awt.Color(0, 118, 222));
        btnAceptInfo.setMinimumSize(new java.awt.Dimension(30, 30));
        btnAceptInfo.setPreferredSize(new java.awt.Dimension(150, 28));
        btnAceptInfo.setText("ACEPTAR");
        btnAceptInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptInfoMouseExited(evt);
            }
        });

        lblMsgINF.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lblMsgINF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsgINF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMsgINF.setPreferredSize(new java.awt.Dimension(370, 120));

        btnCancelar.setAlignment(java.awt.Label.CENTER);
        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 118, 222));
        btnCancelar.setMinimumSize(new java.awt.Dimension(30, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 28));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });

        btnOK.setAlignment(java.awt.Label.CENTER);
        btnOK.setBackground(new java.awt.Color(255, 255, 255));
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOK.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnOK.setForeground(new java.awt.Color(0, 118, 222));
        btnOK.setMinimumSize(new java.awt.Dimension(30, 30));
        btnOK.setPreferredSize(new java.awt.Dimension(150, 28));
        btnOK.setText("ACEPTAR");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOKMouseExited(evt);
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
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnAceptInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addComponent(pnlCabeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMsgINF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAceptInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptInfoMouseClicked
        resInfo = "ver";
        try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(InfVerFrmEstHab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptInfoMouseClicked

    private void btnAceptInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptInfoMouseEntered
        btnAceptInfo.setBackground(new Color(0, 118, 222));
        btnAceptInfo.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnAceptInfoMouseEntered

    private void btnAceptInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptInfoMouseExited
        btnAceptInfo.setBackground(Color.WHITE);
        btnAceptInfo.setForeground(new Color(0, 118, 222));
    }//GEN-LAST:event_btnAceptInfoMouseExited

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        resInfo = "continuar";
         try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(InfVerFrmEstHab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(0, 118, 222));
        btnCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
         btnCancelar.setBackground(Color.WHITE);
        btnCancelar.setForeground(new Color(0, 118, 222));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
          try {
            RSAnimation.setSubir(250, -330, 1, 3, this);
            Thread.sleep(500);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(InfVerFrmEstHab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOKMouseClicked

    private void btnOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseEntered
        btnCancelar.setBackground(new Color(0, 118, 222));
        btnCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnOKMouseEntered

    private void btnOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseExited
        btnCancelar.setBackground(Color.WHITE);
        btnCancelar.setForeground(new Color(0, 118, 222));
    }//GEN-LAST:event_btnOKMouseExited

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
                InfVerFrmEstHab dialogI = new InfVerFrmEstHab(new javax.swing.JFrame(), true);
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
    public java.awt.Label btnAceptInfo;
    public java.awt.Label btnCancelar;
    public java.awt.Label btnOK;
    private javax.swing.JLabel lblImgInf;
    private javax.swing.JLabel lblInfo;
    public static javax.swing.JLabel lblMsgINF;
    private javax.swing.JPanel pnlCabeInfo;
    private javax.swing.JPanel pnlInfo;
    // End of variables declaration//GEN-END:variables
}
