package vistas;

//@author Software_Max M_O
import clases.conectar;
import clases.propiedadesCBX;
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

public final class FrmRepChekin extends javax.swing.JFrame {

    Frame JInternalFrame;
    public static DefaultTableModel modeloNal = new DefaultTableModel();
    public static DefaultTableModel modeloExt = new DefaultTableModel();
    public static DefaultTableModel modeloDoc = new DefaultTableModel();
    public static DefaultTableModel modeloFec = new DefaultTableModel();
    recursividad rec = new recursividad();

    public FrmRepChekin() {

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
        pnlFechas = new javax.swing.JPanel();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        dcFecInicial = new com.toedter.calendar.JDateChooser();
        dcFecFinal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarFec = new java.awt.Label();
        btnValidarFec = new java.awt.Label();
        btnGenRepFec = new java.awt.Label();
        btnLimpiarFec = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepChekinFechas = new rojerusan.RSTableMetro();
        pnlDocumento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        btnBuscarDoc = new java.awt.Label();
        btnGenRepDoc = new java.awt.Label();
        btnLimpiarDoc = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRepChekDoc = new rojerusan.RSTableMetro();
        pnlNacional = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxNal = new javax.swing.JComboBox<>();
        btnBuscarNal = new java.awt.Label();
        btnGenRepNal = new java.awt.Label();
        btnGenRepExtranj = new java.awt.Label();
        btnLimpiarNal = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRepChekinNal = new rojerusan.RSTableMetro();
        pnlMenu = new javax.swing.JPanel();
        rbtFechas = new javax.swing.JRadioButton();
        rbtNacionalidad = new javax.swing.JRadioButton();
        rbtDocumento = new javax.swing.JRadioButton();

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
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "REPORTES CHECK-IN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFechas.setBackground(new java.awt.Color(255, 255, 255));
        pnlFechas.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(4, 153, 193)));
        pnlFechas.setPreferredSize(new java.awt.Dimension(1270, 490));
        pnlFechas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlFechas.add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));
        pnlFechas.add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, -1));

        dcFecInicial.setDateFormatString("yyyy-MM-dd");
        dcFecInicial.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlFechas.add(dcFecInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        dcFecFinal.setDateFormatString("yyyy-MM-dd");
        dcFecFinal.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlFechas.add(dcFecFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 153, 193));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESDE :");
        pnlFechas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 150, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 153, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HASTA :");
        pnlFechas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, 30));

        btnBuscarFec.setAlignment(java.awt.Label.CENTER);
        btnBuscarFec.setBackground(new java.awt.Color(4, 153, 193));
        btnBuscarFec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarFec.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBuscarFec.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarFec.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBuscarFec.setText("BUSCAR");
        btnBuscarFec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarFecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarFecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarFecMouseExited(evt);
            }
        });
        pnlFechas.add(btnBuscarFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 110, -1));

        btnValidarFec.setAlignment(java.awt.Label.CENTER);
        btnValidarFec.setBackground(new java.awt.Color(4, 153, 193));
        btnValidarFec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnValidarFec.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnValidarFec.setForeground(new java.awt.Color(255, 255, 255));
        btnValidarFec.setPreferredSize(new java.awt.Dimension(100, 30));
        btnValidarFec.setText("VALIDAR");
        btnValidarFec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidarFecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValidarFecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValidarFecMouseExited(evt);
            }
        });
        pnlFechas.add(btnValidarFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 110, -1));

        btnGenRepFec.setAlignment(java.awt.Label.CENTER);
        btnGenRepFec.setBackground(new java.awt.Color(4, 153, 193));
        btnGenRepFec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenRepFec.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenRepFec.setForeground(new java.awt.Color(255, 255, 255));
        btnGenRepFec.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGenRepFec.setText("GENERAR REPORTE");
        btnGenRepFec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenRepFecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenRepFecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenRepFecMouseExited(evt);
            }
        });
        pnlFechas.add(btnGenRepFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        btnLimpiarFec.setAlignment(java.awt.Label.CENTER);
        btnLimpiarFec.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarFec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarFec.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarFec.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarFec.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLimpiarFec.setText("LIMPIAR");
        btnLimpiarFec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarFecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarFecMouseExited(evt);
            }
        });
        pnlFechas.add(btnLimpiarFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 110, -1));

        tblRepChekinFechas.setBackground(new java.awt.Color(4, 153, 193));
        tblRepChekinFechas.setForeground(new java.awt.Color(255, 255, 255));
        tblRepChekinFechas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRepChekinFechas.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblRepChekinFechas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblRepChekinFechas.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblRepChekinFechas.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblRepChekinFechas.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblRepChekinFechas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekinFechas.setFuenteFilas(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekinFechas.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekinFechas.setFuenteHead(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tblRepChekinFechas.setMultipleSeleccion(false);
        tblRepChekinFechas.setPreferredSize(new java.awt.Dimension(695, 271));
        tblRepChekinFechas.setSelectionBackground(new java.awt.Color(13, 41, 66));
        jScrollPane1.setViewportView(tblRepChekinFechas);

        pnlFechas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1250, 300));

        jPanel4.add(pnlFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        pnlDocumento.setBackground(new java.awt.Color(255, 255, 255));
        pnlDocumento.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(4, 153, 193)));
        pnlDocumento.setPreferredSize(new java.awt.Dimension(1270, 490));
        pnlDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 153, 193));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUMERO DE DOCUMENTO:");
        pnlDocumento.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 220, 30));
        pnlDocumento.add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 190, 30));

        btnBuscarDoc.setAlignment(java.awt.Label.CENTER);
        btnBuscarDoc.setBackground(new java.awt.Color(4, 153, 193));
        btnBuscarDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarDoc.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBuscarDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDoc.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBuscarDoc.setText("BUSCAR");
        btnBuscarDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarDocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarDocMouseExited(evt);
            }
        });
        pnlDocumento.add(btnBuscarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 110, -1));

        btnGenRepDoc.setAlignment(java.awt.Label.CENTER);
        btnGenRepDoc.setBackground(new java.awt.Color(4, 153, 193));
        btnGenRepDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenRepDoc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenRepDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnGenRepDoc.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGenRepDoc.setText("GENERAR REPORTE");
        btnGenRepDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenRepDocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenRepDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenRepDocMouseExited(evt);
            }
        });
        pnlDocumento.add(btnGenRepDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        btnLimpiarDoc.setAlignment(java.awt.Label.CENTER);
        btnLimpiarDoc.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarDoc.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarDoc.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLimpiarDoc.setText("LIMPIAR");
        btnLimpiarDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarDocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarDocMouseExited(evt);
            }
        });
        pnlDocumento.add(btnLimpiarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 110, -1));

        tblRepChekDoc.setBackground(new java.awt.Color(4, 153, 193));
        tblRepChekDoc.setForeground(new java.awt.Color(255, 255, 255));
        tblRepChekDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "CONCEPTO", "VALOR", "REGISTRA"
            }
        ));
        tblRepChekDoc.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblRepChekDoc.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblRepChekDoc.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblRepChekDoc.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblRepChekDoc.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblRepChekDoc.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekDoc.setFuenteFilas(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekDoc.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekDoc.setFuenteHead(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tblRepChekDoc.setMultipleSeleccion(false);
        tblRepChekDoc.setPreferredSize(new java.awt.Dimension(695, 271));
        tblRepChekDoc.setSelectionBackground(new java.awt.Color(13, 41, 66));
        jScrollPane3.setViewportView(tblRepChekDoc);

        pnlDocumento.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1250, 300));

        jPanel4.add(pnlDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        pnlNacional.setBackground(new java.awt.Color(255, 255, 255));
        pnlNacional.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(4, 153, 193)));
        pnlNacional.setPreferredSize(new java.awt.Dimension(1270, 490));
        pnlNacional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 153, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NACIONALIDAD:");
        pnlNacional.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 150, 30));

        cbxNal.setBackground(new java.awt.Color(113, 181, 255));
        cbxNal.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxNal.setForeground(new java.awt.Color(255, 255, 255));
        cbxNal.setMaximumRowCount(10);
        cbxNal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "COLOMBIANO", "EXTRANJERO", " ", " " }));
        cbxNal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxNal.setPreferredSize(new java.awt.Dimension(150, 28));
        pnlNacional.add(cbxNal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, 30));

        btnBuscarNal.setAlignment(java.awt.Label.CENTER);
        btnBuscarNal.setBackground(new java.awt.Color(4, 153, 193));
        btnBuscarNal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarNal.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBuscarNal.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarNal.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBuscarNal.setText("BUSCAR");
        btnBuscarNal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarNalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarNalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarNalMouseExited(evt);
            }
        });
        pnlNacional.add(btnBuscarNal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 110, -1));

        btnGenRepNal.setAlignment(java.awt.Label.CENTER);
        btnGenRepNal.setBackground(new java.awt.Color(4, 153, 193));
        btnGenRepNal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenRepNal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenRepNal.setForeground(new java.awt.Color(255, 255, 255));
        btnGenRepNal.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGenRepNal.setText("GENERAR REPORTE");
        btnGenRepNal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenRepNalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenRepNalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenRepNalMouseExited(evt);
            }
        });
        pnlNacional.add(btnGenRepNal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        btnGenRepExtranj.setAlignment(java.awt.Label.CENTER);
        btnGenRepExtranj.setBackground(new java.awt.Color(4, 153, 193));
        btnGenRepExtranj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenRepExtranj.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenRepExtranj.setForeground(new java.awt.Color(255, 255, 255));
        btnGenRepExtranj.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGenRepExtranj.setText("GENERAR REPORTE");
        btnGenRepExtranj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenRepExtranjMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenRepExtranjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenRepExtranjMouseExited(evt);
            }
        });
        pnlNacional.add(btnGenRepExtranj, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        btnLimpiarNal.setAlignment(java.awt.Label.CENTER);
        btnLimpiarNal.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarNal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarNal.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarNal.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarNal.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLimpiarNal.setText("LIMPIAR");
        btnLimpiarNal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarNalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarNalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarNalMouseExited(evt);
            }
        });
        pnlNacional.add(btnLimpiarNal, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 110, -1));

        tblRepChekinNal.setBackground(new java.awt.Color(4, 153, 193));
        tblRepChekinNal.setForeground(new java.awt.Color(255, 255, 255));
        tblRepChekinNal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRepChekinNal.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblRepChekinNal.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblRepChekinNal.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblRepChekinNal.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblRepChekinNal.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblRepChekinNal.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekinNal.setFuenteFilas(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekinNal.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRepChekinNal.setFuenteHead(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tblRepChekinNal.setMultipleSeleccion(false);
        tblRepChekinNal.setPreferredSize(new java.awt.Dimension(695, 271));
        tblRepChekinNal.setSelectionBackground(new java.awt.Color(13, 41, 66));
        jScrollPane2.setViewportView(tblRepChekinNal);

        pnlNacional.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1250, 300));

        jPanel4.add(pnlNacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        pnlMenu.setBackground(new java.awt.Color(4, 153, 193));
        pnlMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 153, 193)), "SELECCIONE EL FILTRO PARA SU REPORTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        rbtFechas.setBackground(new java.awt.Color(4, 153, 193));
        buttonGroup1.add(rbtFechas);
        rbtFechas.setForeground(new java.awt.Color(255, 255, 255));
        rbtFechas.setText("POR FECHAS");
        rbtFechas.setBorder(null);
        rbtFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFechasActionPerformed(evt);
            }
        });

        rbtNacionalidad.setBackground(new java.awt.Color(4, 153, 193));
        buttonGroup1.add(rbtNacionalidad);
        rbtNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        rbtNacionalidad.setText("POR NACIONALIDAD");
        rbtNacionalidad.setBorder(null);
        rbtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNacionalidadActionPerformed(evt);
            }
        });

        rbtDocumento.setBackground(new java.awt.Color(4, 153, 193));
        buttonGroup1.add(rbtDocumento);
        rbtDocumento.setForeground(new java.awt.Color(255, 255, 255));
        rbtDocumento.setText("POR DOCUMENTO");
        rbtDocumento.setBorder(null);
        rbtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(rbtFechas)
                .addGap(133, 133, 133)
                .addComponent(rbtNacionalidad)
                .addGap(148, 148, 148)
                .addComponent(rbtDocumento)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNacionalidad)
                    .addComponent(rbtDocumento)
                    .addComponent(rbtFechas))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
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

    private void btnBuscarFecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarFecMouseClicked
        String fec1 = txtDesde.getText();
        String fec2 = txtHasta.getText();
        if (!listarChekFechas(fec1, fec2)) {
            mensajeER = "<html><center>No hay check-in´s para mostrar <p>en el rango de fechas, intenta de nuevo";
            new alertas.Error(JInternalFrame, true).setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarFecMouseClicked

    private void btnBuscarFecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarFecMouseEntered
        btnBuscarFec.setBackground(new Color(0, 204, 204));
        btnBuscarFec.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarFecMouseEntered

    private void btnBuscarFecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarFecMouseExited
        btnBuscarFec.setBackground(new Color(4, 153, 193));
        btnBuscarFec.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarFecMouseExited

    private void btnLimpiarFecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFecMouseClicked
        limpiarFec();
    }//GEN-LAST:event_btnLimpiarFecMouseClicked

    private void btnLimpiarFecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFecMouseEntered
        btnLimpiarFec.setBackground(new Color(0, 204, 204));
        btnLimpiarFec.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarFecMouseEntered

    private void btnLimpiarFecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFecMouseExited
        btnLimpiarFec.setBackground(new Color(4, 153, 193));
        btnLimpiarFec.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarFecMouseExited

    private void btnValidarFecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarFecMouseClicked
        String f1 = rec.convertirFecha(dcFecInicial);
        String f2 = rec.convertirFecha(dcFecFinal);
        txtDesde.setText(f1);
        txtHasta.setText(f2);
        String fc1, fc2;
        fc1 = txtDesde.getText();
        fc2 = txtHasta.getText();
        btnBuscarFec.setVisible(true);
        btnValidarFec.setVisible(false);
    }//GEN-LAST:event_btnValidarFecMouseClicked

    private void btnValidarFecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarFecMouseEntered
        btnValidarFec.setBackground(new Color(0, 204, 204));
        btnValidarFec.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarFecMouseEntered

    private void btnValidarFecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarFecMouseExited
        btnValidarFec.setBackground(new Color(4, 153, 193));
        btnValidarFec.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnValidarFecMouseExited

    private void btnGenRepFecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepFecMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/RChekinFechas.jasper"));
            Map parametro = new HashMap();
            parametro.put("desde", txtDesde.getText());
            parametro.put("hasta", txtHasta.getText());
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametro, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btnGenRepFecMouseClicked

    private void btnGenRepFecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepFecMouseEntered
        btnGenRepFec.setBackground(new Color(0, 204, 204));
        btnGenRepFec.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepFecMouseEntered

    private void btnGenRepFecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepFecMouseExited
        btnGenRepFec.setBackground(new Color(4, 153, 193));
        btnGenRepFec.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepFecMouseExited

    private void btnBuscarNalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNalMouseClicked
        String origen = cbxNal.getSelectedItem().toString();
        if (origen.equals("COLOMBIANO")) {
            if (!buscarCol()) {
                mensajeER = "<html><center>No hay check-in´s  de Colombianos para mostrar <p>, intenta de nuevo";
                new alertas.Error(JInternalFrame, true).setVisible(true);
            }
            btnGenRepNal.setVisible(true);
            btnGenRepExtranj.setVisible(false);
        } else if (origen.equals("EXTRANJERO")) {
            if (!buscarExtran()) {
                mensajeER = "<html><center>No hay check-in´s  de extranjeros para mostrar <p>, intenta de nuevo";
                new alertas.Error(JInternalFrame, true).setVisible(true);
            }
            btnGenRepNal.setVisible(false);
            btnGenRepExtranj.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarNalMouseClicked

    private void btnBuscarNalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNalMouseEntered
        btnBuscarNal.setBackground(new Color(0, 204, 204));
        btnBuscarNal.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarNalMouseEntered

    private void btnBuscarNalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNalMouseExited
        btnBuscarNal.setBackground(new Color(4, 153, 193));
        btnBuscarNal.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarNalMouseExited

    private void btnGenRepNalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepNalMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/RChekinCol.jasper"));
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnGenRepNalMouseClicked

    private void btnGenRepNalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepNalMouseEntered
        btnGenRepNal.setBackground(new Color(0, 204, 204));
        btnGenRepNal.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepNalMouseEntered

    private void btnGenRepNalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepNalMouseExited
        btnGenRepNal.setBackground(new Color(4, 153, 193));
        btnGenRepNal.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepNalMouseExited

    private void btnLimpiarNalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarNalMouseClicked
        limpiarExt();
    }//GEN-LAST:event_btnLimpiarNalMouseClicked

    private void btnLimpiarNalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarNalMouseEntered
        btnLimpiarNal.setBackground(new Color(0, 204, 204));
        btnLimpiarNal.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarNalMouseEntered

    private void btnLimpiarNalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarNalMouseExited
        btnLimpiarNal.setBackground(new Color(4, 153, 193));
        btnLimpiarNal.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarNalMouseExited

    private void rbtFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFechasActionPerformed
        pnlFechas.setVisible(true);
        pnlNacional.setVisible(false);
        pnlDocumento.setVisible(false);
    }//GEN-LAST:event_rbtFechasActionPerformed

    private void btnBuscarDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDocMouseClicked
        String dc = txtNumDoc.getText();
        if (!buscarDocumento(dc)) {
            mensajeER = "<html><center>No hay check-in´s con ese numero de documento para mostrar <p>, intenta de nuevo";
            new alertas.Error(JInternalFrame, true).setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarDocMouseClicked

    private void btnBuscarDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDocMouseEntered
        btnBuscarDoc.setBackground(new Color(0, 204, 204));
        btnBuscarDoc.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarDocMouseEntered

    private void btnBuscarDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDocMouseExited
        btnBuscarDoc.setBackground(new Color(4, 153, 193));
        btnBuscarDoc.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarDocMouseExited

    private void btnGenRepDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepDocMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/RChekinDoc.jasper"));
            Map parametro = new HashMap();
            parametro.put("id", txtNumDoc.getText());
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametro, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnGenRepDocMouseClicked

    private void btnGenRepDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepDocMouseEntered
        btnGenRepDoc.setBackground(new Color(0, 204, 204));
        btnGenRepDoc.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepDocMouseEntered

    private void btnGenRepDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepDocMouseExited
        btnGenRepDoc.setBackground(new Color(4, 153, 193));
        btnGenRepDoc.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepDocMouseExited

    private void btnLimpiarDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarDocMouseClicked
        limpiarDoc();
    }//GEN-LAST:event_btnLimpiarDocMouseClicked

    private void btnLimpiarDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarDocMouseEntered
        btnLimpiarDoc.setBackground(new Color(0, 204, 204));
        btnLimpiarDoc.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarDocMouseEntered

    private void btnLimpiarDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarDocMouseExited
        btnLimpiarDoc.setBackground(new Color(4, 153, 193));
        btnLimpiarDoc.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarDocMouseExited

    private void rbtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNacionalidadActionPerformed
        pnlNacional.setVisible(true);
        pnlFechas.setVisible(false);
        pnlDocumento.setVisible(false);
    }//GEN-LAST:event_rbtNacionalidadActionPerformed

    private void rbtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDocumentoActionPerformed
        pnlDocumento.setVisible(true);
        pnlFechas.setVisible(false);
        pnlNacional.setVisible(false);
    }//GEN-LAST:event_rbtDocumentoActionPerformed

    private void btnGenRepExtranjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepExtranjMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/RChekinExt.jasper"));
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnGenRepExtranjMouseClicked

    private void btnGenRepExtranjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepExtranjMouseEntered
        btnGenRepExtranj.setBackground(new Color(0, 204, 204));
        btnGenRepExtranj.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepExtranjMouseEntered

    private void btnGenRepExtranjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepExtranjMouseExited
        btnGenRepExtranj.setBackground(new Color(4, 153, 193));
        btnGenRepExtranj.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepExtranjMouseExited

    public static void main(String args[]) {

        FrmRepChekin frmRepChking = new FrmRepChekin();
        frmRepChking.setVisible(true);
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
        pnlFechas.setVisible(false);
        pnlNacional.setVisible(false);
        pnlDocumento.setVisible(false);
        cbxNal.setUI(propiedadesCBX.createUI(rootPane));
        btnGenRepNal.setVisible(false);
        btnGenRepExtranj.setVisible(false);
        txtDesde.setVisible(false);
        txtHasta.setVisible(false);
        btnBuscarFec.setVisible(false);

    }

//******************************************************* BUSCAR POR FECHAS *********************************************************************
    public boolean listarChekFechas(String val1, String val2) {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"NUM_HAB", "FEC_ENTRA", "FEC_SALE", "TIEMP_ESTAN", "DOC_RESP", "NOM_RESP", "RESERV_PO", "VALOR", "DESAYUNO", "TOURS", "NUM_ACOMP"};

        modeloFec.setColumnIdentifiers(Titulos);
        tblRepChekinFechas.setModel(modeloFec);

        try {

            String ConsultaSQL = "CALL VER_CHEK_X_FECHAS('" + val1 + "','" + val2 + "')";

            String[] registros = new String[11];

            Statement st = con.createStatement();
            rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {

                registros[0] = rs.getString("num_habit");
                registros[1] = rs.getString("fec_entra");
                registros[2] = rs.getString("fec_sale");
                registros[3] = rs.getString("tiemp_estan");
                registros[4] = rs.getString("doc_resp");
                registros[5] = rs.getString("nom_resp");
                registros[6] = rs.getString("reserv_por");
                registros[7] = rs.getString("valor");
                registros[8] = rs.getString("desayuno");
                registros[9] = rs.getString("tours");
                registros[10] = rs.getString("num_acomp");
                modeloFec.addRow(registros);
                return true;

            }
            tblRepChekinFechas.setModel(modeloFec);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepChekin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
//****************************************************** BUSCAR POR NAL_EXTR **********************************************************************

    public boolean buscarExtran() {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"TIPO.DOC", "NUM.DOC", "NOMBRE", "APELLIDO", "CONTACTO", "NACIONALIDAD", "ENTRA", "SALE", "VIENE DE", "VA PARA"};

        modeloExt.setColumnIdentifiers(Titulos);
        tblRepChekinNal.setModel(modeloExt);

        try {

            String ConsultaSQL = "CALL VER_CHKIN_EXTRANJEROS()";

            String[] registros = new String[10];

            Statement st = con.createStatement();
            rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {

                registros[0] = rs.getString("tipo_doc");
                registros[1] = rs.getString("doc_resp");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("apellido");
                registros[4] = rs.getString("contacto");
                registros[5] = rs.getString("pais");
                registros[6] = rs.getString("fec_entra");
                registros[7] = rs.getString("fec_sale");
                registros[8] = rs.getString("viene");
                registros[9] = rs.getString("va");
                modeloExt.addRow(registros);
                return true;

            }
            tblRepChekinNal.setModel(modeloExt);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepChekin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
//******************************************************** BUSCAR POR NAL_COL *****************************************************************************

    public boolean buscarCol() {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"TIPO.DOC", "NUM.DOC", "NOMBRE", "APELLIDO", "CONTACTO", "NACIONALIDAD", "ENTRA", "SALE", "VIENE DE", "VA PARA"};

        modeloNal.setColumnIdentifiers(Titulos);
        tblRepChekinNal.setModel(modeloNal);

        try {

            String ConsultaSQL = "CALL VER_CHEKIN_COL()";

            String[] registros = new String[10];

            Statement st = con.createStatement();
            rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {

                registros[0] = rs.getString("tipo_doc");
                registros[1] = rs.getString("num_doc");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("apellido");
                registros[4] = rs.getString("contacto");
                registros[5] = rs.getString("pais");
                registros[6] = rs.getString("fec_entra");
                registros[7] = rs.getString("fec_sale");
                registros[8] = rs.getString("viene");
                registros[9] = rs.getString("va");
                modeloNal.addRow(registros);
                return true;

            }
            tblRepChekinNal.setModel(modeloNal);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepChekin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//******************************************************** BUSCAR POR DOCUMENTO ******************************************************************
    public boolean buscarDocumento(String doc) {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"NUM.DOC", "NOMBRE", "HABITACION", "FEC.ENTRA", "FEC.SALE", "VALOR"};

        modeloDoc.setColumnIdentifiers(Titulos);
        tblRepChekDoc.setModel(modeloDoc);

        try {

            String ConsultaSQL = "CALL VER_CHEKIN_X_DOC('" + doc + "')";

            String[] registros = new String[6];

            Statement st = con.createStatement();
            rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("doc_resp");
                registros[1] = rs.getString("nom_resp");
                registros[2] = rs.getString("num_habit");
                registros[3] = rs.getString("fec_entra");
                registros[3] = rs.getString("fec_sale");
                registros[3] = rs.getString("valor");
                modeloDoc.addRow(registros);
                return true;
            }
            tblRepChekDoc.setModel(modeloDoc);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepChekin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//************************************* LIMPIAR TODO ************************************************************************
    private void limpiarFec() {
        dcFecFinal.setDate(null);
        dcFecInicial.setDate(null);
        txtDesde.setText("");
        txtHasta.setText("");
        btnBuscarFec.setVisible(false);
        btnValidarFec.setVisible(true);
        rec.limpiarTabla(tblRepChekinFechas, modeloFec);
    }

    private void limpiarDoc() {
        txtNumDoc.setText("");
        rec.limpiarTabla(tblRepChekDoc, modeloDoc);
    }

    private void limpiarExt() {
        cbxNal.setSelectedItem("Seleccione");
        rec.limpiarTabla(tblRepChekinNal, modeloNal);
        btnGenRepNal.setVisible(false);
        btnGenRepExtranj.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnBuscarDoc;
    public java.awt.Label btnBuscarFec;
    public java.awt.Label btnBuscarNal;
    public java.awt.Label btnGenRepDoc;
    public java.awt.Label btnGenRepExtranj;
    public java.awt.Label btnGenRepFec;
    public java.awt.Label btnGenRepNal;
    public java.awt.Label btnLimpiarDoc;
    public java.awt.Label btnLimpiarFec;
    public java.awt.Label btnLimpiarNal;
    public javax.swing.JLabel btnSalir;
    public java.awt.Label btnValidarFec;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbxNal;
    public com.toedter.calendar.JDateChooser dcFecFinal;
    public com.toedter.calendar.JDateChooser dcFecInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JPanel pnlDocumento;
    private javax.swing.JPanel pnlFechas;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoRegIng;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNacional;
    private javax.swing.JRadioButton rbtDocumento;
    private javax.swing.JRadioButton rbtFechas;
    private javax.swing.JRadioButton rbtNacionalidad;
    public static rojerusan.RSTableMetro tblRepChekDoc;
    public static rojerusan.RSTableMetro tblRepChekinFechas;
    public static rojerusan.RSTableMetro tblRepChekinNal;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtHasta;
    private javax.swing.JTextField txtNumDoc;
    // End of variables declaration//GEN-END:variables
}
