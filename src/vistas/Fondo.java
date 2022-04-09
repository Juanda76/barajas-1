package vistas;


public class Fondo extends javax.swing.JFrame {

    public Fondo() {
        
        initComponents(); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupNacionalidad = new javax.swing.ButtonGroup();
        btnGrupDesayuno = new javax.swing.ButtonGroup();
        btnGrupPago = new javax.swing.ButtonGroup();
        btnGrupTours = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setExtendedState(6);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(4, 153, 193));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1348, Short.MAX_VALUE)
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //************************************VOID MAIN **************************************************************
    public static void main(String args[]) {
        
        Fondo frmFnd = new Fondo();
        frmFnd.setVisible(true);

    }







    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup btnGrupDesayuno;
    public javax.swing.ButtonGroup btnGrupNacionalidad;
    public javax.swing.ButtonGroup btnGrupPago;
    public javax.swing.ButtonGroup btnGrupTours;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables

}
