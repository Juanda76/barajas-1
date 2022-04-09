package vistas;

//@author Software_Max M_O
import clases.conectar;
import clases.recursividad;
import consultas.consHotel_J;
import java.awt.Color;
import java.awt.Frame;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;
import static consultas.consUsuario_M.nom;
import static controlador.ctrlHotel_J.mensajeER;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public final class FrmRepGastIngre extends javax.swing.JFrame {

    Frame JInternalFrame;
    public static DefaultTableModel modeloGas = new DefaultTableModel();
    public static DefaultTableModel modeloIng = new DefaultTableModel();
    recursividad rec = new recursividad();
   
    public FrmRepGastIngre() {

        initComponents();
        mostrarDatosHot();

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
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
        pnlFondoRegIng = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pnlIngresos = new javax.swing.JPanel();
        dcFecInicialE = new com.toedter.calendar.JDateChooser();
        dcFecFinalE = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDesdeE = new javax.swing.JTextField();
        txtHastaE = new javax.swing.JTextField();
        btnBuscarE = new java.awt.Label();
        btnValidarE = new java.awt.Label();
        btnLimpiarE = new java.awt.Label();
        btnGenararRepE = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepIngreso = new rojerusan.RSTableMetro();
        pnlGastos = new javax.swing.JPanel();
        dcFecInicialG = new com.toedter.calendar.JDateChooser();
        dcFecFinalG = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDesdeG = new javax.swing.JTextField();
        txtHastaG = new javax.swing.JTextField();
        btnBuscarG = new java.awt.Label();
        btnValidarG = new java.awt.Label();
        btnLimpiarG = new java.awt.Label();
        btnGReporteG = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRepGastos = new rojerusan.RSTableMetro();
        pnlMenu = new javax.swing.JPanel();
        rbtGastos = new javax.swing.JRadioButton();
        rbtIngresos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setPreferredSize(new java.awt.Dimension(1350, 735));

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

        pnlFondoRegIng.setBackground(new java.awt.Color(4, 153, 193));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "REPORTES GASTOS E INGRESOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIngresos.setBackground(new java.awt.Color(255, 255, 255));
        pnlIngresos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 153, 193), 2), "INGRESOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(4, 153, 193))); // NOI18N
        pnlIngresos.setForeground(new java.awt.Color(4, 153, 193));
        pnlIngresos.setEnabled(false);
        pnlIngresos.setPreferredSize(new java.awt.Dimension(1270, 500));
        pnlIngresos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dcFecInicialE.setDateFormatString("yyyy-MM-dd");
        dcFecInicialE.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlIngresos.add(dcFecInicialE, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        dcFecFinalE.setDateFormatString("yyyy-MM-dd");
        dcFecFinalE.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlIngresos.add(dcFecFinalE, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 153, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HASTA :");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlIngresos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 153, 193));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESDE :");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlIngresos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));
        pnlIngresos.add(txtDesdeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, -1));
        pnlIngresos.add(txtHastaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, -1));

        btnBuscarE.setAlignment(java.awt.Label.CENTER);
        btnBuscarE.setBackground(new java.awt.Color(4, 153, 193));
        btnBuscarE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarE.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBuscarE.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarE.setPreferredSize(new java.awt.Dimension(110, 30));
        btnBuscarE.setText("BUSCAR");
        btnBuscarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarEMouseExited(evt);
            }
        });
        pnlIngresos.add(btnBuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, -1, -1));

        btnValidarE.setAlignment(java.awt.Label.CENTER);
        btnValidarE.setBackground(new java.awt.Color(4, 153, 193));
        btnValidarE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnValidarE.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnValidarE.setForeground(new java.awt.Color(255, 255, 255));
        btnValidarE.setPreferredSize(new java.awt.Dimension(110, 30));
        btnValidarE.setText("VALIDAR");
        btnValidarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidarEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValidarEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValidarEMouseExited(evt);
            }
        });
        pnlIngresos.add(btnValidarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, -1, -1));

        btnLimpiarE.setAlignment(java.awt.Label.CENTER);
        btnLimpiarE.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarE.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarE.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarE.setPreferredSize(new java.awt.Dimension(110, 30));
        btnLimpiarE.setText("LIMPIAR");
        btnLimpiarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarEMouseExited(evt);
            }
        });
        pnlIngresos.add(btnLimpiarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, -1, -1));

        btnGenararRepE.setAlignment(java.awt.Label.CENTER);
        btnGenararRepE.setBackground(new java.awt.Color(4, 153, 193));
        btnGenararRepE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenararRepE.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenararRepE.setForeground(new java.awt.Color(255, 255, 255));
        btnGenararRepE.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGenararRepE.setText("GENERAR REPORTE");
        btnGenararRepE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenararRepEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenararRepEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenararRepEMouseExited(evt);
            }
        });
        pnlIngresos.add(btnGenararRepE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

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

        pnlIngresos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1230, 320));

        jPanel4.add(pnlIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        pnlGastos.setBackground(new java.awt.Color(255, 255, 255));
        pnlGastos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 153, 193), 2), "GASTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(4, 153, 193))); // NOI18N
        pnlGastos.setPreferredSize(new java.awt.Dimension(1270, 500));
        pnlGastos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dcFecInicialG.setDateFormatString("yyyy-MM-dd");
        dcFecInicialG.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlGastos.add(dcFecInicialG, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        dcFecFinalG.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlGastos.add(dcFecFinalG, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 153, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DESDE:");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlGastos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 153, 193));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HASTA:");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlGastos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        txtDesdeG.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pnlGastos.add(txtDesdeG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        txtHastaG.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pnlGastos.add(txtHastaG, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 80, 20));

        btnBuscarG.setAlignment(java.awt.Label.CENTER);
        btnBuscarG.setBackground(new java.awt.Color(4, 153, 193));
        btnBuscarG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarG.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBuscarG.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarG.setPreferredSize(new java.awt.Dimension(110, 30));
        btnBuscarG.setText("BUSCAR");
        btnBuscarG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarGMouseExited(evt);
            }
        });
        pnlGastos.add(btnBuscarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, -1, -1));

        btnValidarG.setAlignment(java.awt.Label.CENTER);
        btnValidarG.setBackground(new java.awt.Color(4, 153, 193));
        btnValidarG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidarG.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnValidarG.setForeground(new java.awt.Color(255, 255, 255));
        btnValidarG.setPreferredSize(new java.awt.Dimension(110, 30));
        btnValidarG.setText("VALIDAR");
        btnValidarG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidarGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValidarGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValidarGMouseExited(evt);
            }
        });
        pnlGastos.add(btnValidarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, -1, -1));

        btnLimpiarG.setAlignment(java.awt.Label.CENTER);
        btnLimpiarG.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarG.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarG.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarG.setPreferredSize(new java.awt.Dimension(110, 30));
        btnLimpiarG.setText("LIMPIAR");
        btnLimpiarG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarGMouseExited(evt);
            }
        });
        pnlGastos.add(btnLimpiarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, -1, -1));

        btnGReporteG.setAlignment(java.awt.Label.CENTER);
        btnGReporteG.setBackground(new java.awt.Color(4, 153, 193));
        btnGReporteG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGReporteG.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGReporteG.setForeground(new java.awt.Color(255, 255, 255));
        btnGReporteG.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGReporteG.setText("GENERAR REPORTE");
        btnGReporteG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGReporteGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGReporteGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGReporteGMouseExited(evt);
            }
        });
        pnlGastos.add(btnGReporteG, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        tblRepGastos.setAutoCreateRowSorter(true);
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
        jScrollPane3.setViewportView(tblRepGastos);

        pnlGastos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1230, 320));

        jPanel4.add(pnlGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        pnlMenu.setBackground(new java.awt.Color(4, 153, 193));
        pnlMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 153, 193)), "SELECCIONE EL FILTRO PARA SU REPORTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        rbtGastos.setBackground(new java.awt.Color(4, 153, 193));
        buttonGroup1.add(rbtGastos);
        rbtGastos.setForeground(new java.awt.Color(255, 255, 255));
        rbtGastos.setText("GASTOS");
        rbtGastos.setBorder(null);
        rbtGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtGastosActionPerformed(evt);
            }
        });

        rbtIngresos.setBackground(new java.awt.Color(4, 153, 193));
        buttonGroup1.add(rbtIngresos);
        rbtIngresos.setForeground(new java.awt.Color(255, 255, 255));
        rbtIngresos.setText("INGRESOS");
        rbtIngresos.setBorder(null);
        rbtIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(rbtGastos)
                .addGap(412, 412, 412)
                .addComponent(rbtIngresos)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtIngresos)
                    .addComponent(rbtGastos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1270, 60));

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

    private void rbtGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtGastosActionPerformed
        pnlGastos.setVisible(true);
        pnlIngresos.setVisible(false);
    }//GEN-LAST:event_rbtGastosActionPerformed

    private void rbtIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtIngresosActionPerformed
        pnlIngresos.setVisible(true);
        pnlGastos.setVisible(false);
    }//GEN-LAST:event_rbtIngresosActionPerformed

    private void btnBuscarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEMouseClicked
        String fec1 = txtDesdeE.getText();
        String fec2 = txtHastaE.getText();
        listarIngr(fec1, fec2);
         if (!listarIngr(fec1, fec2)) {
            mensajeER = "<html><center>No hay ingresos para mostrar <p>en el rango de fechas, intenta de nuevo";
            new alertas.Error(JInternalFrame, true).setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarEMouseClicked

    private void btnBuscarEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEMouseEntered
        btnBuscarE.setBackground(new Color(0, 204, 204));
        btnBuscarE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarEMouseEntered

    private void btnBuscarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEMouseExited
        btnBuscarE.setBackground(new Color(4, 153, 193));
        btnBuscarE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarEMouseExited

    private void btnGenararRepEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenararRepEMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/RIngresos.jasper"));
            Map parametro = new HashMap();
            parametro.put("desde", txtDesdeE.getText());
            parametro.put("hasta", txtHastaE.getText());
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametro, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btnGenararRepEMouseClicked

    private void btnGenararRepEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenararRepEMouseEntered
        btnGenararRepE.setBackground(new Color(0, 204, 204));
        btnGenararRepE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenararRepEMouseEntered

    private void btnGenararRepEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenararRepEMouseExited
        btnGenararRepE.setBackground(new Color(4, 153, 193));
        btnGenararRepE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenararRepEMouseExited

    private void btnValidarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarEMouseClicked
        String f1 = rec.convertirFecha(dcFecInicialE);
        String f2 = rec.convertirFecha(dcFecFinalE);
        txtDesdeE.setText(f1);
        txtHastaE.setText(f2);
        String fc1, fc2;
        fc1 = txtDesdeE.getText();
        fc2 = txtHastaE.getText();
        btnBuscarE.setVisible(true);
        btnValidarE.setVisible(false);
    }//GEN-LAST:event_btnValidarEMouseClicked

    private void btnValidarEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarEMouseEntered
        btnValidarE.setBackground(new Color(0, 204, 204));
        btnValidarE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarEMouseEntered

    private void btnValidarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarEMouseExited
        btnValidarE.setBackground(new Color(4, 153, 193));
        btnValidarE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarEMouseExited

    private void btnLimpiarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEMouseClicked
        limpiarE();
    }//GEN-LAST:event_btnLimpiarEMouseClicked

    private void btnLimpiarEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEMouseEntered
        btnLimpiarE.setBackground(new Color(0, 204, 204));
        btnLimpiarE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarEMouseEntered

    private void btnLimpiarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEMouseExited
        btnLimpiarE.setBackground(new Color(4, 153, 193));
        btnLimpiarE.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarEMouseExited

    private void btnValidarGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarGMouseClicked
        String f1 = rec.convertirFecha(dcFecInicialG);
        String f2 = rec.convertirFecha(dcFecFinalG);
        txtDesdeG.setText(f1);
        txtHastaG.setText(f2);
        String fc1, fc2;
        fc1 = txtDesdeG.getText();
        fc2 = txtHastaG.getText();
        btnBuscarG.setVisible(true);
        btnValidarG.setVisible(false);
    }//GEN-LAST:event_btnValidarGMouseClicked

    private void btnValidarGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarGMouseEntered
        btnValidarG.setBackground(new Color(0, 204, 204));
        btnValidarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarGMouseEntered

    private void btnValidarGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarGMouseExited
        btnValidarG.setBackground(new Color(4, 153, 193));
        btnValidarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarGMouseExited

    private void btnLimpiarGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarGMouseClicked
        dcFecFinalG.setDate(null);
        dcFecInicialG.setDate(null);
        txtDesdeG.setText("");
        txtHastaG.setText("");
        btnBuscarG.setVisible(false);
        btnValidarG.setVisible(true);
        rec.limpiarTabla(tblRepGastos, modeloGas);
    }//GEN-LAST:event_btnLimpiarGMouseClicked

    private void btnLimpiarGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarGMouseEntered
        btnLimpiarG.setBackground(new Color(0, 204, 204));
        btnLimpiarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarGMouseEntered

    private void btnLimpiarGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarGMouseExited
        btnLimpiarG.setBackground(new Color(4, 153, 193));
        btnLimpiarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarGMouseExited

    private void btnGReporteGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGReporteGMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/Reporte_Gastos.jasper"));
            Map parametro = new HashMap();
            parametro.put("desde", txtDesdeG.getText());
            parametro.put("hasta", txtHastaG.getText());
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametro, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnGReporteGMouseClicked

    private void btnGReporteGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGReporteGMouseEntered
        btnGReporteG.setBackground(new Color(0, 204, 204));
        btnGReporteG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGReporteGMouseEntered

    private void btnGReporteGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGReporteGMouseExited
        btnGReporteG.setBackground(new Color(4, 153, 193));
        btnGReporteG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGReporteGMouseExited

    private void btnBuscarGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarGMouseClicked
        String fec1 = txtDesdeG.getText();
        String fec2 = txtHastaG.getText();
        if (!listarGast(fec1, fec2)) {
            mensajeER = "<html><center>No hay gastos para mostrar <p>en el rango de fechas, intenta de nuevo";
            new alertas.Error(JInternalFrame, true).setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarGMouseClicked

    private void btnBuscarGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarGMouseEntered
        btnBuscarG.setBackground(new Color(0, 204, 204));
        btnBuscarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarGMouseEntered

    private void btnBuscarGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarGMouseExited
        btnBuscarG.setBackground(new Color(4, 153, 193));
        btnBuscarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarGMouseExited

    public static void main(String args[]) {

        FrmRepGastIngre frmRepGasIng = new FrmRepGastIngre();
        frmRepGasIng.setVisible(true);
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
        pnlIngresos.setVisible(false);
        pnlGastos.setVisible(false);
        txtDesdeE.setVisible(false);
        txtHastaE.setVisible(false);
        txtDesdeG.setVisible(false);
        txtHastaG.setVisible(false);
        btnBuscarE.setVisible(false);
        btnBuscarG.setVisible(false);

    }

//********************************************************BTN GUARDAR*****************************************************************************
    public boolean listarIngr(String val1, String val2) {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"FECHA", "CONCEPTO", "VALOR", "REGISTRA"};

        modeloIng.setColumnIdentifiers(Titulos);
        this.tblRepIngreso.setModel(modeloIng);

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
                modeloIng.addRow(registros);
                return true;
            }
            tblRepIngreso.setModel(modeloIng);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //*******************BTN GUARDAR**************************
    public boolean listarGast(String val1, String val2) {
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
                return true;
            }
            tblRepGastos.setModel(modeloGas);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//************************************* LIMPIAR TODO ************************************************************************
    private void limpiarE() {
        dcFecFinalE.setDate(null);
        dcFecInicialE.setDate(null);
        txtDesdeE.setText("");
        txtHastaE.setText("");
        btnBuscarE.setVisible(false);
        btnValidarE.setVisible(true);
        rec.limpiarTabla(tblRepIngreso, modeloIng);
    }
//************************************* LIMPIAR TODO ************************************************************************

    private void limpiarG() {
        dcFecFinalG.setDate(null);
        dcFecInicialG.setDate(null);
        txtDesdeG.setText("");
        txtHastaG.setText("");
        btnBuscarG.setVisible(false);
        btnValidarG.setVisible(true);
        rec.limpiarTabla(tblRepGastos, modeloGas);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnBuscarE;
    public java.awt.Label btnBuscarG;
    public java.awt.Label btnGReporteG;
    public java.awt.Label btnGenararRepE;
    public java.awt.Label btnLimpiarE;
    public java.awt.Label btnLimpiarG;
    public javax.swing.JLabel btnSalir;
    public java.awt.Label btnValidarE;
    public java.awt.Label btnValidarG;
    private javax.swing.ButtonGroup buttonGroup1;
    public com.toedter.calendar.JDateChooser dcFecFinalE;
    private com.toedter.calendar.JDateChooser dcFecFinalG;
    public com.toedter.calendar.JDateChooser dcFecInicialE;
    private com.toedter.calendar.JDateChooser dcFecInicialG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
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
    public javax.swing.JPanel pnlIngresos;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JRadioButton rbtGastos;
    private javax.swing.JRadioButton rbtIngresos;
    public static rojerusan.RSTableMetro tblRepGastos;
    public static rojerusan.RSTableMetro tblRepIngreso;
    private javax.swing.JTextField txtDesdeE;
    private javax.swing.JTextField txtDesdeG;
    private javax.swing.JTextField txtHastaE;
    private javax.swing.JTextField txtHastaG;
    // End of variables declaration//GEN-END:variables
}
