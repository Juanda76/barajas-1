package vistas;

import alertas.AlertaEnProd;
import controlador.ctrlCliente_J;
import controlador.ctrlGastos_M;
import controlador.ctrlHotel_J;
import controlador.ctrlIngresos_M;
import controlador.ctrlPagosPend_J;
import controlador.ctrlReservas_J;
import controlador.ctrlTours_J;
import java.awt.Color;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.cliente_J;
import consultas.consCliente_J;
import consultas.consEstadoHabit_J;
import consultas.consGastos_M;
import consultas.consHotel_J;
import consultas.consIngresos_M;
import consultas.consPagPend_J;
import consultas.consReservas_J;
import consultas.consTours_J;
import modelo.gastos_M;
import modelo.hotel_J;
import modelo.ingresos_M;
import modelo.pagosPend_J;
import modelo.reservas_J;
import rsscalelabel.RSScaleLabel;
import static consultas.consUsuario_M.nom;
import controlador.ctrlEstadoHabit_J;
import modelo.estadoHab;
import modelo.tours_J;

// @author Software_Max(JDV)
public final class FrmMenuAdmin_J extends javax.swing.JFrame {

    consPagPend_J consPag = new consPagPend_J();
    consReservas_J consResv = new consReservas_J();
    Frame JInternalFrame;
    public static String mensajeAL;

    public FrmMenuAdmin_J() {
        initComponents();
        mostrarDatosHot();
        pagPen();
        resvPend();
//        this.setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoPpal = new javax.swing.JPanel();
        pnlDatos1 = new javax.swing.JPanel();
        lblNomHotel = new javax.swing.JLabel();
        lblLocalizacion = new javax.swing.JLabel();
        btnCerrSesion = new java.awt.Label();
        btnSalir = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        lblsaludo5 = new javax.swing.JLabel();
        lblSotMax = new javax.swing.JLabel();
        lblsaludo4 = new javax.swing.JLabel();
        lblCara = new javax.swing.JLabel();
        lblHola = new javax.swing.JLabel();
        lblNomUser = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        pnlOPERA = new javax.swing.JPanel();
        btnRegNuevoHuesped = new rsbuttoncustom.RSButtonCustom();
        btnEstadoHabit = new rsbuttoncustom.RSButtonCustom();
        btnRegIngresoDinero = new rsbuttoncustom.RSButtonCustom();
        btnRegSalidaDinero = new rsbuttoncustom.RSButtonCustom();
        btnReservas = new rsbuttoncustom.RSButtonCustom();
        btnTours = new rsbuttoncustom.RSButtonCustom();
        jLabel19 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lblImgOperac = new javax.swing.JLabel();
        btnRegPagosPendientes = new rsbuttoncustom.RSButtonCustom();
        lblPagPend = new java.awt.Label();
        lblResvPend = new java.awt.Label();
        pnCONFIG = new javax.swing.JPanel();
        btnRegEmpleados = new rsbuttoncustom.RSButtonCustom();
        btnDatosHotel = new rsbuttoncustom.RSButtonCustom();
        btnListNegra = new rsbuttoncustom.RSButtonCustom();
        jLabel17 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblImgConfig = new javax.swing.JLabel();
        pnlREPORT = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblImgReport = new javax.swing.JLabel();
        btnRepGastIng = new rsbuttoncustom.RSButtonCustom();
        btnRepVisit = new rsbuttoncustom.RSButtonCustom();
        btnRepReserv = new rsbuttoncustom.RSButtonCustom();
        btnRepTours = new rsbuttoncustom.RSButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondoPpal.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoPpal.setMinimumSize(new java.awt.Dimension(1366, 768));
        pnlFondoPpal.setPreferredSize(new java.awt.Dimension(1366, 768));
        pnlFondoPpal.setRequestFocusEnabled(false);
        pnlFondoPpal.setVerifyInputWhenFocusTarget(false);
        pnlFondoPpal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDatos1.setBackground(new java.awt.Color(4, 153, 193));
        pnlDatos1.setPreferredSize(new java.awt.Dimension(1350, 117));
        pnlDatos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomHotel.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lblNomHotel.setForeground(new java.awt.Color(255, 255, 255));
        lblNomHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomHotel.setText("NOMBRE HOTEL");
        pnlDatos1.add(lblNomHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 540, -1));

        lblLocalizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocalizacion.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocalizacion.setText("LOCALIZADO EN");
        pnlDatos1.add(lblLocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 540, -1));

        btnCerrSesion.setAlignment(java.awt.Label.CENTER);
        btnCerrSesion.setBackground(new java.awt.Color(0, 153, 255));
        btnCerrSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrSesion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCerrSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrSesion.setName(""); // NOI18N
        btnCerrSesion.setPreferredSize(new java.awt.Dimension(90, 25));
        btnCerrSesion.setText("CERRAR SESION");
        btnCerrSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrSesionMouseExited(evt);
            }
        });
        pnlDatos1.add(btnCerrSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 70, -1, -1));

        btnSalir.setAlignment(java.awt.Label.CENTER);
        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setName(""); // NOI18N
        btnSalir.setPreferredSize(new java.awt.Dimension(90, 25));
        btnSalir.setText("SALIR");
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
        pnlDatos1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(4, 153, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsaludo5.setFont(new java.awt.Font("sansserif", 3, 6)); // NOI18N
        lblsaludo5.setForeground(new java.awt.Color(255, 255, 255));
        lblsaludo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsaludo5.setText("DESARROLLADO POR");
        jPanel1.add(lblsaludo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblSotMax.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSotMax.setForeground(new java.awt.Color(255, 255, 255));
        lblSotMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSotMax.setPreferredSize(new java.awt.Dimension(40, 50));
        jPanel1.add(lblSotMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 38));

        lblsaludo4.setFont(new java.awt.Font("Comic Sans MS", 3, 9)); // NOI18N
        lblsaludo4.setForeground(new java.awt.Color(255, 255, 255));
        lblsaludo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsaludo4.setText("SOFTWARE MAX");
        jPanel1.add(lblsaludo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pnlDatos1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 80, 80));

        lblCara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCara.setPreferredSize(new java.awt.Dimension(80, 80));
        pnlDatos1.add(lblCara, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 79));

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

        pnlFondoPpal.add(pnlDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pnlMenu.setBackground(new java.awt.Color(4, 153, 193));

        pnlOPERA.setBackground(new java.awt.Color(255, 255, 255));
        pnlOPERA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegNuevoHuesped.setForeground(new java.awt.Color(4, 153, 193));
        btnRegNuevoHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/RegistrarCliente.png"))); // NOI18N
        btnRegNuevoHuesped.setText("<html><center>REGISTRAR<p>NUEVO HUESPED");
        btnRegNuevoHuesped.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRegNuevoHuesped.setFocusPainted(false);
        btnRegNuevoHuesped.setPreferredSize(new java.awt.Dimension(140, 80));
        btnRegNuevoHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegNuevoHuespedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegNuevoHuespedMouseExited(evt);
            }
        });
        btnRegNuevoHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegNuevoHuespedActionPerformed(evt);
            }
        });
        pnlOPERA.add(btnRegNuevoHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, 90));

        btnEstadoHabit.setForeground(new java.awt.Color(4, 153, 193));
        btnEstadoHabit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/EstadoHabitacion.png"))); // NOI18N
        btnEstadoHabit.setText("<html><center>ESTADO <p>HABITACIONES");
        btnEstadoHabit.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnEstadoHabit.setFocusPainted(false);
        btnEstadoHabit.setPreferredSize(new java.awt.Dimension(150, 90));
        btnEstadoHabit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstadoHabitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstadoHabitMouseExited(evt);
            }
        });
        btnEstadoHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoHabitActionPerformed(evt);
            }
        });
        pnlOPERA.add(btnEstadoHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

        btnRegIngresoDinero.setForeground(new java.awt.Color(4, 153, 193));
        btnRegIngresoDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/IngreDinero.png"))); // NOI18N
        btnRegIngresoDinero.setText("<html><center>REGISTRO <p>INGRESOS");
        btnRegIngresoDinero.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRegIngresoDinero.setFocusPainted(false);
        btnRegIngresoDinero.setPreferredSize(new java.awt.Dimension(150, 90));
        btnRegIngresoDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegIngresoDineroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegIngresoDineroMouseExited(evt);
            }
        });
        btnRegIngresoDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegIngresoDineroActionPerformed(evt);
            }
        });
        pnlOPERA.add(btnRegIngresoDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        btnRegSalidaDinero.setForeground(new java.awt.Color(4, 153, 193));
        btnRegSalidaDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/SalidaDinero.png"))); // NOI18N
        btnRegSalidaDinero.setText("<html><center>REGISTRO<p>GASTOS");
        btnRegSalidaDinero.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRegSalidaDinero.setFocusPainted(false);
        btnRegSalidaDinero.setPreferredSize(new java.awt.Dimension(150, 90));
        btnRegSalidaDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegSalidaDineroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegSalidaDineroMouseExited(evt);
            }
        });
        btnRegSalidaDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSalidaDineroActionPerformed(evt);
            }
        });
        pnlOPERA.add(btnRegSalidaDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 160, -1));

        btnReservas.setForeground(new java.awt.Color(4, 153, 193));
        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/Reservas.png"))); // NOI18N
        btnReservas.setText("<html><center> REGISTRAR<p>RESERVA");
        btnReservas.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnReservas.setFocusPainted(false);
        btnReservas.setPreferredSize(new java.awt.Dimension(150, 90));
        btnReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReservasMouseExited(evt);
            }
        });
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });
        pnlOPERA.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, -1));

        btnTours.setForeground(new java.awt.Color(4, 153, 193));
        btnTours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/Tour.png"))); // NOI18N
        btnTours.setText("<html><center> REGISTRAR<p>TOURS");
        btnTours.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnTours.setFocusPainted(false);
        btnTours.setPreferredSize(new java.awt.Dimension(150, 90));
        btnTours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnToursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnToursMouseExited(evt);
            }
        });
        btnTours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToursActionPerformed(evt);
            }
        });
        pnlOPERA.add(btnTours, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 160, -1));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(4, 153, 193));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("OPERACIONES");
        pnlOPERA.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 20, 162, 36));

        jSeparator9.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlOPERA.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 390, 10));

        lblImgOperac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgOperac.setPreferredSize(new java.awt.Dimension(55, 55));
        pnlOPERA.add(lblImgOperac, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        btnRegPagosPendientes.setForeground(new java.awt.Color(4, 153, 193));
        btnRegPagosPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/Pagos.Pend.jpeg"))); // NOI18N
        btnRegPagosPendientes.setText("<html><center> REG.PAGOS<p>PENDIENTES");
        btnRegPagosPendientes.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRegPagosPendientes.setFocusPainted(false);
        btnRegPagosPendientes.setPreferredSize(new java.awt.Dimension(150, 90));
        btnRegPagosPendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegPagosPendientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegPagosPendientesMouseExited(evt);
            }
        });
        btnRegPagosPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegPagosPendientesActionPerformed(evt);
            }
        });
        pnlOPERA.add(btnRegPagosPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        lblPagPend.setAlignment(java.awt.Label.CENTER);
        lblPagPend.setBackground(new java.awt.Color(255, 0, 0));
        lblPagPend.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPagPend.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPagPend.setForeground(new java.awt.Color(255, 255, 255));
        lblPagPend.setPreferredSize(new java.awt.Dimension(20, 20));
        pnlOPERA.add(lblPagPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        lblResvPend.setAlignment(java.awt.Label.CENTER);
        lblResvPend.setBackground(new java.awt.Color(255, 0, 0));
        lblResvPend.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblResvPend.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblResvPend.setForeground(new java.awt.Color(255, 255, 255));
        lblResvPend.setPreferredSize(new java.awt.Dimension(20, 20));
        pnlOPERA.add(lblResvPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        pnCONFIG.setBackground(new java.awt.Color(255, 255, 255));
        pnCONFIG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegEmpleados.setForeground(new java.awt.Color(4, 153, 193));
        btnRegEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/Regis.Empleados.png"))); // NOI18N
        btnRegEmpleados.setText("<html><center>REGISTRO <p>EMPLEADOS");
        btnRegEmpleados.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRegEmpleados.setFocusPainted(false);
        btnRegEmpleados.setPreferredSize(new java.awt.Dimension(150, 90));
        btnRegEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegEmpleadosMouseExited(evt);
            }
        });
        btnRegEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEmpleadosActionPerformed(evt);
            }
        });
        pnCONFIG.add(btnRegEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        btnDatosHotel.setForeground(new java.awt.Color(4, 153, 193));
        btnDatosHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/DatosHotel.png"))); // NOI18N
        btnDatosHotel.setText("<html><center>DATOS <p>HOTEL");
        btnDatosHotel.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnDatosHotel.setFocusPainted(false);
        btnDatosHotel.setPreferredSize(new java.awt.Dimension(150, 90));
        btnDatosHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDatosHotelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDatosHotelMouseExited(evt);
            }
        });
        btnDatosHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosHotelActionPerformed(evt);
            }
        });
        pnCONFIG.add(btnDatosHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        btnListNegra.setForeground(new java.awt.Color(4, 153, 193));
        btnListNegra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/ListaNegra.png"))); // NOI18N
        btnListNegra.setText("<html><center>LISTA<p>NEGRA");
        btnListNegra.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnListNegra.setFocusPainted(false);
        btnListNegra.setPreferredSize(new java.awt.Dimension(150, 90));
        btnListNegra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListNegraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListNegraMouseExited(evt);
            }
        });
        btnListNegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListNegraActionPerformed(evt);
            }
        });
        pnCONFIG.add(btnListNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(4, 153, 193));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CONFIGURACIONES");
        pnCONFIG.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 203, 36));

        jSeparator8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnCONFIG.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 352, 10));

        lblImgConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgConfig.setPreferredSize(new java.awt.Dimension(55, 55));
        pnCONFIG.add(lblImgConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        pnlREPORT.setBackground(new java.awt.Color(255, 255, 255));
        pnlREPORT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(4, 153, 193));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("REPORTES");
        pnlREPORT.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 20, 130, 36));

        jSeparator7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlREPORT.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 400, 10));

        lblImgReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgReport.setPreferredSize(new java.awt.Dimension(55, 55));
        pnlREPORT.add(lblImgReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        btnRepGastIng.setForeground(new java.awt.Color(4, 153, 193));
        btnRepGastIng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/Repor.Ing.Gas.png"))); // NOI18N
        btnRepGastIng.setText("<html><center>GASTOS<p> E INGRESOS");
        btnRepGastIng.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRepGastIng.setFocusPainted(false);
        btnRepGastIng.setPreferredSize(new java.awt.Dimension(150, 90));
        btnRepGastIng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepGastIngMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepGastIngMouseExited(evt);
            }
        });
        btnRepGastIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepGastIngActionPerformed(evt);
            }
        });
        pnlREPORT.add(btnRepGastIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        btnRepVisit.setForeground(new java.awt.Color(4, 153, 193));
        btnRepVisit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/Repor.Ing.Cliente.png"))); // NOI18N
        btnRepVisit.setText("<html><center>VISITANTES<p>E<p>INGRESOS<p>");
        btnRepVisit.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRepVisit.setFocusPainted(false);
        btnRepVisit.setPreferredSize(new java.awt.Dimension(150, 90));
        btnRepVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepVisitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepVisitMouseExited(evt);
            }
        });
        btnRepVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepVisitActionPerformed(evt);
            }
        });
        pnlREPORT.add(btnRepVisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        btnRepReserv.setForeground(new java.awt.Color(4, 153, 193));
        btnRepReserv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/Repor.Reservas.png"))); // NOI18N
        btnRepReserv.setText("<html><center>LAS<p>RESERVAS");
        btnRepReserv.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRepReserv.setFocusPainted(false);
        btnRepReserv.setPreferredSize(new java.awt.Dimension(150, 90));
        btnRepReserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepReservMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepReservMouseExited(evt);
            }
        });
        btnRepReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepReservActionPerformed(evt);
            }
        });
        pnlREPORT.add(btnRepReserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        btnRepTours.setForeground(new java.awt.Color(4, 153, 193));
        btnRepTours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/Repor.Tours.png"))); // NOI18N
        btnRepTours.setText("<html><center>LOS <p>TOURS");
        btnRepTours.setColorMaterial(new java.awt.Color(0, 153, 255));
        btnRepTours.setFocusPainted(false);
        btnRepTours.setPreferredSize(new java.awt.Dimension(150, 90));
        btnRepTours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepToursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepToursMouseExited(evt);
            }
        });
        btnRepTours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepToursActionPerformed(evt);
            }
        });
        pnlREPORT.add(btnRepTours, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOPERA, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnCONFIG, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlREPORT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnCONFIG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlREPORT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOPERA, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFondoPpal.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 123, 1350, -1));

        getContentPane().add(pnlFondoPpal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegNuevoHuespedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegNuevoHuespedMouseEntered
        btnRegNuevoHuesped.setBackground(new Color(0, 153, 255));
        btnRegNuevoHuesped.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRegNuevoHuespedMouseEntered

    private void btnRegNuevoHuespedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegNuevoHuespedMouseExited
        btnRegNuevoHuesped.setBackground(Color.WHITE);
        btnRegNuevoHuesped.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRegNuevoHuespedMouseExited

    private void btnRegNuevoHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegNuevoHuespedActionPerformed
        String nomReg = lblNomUser.getText();
        cliente_J modCli = new cliente_J();
        consCliente_J consCli = new consCliente_J();
        FrmAClientes_J frmCli = new FrmAClientes_J(JInternalFrame, rootPaneCheckingEnabled);
        ctrlCliente_J ctrCli = new ctrlCliente_J(modCli, consCli, frmCli);
        frmCli.txtRegistra.setText(nomReg);
        frmCli.setVisible(true);
    }//GEN-LAST:event_btnRegNuevoHuespedActionPerformed

    private void btnEstadoHabitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadoHabitMouseEntered
        btnEstadoHabit.setBackground(new Color(0, 153, 255));
        btnEstadoHabit.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEstadoHabitMouseEntered

    private void btnEstadoHabitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadoHabitMouseExited
        btnEstadoHabit.setBackground(Color.WHITE);
        btnEstadoHabit.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnEstadoHabitMouseExited

    private void btnEstadoHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoHabitActionPerformed
        consEstadoHabit_J consEstHab = new consEstadoHabit_J();
        FrmEstadoHabit_J frmEstHab = new FrmEstadoHabit_J();
        estadoHab modEstHab = new estadoHab();
        ctrlEstadoHabit_J ctrlEstHab = new ctrlEstadoHabit_J(consEstHab, frmEstHab,modEstHab);
        frmEstHab.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEstadoHabitActionPerformed

    private void btnRegIngresoDineroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegIngresoDineroMouseEntered
        btnRegIngresoDinero.setBackground(new Color(0, 153, 255));
        btnRegIngresoDinero.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRegIngresoDineroMouseEntered

    private void btnRegIngresoDineroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegIngresoDineroMouseExited
        btnRegIngresoDinero.setBackground(Color.WHITE);
        btnRegIngresoDinero.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRegIngresoDineroMouseExited

    private void btnRegIngresoDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegIngresoDineroActionPerformed
        ingresos_M ing = new ingresos_M();
        consIngresos_M conIng = new consIngresos_M();
        FrmIngresos_M frmIng = new FrmIngresos_M();
        ctrlIngresos_M ctrlIng = new ctrlIngresos_M(ing, conIng, frmIng);
        frmIng.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegIngresoDineroActionPerformed

    private void btnRegSalidaDineroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegSalidaDineroMouseEntered
        btnRegSalidaDinero.setBackground(new Color(0, 153, 255));
        btnRegSalidaDinero.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRegSalidaDineroMouseEntered

    private void btnRegSalidaDineroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegSalidaDineroMouseExited
        btnRegSalidaDinero.setBackground(Color.WHITE);
        btnRegSalidaDinero.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRegSalidaDineroMouseExited

    private void btnReservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseEntered
        btnReservas.setBackground(new Color(0, 153, 255));
        btnReservas.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnReservasMouseEntered

    private void btnReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseExited
        btnReservas.setBackground(Color.WHITE);
        btnReservas.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnReservasMouseExited

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        reservas_J modRes = new reservas_J();
        consReservas_J consRes = new consReservas_J();
        FrmReservas_J frmRes = new FrmReservas_J();
        ctrlReservas_J ctrlRes = new ctrlReservas_J(modRes, consRes, frmRes);
        frmRes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnToursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToursMouseEntered
        btnTours.setBackground(new Color(0, 153, 255));
        btnTours.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnToursMouseEntered

    private void btnToursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToursMouseExited
        btnTours.setBackground(Color.WHITE);
        btnTours.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnToursMouseExited

    private void btnRegEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegEmpleadosMouseEntered
        btnRegEmpleados.setBackground(new Color(0, 153, 255));
        btnRegEmpleados.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRegEmpleadosMouseEntered

    private void btnRegEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegEmpleadosMouseExited
        btnRegEmpleados.setBackground(Color.WHITE);
        btnRegEmpleados.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRegEmpleadosMouseExited

    private void btnDatosHotelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatosHotelMouseEntered
        btnDatosHotel.setBackground(new Color(0, 153, 255));
        btnDatosHotel.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnDatosHotelMouseEntered

    private void btnDatosHotelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatosHotelMouseExited
        btnDatosHotel.setBackground(Color.WHITE);
        btnDatosHotel.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnDatosHotelMouseExited

    private void btnDatosHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosHotelActionPerformed
        hotel_J modHot = new hotel_J();
        consHotel_J modCons = new consHotel_J();
        FrmDatosHotel_J frmHot = new FrmDatosHotel_J();
        ctrlHotel_J ctrlHot = new ctrlHotel_J(modHot, modCons, frmHot);
        frmHot.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatosHotelActionPerformed

    private void btnListNegraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListNegraMouseEntered
        btnListNegra.setBackground(new Color(0, 153, 255));
        btnListNegra.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnListNegraMouseEntered

    private void btnListNegraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListNegraMouseExited
        btnListNegra.setBackground(Color.WHITE);
        btnListNegra.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnListNegraMouseExited

    private void btnRepGastIngMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepGastIngMouseEntered
        btnRepGastIng.setBackground(new Color(0, 153, 255));
        btnRepGastIng.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRepGastIngMouseEntered

    private void btnRepGastIngMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepGastIngMouseExited
        btnRepGastIng.setBackground(Color.WHITE);
        btnRepGastIng.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRepGastIngMouseExited

    private void btnRepVisitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepVisitMouseEntered
        btnRepVisit.setBackground(new Color(0, 153, 255));
        btnRepVisit.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRepVisitMouseEntered

    private void btnRepVisitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepVisitMouseExited
        btnRepVisit.setBackground(Color.WHITE);
        btnRepVisit.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRepVisitMouseExited

    private void btnRepReservMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepReservMouseEntered
        btnRepReserv.setBackground(new Color(0, 153, 255));
        btnRepReserv.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRepReservMouseEntered

    private void btnRepReservMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepReservMouseExited
        btnRepReserv.setBackground(Color.WHITE);
        btnRepReserv.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRepReservMouseExited

    private void btnRepToursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepToursMouseEntered
        btnRepTours.setBackground(new Color(0, 153, 255));
        btnRepTours.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRepToursMouseEntered

    private void btnRepToursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepToursMouseExited
        btnRepTours.setBackground(Color.WHITE);
        btnRepTours.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRepToursMouseExited

    private void btnRegPagosPendientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegPagosPendientesMouseEntered
        btnRegPagosPendientes.setBackground(new Color(0, 153, 255));
        btnRegPagosPendientes.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRegPagosPendientesMouseEntered

    private void btnRegPagosPendientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegPagosPendientesMouseExited
        btnRegPagosPendientes.setBackground(Color.WHITE);
        btnRegPagosPendientes.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_btnRegPagosPendientesMouseExited

    private void btnRegPagosPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegPagosPendientesActionPerformed
        pagosPend_J modPagPen = new pagosPend_J();
        consPagPend_J consPagPen = new consPagPend_J();
        FrmPagosPend_J frmPagPen = new FrmPagosPend_J();
        ctrlPagosPend_J ctrlPagPend = new ctrlPagosPend_J(modPagPen, consPagPen, frmPagPen);
        frmPagPen.cbxPago.setSelectedItem("Seleccione");
        ctrlPagPend.limpiar();
        frmPagPen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegPagosPendientesActionPerformed

    private void btnCerrSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrSesionMouseEntered
        btnCerrSesion.setBackground(new Color(255, 255, 255));
        btnCerrSesion.setForeground(new Color(51, 102, 255));
    }//GEN-LAST:event_btnCerrSesionMouseEntered

    private void btnCerrSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrSesionMouseExited
        btnCerrSesion.setBackground(new Color(0, 153, 255));
        btnCerrSesion.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCerrSesionMouseExited

    private void btnCerrSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrSesionMouseClicked
        Login_M log = new Login_M();
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCerrSesionMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        Fondo fdo = new Fondo();
        fdo.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setForeground(Color.RED);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.RED);
        btnSalir.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnToursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToursActionPerformed
        String nomRe = lblNomUser.getText();
        tours_J modTrs = new tours_J();
        consTours_J consTrs = new consTours_J();
        FrmATours_J frmTrs = new FrmATours_J(JInternalFrame, rootPaneCheckingEnabled);
        ctrlTours_J ctrlTours = new ctrlTours_J(modTrs, consTrs, frmTrs);
        frmTrs.setVisible(true);
        frmTrs.txtRegistra.setText(nomRe);


    }//GEN-LAST:event_btnToursActionPerformed

    private void btnRegSalidaDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSalidaDineroActionPerformed
        gastos_M gas = new gastos_M();
        consGastos_M congas = new consGastos_M();
        FrmGastos_M frmgas = new FrmGastos_M();
        ctrlGastos_M ctrlGas = new ctrlGastos_M(gas, congas, frmgas);
        frmgas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegSalidaDineroActionPerformed

    private void btnRegEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEmpleadosActionPerformed
        mensajeAL = "<html><center>ESTA OPCION ESTA EN DESARROLLO,<p> DISCULPE POR LAS MOLESTIAS";
        new AlertaEnProd(JInternalFrame, true).setVisible(true);
    }//GEN-LAST:event_btnRegEmpleadosActionPerformed

    private void btnListNegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListNegraActionPerformed
        mensajeAL = "<html><center>ESTA OPCION ESTA EN DESARROLLO,<p> DISCULPE POR LAS MOLESTIAS";
        new AlertaEnProd(JInternalFrame, true).setVisible(true);
    }//GEN-LAST:event_btnListNegraActionPerformed

    private void btnRepReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepReservActionPerformed
        mensajeAL = "<html><center>ESTA OPCION ESTA EN DESARROLLO,<p> DISCULPE POR LAS MOLESTIAS";
        new AlertaEnProd(JInternalFrame, true).setVisible(true);
    }//GEN-LAST:event_btnRepReservActionPerformed

    private void btnRepGastIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepGastIngActionPerformed
        mensajeAL = "<html><center>ESTA OPCION ESTA EN DESARROLLO,<p> DISCULPE POR LAS MOLESTIAS";
        new AlertaEnProd(JInternalFrame, true).setVisible(true);
    }//GEN-LAST:event_btnRepGastIngActionPerformed

    private void btnRepToursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepToursActionPerformed
        mensajeAL = "<html><center>ESTA OPCION ESTA EN DESARROLLO,<p> DISCULPE POR LAS MOLESTIAS";
        new AlertaEnProd(JInternalFrame, true).setVisible(true);
    }//GEN-LAST:event_btnRepToursActionPerformed

    private void btnRepVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepVisitActionPerformed
//        mensajeAL = "<html><center>ESTA OPCION ESTA EN DESARROLLO,<p> DISCULPE POR LAS MOLESTIAS";
//        new AlertaEnProd(JInternalFrame, true).setVisible(true);
    FrmRepChekin repchk = new FrmRepChekin();
    repchk.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnRepVisitActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin_J.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin_J.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin_J.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin_J.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuAdmin_J().setVisible(true);
            }
        });
    }

//******************************************************************** MÉTODOS ****************************************************************
//*********************************************************************************************************************************************
//****************************************************** FECHA DEL SISTEMA (dia-mes-año) ******************************************************
    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd / MMMM / YYYY");

        return formatoFecha.format(fecha);

    }

//******************************************** VALIDAR SI HA PAGOS PENDIENTES ****************************************************************
    private void pagPen() {
        int n = consPag.pagosPend();
        if (n >= 1) {
            lblPagPend.setVisible(true);
            lblPagPend.setText(String.valueOf(n));
        } else {
            lblPagPend.setVisible(false);

        }
    }

//******************************************** VER INFORMACION *******************************************************************************
    private void resvPend() {
        int n = consResv.numReservasPend();
        if (n >= 1) {
            lblResvPend.setVisible(true);
            lblResvPend.setText(String.valueOf(n));
        } else {
            lblResvPend.setVisible(false);

        }
    }

//******************************************** MOSTRAR DATOS DEL HOTEL ****************************************************************
    public void mostrarDatosHot() {
        hotel_J ht = new hotel_J();
        consHotel_J cons = new consHotel_J();
        cons.nombreHot(ht);
        lblNomHotel.setText("HOTEL  " + ht.getNombre());
        lblLocalizacion.setText(ht.getMunicipio());
        lblFecha.setText(consHotel_J.fechaActual().toUpperCase());
        lblNomUser.setText(nom);
        //hasta aca son datos del hotel
        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");
        RSScaleLabel.setScaleLabel(lblImgConfig, "src/imgMenu/Configuraciones.png");
        RSScaleLabel.setScaleLabel(lblImgOperac, "src/imgMenu/Operaciones.png");
        RSScaleLabel.setScaleLabel(lblImgReport, "src/imgMenu/Reportes.png");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label btnCerrSesion;
    public rsbuttoncustom.RSButtonCustom btnDatosHotel;
    public rsbuttoncustom.RSButtonCustom btnEstadoHabit;
    public rsbuttoncustom.RSButtonCustom btnListNegra;
    public rsbuttoncustom.RSButtonCustom btnRegEmpleados;
    public rsbuttoncustom.RSButtonCustom btnRegIngresoDinero;
    public rsbuttoncustom.RSButtonCustom btnRegNuevoHuesped;
    public rsbuttoncustom.RSButtonCustom btnRegPagosPendientes;
    public rsbuttoncustom.RSButtonCustom btnRegSalidaDinero;
    private rsbuttoncustom.RSButtonCustom btnRepGastIng;
    public rsbuttoncustom.RSButtonCustom btnRepReserv;
    public rsbuttoncustom.RSButtonCustom btnRepTours;
    private rsbuttoncustom.RSButtonCustom btnRepVisit;
    public rsbuttoncustom.RSButtonCustom btnReservas;
    private java.awt.Label btnSalir;
    public rsbuttoncustom.RSButtonCustom btnTours;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCara;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHola;
    private javax.swing.JLabel lblImgConfig;
    private javax.swing.JLabel lblImgOperac;
    private javax.swing.JLabel lblImgReport;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomUser;
    public java.awt.Label lblPagPend;
    public java.awt.Label lblResvPend;
    public javax.swing.JLabel lblSotMax;
    public javax.swing.JLabel lblsaludo4;
    public javax.swing.JLabel lblsaludo5;
    private javax.swing.JPanel pnCONFIG;
    private javax.swing.JPanel pnlDatos1;
    private javax.swing.JPanel pnlFondoPpal;
    public static javax.swing.JPanel pnlMenu;
    public javax.swing.JPanel pnlOPERA;
    private javax.swing.JPanel pnlREPORT;
    // End of variables declaration//GEN-END:variables

}
