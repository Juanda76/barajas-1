package vistas;

//@author Software_Max M_O
import clases.conectar;
import clases.recursividad;
import com.toedter.calendar.JDateChooser;
import static consultas.consUsuario_M.nom;
import modelo.ingresos_M;
import consultas.consIngresos_M;
import java.awt.Color;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Date;
import consultas.consHotel_J;
import java.sql.Connection;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public final class FrmRepGastos extends javax.swing.JFrame {

    Frame JInternalFrame;
    consIngresos_M conIngr = new consIngresos_M();
    ingresos_M ing = new ingresos_M();
    public static DefaultTableModel modeloGas = new DefaultTableModel();
    recursividad rec = new recursividad();

    public FrmRepGastos() {
        initComponents();
        mostrarDatosHot();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
        pnlFondoRegIng = new javax.swing.JPanel();
        pnlGastos = new javax.swing.JPanel();
        dcFecInicial = new com.toedter.calendar.JDateChooser();
        dcFecFinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        btnValidar = new java.awt.Label();
        btnLimpiar = new java.awt.Label();
        btnGReporte = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepGastos = new rojerusan.RSTableMetro();
        btnBuscar = new java.awt.Label();
        pnlDatos2 = new javax.swing.JPanel();
        lblCara = new javax.swing.JLabel();
        lblLocalizacion = new javax.swing.JLabel();
        lblNomHotel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblsaludo6 = new javax.swing.JLabel();
        lblSotMax = new javax.swing.JLabel();
        lblsaludo9 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHola = new javax.swing.JLabel();
        lblNomUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setPreferredSize(new java.awt.Dimension(1350, 735));

        pnlFondoRegIng.setBackground(new java.awt.Color(4, 153, 193));

        pnlGastos.setBackground(new java.awt.Color(255, 255, 255));
        pnlGastos.setPreferredSize(new java.awt.Dimension(1270, 500));
        pnlGastos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlGastos.add(dcFecInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 177, 29));
        pnlGastos.add(dcFecFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 175, 32));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 153, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DESDE:");
        pnlGastos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 153, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HASTA:");
        pnlGastos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        txtDesde.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pnlGastos.add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        txtHasta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pnlGastos.add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 80, 20));

        btnValidar.setAlignment(java.awt.Label.CENTER);
        btnValidar.setBackground(new java.awt.Color(4, 153, 193));
        btnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnValidar.setText("VALIDAR");
        btnValidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValidarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValidarMouseExited(evt);
            }
        });
        pnlGastos.add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        btnLimpiar.setAlignment(java.awt.Label.CENTER);
        btnLimpiar.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        pnlGastos.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, -1, -1));

        btnGReporte.setAlignment(java.awt.Label.CENTER);
        btnGReporte.setBackground(new java.awt.Color(4, 153, 193));
        btnGReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGReporte.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnGReporte.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGReporte.setText("GENERAR REPORTE");
        btnGReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGReporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGReporteMouseExited(evt);
            }
        });
        pnlGastos.add(btnGReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, -1, -1));

        tblRepGastos.setBackground(new java.awt.Color(4, 153, 193));
        tblRepGastos.setForeground(new java.awt.Color(255, 255, 255));
        tblRepGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "CONCEPTO", "VALOR", "REGISTRA"
            }
        ));
        tblRepGastos.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblRepGastos.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblRepGastos.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblRepGastos.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblRepGastos.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblRepGastos.setFuenteFilas(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblRepGastos.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblRepGastos.setFuenteHead(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tblRepGastos.setMultipleSeleccion(false);
        tblRepGastos.setPreferredSize(new java.awt.Dimension(695, 271));
        tblRepGastos.setSelectionBackground(new java.awt.Color(13, 41, 66));
        jScrollPane1.setViewportView(tblRepGastos);

        pnlGastos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1278, 320));

        btnBuscar.setAlignment(java.awt.Label.CENTER);
        btnBuscar.setBackground(new java.awt.Color(4, 153, 193));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        pnlGastos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        javax.swing.GroupLayout pnlFondoRegIngLayout = new javax.swing.GroupLayout(pnlFondoRegIng);
        pnlFondoRegIng.setLayout(pnlFondoRegIngLayout);
        pnlFondoRegIngLayout.setHorizontalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoRegIngLayout.setVerticalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlDatos2.setBackground(new java.awt.Color(4, 153, 193));
        pnlDatos2.setPreferredSize(new java.awt.Dimension(1350, 117));
        pnlDatos2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCara.setPreferredSize(new java.awt.Dimension(80, 80));
        pnlDatos2.add(lblCara, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, -1, 79));

        lblLocalizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocalizacion.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocalizacion.setText("LOCALIZADO EN");
        pnlDatos2.add(lblLocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 540, -1));

        lblNomHotel.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lblNomHotel.setForeground(new java.awt.Color(255, 255, 255));
        lblNomHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomHotel.setText("NOMBRE HOTEL");
        pnlDatos2.add(lblNomHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 8, 540, -1));

        jPanel3.setBackground(new java.awt.Color(4, 153, 193));

        lblsaludo6.setFont(new java.awt.Font("sansserif", 1, 8)); // NOI18N
        lblsaludo6.setForeground(new java.awt.Color(255, 255, 255));
        lblsaludo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsaludo6.setText("DESARROLLADO POR");

        lblSotMax.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSotMax.setForeground(new java.awt.Color(255, 255, 255));
        lblSotMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSotMax.setPreferredSize(new java.awt.Dimension(40, 50));

        lblsaludo9.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        lblsaludo9.setForeground(new java.awt.Color(255, 255, 255));
        lblsaludo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsaludo9.setText("SOFTWARE MAX");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblsaludo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSotMax, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsaludo6))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsaludo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSotMax, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsaludo9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatos2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 8, -1, -1));

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
        pnlDatos2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1301, 8, -1, -1));

        lblFecha.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha.setText("FECHA COMPLETA");
        pnlDatos2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 270, -1));

        lblHola.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblHola.setForeground(new java.awt.Color(255, 255, 255));
        lblHola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHola.setText("HOLA ");
        pnlDatos2.add(lblHola, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, -1));

        lblNomUser.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblNomUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNomUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomUser.setText("NU");
        pnlDatos2.add(lblNomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 160, -1));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);
        pnlFondo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        FrmMenuAdmin_J frmAdm = new FrmMenuAdmin_J();
        frmAdm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/cerrar.png");
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnValidarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseEntered
        btnValidar.setBackground(new Color(0, 204, 204));
        btnValidar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarMouseEntered

    private void btnValidarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseExited
        btnValidar.setBackground(new Color(4, 153, 193));
        btnValidar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarMouseExited

    private void btnValidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseClicked
        String f1 = pasarFechas(dcFecInicial);
        String f2 = pasarFechas(dcFecFinal);
        txtDesde.setText(f1);
        txtHasta.setText(f2);
        String fc1, fc2;
        fc1 = txtDesde.getText();
        fc2 = txtHasta.getText();
        btnBuscar.setVisible(true);
        btnValidar.setVisible(false);
    }//GEN-LAST:event_btnValidarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        dcFecFinal.setDate(null);
        dcFecInicial.setDate(null);
        txtDesde.setText("");
        txtHasta.setText("");
        btnBuscar.setVisible(false);
        btnValidar.setVisible(true);
       rec.limpiarTabla(tblRepGastos, modeloGas);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0, 204, 204));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(4, 153, 193));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnGReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGReporteMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/Reporte_Gastos.jasper"));
            Map parametro = new HashMap();
            parametro.put("desde", txtDesde.getText());
            parametro.put("hasta", txtHasta.getText());
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametro, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnGReporteMouseClicked

    private void btnGReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGReporteMouseEntered
        btnGReporte.setBackground(new Color(0, 204, 204));
        btnGReporte.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGReporteMouseEntered

    private void btnGReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGReporteMouseExited
        btnGReporte.setBackground(new Color(4, 153, 193));
        btnGReporte.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGReporteMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String fec1 = txtDesde.getText();
        String fec2 = txtHasta.getText();
        listarGast(fec1, fec2);

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(0, 204, 204));
        btnBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(4, 153, 193));
        btnBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseExited

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
            java.util.logging.Logger.getLogger(FrmRepGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRepGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRepGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRepGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        FrmRepGastos GasR = new FrmRepGastos();
        GasR.setVisible(true);
    }

//**************************************************** DATOS HOTEL *****************************************************************************
    public void mostrarDatosHot() {

        hotel_J ht = new hotel_J();
        consHotel_J cons = new consHotel_J();
        cons.nombreHot(ht);
        lblNomHotel.setText("HOTEL  " + ht.getNombre());
        lblNomUser.setText(nom);
        lblLocalizacion.setText(ht.getMunicipio());
        lblFecha.setText(consHotel_J.fechaActual().toUpperCase());
        //hasta aca son datos del hotel
        //**************************************************************
        //FECHA DEL SISTEMA
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
//        txtFechaG.setText(formato.format(sistFecha));
//        txtConceptoG.requestFocus();
        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");

        //****************
        btnBuscar.setVisible(false);
        txtHasta.setVisible(false);
        txtDesde.setVisible(false);
    }

    //*************************************************************************************************************************
    public String pasarFechas(JDateChooser jdtFec1) {

        String fecha;
        int dia, mes, year;
        dia = jdtFec1.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes = jdtFec1.getCalendar().get(Calendar.MONTH) + 1;
        year = jdtFec1.getCalendar().get(Calendar.YEAR);
        if (mes <= 9) {
            fecha = (year + "-" + "0" + mes + "-" + dia);
        } else {
            fecha = (year + "-" + mes + "-" + dia);
        }
        return fecha;
    }

    //*******************BTN GUARDAR**************************
    public void listarGast(String val1, String val2) {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"FECHA", "CONCEPTO", "VALOR", "REGISTRA"};

        modeloGas.setColumnIdentifiers(Titulos);
        this.tblRepGastos.setModel(modeloGas);

        try {

            String ConsultaSQL = "CALL VER_GASTO('" + val1 + "','" + val2 + "')";

            String[] registros = new String[4];

            Statement st = con.createStatement();
            rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("fecha");
                registros[1] = rs.getString("concepto");
                registros[2] = rs.getString("valor");
                registros[3] = rs.getString("registra");
                modeloGas.addRow(registros);

            }
            tblRepGastos.setModel(modeloGas);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnBuscar;
    public java.awt.Label btnGReporte;
    public java.awt.Label btnLimpiar;
    public javax.swing.JLabel btnSalir;
    public java.awt.Label btnValidar;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dcFecFinal;
    private com.toedter.calendar.JDateChooser dcFecInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCara;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHola;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomUser;
    public javax.swing.JLabel lblSotMax;
    public javax.swing.JLabel lblsaludo6;
    public javax.swing.JLabel lblsaludo9;
    private javax.swing.JPanel pnlDatos2;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoRegIng;
    public javax.swing.JPanel pnlGastos;
    public static rojerusan.RSTableMetro tblRepGastos;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtHasta;
    // End of variables declaration//GEN-END:variables

}
