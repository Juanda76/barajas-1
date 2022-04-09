package vistas;

import consultas.consEstadoHabit_J;
import consultas.consHotel_J;
import java.awt.Frame;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;
import static consultas.consUsuario_M.nom;
import static consultas.consEstadoHabit_J.acompA;
import static consultas.consEstadoHabit_J.acompR;
import static consultas.consEstadoHabit_J.nomresA;
import static consultas.consEstadoHabit_J.nomresR;
import controlador.ctrlEstadoHabit_J;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.estadoHab;
// @author Software_Max(JDV)mmnb

public final class FrmEstadoHabit_J extends javax.swing.JFrame {

    Frame JInternalFrame = null;
    consEstadoHabit_J consEstHab = new consEstadoHabit_J();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    public static int dys;
     String fecAct;

    public FrmEstadoHabit_J() {

        initComponents();
       fecAct=lblFecAct.getText();
        valCantHabOcup();
        valCantHabDisp();
        valCantHabReserv();
        valNumHuespedes();
        validInfoPuertaHabit();
        mostrarDatosHot();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lblFecAct = new javax.swing.JTextField();
        pnlHabitaciones = new javax.swing.JPanel();
        marcoP1 = new javax.swing.JPanel();
        puertaHBT1 = new javax.swing.JPanel();
        lblNuPerH1 = new javax.swing.JLabel();
        manija1 = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        btnVerH1 = new javax.swing.JButton();
        lblResH1 = new javax.swing.JLabel();
        lblR1 = new javax.swing.JLabel();
        lblA1 = new javax.swing.JLabel();
        btnIrChekinH1 = new javax.swing.JButton();
        marcoP2 = new javax.swing.JPanel();
        puertaHBT2 = new javax.swing.JPanel();
        num2 = new javax.swing.JLabel();
        btnVerH2 = new javax.swing.JButton();
        manija2 = new javax.swing.JLabel();
        lblNuPerH2 = new javax.swing.JLabel();
        lblResH2 = new javax.swing.JLabel();
        lblR2 = new javax.swing.JLabel();
        lblA2 = new javax.swing.JLabel();
        btnIrChekinH2 = new javax.swing.JButton();
        marcoP3 = new javax.swing.JPanel();
        puertaHBT3 = new javax.swing.JPanel();
        num3 = new javax.swing.JLabel();
        btnVerH3 = new javax.swing.JButton();
        manija3 = new javax.swing.JLabel();
        lblNuPerH3 = new javax.swing.JLabel();
        lblResH3 = new javax.swing.JLabel();
        lblR3 = new javax.swing.JLabel();
        lblA3 = new javax.swing.JLabel();
        btnIrChekinH3 = new javax.swing.JButton();
        marcoP4 = new javax.swing.JPanel();
        puertaHBT4 = new javax.swing.JPanel();
        num4 = new javax.swing.JLabel();
        btnVerH4 = new javax.swing.JButton();
        manija4 = new javax.swing.JLabel();
        lblNuPerH4 = new javax.swing.JLabel();
        lblResH4 = new javax.swing.JLabel();
        lblR4 = new javax.swing.JLabel();
        lblA4 = new javax.swing.JLabel();
        btnIrChekinH4 = new javax.swing.JButton();
        marcoP5 = new javax.swing.JPanel();
        puertaHBT5 = new javax.swing.JPanel();
        num5 = new javax.swing.JLabel();
        btnVerH5 = new javax.swing.JButton();
        manija5 = new javax.swing.JLabel();
        lblNuPerH5 = new javax.swing.JLabel();
        lblResH5 = new javax.swing.JLabel();
        lblR5 = new javax.swing.JLabel();
        lblA5 = new javax.swing.JLabel();
        btnIrChekinH5 = new javax.swing.JButton();
        marcoP6 = new javax.swing.JPanel();
        puertaHBT6 = new javax.swing.JPanel();
        num6 = new javax.swing.JLabel();
        btnVerH6 = new javax.swing.JButton();
        manija6 = new javax.swing.JLabel();
        lblNuPerH6 = new javax.swing.JLabel();
        lblResH6 = new javax.swing.JLabel();
        lblR6 = new javax.swing.JLabel();
        lblA6 = new javax.swing.JLabel();
        btnIrChekinH6 = new javax.swing.JButton();
        marcoP7 = new javax.swing.JPanel();
        puertaHBT7 = new javax.swing.JPanel();
        num7 = new javax.swing.JLabel();
        btnVerH7 = new javax.swing.JButton();
        manija7 = new javax.swing.JLabel();
        lblNuPerH7 = new javax.swing.JLabel();
        lblResH7 = new javax.swing.JLabel();
        lblR7 = new javax.swing.JLabel();
        lblA7 = new javax.swing.JLabel();
        btnIrChekinH7 = new javax.swing.JButton();
        marcoP8 = new javax.swing.JPanel();
        puertaHBT8 = new javax.swing.JPanel();
        num8 = new javax.swing.JLabel();
        btnVerH8 = new javax.swing.JButton();
        manija8 = new javax.swing.JLabel();
        lblNuPerH8 = new javax.swing.JLabel();
        lblResH8 = new javax.swing.JLabel();
        lblR8 = new javax.swing.JLabel();
        lblA8 = new javax.swing.JLabel();
        btnIrChekinH8 = new javax.swing.JButton();
        marcoP9 = new javax.swing.JPanel();
        puertaHBT9 = new javax.swing.JPanel();
        num9 = new javax.swing.JLabel();
        btnVerH9 = new javax.swing.JButton();
        manija9 = new javax.swing.JLabel();
        lblNuPerH9 = new javax.swing.JLabel();
        lblResH9 = new javax.swing.JLabel();
        lblR9 = new javax.swing.JLabel();
        lblA9 = new javax.swing.JLabel();
        btnIrChekinH9 = new javax.swing.JButton();
        marcoP10 = new javax.swing.JPanel();
        puertaHBT10 = new javax.swing.JPanel();
        num10 = new javax.swing.JLabel();
        btnVerH10 = new javax.swing.JButton();
        manija10 = new javax.swing.JLabel();
        lblNuPerH10 = new javax.swing.JLabel();
        lblResH10 = new javax.swing.JLabel();
        lblR10 = new javax.swing.JLabel();
        lblA10 = new javax.swing.JLabel();
        btnIrChekinH10 = new javax.swing.JButton();
        marcoP11 = new javax.swing.JPanel();
        puertaHBT11 = new javax.swing.JPanel();
        num11 = new javax.swing.JLabel();
        btnVerH11 = new javax.swing.JButton();
        manija11 = new javax.swing.JLabel();
        lblNuPerH11 = new javax.swing.JLabel();
        lblResH11 = new javax.swing.JLabel();
        lblR11 = new javax.swing.JLabel();
        lblA11 = new javax.swing.JLabel();
        btnIrChekinH11 = new javax.swing.JButton();
        marcoP12 = new javax.swing.JPanel();
        puertaHBT12 = new javax.swing.JPanel();
        num12 = new javax.swing.JLabel();
        btnVerH12 = new javax.swing.JButton();
        manija12 = new javax.swing.JLabel();
        lblNuPerH12 = new javax.swing.JLabel();
        lblResH12 = new javax.swing.JLabel();
        lblR12 = new javax.swing.JLabel();
        lblA12 = new javax.swing.JLabel();
        btnIrChekinH12 = new javax.swing.JButton();
        pnlDisponibles = new javax.swing.JPanel();
        numHabitRojo3 = new javax.swing.JLabel();
        numDisponibles = new javax.swing.JLabel();
        imgDisponibles = new javax.swing.JLabel();
        pnlReserv = new javax.swing.JPanel();
        numHabitRojo2 = new javax.swing.JLabel();
        numReservas = new javax.swing.JLabel();
        imgReservas = new javax.swing.JLabel();
        pnlOcupacion = new javax.swing.JPanel();
        numHuespedes = new javax.swing.JLabel();
        imgGrupoOcup = new javax.swing.JLabel();
        numHabitRojo1 = new javax.swing.JLabel();
        imgHabitOcup = new javax.swing.JLabel();
        numOcup = new javax.swing.JLabel();

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
                .addGap(0, 3, Short.MAX_VALUE))
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

        lblFecAct.setText("jTextField1");
        pnlDatos1.add(lblFecAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        pnlHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlHabitaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        pnlHabitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marcoP1.setBackground(new java.awt.Color(102, 102, 102));
        marcoP1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP1.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT1.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT1.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNuPerH1.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH1.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT1.add(lblNuPerH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        manija1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija1.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT1.add(manija1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        num1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num1.setForeground(new java.awt.Color(0, 0, 0));
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num1.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT1.add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH1.setText("VER");
        btnVerH1.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT1.add(btnVerH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblResH1.setForeground(new java.awt.Color(255, 255, 255));
        lblResH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH1.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT1.add(lblResH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR1.setForeground(new java.awt.Color(255, 255, 255));
        lblR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR1.setText("RESPONSABLE");
        lblR1.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT1.add(lblR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA1.setForeground(new java.awt.Color(255, 255, 255));
        lblA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA1.setText("ACOMPAÑANTES");
        lblA1.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT1.add(lblA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH1.setText("CHECKIN");
        btnIrChekinH1.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT1.add(btnIrChekinH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP1Layout = new javax.swing.GroupLayout(marcoP1);
        marcoP1.setLayout(marcoP1Layout);
        marcoP1Layout.setHorizontalGroup(
            marcoP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(puertaHBT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        marcoP1Layout.setVerticalGroup(
            marcoP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(puertaHBT1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );

        pnlHabitaciones.add(marcoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        marcoP2.setBackground(new java.awt.Color(102, 102, 102));
        marcoP2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP2.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT2.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT2.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num2.setForeground(new java.awt.Color(0, 0, 0));
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num2.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT2.add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH2.setText("VER");
        btnVerH2.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT2.add(btnVerH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija2.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT2.add(manija2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH2.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH2.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT2.add(lblNuPerH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH2.setForeground(new java.awt.Color(255, 255, 255));
        lblResH2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH2.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT2.add(lblResH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR2.setForeground(new java.awt.Color(255, 255, 255));
        lblR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR2.setText("RESPONSABLE");
        lblR2.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT2.add(lblR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA2.setForeground(new java.awt.Color(255, 255, 255));
        lblA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA2.setText("ACOMPAÑANTES");
        lblA2.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT2.add(lblA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH2.setText("CHECKIN");
        btnIrChekinH2.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT2.add(btnIrChekinH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP2Layout = new javax.swing.GroupLayout(marcoP2);
        marcoP2.setLayout(marcoP2Layout);
        marcoP2Layout.setHorizontalGroup(
            marcoP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP2Layout.setVerticalGroup(
            marcoP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP2Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        marcoP3.setBackground(new java.awt.Color(102, 102, 102));
        marcoP3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP3.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT3.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT3.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num3.setForeground(new java.awt.Color(0, 0, 0));
        num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num3.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT3.add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH3.setText("VER");
        btnVerH3.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT3.add(btnVerH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija3.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT3.add(manija3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH3.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH3.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT3.add(lblNuPerH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH3.setForeground(new java.awt.Color(255, 255, 255));
        lblResH3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH3.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT3.add(lblResH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR3.setForeground(new java.awt.Color(255, 255, 255));
        lblR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR3.setText("RESPONSABLE");
        lblR3.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT3.add(lblR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA3.setForeground(new java.awt.Color(255, 255, 255));
        lblA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA3.setText("ACOMPAÑANTES");
        lblA3.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT3.add(lblA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH3.setText("CHECKIN");
        btnIrChekinH3.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT3.add(btnIrChekinH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP3Layout = new javax.swing.GroupLayout(marcoP3);
        marcoP3.setLayout(marcoP3Layout);
        marcoP3Layout.setHorizontalGroup(
            marcoP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP3Layout.setVerticalGroup(
            marcoP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP3Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        marcoP4.setBackground(new java.awt.Color(102, 102, 102));
        marcoP4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP4.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT4.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT4.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num4.setForeground(new java.awt.Color(0, 0, 0));
        num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num4.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT4.add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH4.setText("VER");
        btnVerH4.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT4.add(btnVerH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija4.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT4.add(manija4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH4.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH4.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT4.add(lblNuPerH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH4.setForeground(new java.awt.Color(255, 255, 255));
        lblResH4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH4.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT4.add(lblResH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR4.setForeground(new java.awt.Color(255, 255, 255));
        lblR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR4.setText("RESPONSABLE");
        lblR4.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT4.add(lblR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA4.setForeground(new java.awt.Color(255, 255, 255));
        lblA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA4.setText("ACOMPAÑANTES");
        lblA4.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT4.add(lblA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH4.setText("CHECKIN");
        btnIrChekinH4.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT4.add(btnIrChekinH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP4Layout = new javax.swing.GroupLayout(marcoP4);
        marcoP4.setLayout(marcoP4Layout);
        marcoP4Layout.setHorizontalGroup(
            marcoP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP4Layout.setVerticalGroup(
            marcoP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP4Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        marcoP5.setBackground(new java.awt.Color(102, 102, 102));
        marcoP5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP5.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT5.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT5.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num5.setForeground(new java.awt.Color(0, 0, 0));
        num5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num5.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT5.add(num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH5.setText("VER");
        btnVerH5.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT5.add(btnVerH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija5.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT5.add(manija5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH5.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH5.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT5.add(lblNuPerH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH5.setForeground(new java.awt.Color(255, 255, 255));
        lblResH5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH5.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT5.add(lblResH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR5.setForeground(new java.awt.Color(255, 255, 255));
        lblR5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR5.setText("RESPONSABLE");
        lblR5.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT5.add(lblR5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA5.setForeground(new java.awt.Color(255, 255, 255));
        lblA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA5.setText("ACOMPAÑANTES");
        lblA5.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT5.add(lblA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH5.setText("CHECKIN");
        btnIrChekinH5.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT5.add(btnIrChekinH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP5Layout = new javax.swing.GroupLayout(marcoP5);
        marcoP5.setLayout(marcoP5Layout);
        marcoP5Layout.setHorizontalGroup(
            marcoP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP5Layout.setVerticalGroup(
            marcoP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP5Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT5, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        marcoP6.setBackground(new java.awt.Color(102, 102, 102));
        marcoP6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP6.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT6.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT6.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num6.setForeground(new java.awt.Color(0, 0, 0));
        num6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num6.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT6.add(num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH6.setText("VER");
        btnVerH6.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT6.add(btnVerH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija6.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT6.add(manija6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH6.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH6.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT6.add(lblNuPerH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH6.setForeground(new java.awt.Color(255, 255, 255));
        lblResH6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH6.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT6.add(lblResH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR6.setForeground(new java.awt.Color(255, 255, 255));
        lblR6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR6.setText("RESPONSABLE");
        lblR6.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT6.add(lblR6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA6.setForeground(new java.awt.Color(255, 255, 255));
        lblA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA6.setText("ACOMPAÑANTES");
        lblA6.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT6.add(lblA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH6.setText("CHECKIN");
        btnIrChekinH6.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT6.add(btnIrChekinH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP6Layout = new javax.swing.GroupLayout(marcoP6);
        marcoP6.setLayout(marcoP6Layout);
        marcoP6Layout.setHorizontalGroup(
            marcoP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP6Layout.setVerticalGroup(
            marcoP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP6Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT6, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, -1, -1));

        marcoP7.setBackground(new java.awt.Color(102, 102, 102));
        marcoP7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP7.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT7.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT7.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num7.setForeground(new java.awt.Color(0, 0, 0));
        num7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num7.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT7.add(num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH7.setText("VER");
        btnVerH7.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT7.add(btnVerH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija7.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT7.add(manija7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH7.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH7.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT7.add(lblNuPerH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH7.setForeground(new java.awt.Color(255, 255, 255));
        lblResH7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH7.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT7.add(lblResH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR7.setForeground(new java.awt.Color(255, 255, 255));
        lblR7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR7.setText("RESPONSABLE");
        lblR7.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT7.add(lblR7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA7.setForeground(new java.awt.Color(255, 255, 255));
        lblA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA7.setText("ACOMPAÑANTES");
        lblA7.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT7.add(lblA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH7.setText("CHECKIN");
        btnIrChekinH7.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT7.add(btnIrChekinH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP7Layout = new javax.swing.GroupLayout(marcoP7);
        marcoP7.setLayout(marcoP7Layout);
        marcoP7Layout.setHorizontalGroup(
            marcoP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP7Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP7Layout.setVerticalGroup(
            marcoP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP7Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT7, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        marcoP8.setBackground(new java.awt.Color(102, 102, 102));
        marcoP8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP8.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT8.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT8.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num8.setForeground(new java.awt.Color(0, 0, 0));
        num8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num8.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT8.add(num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH8.setText("VER");
        btnVerH8.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT8.add(btnVerH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija8.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT8.add(manija8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH8.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH8.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT8.add(lblNuPerH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH8.setForeground(new java.awt.Color(255, 255, 255));
        lblResH8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH8.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT8.add(lblResH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR8.setForeground(new java.awt.Color(255, 255, 255));
        lblR8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR8.setText("RESPONSABLE");
        lblR8.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT8.add(lblR8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA8.setForeground(new java.awt.Color(255, 255, 255));
        lblA8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA8.setText("ACOMPAÑANTES");
        lblA8.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT8.add(lblA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH8.setText("CHECKIN");
        btnIrChekinH8.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT8.add(btnIrChekinH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP8Layout = new javax.swing.GroupLayout(marcoP8);
        marcoP8.setLayout(marcoP8Layout);
        marcoP8Layout.setHorizontalGroup(
            marcoP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP8Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP8Layout.setVerticalGroup(
            marcoP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP8Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT8, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        marcoP9.setBackground(new java.awt.Color(102, 102, 102));
        marcoP9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP9.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT9.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT9.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num9.setForeground(new java.awt.Color(0, 0, 0));
        num9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num9.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT9.add(num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH9.setText("VER");
        btnVerH9.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT9.add(btnVerH9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija9.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT9.add(manija9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH9.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH9.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT9.add(lblNuPerH9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH9.setForeground(new java.awt.Color(255, 255, 255));
        lblResH9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH9.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT9.add(lblResH9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR9.setForeground(new java.awt.Color(255, 255, 255));
        lblR9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR9.setText("RESPONSABLE");
        lblR9.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT9.add(lblR9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA9.setForeground(new java.awt.Color(255, 255, 255));
        lblA9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA9.setText("ACOMPAÑANTES");
        lblA9.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT9.add(lblA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH9.setText("CHECKIN");
        btnIrChekinH9.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT9.add(btnIrChekinH9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP9Layout = new javax.swing.GroupLayout(marcoP9);
        marcoP9.setLayout(marcoP9Layout);
        marcoP9Layout.setHorizontalGroup(
            marcoP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP9Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP9Layout.setVerticalGroup(
            marcoP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP9Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT9, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        marcoP10.setBackground(new java.awt.Color(102, 102, 102));
        marcoP10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP10.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT10.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT10.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num10.setForeground(new java.awt.Color(0, 0, 0));
        num10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num10.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT10.add(num10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH10.setText("VER");
        btnVerH10.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT10.add(btnVerH10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija10.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT10.add(manija10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH10.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH10.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT10.add(lblNuPerH10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH10.setForeground(new java.awt.Color(255, 255, 255));
        lblResH10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH10.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT10.add(lblResH10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR10.setForeground(new java.awt.Color(255, 255, 255));
        lblR10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR10.setText("RESPONSABLE");
        lblR10.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT10.add(lblR10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA10.setForeground(new java.awt.Color(255, 255, 255));
        lblA10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA10.setText("ACOMPAÑANTES");
        lblA10.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT10.add(lblA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH10.setText("CHECKIN");
        btnIrChekinH10.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT10.add(btnIrChekinH10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP10Layout = new javax.swing.GroupLayout(marcoP10);
        marcoP10.setLayout(marcoP10Layout);
        marcoP10Layout.setHorizontalGroup(
            marcoP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP10Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP10Layout.setVerticalGroup(
            marcoP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP10Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT10, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        marcoP11.setBackground(new java.awt.Color(102, 102, 102));
        marcoP11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP11.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT11.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT11.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num11.setForeground(new java.awt.Color(0, 0, 0));
        num11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num11.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT11.add(num11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH11.setText("VER");
        btnVerH11.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT11.add(btnVerH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija11.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT11.add(manija11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH11.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH11.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT11.add(lblNuPerH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH11.setForeground(new java.awt.Color(255, 255, 255));
        lblResH11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH11.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT11.add(lblResH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR11.setForeground(new java.awt.Color(255, 255, 255));
        lblR11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR11.setText("RESPONSABLE");
        lblR11.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT11.add(lblR11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA11.setForeground(new java.awt.Color(255, 255, 255));
        lblA11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA11.setText("ACOMPAÑANTES");
        lblA11.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT11.add(lblA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH11.setText("CHECKIN");
        btnIrChekinH11.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT11.add(btnIrChekinH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP11Layout = new javax.swing.GroupLayout(marcoP11);
        marcoP11.setLayout(marcoP11Layout);
        marcoP11Layout.setHorizontalGroup(
            marcoP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP11Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP11Layout.setVerticalGroup(
            marcoP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP11Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT11, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, -1, -1));

        marcoP12.setBackground(new java.awt.Color(102, 102, 102));
        marcoP12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        marcoP12.setPreferredSize(new java.awt.Dimension(200, 270));

        puertaHBT12.setBackground(new java.awt.Color(204, 204, 204));
        puertaHBT12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.black, java.awt.Color.white));
        puertaHBT12.setPreferredSize(new java.awt.Dimension(180, 250));
        puertaHBT12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        num12.setForeground(new java.awt.Color(0, 0, 0));
        num12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num12.setPreferredSize(new java.awt.Dimension(80, 40));
        puertaHBT12.add(num12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnVerH12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnVerH12.setText("VER");
        btnVerH12.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT12.add(btnVerH12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        manija12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        manija12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manija12.setPreferredSize(new java.awt.Dimension(25, 50));
        puertaHBT12.add(manija12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lblNuPerH12.setForeground(new java.awt.Color(255, 255, 255));
        lblNuPerH12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuPerH12.setPreferredSize(new java.awt.Dimension(50, 17));
        puertaHBT12.add(lblNuPerH12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblResH12.setForeground(new java.awt.Color(255, 255, 255));
        lblResH12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResH12.setPreferredSize(new java.awt.Dimension(110, 17));
        puertaHBT12.add(lblResH12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblR12.setForeground(new java.awt.Color(255, 255, 255));
        lblR12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR12.setText("RESPONSABLE");
        lblR12.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT12.add(lblR12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblA12.setForeground(new java.awt.Color(255, 255, 255));
        lblA12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA12.setText("ACOMPAÑANTES");
        lblA12.setPreferredSize(new java.awt.Dimension(110, 16));
        puertaHBT12.add(lblA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnIrChekinH12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnIrChekinH12.setText("CHECKIN");
        btnIrChekinH12.setPreferredSize(new java.awt.Dimension(140, 20));
        puertaHBT12.add(btnIrChekinH12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout marcoP12Layout = new javax.swing.GroupLayout(marcoP12);
        marcoP12.setLayout(marcoP12Layout);
        marcoP12Layout.setHorizontalGroup(
            marcoP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(marcoP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP12Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puertaHBT12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        marcoP12Layout.setVerticalGroup(
            marcoP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(marcoP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcoP12Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(puertaHBT12, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
        );

        pnlHabitaciones.add(marcoP12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 340, -1, -1));

        pnlDisponibles.setBackground(new java.awt.Color(0, 175, 22));
        pnlDisponibles.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        pnlDisponibles.setPreferredSize(new java.awt.Dimension(443, 50));
        pnlDisponibles.setRequestFocusEnabled(false);
        pnlDisponibles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numHabitRojo3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        numHabitRojo3.setForeground(new java.awt.Color(255, 255, 255));
        numHabitRojo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numHabitRojo3.setText("Disponibles");
        numHabitRojo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlDisponibles.add(numHabitRojo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 100, 20));

        numDisponibles.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        numDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        numDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numDisponibles.setText("0");
        numDisponibles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlDisponibles.add(numDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 20, 20));

        imgDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDisponibles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgDisponibles.setPreferredSize(new java.awt.Dimension(30, 30));
        pnlDisponibles.add(imgDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        pnlHabitaciones.add(pnlDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pnlReserv.setBackground(new java.awt.Color(255, 204, 0));
        pnlReserv.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        pnlReserv.setPreferredSize(new java.awt.Dimension(443, 50));
        pnlReserv.setRequestFocusEnabled(false);
        pnlReserv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numHabitRojo2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        numHabitRojo2.setForeground(new java.awt.Color(255, 255, 255));
        numHabitRojo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numHabitRojo2.setText("Reservaciones");
        numHabitRojo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlReserv.add(numHabitRojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 140, 20));

        numReservas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        numReservas.setForeground(new java.awt.Color(255, 255, 255));
        numReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numReservas.setText("0");
        numReservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlReserv.add(numReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 20, 20));

        imgReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgReservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgReservas.setPreferredSize(new java.awt.Dimension(30, 30));
        pnlReserv.add(imgReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        pnlHabitaciones.add(pnlReserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        pnlOcupacion.setBackground(new java.awt.Color(255, 51, 51));
        pnlOcupacion.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        pnlOcupacion.setPreferredSize(new java.awt.Dimension(443, 50));
        pnlOcupacion.setRequestFocusEnabled(false);
        pnlOcupacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numHuespedes.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        numHuespedes.setForeground(new java.awt.Color(255, 255, 255));
        numHuespedes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numHuespedes.setText("0");
        numHuespedes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlOcupacion.add(numHuespedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 20, 20));

        imgGrupoOcup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGrupoOcup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgGrupoOcup.setPreferredSize(new java.awt.Dimension(30, 30));
        pnlOcupacion.add(imgGrupoOcup, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        numHabitRojo1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        numHabitRojo1.setForeground(new java.awt.Color(255, 255, 255));
        numHabitRojo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numHabitRojo1.setText("Ocupacion");
        numHabitRojo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlOcupacion.add(numHabitRojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 100, 20));

        imgHabitOcup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHabitOcup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgHabitOcup.setPreferredSize(new java.awt.Dimension(30, 30));
        pnlOcupacion.add(imgHabitOcup, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        numOcup.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        numOcup.setForeground(new java.awt.Color(255, 255, 255));
        numOcup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numOcup.setText("0");
        numOcup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlOcupacion.add(numOcup, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 20, 20));

        pnlHabitaciones.add(pnlOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, -1));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

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

//************************************VOID MAIN **************************************************************
    public static void main(String args[]) {

        consEstadoHabit_J consEstHab = new consEstadoHabit_J();
        FrmEstadoHabit_J frmEstHab = new FrmEstadoHabit_J();
        estadoHab modEstHab = new estadoHab();
        ctrlEstadoHabit_J ctrlEstHab = new ctrlEstadoHabit_J(consEstHab, frmEstHab, modEstHab);
        frmEstHab.setVisible(true);

    }

//****************************************** METODOS **********************************************************************
//*************************************************************************************************************************
    public void usarEstadoHab(String numHab, JPanel puertaNum, JLabel Lresp, JLabel Lacomp, JLabel respRes, JLabel acompRes, JButton btnVerHabNum, JButton btnIrChekinNum) {

        String est = consEstHab.verEstadoAux(numHab);

        switch (est) {
            case "DISPONIBLE":
                puertaNum.setBackground(new Color(0, 204, 0));
                Lresp.setVisible(false);
                Lacomp.setVisible(false);
                respRes.setText("");
                acompRes.setText("");
                btnVerHabNum.setVisible(false);
                btnIrChekinNum.setVisible(true);
                break;

            case "OCUPADO":
                consEstHab.datosHabitPuertaRoja("OCUPADO", numHab);
                puertaNum.setBackground(Color.RED);
                Lresp.setVisible(true);
                Lacomp.setVisible(true);
                respRes.setText(nomresR);
                acompRes.setText(acompR);
                btnVerHabNum.setVisible(true);
                btnIrChekinNum.setVisible(false);
                break;
            default:
                break;
        }

        if (est.equals("RESERVA")) {

            dys = diasRestReserva(est, numHab);

            if (dys > 1) {
                puertaNum.setBackground(new Color(0, 204, 0));
                Lresp.setVisible(false);
                Lacomp.setVisible(false);
                respRes.setText("");
                acompRes.setText("");
                btnVerHabNum.setVisible(false);
                btnIrChekinNum.setVisible(true);

            } else {

                consEstHab.datosHabitPuertaAmarilla("RESERVA", numHab);
                puertaNum.setBackground(new Color(255, 204, 0));
                Lresp.setVisible(true);
                Lacomp.setVisible(true);
                respRes.setText(nomresA);
                acompRes.setText(acompA);
                btnVerHabNum.setVisible(true);
                btnIrChekinNum.setVisible(false);

            }

        }
    }

//*************************************************************************************************************************
    public void validInfoPuertaHabit() {

        usarEstadoHab("1", puertaHBT1, lblR1, lblA1, lblResH1, lblNuPerH1, btnVerH1, btnIrChekinH1);
        usarEstadoHab("2", puertaHBT2, lblR2, lblA2, lblResH2, lblNuPerH2, btnVerH2, btnIrChekinH2);
        usarEstadoHab("3", puertaHBT3, lblR3, lblA3, lblResH3, lblNuPerH3, btnVerH3, btnIrChekinH3);
        usarEstadoHab("4", puertaHBT4, lblR4, lblA4, lblResH4, lblNuPerH4, btnVerH4, btnIrChekinH4);
        usarEstadoHab("5", puertaHBT5, lblR5, lblA5, lblResH5, lblNuPerH5, btnVerH5, btnIrChekinH5);
        usarEstadoHab("6", puertaHBT6, lblR6, lblA6, lblResH6, lblNuPerH6, btnVerH6, btnIrChekinH6);
        usarEstadoHab("7", puertaHBT7, lblR7, lblA7, lblResH7, lblNuPerH7, btnVerH7, btnIrChekinH7);
        usarEstadoHab("8", puertaHBT8, lblR8, lblA8, lblResH8, lblNuPerH8, btnVerH8, btnIrChekinH8);
        usarEstadoHab("9", puertaHBT9, lblR9, lblA9, lblResH9, lblNuPerH9, btnVerH9, btnIrChekinH9);
        usarEstadoHab("10", puertaHBT10, lblR10, lblA10, lblResH10, lblNuPerH10, btnVerH10, btnIrChekinH10);
        usarEstadoHab("11", puertaHBT11, lblR11, lblA11, lblResH11, lblNuPerH11, btnVerH11, btnIrChekinH11);
        usarEstadoHab("12", puertaHBT12, lblR12, lblA12, lblResH12, lblNuPerH12, btnVerH12, btnIrChekinH12);
    }

//******************************************** VALIDAR HABITACIONES OCUPADAS ****************************************************************
    private void valCantHabOcup() {
        int n = consEstHab.cantEstados("OCUPADO");
        if (n >= 1) {
            numOcup.setVisible(true);
            numOcup.setText(String.valueOf(n));
        } else {
            numOcup.setVisible(true);
            numOcup.setText("0");

        }
    }
//******************************************** VALIDAR HABITACIONES DISPONIBLES ****************************************************************

    private void valCantHabDisp() {
        int n = consEstHab.cantEstados("DISPONIBLE");
        if (n >= 1) {
            numDisponibles.setVisible(true);
            numDisponibles.setText(String.valueOf(n));
        } else {
            numDisponibles.setVisible(true);
            numDisponibles.setText("0");

        }
    }
//******************************************** VALIDAR HABITACIONES RESERVADAS  ****************************************************************

    private void valCantHabReserv() {
        int n = consEstHab.cantEstados("RESERVA");
        if (n >= 1) {
            numReservas.setVisible(true);
            numReservas.setText(String.valueOf(n));
        } else {
            numReservas.setVisible(true);
            numReservas.setText("0");

        }
    }
//******************************************** VALIDAR NUMERO HUESPEDES  ****************************************************************

    private void valNumHuespedes() {
        int n = consEstHab.numActualHuespedes();
        if (n >= 1) {
            numHuespedes.setVisible(true);
            numHuespedes.setText(String.valueOf(n));
        } else {
            numHuespedes.setVisible(true);
            numHuespedes.setText("0");

        }
    }
//******************************************** VALIDAR NUMERO HUESPEDES  ****************************************************************

    public int diasRestReserva(String est, String numHab) {
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
       String fecAct1 = (formato.format(sistFecha));
        String ingA = consEstHab.fechaHabAmarilla("RESERVA", numHab);

        String fecha1 = (ingA);
        String fecha2 = (fecAct1);
        
        Date f1 = setearFechas(fecha1);
        Date f2 = setearFechas(fecha2);
        

        int dias = consEstHab.numeroDiasParaReserva(f2, f1);
        return dias;

    }

//*********************************************************************************************************************************************
    public Date setearFechas(String fec) {

        Date fechaSetDate = null;

        try {
            fechaSetDate = formatoFecha.parse(fec);

        } catch (ParseException ex) {

            Logger.getLogger(FrmReservas_J.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaSetDate;

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
        
        lblFecAct.setVisible(false);

        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");
        RSScaleLabel.setScaleLabel(manija1, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num1, "src/img/H1.png");
        RSScaleLabel.setScaleLabel(manija2, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num2, "src/img/H2.png");
        RSScaleLabel.setScaleLabel(manija3, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num3, "src/img/H3.png");
        RSScaleLabel.setScaleLabel(manija4, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num4, "src/img/H4.png");
        RSScaleLabel.setScaleLabel(manija5, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num5, "src/img/H5.png");
        RSScaleLabel.setScaleLabel(manija6, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num6, "src/img/H6.png");
        RSScaleLabel.setScaleLabel(manija7, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num7, "src/img/H7.png");
        RSScaleLabel.setScaleLabel(manija8, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num8, "src/img/H8.png");
        RSScaleLabel.setScaleLabel(manija9, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num9, "src/img/H9.png");
        RSScaleLabel.setScaleLabel(manija10, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num10, "src/img/H10.png");
        RSScaleLabel.setScaleLabel(manija11, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num11, "src/img/H11.png");
        RSScaleLabel.setScaleLabel(manija12, "src/img/manija.png");
        RSScaleLabel.setScaleLabel(num12, "src/img/H12.png");
        RSScaleLabel.setScaleLabel(imgGrupoOcup, "src/img/grupoB.png");
        RSScaleLabel.setScaleLabel(imgHabitOcup, "src/img/llave.png");
        RSScaleLabel.setScaleLabel(imgDisponibles, "src/img/disp1.png");
        RSScaleLabel.setScaleLabel(imgReservas, "src/img/reserva.png");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIrChekinH1;
    public javax.swing.JButton btnIrChekinH10;
    public javax.swing.JButton btnIrChekinH11;
    public javax.swing.JButton btnIrChekinH12;
    public javax.swing.JButton btnIrChekinH2;
    public javax.swing.JButton btnIrChekinH3;
    public javax.swing.JButton btnIrChekinH4;
    public javax.swing.JButton btnIrChekinH5;
    public javax.swing.JButton btnIrChekinH6;
    public javax.swing.JButton btnIrChekinH7;
    public javax.swing.JButton btnIrChekinH8;
    public javax.swing.JButton btnIrChekinH9;
    public javax.swing.JLabel btnSalir;
    public javax.swing.JButton btnVerH1;
    public javax.swing.JButton btnVerH10;
    public javax.swing.JButton btnVerH11;
    public javax.swing.JButton btnVerH12;
    public javax.swing.JButton btnVerH2;
    public javax.swing.JButton btnVerH3;
    public javax.swing.JButton btnVerH4;
    public javax.swing.JButton btnVerH5;
    public javax.swing.JButton btnVerH6;
    public javax.swing.JButton btnVerH7;
    public javax.swing.JButton btnVerH8;
    public javax.swing.JButton btnVerH9;
    public javax.swing.JLabel imgDisponibles;
    public javax.swing.JLabel imgGrupoOcup;
    public javax.swing.JLabel imgHabitOcup;
    public javax.swing.JLabel imgReservas;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblA1;
    public javax.swing.JLabel lblA10;
    public javax.swing.JLabel lblA11;
    public javax.swing.JLabel lblA12;
    public javax.swing.JLabel lblA2;
    public javax.swing.JLabel lblA3;
    public javax.swing.JLabel lblA4;
    public javax.swing.JLabel lblA5;
    public javax.swing.JLabel lblA6;
    public javax.swing.JLabel lblA7;
    public javax.swing.JLabel lblA8;
    public javax.swing.JLabel lblA9;
    public javax.swing.JLabel lblCara;
    public javax.swing.JTextField lblFecAct;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHola;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomUser;
    public javax.swing.JLabel lblNuPerH1;
    public javax.swing.JLabel lblNuPerH10;
    public javax.swing.JLabel lblNuPerH11;
    public javax.swing.JLabel lblNuPerH12;
    public javax.swing.JLabel lblNuPerH2;
    public javax.swing.JLabel lblNuPerH3;
    public javax.swing.JLabel lblNuPerH4;
    public javax.swing.JLabel lblNuPerH5;
    public javax.swing.JLabel lblNuPerH6;
    public javax.swing.JLabel lblNuPerH7;
    public javax.swing.JLabel lblNuPerH8;
    public javax.swing.JLabel lblNuPerH9;
    public javax.swing.JLabel lblR1;
    public javax.swing.JLabel lblR10;
    public javax.swing.JLabel lblR11;
    public javax.swing.JLabel lblR12;
    public javax.swing.JLabel lblR2;
    public javax.swing.JLabel lblR3;
    public javax.swing.JLabel lblR4;
    public javax.swing.JLabel lblR5;
    public javax.swing.JLabel lblR6;
    public javax.swing.JLabel lblR7;
    public javax.swing.JLabel lblR8;
    public javax.swing.JLabel lblR9;
    public javax.swing.JLabel lblResH1;
    public javax.swing.JLabel lblResH10;
    public javax.swing.JLabel lblResH11;
    public javax.swing.JLabel lblResH12;
    public javax.swing.JLabel lblResH2;
    public javax.swing.JLabel lblResH3;
    public javax.swing.JLabel lblResH4;
    public javax.swing.JLabel lblResH5;
    public javax.swing.JLabel lblResH6;
    public javax.swing.JLabel lblResH7;
    public javax.swing.JLabel lblResH8;
    public javax.swing.JLabel lblResH9;
    public javax.swing.JLabel lblSotMax;
    public javax.swing.JLabel lblsaludo4;
    public javax.swing.JLabel lblsaludo5;
    public javax.swing.JLabel manija1;
    public javax.swing.JLabel manija10;
    public javax.swing.JLabel manija11;
    public javax.swing.JLabel manija12;
    public javax.swing.JLabel manija2;
    public javax.swing.JLabel manija3;
    public javax.swing.JLabel manija4;
    public javax.swing.JLabel manija5;
    public javax.swing.JLabel manija6;
    public javax.swing.JLabel manija7;
    public javax.swing.JLabel manija8;
    public javax.swing.JLabel manija9;
    public javax.swing.JPanel marcoP1;
    public javax.swing.JPanel marcoP10;
    public javax.swing.JPanel marcoP11;
    public javax.swing.JPanel marcoP12;
    public javax.swing.JPanel marcoP2;
    public javax.swing.JPanel marcoP3;
    public javax.swing.JPanel marcoP4;
    public javax.swing.JPanel marcoP5;
    public javax.swing.JPanel marcoP6;
    public javax.swing.JPanel marcoP7;
    public javax.swing.JPanel marcoP8;
    public javax.swing.JPanel marcoP9;
    public javax.swing.JLabel num1;
    public javax.swing.JLabel num10;
    public javax.swing.JLabel num11;
    public javax.swing.JLabel num12;
    public javax.swing.JLabel num2;
    public javax.swing.JLabel num3;
    public javax.swing.JLabel num4;
    public javax.swing.JLabel num5;
    public javax.swing.JLabel num6;
    public javax.swing.JLabel num7;
    public javax.swing.JLabel num8;
    public javax.swing.JLabel num9;
    public javax.swing.JLabel numDisponibles;
    public javax.swing.JLabel numHabitRojo1;
    public javax.swing.JLabel numHabitRojo2;
    public javax.swing.JLabel numHabitRojo3;
    public javax.swing.JLabel numHuespedes;
    public javax.swing.JLabel numOcup;
    public javax.swing.JLabel numReservas;
    private javax.swing.JPanel pnlDatos1;
    public javax.swing.JPanel pnlDisponibles;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlHabitaciones;
    public javax.swing.JPanel pnlOcupacion;
    public javax.swing.JPanel pnlReserv;
    public javax.swing.JPanel puertaHBT1;
    public javax.swing.JPanel puertaHBT10;
    public javax.swing.JPanel puertaHBT11;
    public javax.swing.JPanel puertaHBT12;
    public javax.swing.JPanel puertaHBT2;
    public javax.swing.JPanel puertaHBT3;
    public javax.swing.JPanel puertaHBT4;
    public javax.swing.JPanel puertaHBT5;
    public javax.swing.JPanel puertaHBT6;
    public javax.swing.JPanel puertaHBT7;
    public javax.swing.JPanel puertaHBT8;
    public javax.swing.JPanel puertaHBT9;
    // End of variables declaration//GEN-END:variables

}
