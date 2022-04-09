package vistas;

//@author Software_Max M_O
import clases.conectar;
import clases.recursividad;
import com.toedter.calendar.JDateChooser;
import consultas.consHotel_J;
import java.awt.Color;
import java.awt.Frame;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;
import static consultas.consUsuario_M.nom;
import java.sql.Connection;
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

public final class FrmRepIngresos extends javax.swing.JFrame {

    Frame JInternalFrame;
    DefaultTableModel modelo = new DefaultTableModel();
    recursividad rec = new recursividad();

    public FrmRepIngresos() {

        initComponents();
        mostrarDatosHot();

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlFondoRegIng = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnBuscar = new java.awt.Label();
        dcFecFinal = new com.toedter.calendar.JDateChooser();
        dcFecInicial = new com.toedter.calendar.JDateChooser();
        btnGenararRep = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        txtHasta = new javax.swing.JTextField();
        txtDesde = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnValidar = new java.awt.Label();
        btnLimpiar = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepIngreso = new rojerusan.RSTableMetro();
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "REPORTES INGRESOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setAlignment(java.awt.Label.CENTER);
        btnBuscar.setBackground(new java.awt.Color(4, 153, 193));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
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
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 110, -1));

        dcFecFinal.setDateFormatString("yyyy-MM-dd");
        dcFecFinal.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel4.add(dcFecFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        dcFecInicial.setDateFormatString("yyyy-MM-dd");
        dcFecInicial.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel4.add(dcFecInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        btnGenararRep.setAlignment(java.awt.Label.CENTER);
        btnGenararRep.setBackground(new java.awt.Color(4, 153, 193));
        btnGenararRep.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenararRep.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenararRep.setForeground(new java.awt.Color(255, 255, 255));
        btnGenararRep.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGenararRep.setText("GENERAR REPORTE");
        btnGenararRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenararRepMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenararRepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenararRepMouseExited(evt);
            }
        });
        jPanel4.add(btnGenararRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 153, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HASTA :");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 150, 30));
        jPanel4.add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 100, -1));
        jPanel4.add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 153, 193));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESDE :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 150, 30));

        btnValidar.setAlignment(java.awt.Label.CENTER);
        btnValidar.setBackground(new java.awt.Color(4, 153, 193));
        btnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnValidar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setPreferredSize(new java.awt.Dimension(100, 30));
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
        jPanel4.add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 110, -1));

        btnLimpiar.setAlignment(java.awt.Label.CENTER);
        btnLimpiar.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 30));
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
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 110, -1));

        tblRepIngreso.setAutoCreateRowSorter(true);
        tblRepIngreso.setBackground(new java.awt.Color(4, 153, 193));
        tblRepIngreso.setForeground(new java.awt.Color(255, 255, 255));
        tblRepIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "CONCEPTO", "VALOR", "REGISTRA"
            }
        ));
        tblRepIngreso.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblRepIngreso.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblRepIngreso.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblRepIngreso.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblRepIngreso.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblRepIngreso.setFuenteFilas(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblRepIngreso.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblRepIngreso.setFuenteHead(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tblRepIngreso.setMultipleSeleccion(false);
        tblRepIngreso.setPreferredSize(new java.awt.Dimension(695, 271));
        tblRepIngreso.setSelectionBackground(new java.awt.Color(13, 41, 66));
        jScrollPane1.setViewportView(tblRepIngreso);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, 1270, 320));

        javax.swing.GroupLayout pnlFondoRegIngLayout = new javax.swing.GroupLayout(pnlFondoRegIng);
        pnlFondoRegIng.setLayout(pnlFondoRegIngLayout);
        pnlFondoRegIngLayout.setHorizontalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoRegIngLayout.setVerticalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        pnlDatos2.add(lblLocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 68, 540, -1));

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
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlDatos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/cerrar.png");
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(4, 153, 193));
        btnBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(0, 204, 204));
        btnBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnGenararRepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenararRepMouseEntered
        btnGenararRep.setBackground(new Color(0, 204, 204));
        btnGenararRep.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenararRepMouseEntered

    private void btnGenararRepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenararRepMouseExited
        btnGenararRep.setBackground(new Color(4, 153, 193));
        btnGenararRep.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenararRepMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String fec1 = txtDesde.getText();
        String fec2 = txtHasta.getText();
        listarIngr(fec1, fec2);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnValidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseClicked
        String f1 = rec.convertirFecha(dcFecInicial);
        String f2 = rec.convertirFecha(dcFecFinal);
        txtDesde.setText(f1);
        txtHasta.setText(f2);
        String fc1, fc2;
        fc1 = txtDesde.getText();
        fc2 = txtHasta.getText();
        btnBuscar.setVisible(true);
        btnValidar.setVisible(false);
    }//GEN-LAST:event_btnValidarMouseClicked

    private void btnValidarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseEntered
        btnValidar.setBackground(new Color(0, 204, 204));
        btnValidar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarMouseEntered

    private void btnValidarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseExited
        btnValidar.setBackground(new Color(4, 153, 193));
        btnValidar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarMouseExited

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();

    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0, 204, 204));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(4, 153, 193));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnGenararRepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenararRepMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/RIngresos.jasper"));
            Map parametro = new HashMap();
            parametro.put("desde", txtDesde.getText());
            parametro.put("hasta", txtHasta.getText());
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametro, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_btnGenararRepMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FrmRepIngresos ing = new FrmRepIngresos();
        ing.setVisible(true);
    }

//************************************************METODOS *************************************************************************************
//**************************************************** DATOS HOTEL ****************************************************************************
    public void mostrarDatosHot() {

        hotel_J ht = new hotel_J();
        consHotel_J cons = new consHotel_J();
        cons.nombreHot(ht);
        lblNomHotel.setText("HOTEL  " + ht.getNombre());
        lblNomUser.setText(nom);
        lblLocalizacion.setText(ht.getMunicipio());
        lblFecha.setText(consHotel_J.fechaActual().toUpperCase());
        //hasta aca son datos del hotel
        //************************************************************
        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");
        btnBuscar.setVisible(false);
        txtHasta.setVisible(false);
        txtDesde.setVisible(false);

    }




//********************************************************BTN GUARDAR*****************************************************************************
    public void listarIngr(String val1, String val2) {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"FECHA", "CONCEPTO", "VALOR", "REGISTRA"};

        modelo.setColumnIdentifiers(Titulos);
        this.tblRepIngreso.setModel(modelo);

        try {

            String ConsultaSQL = "CALL VER_INGRESOS('" + val1 + "','" + val2 + "')";

            String[] registros = new String[4];

            Statement st = con.createStatement();
            rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("fecha");
                registros[1] = rs.getString("concepto");
                registros[2] = rs.getString("valor");
                registros[3] = rs.getString("registra");
                modelo.addRow(registros);

            }
            tblRepIngreso.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//************************************* LIMPIAR TABLA ************************************************************************

    private void limpiarTabla() {
        for (int i = 0; i < tblRepIngreso.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

//************************************* LIMPIAR TODO ************************************************************************
    private void limpiar() {
        dcFecFinal.setDate(null);
        dcFecInicial.setDate(null);
        txtDesde.setText("");
        txtHasta.setText("");
        btnBuscar.setVisible(false);
        btnValidar.setVisible(true);
        limpiarTabla();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnBuscar;
    public java.awt.Label btnGenararRep;
    public java.awt.Label btnLimpiar;
    public javax.swing.JLabel btnSalir;
    public java.awt.Label btnValidar;
    public com.toedter.calendar.JDateChooser dcFecFinal;
    public com.toedter.calendar.JDateChooser dcFecInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
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
    public static rojerusan.RSTableMetro tblRepIngreso;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtHasta;
    // End of variables declaration//GEN-END:variables
}
