package vistas;

import clases.conectar;
import alertas.Error;
import clases.propiedadesCBX;
import com.toedter.calendar.JDateChooser;
import consultas.consCheckIn_J;
import consultas.consCliente_J;
import consultas.consEstadoHabit_J;
import consultas.consHotel_J;
import consultas.consTours_J;
import controlador.ctrlCheckin_J;
import controlador.ctrlTours_J;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.checkin_J;
import modelo.cliente_J;
import modelo.hotel_J;
import modelo.tours_J;
import rsscalelabel.RSScaleLabel;
import static controlador.ctrlHotel_J.mensajeER;
import static consultas.consUsuario_M.nom;
import static controlador.ctrlEstadoHabit_J.numHab;
import static controlador.ctrlEstadoHabit_J.tomadoDe;
import java.util.Calendar;
import java.util.GregorianCalendar;
import clases.consultas_generales;
import controlador.ctrlEstadoHabit_J;
import static controlador.ctrlEstadoHabit_J.d;

// @author Software_Max(JDV)
public final class FrmCheckin_J extends javax.swing.JFrame {

    Frame JInternalFrame = null;
    cliente_J cli = new cliente_J();
    consCliente_J consCli = new consCliente_J();
    consEstadoHabit_J consEstHab = new consEstadoHabit_J();
    consultas_generales consGen = new consultas_generales();
    String mensaje;
    String mensaje1;
    public int diasEst = 0;

    public FrmCheckin_J() {

        initComponents();
        acompInvisi();
        mostrarDatosHot();
        cbxPers();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupNacionalidad = new javax.swing.ButtonGroup();
        btnGrupDesayuno = new javax.swing.ButtonGroup();
        btnGrupPago = new javax.swing.ButtonGroup();
        btnGrupTours = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
        pnlDatos1 = new javax.swing.JPanel();
        lblCara = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblsaludo5 = new javax.swing.JLabel();
        lblSotMax = new javax.swing.JLabel();
        lblsaludo4 = new javax.swing.JLabel();
        lblNomHotel = new javax.swing.JLabel();
        lblLocalizacion = new javax.swing.JLabel();
        lblHola = new javax.swing.JLabel();
        lblNomUser = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        pnlFondoRegIng = new javax.swing.JPanel();
        pnlRegistroIngresos = new javax.swing.JPanel();
        btnGuarCheckin = new java.awt.Label();
        btnLimpiarIngreso = new java.awt.Label();
        pnlTours = new javax.swing.JPanel();
        rbtToursNo = new javax.swing.JRadioButton();
        rbtToursSi = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        pnlDesayuno = new javax.swing.JPanel();
        rbtDesayNo = new javax.swing.JRadioButton();
        rbtDesaySi = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        cbxReservoPor = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        lblNomResponsable = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        btnRegResp = new java.awt.Label();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        cbxNumAcomp = new javax.swing.JComboBox<>();
        lblInfoAcomp = new javax.swing.JLabel();
        txtAcom1 = new javax.swing.JTextField();
        btnRegAc1 = new java.awt.Label();
        jSeparatornom1 = new javax.swing.JSeparator();
        lblNomAcom1 = new javax.swing.JLabel();
        txtAcom2 = new javax.swing.JTextField();
        jSeparatornom2 = new javax.swing.JSeparator();
        lblNomAcom2 = new javax.swing.JLabel();
        btnRegAc2 = new java.awt.Label();
        btnRegAc3 = new java.awt.Label();
        txtAcom3 = new javax.swing.JTextField();
        jSeparatornom3 = new javax.swing.JSeparator();
        lblNomAcom3 = new javax.swing.JLabel();
        txtAcom4 = new javax.swing.JTextField();
        jSeparatornom4 = new javax.swing.JSeparator();
        lblNomAcom4 = new javax.swing.JLabel();
        btnRegAc4 = new java.awt.Label();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblValidacion1 = new javax.swing.JLabel();
        lblImgOkNo1 = new javax.swing.JLabel();
        lblValidacion2 = new javax.swing.JLabel();
        lblImgOkNo2 = new javax.swing.JLabel();
        lblImgOkNo3 = new javax.swing.JLabel();
        lblValidacion3 = new javax.swing.JLabel();
        lblImgOkNo4 = new javax.swing.JLabel();
        lblValidacion4 = new javax.swing.JLabel();
        lblValidRESP = new javax.swing.JLabel();
        lblImgOkNoRESP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtValorPagar = new javax.swing.JTextField();
        dcFecSale = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumDocResp = new javax.swing.JTextField();
        btnVerNumDias = new javax.swing.JLabel();
        dcFecEntra = new com.toedter.calendar.JDateChooser();
        lblNumDias = new javax.swing.JLabel();
        txtHabitacionNum = new javax.swing.JTextField();
        lblRestriccion = new javax.swing.JLabel();
        btnGuarChecResrv = new java.awt.Label();
        lblAdvertencia = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtValorResta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtVieneDe = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtVaPara = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        btnGuarChkProv = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setExtendedState(6);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));

        pnlDatos1.setBackground(new java.awt.Color(4, 153, 193));
        pnlDatos1.setPreferredSize(new java.awt.Dimension(1350, 117));
        pnlDatos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCara.setPreferredSize(new java.awt.Dimension(80, 80));
        pnlDatos1.add(lblCara, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 79));

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
        pnlDatos1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(4, 153, 193));

        lblsaludo5.setFont(new java.awt.Font("sansserif", 1, 8)); // NOI18N
        lblsaludo5.setForeground(new java.awt.Color(255, 255, 255));
        lblsaludo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsaludo5.setText("DESARROLLADO POR");

        lblSotMax.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSotMax.setForeground(new java.awt.Color(255, 255, 255));
        lblSotMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSotMax.setPreferredSize(new java.awt.Dimension(40, 50));

        lblsaludo4.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        lblsaludo4.setForeground(new java.awt.Color(255, 255, 255));
        lblsaludo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsaludo4.setText("SOFTWARE MAX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblsaludo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSotMax, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsaludo5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsaludo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSotMax, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsaludo4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatos1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 100, -1));

        lblNomHotel.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lblNomHotel.setForeground(new java.awt.Color(255, 255, 255));
        lblNomHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomHotel.setText("NOMBRE HOTEL");
        pnlDatos1.add(lblNomHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 540, -1));

        lblLocalizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocalizacion.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocalizacion.setText("LOCALIZADO EN");
        pnlDatos1.add(lblLocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 540, -1));

        lblHola.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblHola.setForeground(new java.awt.Color(255, 255, 255));
        lblHola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHola.setText("HOLA ");
        pnlDatos1.add(lblHola, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, -1));

        lblNomUser.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblNomUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNomUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomUser.setText("NU");
        pnlDatos1.add(lblNomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 160, -1));

        lblFecha.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha.setText("FECHA COMPLETA");
        pnlDatos1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 270, -1));

        pnlFondoRegIng.setBackground(new java.awt.Color(4, 153, 193));

        pnlRegistroIngresos.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroIngresos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "REGISTRO DE INGRESO HUESPEDES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        pnlRegistroIngresos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuarCheckin.setAlignment(java.awt.Label.CENTER);
        btnGuarCheckin.setBackground(new java.awt.Color(4, 153, 193));
        btnGuarCheckin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuarCheckin.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGuarCheckin.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarCheckin.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGuarCheckin.setText("GUARDAR");
        btnGuarCheckin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuarCheckinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuarCheckinMouseExited(evt);
            }
        });
        pnlRegistroIngresos.add(btnGuarCheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, -1, -1));

        btnLimpiarIngreso.setAlignment(java.awt.Label.CENTER);
        btnLimpiarIngreso.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarIngreso.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarIngreso.setPreferredSize(new java.awt.Dimension(130, 30));
        btnLimpiarIngreso.setText("LIMPIAR");
        btnLimpiarIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarIngresoMouseExited(evt);
            }
        });
        pnlRegistroIngresos.add(btnLimpiarIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, -1));

        pnlTours.setBackground(new java.awt.Color(255, 255, 255));

        rbtToursNo.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupTours.add(rbtToursNo);
        rbtToursNo.setForeground(new java.awt.Color(4, 153, 193));
        rbtToursNo.setText("NO");

        rbtToursSi.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupTours.add(rbtToursSi);
        rbtToursSi.setForeground(new java.awt.Color(4, 153, 193));
        rbtToursSi.setText("SI");
        rbtToursSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtToursSiActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(4, 153, 193));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TOURS:");

        javax.swing.GroupLayout pnlToursLayout = new javax.swing.GroupLayout(pnlTours);
        pnlTours.setLayout(pnlToursLayout);
        pnlToursLayout.setHorizontalGroup(
            pnlToursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToursLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtToursSi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(rbtToursNo)
                .addContainerGap())
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlToursLayout.setVerticalGroup(
            pnlToursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToursLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlToursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtToursNo)
                    .addComponent(rbtToursSi))
                .addContainerGap())
        );

        pnlRegistroIngresos.add(pnlTours, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        pnlDesayuno.setBackground(new java.awt.Color(255, 255, 255));

        rbtDesayNo.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupDesayuno.add(rbtDesayNo);
        rbtDesayNo.setForeground(new java.awt.Color(4, 153, 193));
        rbtDesayNo.setText("NO");

        rbtDesaySi.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupDesayuno.add(rbtDesaySi);
        rbtDesaySi.setForeground(new java.awt.Color(4, 153, 193));
        rbtDesaySi.setText("SI");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(4, 153, 193));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("DESAYUNO:");

        javax.swing.GroupLayout pnlDesayunoLayout = new javax.swing.GroupLayout(pnlDesayuno);
        pnlDesayuno.setLayout(pnlDesayunoLayout);
        pnlDesayunoLayout.setHorizontalGroup(
            pnlDesayunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDesayunoLayout.createSequentialGroup()
                .addComponent(rbtDesaySi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(rbtDesayNo)
                .addContainerGap())
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlDesayunoLayout.setVerticalGroup(
            pnlDesayunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDesayunoLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDesayunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtDesayNo)
                    .addComponent(rbtDesaySi))
                .addContainerGap())
        );

        pnlRegistroIngresos.add(pnlDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, -1));

        cbxReservoPor.setBackground(new java.awt.Color(4, 153, 193));
        cbxReservoPor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxReservoPor.setForeground(new java.awt.Color(255, 255, 255));
        cbxReservoPor.setMaximumRowCount(5);
        cbxReservoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Instagram", "WhatsApp", "Paginas web", "Llamada", "Recepcion" }));
        cbxReservoPor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxReservoPor.setPreferredSize(new java.awt.Dimension(150, 28));
        pnlRegistroIngresos.add(cbxReservoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(4, 153, 193));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("RESERVADO POR:");
        pnlRegistroIngresos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 150, 20));

        lblNomResponsable.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNomResponsable.setForeground(new java.awt.Color(0, 153, 255));
        lblNomResponsable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblNomResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 150, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 150, 10));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(4, 153, 193));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("N° - DOC.  RESP:");
        pnlRegistroIngresos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 150, -1));

        btnRegResp.setAlignment(java.awt.Label.CENTER);
        btnRegResp.setBackground(new java.awt.Color(4, 153, 193));
        btnRegResp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegResp.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegResp.setForeground(new java.awt.Color(255, 255, 255));
        btnRegResp.setPreferredSize(new java.awt.Dimension(30, 20));
        btnRegResp.setText("REG.");
        pnlRegistroIngresos.add(btnRegResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 102, 255));
        jSeparator9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 150, 10));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(4, 153, 193));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VALOR TOTAL :");
        pnlRegistroIngresos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 150, 20));

        cbxNumAcomp.setBackground(new java.awt.Color(4, 153, 193));
        cbxNumAcomp.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxNumAcomp.setForeground(new java.awt.Color(255, 255, 255));
        cbxNumAcomp.setMaximumRowCount(5);
        cbxNumAcomp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "0", "1", "2", "3", "4" }));
        cbxNumAcomp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxNumAcomp.setPreferredSize(new java.awt.Dimension(150, 28));
        cbxNumAcomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNumAcompActionPerformed(evt);
            }
        });
        pnlRegistroIngresos.add(cbxNumAcomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 80, -1, -1));

        lblInfoAcomp.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblInfoAcomp.setForeground(new java.awt.Color(4, 153, 193));
        lblInfoAcomp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoAcomp.setText("<html><center>Ingrese el documanto <p> de cada acompañante");
        pnlRegistroIngresos.add(lblInfoAcomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, 150, 30));

        txtAcom1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtAcom1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcom1.setBorder(null);
        txtAcom1.setPreferredSize(new java.awt.Dimension(150, 30));
        txtAcom1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAcom1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcom1KeyTyped(evt);
            }
        });
        pnlRegistroIngresos.add(txtAcom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 180, 150, -1));

        btnRegAc1.setAlignment(java.awt.Label.CENTER);
        btnRegAc1.setBackground(new java.awt.Color(4, 153, 193));
        btnRegAc1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegAc1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegAc1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegAc1.setPreferredSize(new java.awt.Dimension(30, 20));
        btnRegAc1.setText("REG.");
        pnlRegistroIngresos.add(btnRegAc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, -1, -1));

        jSeparatornom1.setForeground(new java.awt.Color(0, 102, 255));
        jSeparatornom1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparatornom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 210, 150, 10));

        lblNomAcom1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNomAcom1.setForeground(new java.awt.Color(0, 153, 255));
        lblNomAcom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblNomAcom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, 150, 20));

        txtAcom2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtAcom2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcom2.setBorder(null);
        txtAcom2.setPreferredSize(new java.awt.Dimension(150, 30));
        txtAcom2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAcom2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcom2KeyTyped(evt);
            }
        });
        pnlRegistroIngresos.add(txtAcom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 260, -1, -1));

        jSeparatornom2.setForeground(new java.awt.Color(0, 102, 255));
        jSeparatornom2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparatornom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 290, 150, 10));

        lblNomAcom2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNomAcom2.setForeground(new java.awt.Color(0, 153, 255));
        lblNomAcom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblNomAcom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 300, 150, 20));

        btnRegAc2.setAlignment(java.awt.Label.CENTER);
        btnRegAc2.setBackground(new java.awt.Color(4, 153, 193));
        btnRegAc2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegAc2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegAc2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegAc2.setPreferredSize(new java.awt.Dimension(30, 20));
        btnRegAc2.setText("REG.");
        pnlRegistroIngresos.add(btnRegAc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 260, -1, -1));

        btnRegAc3.setAlignment(java.awt.Label.CENTER);
        btnRegAc3.setBackground(new java.awt.Color(4, 153, 193));
        btnRegAc3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegAc3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegAc3.setForeground(new java.awt.Color(255, 255, 255));
        btnRegAc3.setPreferredSize(new java.awt.Dimension(30, 20));
        btnRegAc3.setText("REG.");
        pnlRegistroIngresos.add(btnRegAc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 350, -1, -1));

        txtAcom3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtAcom3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcom3.setBorder(null);
        txtAcom3.setPreferredSize(new java.awt.Dimension(150, 30));
        txtAcom3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAcom3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcom3KeyTyped(evt);
            }
        });
        pnlRegistroIngresos.add(txtAcom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 350, -1, -1));

        jSeparatornom3.setForeground(new java.awt.Color(0, 102, 255));
        jSeparatornom3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparatornom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 380, 150, 10));

        lblNomAcom3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNomAcom3.setForeground(new java.awt.Color(0, 153, 255));
        lblNomAcom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblNomAcom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 390, 150, 20));

        txtAcom4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtAcom4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcom4.setBorder(null);
        txtAcom4.setPreferredSize(new java.awt.Dimension(150, 30));
        txtAcom4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAcom4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcom4KeyTyped(evt);
            }
        });
        pnlRegistroIngresos.add(txtAcom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 430, -1, -1));

        jSeparatornom4.setForeground(new java.awt.Color(0, 102, 255));
        jSeparatornom4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparatornom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 460, 150, 10));

        lblNomAcom4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNomAcom4.setForeground(new java.awt.Color(0, 153, 255));
        lblNomAcom4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblNomAcom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 470, 150, 20));

        btnRegAc4.setAlignment(java.awt.Label.CENTER);
        btnRegAc4.setBackground(new java.awt.Color(4, 153, 193));
        btnRegAc4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegAc4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegAc4.setForeground(new java.awt.Color(255, 255, 255));
        btnRegAc4.setPreferredSize(new java.awt.Dimension(30, 20));
        btnRegAc4.setText("REG.");
        pnlRegistroIngresos.add(btnRegAc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 430, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(4, 153, 193));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("N°   ACOMPAÑANTES:");
        pnlRegistroIngresos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, 150, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(4, 153, 193));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("N°  HABITACION:");
        pnlRegistroIngresos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        lblValidacion1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidacion1.setForeground(new java.awt.Color(0, 51, 255));
        lblValidacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblValidacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, 60, 30));

        lblImgOkNo1.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlRegistroIngresos.add(lblImgOkNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, -1, -1));

        lblValidacion2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidacion2.setForeground(new java.awt.Color(0, 51, 255));
        lblValidacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblValidacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 60, 30));

        lblImgOkNo2.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlRegistroIngresos.add(lblImgOkNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, -1, -1));

        lblImgOkNo3.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlRegistroIngresos.add(lblImgOkNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, -1, -1));

        lblValidacion3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidacion3.setForeground(new java.awt.Color(0, 51, 255));
        lblValidacion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblValidacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 60, 30));

        lblImgOkNo4.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlRegistroIngresos.add(lblImgOkNo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, -1, -1));

        lblValidacion4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidacion4.setForeground(new java.awt.Color(0, 51, 255));
        lblValidacion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroIngresos.add(lblValidacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 60, 30));

        lblValidRESP.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidRESP.setForeground(new java.awt.Color(0, 51, 255));
        lblValidRESP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValidRESP.setText("dffggg");
        pnlRegistroIngresos.add(lblValidRESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 70, 30));

        lblImgOkNoRESP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgOkNoRESP.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlRegistroIngresos.add(lblImgOkNoRESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("$");
        pnlRegistroIngresos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 20, 30));

        txtValorPagar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtValorPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorPagar.setText("0");
        txtValorPagar.setBorder(null);
        txtValorPagar.setPreferredSize(new java.awt.Dimension(130, 30));
        txtValorPagar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorPagarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorPagarFocusLost(evt);
            }
        });
        txtValorPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorPagarKeyTyped(evt);
            }
        });
        pnlRegistroIngresos.add(txtValorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        dcFecSale.setDateFormatString("yyyy-MM-dd");
        dcFecSale.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroIngresos.add(dcFecSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 153, 193));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FECHA SALIDA:");
        pnlRegistroIngresos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 150, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 153, 193));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA INGRESO:");
        pnlRegistroIngresos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 150, -1));

        txtNumDocResp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNumDocResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumDocResp.setBorder(null);
        txtNumDocResp.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNumDocResp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumDocRespKeyReleased(evt);
            }
        });
        pnlRegistroIngresos.add(txtNumDocResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        btnVerNumDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerNumDias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recarga.png"))); // NOI18N
        btnVerNumDias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerNumDiasMouseClicked(evt);
            }
        });
        pnlRegistroIngresos.add(btnVerNumDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 30, 30));

        dcFecEntra.setDateFormatString("yyyy-MM-dd");
        dcFecEntra.setFocusable(false);
        dcFecEntra.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroIngresos.add(dcFecEntra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        lblNumDias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pnlRegistroIngresos.add(lblNumDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 30, 30));

        txtHabitacionNum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtHabitacionNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlRegistroIngresos.add(txtHabitacionNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, 30));

        lblRestriccion.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblRestriccion.setForeground(new java.awt.Color(0, 102, 255));
        lblRestriccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestriccion.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlRegistroIngresos.add(lblRestriccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        btnGuarChecResrv.setAlignment(java.awt.Label.CENTER);
        btnGuarChecResrv.setBackground(new java.awt.Color(4, 153, 193));
        btnGuarChecResrv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuarChecResrv.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGuarChecResrv.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarChecResrv.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGuarChecResrv.setText("GUARDAR rsv");
        btnGuarChecResrv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuarChecResrvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuarChecResrvMouseExited(evt);
            }
        });
        pnlRegistroIngresos.add(btnGuarChecResrv, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, -1));

        lblAdvertencia.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblAdvertencia.setForeground(new java.awt.Color(204, 0, 0));
        lblAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvertencia.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlRegistroIngresos.add(lblAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(4, 153, 193));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("DEBE :");
        pnlRegistroIngresos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 150, 20));

        txtValorResta.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtValorResta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorResta.setText("0");
        txtValorResta.setBorder(null);
        txtValorResta.setPreferredSize(new java.awt.Dimension(130, 30));
        txtValorResta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorRestaKeyTyped(evt);
            }
        });
        pnlRegistroIngresos.add(txtValorResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 153, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("$");
        pnlRegistroIngresos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 20, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 102, 255));
        jSeparator10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 150, 10));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(4, 153, 193));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("VIENE DE:");
        pnlRegistroIngresos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 150, -1));

        txtVieneDe.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtVieneDe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVieneDe.setBorder(null);
        txtVieneDe.setPreferredSize(new java.awt.Dimension(150, 30));
        txtVieneDe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVieneDeKeyTyped(evt);
            }
        });
        pnlRegistroIngresos.add(txtVieneDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 102, 255));
        jSeparator7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, 10));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 153, 193));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VA PARA:");
        pnlRegistroIngresos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 150, -1));

        txtVaPara.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtVaPara.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVaPara.setBorder(null);
        txtVaPara.setPreferredSize(new java.awt.Dimension(150, 30));
        txtVaPara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVaParaKeyTyped(evt);
            }
        });
        pnlRegistroIngresos.add(txtVaPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 102, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroIngresos.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, 10));

        btnGuarChkProv.setAlignment(java.awt.Label.CENTER);
        btnGuarChkProv.setBackground(new java.awt.Color(4, 153, 193));
        btnGuarChkProv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuarChkProv.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGuarChkProv.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarChkProv.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGuarChkProv.setText("GUARDAR prov");
        btnGuarChkProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuarChkProvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuarChkProvMouseExited(evt);
            }
        });
        pnlRegistroIngresos.add(btnGuarChkProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, -1, -1));

        javax.swing.GroupLayout pnlFondoRegIngLayout = new javax.swing.GroupLayout(pnlFondoRegIng);
        pnlFondoRegIng.setLayout(pnlFondoRegIngLayout);
        pnlFondoRegIngLayout.setHorizontalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistroIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoRegIngLayout.setVerticalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistroIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/cerrar.png");
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnGuarCheckinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuarCheckinMouseEntered
        btnGuarCheckin.setBackground(new Color(0, 204, 204));
        btnGuarCheckin.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGuarCheckinMouseEntered

    private void btnGuarCheckinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuarCheckinMouseExited
        btnGuarCheckin.setBackground(new Color(4, 153, 193));
        btnGuarCheckin.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuarCheckinMouseExited

    private void btnLimpiarIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarIngresoMouseEntered
        btnLimpiarIngreso.setBackground(new Color(0, 204, 204));
        btnLimpiarIngreso.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLimpiarIngresoMouseEntered

    private void btnLimpiarIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarIngresoMouseExited
        btnLimpiarIngreso.setBackground(new Color(4, 153, 193));
        btnLimpiarIngreso.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarIngresoMouseExited

    private void cbxNumAcompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNumAcompActionPerformed
        ActivarAcompañantes();
    }//GEN-LAST:event_cbxNumAcompActionPerformed

    private void txtAcom1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcom1KeyReleased
        String res = BuscarIdentif(txtAcom1.getText());

        if (txtAcom1.getText().equals("")) {

            lblValidacion1.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNo1, "");
            btnRegAc1.setVisible(false);

        } else if (res.equals("si")) {

            lblValidacion1.setText("<html><center>Cliente <p> registrado.");
            lblValidacion1.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkNo1, "src/img/ok.png");
            lblNomAcom1.setText(cli.getNombre());
            btnRegAc1.setVisible(false);

        } else {

            lblValidacion1.setText("<html><center>Cliente sin <p>registrar.");
            RSScaleLabel.setScaleLabel(lblImgOkNo1, "src/img/alert.gif");
            lblValidacion1.setForeground(new Color(0, 0, 0));
            lblNomAcom1.setText("");
            btnRegAc1.setVisible(true);

        }
    }//GEN-LAST:event_txtAcom1KeyReleased

    private void txtAcom2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcom2KeyReleased
        String res = BuscarIdentif(txtAcom2.getText());

        if (txtAcom2.getText().equals("")) {

            lblValidacion2.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNo2, "");
            btnRegAc2.setVisible(false);

        } else if (res.equals("si")) {

            lblValidacion2.setText("<html><center>Cliente <p> registrado.");
            lblValidacion2.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkNo2, "src/img/ok.png");
            lblNomAcom2.setText(cli.getNombre());
            btnRegAc2.setVisible(false);

        } else {

            lblValidacion2.setText("<html><center>Cliente sin <p>registrar.");
            RSScaleLabel.setScaleLabel(lblImgOkNo2, "src/img/alert.gif");
            lblValidacion2.setForeground(new Color(0, 0, 0));
            lblNomAcom2.setText("");
            btnRegAc2.setVisible(true);

        }
    }//GEN-LAST:event_txtAcom2KeyReleased

    private void txtAcom3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcom3KeyReleased
        String res = BuscarIdentif(txtAcom3.getText());

        if (txtAcom3.getText().equals("")) {

            lblValidacion3.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNo3, "");
            btnRegAc3.setVisible(false);

        } else if (res.equals("si")) {

            lblValidacion3.setText("<html><center>Cliente <p> registrado");
            lblValidacion3.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkNo3, "src/img/ok.png");
            lblNomAcom3.setText(cli.getNombre());
            btnRegAc3.setVisible(false);

        } else {

            lblValidacion3.setText("<html><center>Cliente sin <p>registrar.");
            RSScaleLabel.setScaleLabel(lblImgOkNo3, "src/img/alert.gif");
            lblValidacion3.setForeground(new Color(0, 0, 0));
            lblNomAcom3.setText("");
            btnRegAc3.setVisible(true);

        }
    }//GEN-LAST:event_txtAcom3KeyReleased

    private void txtAcom4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcom4KeyReleased
        String res = BuscarIdentif(txtAcom4.getText());

        if (txtAcom4.getText().equals("")) {

            lblValidacion4.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNo4, "");
            btnRegAc4.setVisible(false);

        } else if (res.equals("si")) {

            lblValidacion4.setText("<html><center>Cliente <p> registrado.");
            lblValidacion4.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkNo4, "src/img/ok.png");
            lblNomAcom4.setText(cli.getNombre());
            btnRegAc4.setVisible(false);

        } else {

            lblValidacion4.setText("<html><center>Cliente sin <p>registrar.");
            RSScaleLabel.setScaleLabel(lblImgOkNo4, "src/img/alert.gif");
            lblValidacion4.setForeground(new Color(0, 0, 0));
            lblNomAcom4.setText("");
            btnRegAc4.setVisible(true);

        }
    }//GEN-LAST:event_txtAcom4KeyReleased

    private void txtAcom1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcom1KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txtAcom1.getText().length() >= 16) {
            mensajeER = "<html><center>Has exedido el número<p> de caractéres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_txtAcom1KeyTyped

    private void txtAcom2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcom2KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txtAcom2.getText().length() >= 16) {
            mensajeER = "<html><center>Has exedido el número<p> de caractéres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_txtAcom2KeyTyped

    private void txtAcom3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcom3KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txtAcom3.getText().length() >= 16) {
            mensajeER = "<html><center>Has exedido el número<p> de caractéres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_txtAcom3KeyTyped

    private void txtAcom4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcom4KeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txtAcom4.getText().length() >= 16) {
            mensajeER = "<html><center>Has exedido el número<p> de caractéres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_txtAcom4KeyTyped

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        FrmMenuAdmin_J frmAdm = new FrmMenuAdmin_J();
        frmAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtValorPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorPagarKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo acepta números.";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();

        } else if (txtValorPagar.getText().length() >= 8) {

            mensajeER = "<html><center>Has exedido el número<p> de caractéres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            txtValorPagar.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtValorPagarKeyTyped

    private void txtValorPagarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusGained
        txtValorPagar.setText("");
    }//GEN-LAST:event_txtValorPagarFocusGained

    private void rbtToursSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtToursSiActionPerformed
        tours_J modTrs = new tours_J();
        consTours_J consTrs = new consTours_J();
        FrmATours_J frmTrs = new FrmATours_J(JInternalFrame, true);
        ctrlTours_J ctrlTours = new ctrlTours_J(modTrs, consTrs, frmTrs);

        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        String fecAct = (formato.format(sistFecha));
        String docIdent = txtNumDocResp.getText();
        String nomReg = lblNomUser.getText();
        frmTrs.txtFecha.setText(fecAct);
        frmTrs.txtNumIdent.setText(docIdent);
        frmTrs.txtRegistra.setText(nomReg);
        RSScaleLabel.setScaleLabel(frmTrs.lblImgOkNoRESP, "src/img/recarga.png");
        frmTrs.setVisible(true);

    }//GEN-LAST:event_rbtToursSiActionPerformed

    private void txtValorPagarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusLost
        if (txtValorPagar.getText().equals("")) {
            txtValorPagar.setText("0");
        }
    }//GEN-LAST:event_txtValorPagarFocusLost

    private void txtNumDocRespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocRespKeyReleased
        String res = BuscarIdentif(txtNumDocResp.getText());

        if (txtNumDocResp.getText().equals("")) {

            lblValidRESP.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "");
            btnRegResp.setVisible(false);

        } else if (res.equals("si")) {

            lblValidRESP.setText("<html><center>Cliente <p> registrado.");
            lblValidRESP.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "src/img/ok.png");
            lblNomResponsable.setText(cli.getNombre());
            btnRegResp.setVisible(false);

        } else {

            lblValidRESP.setText("<html><center>Cliente sin <p>registrar");
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "src/img/alert.gif");
            lblValidRESP.setForeground(new Color(0, 0, 0));
            lblNomResponsable.setText("");
            btnRegResp.setVisible(true);

        }
    }//GEN-LAST:event_txtNumDocRespKeyReleased

    private void btnVerNumDiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerNumDiasMouseClicked
        if (tomadoDe.equals("prov")) {

            if (d > 0) {

                lblRestriccion.setVisible(true);
                int ds = calcularDias(dcFecEntra, dcFecSale);
                String dia = String.valueOf(ds);
                lblNumDias.setText(dia);

                if (ds <= d) {

                    btnGuarChkProv.setVisible(true);
                    lblAdvertencia.setVisible(false);

                } else {

                    lblRestriccion.setVisible(false);
                    lblAdvertencia.setVisible(true);
                    lblAdvertencia.setText("<html><center>Se ha excedido el numero<p> de dias permitido.");
                    btnGuarChkProv.setVisible(false);
                }
            }

        } else if (tomadoDe.equals("norm")) {

            int ds = calcularDias(dcFecEntra, dcFecSale);
            String dia = String.valueOf(ds);
            lblNumDias.setText(dia);
        }

    }//GEN-LAST:event_btnVerNumDiasMouseClicked

    private void btnGuarChecResrvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuarChecResrvMouseEntered
        btnGuarChecResrv.setBackground(new Color(0, 204, 204));
        btnGuarChecResrv.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGuarChecResrvMouseEntered

    private void btnGuarChecResrvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuarChecResrvMouseExited
        btnGuarChecResrv.setBackground(new Color(4, 153, 193));
        btnGuarChecResrv.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuarChecResrvMouseExited

    private void txtValorRestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorRestaKeyTyped
        char d = evt.getKeyChar();

        if (!Character.isDigit(d) && d != KeyEvent.VK_SPACE && d != KeyEvent.VK_BACK_SPACE) {
            mensajeER = "<html><center>Este campo solo<p> acepta números ¡¡¡";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();
        };
    }//GEN-LAST:event_txtValorRestaKeyTyped

    private void txtVieneDeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVieneDeKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE) {
            mensajeER = "<html><center>Este campo solo<p> acepta letras ¡¡¡";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_txtVieneDeKeyTyped

    private void txtVaParaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVaParaKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo<p> acepta letras ¡¡¡";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_txtVaParaKeyTyped

    private void btnGuarChkProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuarChkProvMouseEntered
        btnGuarChkProv.setBackground(new Color(0, 204, 204));
        btnGuarChkProv.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGuarChkProvMouseEntered

    private void btnGuarChkProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuarChkProvMouseExited
        btnGuarChkProv.setBackground(new Color(4, 153, 193));
        btnGuarChkProv.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuarChkProvMouseExited

    //************************************VOID MAIN **************************************************************
    public static void main(String args[]) {

        checkin_J modChki = new checkin_J();
        consCheckIn_J consChki = new consCheckIn_J();
        FrmCheckin_J frmChki = new FrmCheckin_J();
        ctrlCheckin_J ctrChki = new ctrlCheckin_J(modChki, consChki, frmChki);
        frmChki.setVisible(true);

    }

////****************************************** CMETODO CALCULAR DIAS***************************************************************    
    public int calcularDias(JDateChooser Llega, JDateChooser Sale) {

        if (dcFecSale.getDate() == null) {
            System.out.println("los campos estan vacios");
            return 0;

        } else {

            Calendar in = Llega.getCalendar();
            Calendar out = Sale.getCalendar();
            int day = -1;

            while (in.before(out) || in.equals(out)) {

                day++;
                in.add(Calendar.DATE, 1);
            }
            return diasEst = day;
        }

    }

////****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    
    void cbxPers() {
        //Le damos las propiedadesCBX de la clase a los cbx
        cbxNumAcomp.setUI(propiedadesCBX.createUI(rootPane));
        cbxReservoPor.setUI(propiedadesCBX.createUI(rootPane));

    }

//    **************************************************BUSCAR CLIENTE*****************************************************************************
    public String BuscarIdentif(String iden) {

        PreparedStatement ps;
        ResultSet rs;

        try {

            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT nombre,id_clientes FROM clientes WHERE num_doc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, iden);

            rs = ps.executeQuery();
            if (rs.next()) {

                cli.setId(rs.getInt("id_clientes"));
                cli.setNombre(rs.getString("nombre"));
                mensaje = "si";

            } else {

                mensaje = "no";
            }

            con.close();

        } catch (SQLException e) {

            System.out.println("ERROR: " + e);
        }

        return mensaje;

    }
//**************************************************BUSCAR CLIENTE*****************************************************************************

    public String BuscarCli(String iden) {

        PreparedStatement ps;
        ResultSet rs;

        try {

            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT * FROM clientes WHERE num_doc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, iden);

            rs = ps.executeQuery();
            if (rs.next()) {

                cli.setId(rs.getInt("id_clientes"));
                cli.setNombre(rs.getString("nombre"));
                cli.setApellido(rs.getString("apellido"));
                cli.setTipo_doc(rs.getString("tipo_doc"));
                cli.setNum_doc(rs.getString("num_doc"));
                cli.setInstagram(rs.getString("instagram"));
                cli.setContacto(rs.getString("contacto"));
                cli.setPais(rs.getString("pais"));
                mensaje1 = "si";

            } else {

                mensaje1 = "no";
            }

            con.close();

        } catch (SQLException e) {

            System.out.println("ERROR: " + e);
        }

        return mensaje1;

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
        txtNumDocResp.requestFocus();
        dcFecEntra.getCalendarButton().setEnabled(false);// Desactivamos el calendario
        Calendar c2 = new GregorianCalendar();
        dcFecEntra.setCalendar(c2);
        txtHabitacionNum.setText(numHab);
        txtHabitacionNum.setEditable(false);
        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");

    }

    //*********************************************************** MÉTODO ACOMP INVISIBLES *********************************************************
    public void acompInvisi() {

        txtAcom1.setVisible(false);
        txtAcom2.setVisible(false);
        txtAcom3.setVisible(false);
        txtAcom4.setVisible(false);
        lblNomAcom1.setVisible(false);
        lblNomAcom2.setVisible(false);
        lblNomAcom3.setVisible(false);
        lblNomAcom4.setVisible(false);
        lblInfoAcomp.setVisible(false);
        jSeparatornom1.setVisible(false);
        jSeparatornom2.setVisible(false);
        jSeparatornom3.setVisible(false);
        jSeparatornom4.setVisible(false);
        btnRegResp.setVisible(false);
        btnRegAc1.setVisible(false);
        btnRegAc2.setVisible(false);
        btnRegAc3.setVisible(false);
        btnRegAc4.setVisible(false);
    }

////************************************** MÉTODO MOSTRAR TXT SEGUN N° DE ACOMPAÑANTES *********************************************************
    public void ActivarAcompañantes() {

        String re = cbxNumAcomp.getSelectedItem().toString();

        switch (re) {

            case "1":
                acompInvisi();
                lblInfoAcomp.setVisible(true);
                txtAcom1.setVisible(true);
                lblNomAcom1.setVisible(true);
                jSeparatornom1.setVisible(true);
                break;

            case "2":
                acompInvisi();
                lblInfoAcomp.setVisible(true);
                txtAcom1.setVisible(true);
                txtAcom2.setVisible(true);
                lblNomAcom1.setVisible(true);
                lblNomAcom2.setVisible(true);
                jSeparatornom1.setVisible(true);
                jSeparatornom2.setVisible(true);
                break;

            case "3":
                acompInvisi();
                lblInfoAcomp.setVisible(true);
                txtAcom1.setVisible(true);
                txtAcom2.setVisible(true);
                txtAcom3.setVisible(true);
                lblNomAcom1.setVisible(true);
                lblNomAcom2.setVisible(true);
                lblNomAcom3.setVisible(true);
                jSeparatornom1.setVisible(true);
                jSeparatornom2.setVisible(true);
                jSeparatornom3.setVisible(true);
                break;

            case "4":
                acompInvisi();
                lblInfoAcomp.setVisible(true);
                txtAcom1.setVisible(true);
                txtAcom2.setVisible(true);
                txtAcom3.setVisible(true);
                txtAcom4.setVisible(true);
                lblNomAcom1.setVisible(true);
                lblNomAcom2.setVisible(true);
                lblNomAcom3.setVisible(true);
                lblNomAcom4.setVisible(true);
                jSeparatornom1.setVisible(true);
                jSeparatornom2.setVisible(true);
                jSeparatornom3.setVisible(true);
                jSeparatornom4.setVisible(true);
                break;

            case "Seleccione":
                acompInvisi();
                break;
            default:
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup btnGrupDesayuno;
    public javax.swing.ButtonGroup btnGrupNacionalidad;
    public javax.swing.ButtonGroup btnGrupPago;
    public javax.swing.ButtonGroup btnGrupTours;
    public java.awt.Label btnGuarChecResrv;
    public java.awt.Label btnGuarCheckin;
    public java.awt.Label btnGuarChkProv;
    public java.awt.Label btnLimpiarIngreso;
    public java.awt.Label btnRegAc1;
    public java.awt.Label btnRegAc2;
    public java.awt.Label btnRegAc3;
    public java.awt.Label btnRegAc4;
    public java.awt.Label btnRegResp;
    public javax.swing.JLabel btnSalir;
    public javax.swing.JLabel btnVerNumDias;
    public javax.swing.JComboBox<String> cbxNumAcomp;
    public javax.swing.JComboBox<String> cbxReservoPor;
    public com.toedter.calendar.JDateChooser dcFecEntra;
    public com.toedter.calendar.JDateChooser dcFecSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator10;
    public javax.swing.JSeparator jSeparator7;
    public javax.swing.JSeparator jSeparator8;
    public javax.swing.JSeparator jSeparator9;
    public javax.swing.JSeparator jSeparatornom1;
    public javax.swing.JSeparator jSeparatornom2;
    public javax.swing.JSeparator jSeparatornom3;
    public javax.swing.JSeparator jSeparatornom4;
    public javax.swing.JLabel lblAdvertencia;
    public javax.swing.JLabel lblCara;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHola;
    public javax.swing.JLabel lblImgOkNo1;
    public javax.swing.JLabel lblImgOkNo2;
    public javax.swing.JLabel lblImgOkNo3;
    public javax.swing.JLabel lblImgOkNo4;
    public javax.swing.JLabel lblImgOkNoRESP;
    public javax.swing.JLabel lblInfoAcomp;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomAcom1;
    public javax.swing.JLabel lblNomAcom2;
    public javax.swing.JLabel lblNomAcom3;
    public javax.swing.JLabel lblNomAcom4;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomResponsable;
    public javax.swing.JLabel lblNomUser;
    public javax.swing.JLabel lblNumDias;
    public javax.swing.JLabel lblRestriccion;
    public javax.swing.JLabel lblSotMax;
    public javax.swing.JLabel lblValidRESP;
    public javax.swing.JLabel lblValidacion1;
    public javax.swing.JLabel lblValidacion2;
    public javax.swing.JLabel lblValidacion3;
    public javax.swing.JLabel lblValidacion4;
    public javax.swing.JLabel lblsaludo4;
    public javax.swing.JLabel lblsaludo5;
    private javax.swing.JPanel pnlDatos1;
    private javax.swing.JPanel pnlDesayuno;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoRegIng;
    private javax.swing.JPanel pnlRegistroIngresos;
    private javax.swing.JPanel pnlTours;
    public javax.swing.JRadioButton rbtDesayNo;
    public javax.swing.JRadioButton rbtDesaySi;
    public javax.swing.JRadioButton rbtToursNo;
    public javax.swing.JRadioButton rbtToursSi;
    public javax.swing.JTextField txtAcom1;
    public javax.swing.JTextField txtAcom2;
    public javax.swing.JTextField txtAcom3;
    public javax.swing.JTextField txtAcom4;
    public javax.swing.JTextField txtHabitacionNum;
    public javax.swing.JTextField txtNumDocResp;
    public javax.swing.JTextField txtVaPara;
    public javax.swing.JTextField txtValorPagar;
    public javax.swing.JTextField txtValorResta;
    public javax.swing.JTextField txtVieneDe;
    // End of variables declaration//GEN-END:variables

}
