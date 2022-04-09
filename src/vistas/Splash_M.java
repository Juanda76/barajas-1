package vistas;

// @author Software-Max M_O
import java.util.logging.Level;
import java.util.logging.Logger;
import consultas.consUsuario_M;
import modelo.usuario_M;
import rsscalelabel.RSScaleLabel;

public class Splash_M extends javax.swing.JFrame {

    public Splash_M() {
        initComponents();
        RSScaleLabel.setScaleLabel(lblfondo, "src/img/hotelb5.png");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblfondo = new javax.swing.JLabel();
        porcentajecarga = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(4, 153, 193));

        porcentajecarga.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        porcentajecarga.setForeground(new java.awt.Color(255, 255, 255));
        porcentajecarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ProgressBar.setBackground(new java.awt.Color(4, 153, 193));
        ProgressBar.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porcentajecarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(porcentajecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        Fondo fdo = new Fondo();
        fdo.setVisible(true);
        Splash_M sp = new Splash_M();
        sp.setVisible(true);
        
        for (int i = 0; i <= 100; i++) {
            
            try {
                
                Thread.sleep(70);
                sp.ProgressBar.setValue(i);
                sp.porcentajecarga.setText("CARGANDO SISTEMA, POR FAVOR ESPERE .....  " + (Integer.toString(i) + "  % "));

                if (i == 100) {
                    
                    usuario_M modUs = new usuario_M();
                    consUsuario_M consUs = new consUsuario_M();
                    Login_M frmLog = new Login_M();
                    sp.dispose();
                    frmLog.setVisible(true);
                    
                }
                
            } catch (InterruptedException ex) {
                
                Logger.getLogger(Splash_M.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel porcentajecarga;
    // End of variables declaration//GEN-END:variables
}
