package vistas;

import alertas.AlertaModificar;
import clases.*;
import clases.propiedadesCBX;
import consultas.consHotel_J;
import consultas.consCliente_J;
import consultas.consReservas_J;
import java.awt.Color;
import java.util.Date;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.awt.event.KeyEvent;
import java.util.logging.Logger;
import java.text.ParseException;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import modelo.cliente_J;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;
import static consultas.consUsuario_M.nom;
import static alertas.AlertaModificar.resModif;
import alertas.Inf;
import consultas.consEstadoHabit_J;
import static controlador.ctrlHotel_J.mensajeER;
import controlador.ctrlReservas_J;
import javax.swing.JOptionPane;
import modelo.reservas_J;

// @author Software_Max(JDV)
public final class FrmReservas_J extends javax.swing.JFrame {

    int filas;
    String mensaje;
    String mensaje1;
    public static String mensajeALMODF;
    public static String mensajeINF;
    public static String selectTipPag;
    Frame JInternalFrame = null;
    consReservas_J consResv = new consReservas_J();
    cliente_J cli = new cliente_J();
    consCliente_J consCli = new consCliente_J();
    consultas_generales consGen = new consultas_generales();
    consEstadoHabit_J consEstHab = new consEstadoHabit_J();
    SimpleDateFormat formatFecha = new SimpleDateFormat("yyyy-MM-dd");

    public FrmReservas_J() {
        initComponents();
        consGen.llenarHabitDisponResv(cbxHabitDisponible);
        mostrarDatosHot();
        cbxPers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupPagoes = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
        pnlDatosRes = new javax.swing.JPanel();
        lblCara = new javax.swing.JLabel();
        btnSalirPagPend = new javax.swing.JLabel();
        pnlSoftMax = new javax.swing.JPanel();
        lblDesarrr = new javax.swing.JLabel();
        lblSotMax = new javax.swing.JLabel();
        lblSoftMax = new javax.swing.JLabel();
        lblNomHotel = new javax.swing.JLabel();
        lblLocalizacion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHola = new javax.swing.JLabel();
        lblNomUser = new javax.swing.JLabel();
        lblFecAct = new javax.swing.JLabel();
        pnlFondoReservas = new javax.swing.JPanel();
        pnlRegisReserv = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreResp = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoResp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtValorPagar = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        cbxresPor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxNumAcomp = new javax.swing.JComboBox<>();
        cbxHabitDisponible = new javax.swing.JComboBox<>();
        cbxFormaPago = new javax.swing.JComboBox<>();
        cbxResvPendiente = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDocResp = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblResvPend = new javax.swing.JLabel();
        btnLimpiarResv1 = new java.awt.Label();
        btnGuardarReserv = new java.awt.Label();
        btnEliminarResv = new java.awt.Label();
        dcFecLlega = new com.toedter.calendar.JDateChooser();
        dcFecSale = new com.toedter.calendar.JDateChooser();
        btnRegResp = new java.awt.Label();
        lblValidRESP = new javax.swing.JLabel();
        lblImgOkNoRESP = new javax.swing.JLabel();
        btnChequear = new java.awt.Label();
        txtHabitacion = new javax.swing.JTextField();
        lblValidDisponibles = new javax.swing.JLabel();
        lblImgOkNoDisponibles = new javax.swing.JLabel();
        lblResta = new javax.swing.JLabel();
        txtValorResta = new javax.swing.JTextField();
        lblPesosREST = new javax.swing.JLabel();
        sepResta = new javax.swing.JSeparator();
        lblAbona = new javax.swing.JLabel();
        lblPesosABN = new javax.swing.JLabel();
        txtValorAbono = new javax.swing.JTextField();
        sepAbono = new javax.swing.JSeparator();
        lblFRg = new javax.swing.JLabel();
        lblRegUser = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        pnlTablaDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservPend = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setExtendedState(6);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));

        pnlDatosRes.setBackground(new java.awt.Color(4, 153, 193));
        pnlDatosRes.setPreferredSize(new java.awt.Dimension(1350, 117));
        pnlDatosRes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCara.setPreferredSize(new java.awt.Dimension(80, 80));
        pnlDatosRes.add(lblCara, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 79));

        btnSalirPagPend.setPreferredSize(new java.awt.Dimension(30, 30));
        btnSalirPagPend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirPagPendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirPagPendMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirPagPendMouseClicked(evt);
            }
        });
        pnlDatosRes.add(btnSalirPagPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        pnlSoftMax.setBackground(new java.awt.Color(4, 153, 193));

        lblDesarrr.setFont(new java.awt.Font("sansserif", 1, 8)); // NOI18N
        lblDesarrr.setForeground(new java.awt.Color(255, 255, 255));
        lblDesarrr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesarrr.setText("DESARROLLADO POR");

        lblSotMax.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSotMax.setForeground(new java.awt.Color(255, 255, 255));
        lblSotMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSotMax.setPreferredSize(new java.awt.Dimension(40, 50));

        lblSoftMax.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        lblSoftMax.setForeground(new java.awt.Color(255, 255, 255));
        lblSoftMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoftMax.setText("SOFTWARE MAX");

        javax.swing.GroupLayout pnlSoftMaxLayout = new javax.swing.GroupLayout(pnlSoftMax);
        pnlSoftMax.setLayout(pnlSoftMaxLayout);
        pnlSoftMaxLayout.setHorizontalGroup(
            pnlSoftMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSoftMaxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSoftMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSoftMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSotMax, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesarrr))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSoftMaxLayout.setVerticalGroup(
            pnlSoftMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSoftMaxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesarrr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSotMax, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSoftMax)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatosRes.add(pnlSoftMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 100, -1));

        lblNomHotel.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lblNomHotel.setForeground(new java.awt.Color(255, 255, 255));
        lblNomHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomHotel.setText("NOMBRE HOTEL");
        pnlDatosRes.add(lblNomHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 540, -1));

        lblLocalizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocalizacion.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocalizacion.setText("LOCALIZADO EN");
        pnlDatosRes.add(lblLocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 540, -1));

        lblFecha.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha.setText("FECHA COMPLETA");
        pnlDatosRes.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 270, -1));

        lblHola.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblHola.setForeground(new java.awt.Color(255, 255, 255));
        lblHola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHola.setText("HOLA ");
        pnlDatosRes.add(lblHola, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, -1));

        lblNomUser.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblNomUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNomUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomUser.setText("NU");
        pnlDatosRes.add(lblNomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 160, -1));

        lblFecAct.setText("jLabel1");
        pnlDatosRes.add(lblFecAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        pnlFondoReservas.setBackground(new java.awt.Color(4, 153, 193));
        pnlFondoReservas.setPreferredSize(new java.awt.Dimension(1324, 632));

        pnlRegisReserv.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegisReserv.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "REGISTRO DE RESERVAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        pnlRegisReserv.setForeground(new java.awt.Color(255, 255, 255));
        pnlRegisReserv.setPreferredSize(new java.awt.Dimension(1290, 317));
        pnlRegisReserv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlRegisReserv.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 40, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 153, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE:");
        pnlRegisReserv.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 150, -1));

        txtNombreResp.setEditable(false);
        txtNombreResp.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreResp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNombreResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreResp.setBorder(null);
        txtNombreResp.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNombreResp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreRespKeyTyped(evt);
            }
        });
        pnlRegisReserv.add(txtNombreResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegisReserv.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 150, 10));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 153, 193));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("APELLIDO:");
        pnlRegisReserv.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 150, -1));

        txtApellidoResp.setEditable(false);
        txtApellidoResp.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoResp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtApellidoResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoResp.setBorder(null);
        txtApellidoResp.setPreferredSize(new java.awt.Dimension(150, 30));
        txtApellidoResp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoRespKeyTyped(evt);
            }
        });
        pnlRegisReserv.add(txtApellidoResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegisReserv.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 150, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 153, 193));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FECHA SALIDA:");
        pnlRegisReserv.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, 150, -1));

        txtValorPagar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtValorPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorPagar.setText("0");
        txtValorPagar.setBorder(null);
        txtValorPagar.setPreferredSize(new java.awt.Dimension(150, 30));
        txtValorPagar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorPagarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorPagarFocusLost(evt);
            }
        });
        pnlRegisReserv.add(txtValorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 120, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegisReserv.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 150, 10));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(4, 153, 193));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("FORMA DE PAGO:");
        pnlRegisReserv.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 140, -1));

        cbxresPor.setBackground(new java.awt.Color(4, 153, 193));
        cbxresPor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxresPor.setForeground(new java.awt.Color(255, 255, 255));
        cbxresPor.setMaximumRowCount(5);
        cbxresPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "WhatsApp", "Instagram", "Llamada", "Paginas web", "Personal" }));
        cbxresPor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxresPor.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegisReserv.add(cbxresPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 153, 193));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("N° ACOMPAÑANTES:");
        pnlRegisReserv.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 150, -1));

        cbxNumAcomp.setBackground(new java.awt.Color(4, 153, 193));
        cbxNumAcomp.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxNumAcomp.setForeground(new java.awt.Color(255, 255, 255));
        cbxNumAcomp.setMaximumRowCount(5);
        cbxNumAcomp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "0", "1", "2", "3", "4" }));
        cbxNumAcomp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxNumAcomp.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegisReserv.add(cbxNumAcomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        cbxHabitDisponible.setBackground(new java.awt.Color(4, 153, 193));
        cbxHabitDisponible.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxHabitDisponible.setForeground(new java.awt.Color(255, 255, 255));
        cbxHabitDisponible.setMaximumRowCount(5);
        cbxHabitDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxHabitDisponible.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxHabitDisponible.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegisReserv.add(cbxHabitDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        cbxFormaPago.setBackground(new java.awt.Color(4, 153, 193));
        cbxFormaPago.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxFormaPago.setForeground(new java.awt.Color(255, 255, 255));
        cbxFormaPago.setMaximumRowCount(5);
        cbxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Efectivo", "Tranferencia", "Consignacion" }));
        cbxFormaPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxFormaPago.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegisReserv.add(cbxFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        cbxResvPendiente.setBackground(new java.awt.Color(4, 153, 193));
        cbxResvPendiente.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxResvPendiente.setForeground(new java.awt.Color(255, 255, 255));
        cbxResvPendiente.setMaximumRowCount(5);
        cbxResvPendiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "NO" }));
        cbxResvPendiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxResvPendiente.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegisReserv.add(cbxResvPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(4, 153, 193));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("RESERVADO POR:");
        pnlRegisReserv.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 150, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(4, 153, 193));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CONTACTO:");
        pnlRegisReserv.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 150, -1));

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(null);
        txtTelefono.setPreferredSize(new java.awt.Dimension(150, 30));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        pnlRegisReserv.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegisReserv.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 150, 10));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(4, 153, 193));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("HABITACION:");
        pnlRegisReserv.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 153, 193));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VALOR TOTAL :");
        pnlRegisReserv.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 150, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 153, 193));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA LLEGADA:");
        pnlRegisReserv.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 150, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 153, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("$");
        pnlRegisReserv.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 30, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(4, 153, 193));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("N° - DOC.RESP:");
        pnlRegisReserv.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, -1));

        txtDocResp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtDocResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocResp.setBorder(null);
        txtDocResp.setPreferredSize(new java.awt.Dimension(150, 30));
        txtDocResp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDocRespKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocRespKeyTyped(evt);
            }
        });
        pnlRegisReserv.add(txtDocResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegisReserv.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 10));

        lblResvPend.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblResvPend.setForeground(new java.awt.Color(4, 153, 193));
        lblResvPend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResvPend.setText("RESERVA PENDIENTE:");
        pnlRegisReserv.add(lblResvPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 140, 150, 20));

        btnLimpiarResv1.setAlignment(java.awt.Label.CENTER);
        btnLimpiarResv1.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarResv1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarResv1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarResv1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarResv1.setPreferredSize(new java.awt.Dimension(130, 30));
        btnLimpiarResv1.setText("LIMPIAR");
        btnLimpiarResv1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarResv1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarResv1MouseExited(evt);
            }
        });
        pnlRegisReserv.add(btnLimpiarResv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        btnGuardarReserv.setAlignment(java.awt.Label.CENTER);
        btnGuardarReserv.setBackground(new java.awt.Color(4, 153, 193));
        btnGuardarReserv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarReserv.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGuardarReserv.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarReserv.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGuardarReserv.setText("GUARDAR");
        btnGuardarReserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarReservMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarReservMouseExited(evt);
            }
        });
        pnlRegisReserv.add(btnGuardarReserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, -1, -1));

        btnEliminarResv.setAlignment(java.awt.Label.CENTER);
        btnEliminarResv.setBackground(new java.awt.Color(4, 153, 193));
        btnEliminarResv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarResv.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEliminarResv.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarResv.setPreferredSize(new java.awt.Dimension(130, 30));
        btnEliminarResv.setText("ELIMINAR");
        btnEliminarResv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarResvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarResvMouseExited(evt);
            }
        });
        pnlRegisReserv.add(btnEliminarResv, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        dcFecLlega.setDateFormatString("yyyy-MM-dd");
        dcFecLlega.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegisReserv.add(dcFecLlega, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, -1, -1));

        dcFecSale.setDateFormatString("yyyy-MM-dd");
        dcFecSale.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegisReserv.add(dcFecSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, -1, -1));

        btnRegResp.setAlignment(java.awt.Label.CENTER);
        btnRegResp.setBackground(new java.awt.Color(4, 153, 193));
        btnRegResp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegResp.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegResp.setForeground(new java.awt.Color(255, 255, 255));
        btnRegResp.setPreferredSize(new java.awt.Dimension(30, 20));
        btnRegResp.setText("REG.");
        pnlRegisReserv.add(btnRegResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblValidRESP.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidRESP.setForeground(new java.awt.Color(0, 51, 255));
        lblValidRESP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegisReserv.add(lblValidRESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 60, 30));

        lblImgOkNoRESP.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlRegisReserv.add(lblImgOkNoRESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        btnChequear.setAlignment(java.awt.Label.CENTER);
        btnChequear.setBackground(new java.awt.Color(4, 153, 193));
        btnChequear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnChequear.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnChequear.setForeground(new java.awt.Color(255, 255, 255));
        btnChequear.setPreferredSize(new java.awt.Dimension(130, 30));
        btnChequear.setText("CHECK-IN");
        btnChequear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChequearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChequearMouseExited(evt);
            }
        });
        pnlRegisReserv.add(btnChequear, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, -1, -1));

        txtHabitacion.setEditable(false);
        txtHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHabitacionMouseClicked(evt);
            }
        });
        pnlRegisReserv.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 30));

        lblValidDisponibles.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidDisponibles.setForeground(new java.awt.Color(255, 0, 0));
        lblValidDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegisReserv.add(lblValidDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 30));

        lblImgOkNoDisponibles.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlRegisReserv.add(lblImgOkNoDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        lblResta.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblResta.setForeground(new java.awt.Color(4, 153, 193));
        lblResta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResta.setText("RESTA :");
        pnlRegisReserv.add(lblResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 70, -1));

        txtValorResta.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtValorResta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorResta.setText("0");
        txtValorResta.setBorder(null);
        txtValorResta.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegisReserv.add(txtValorResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 120, 30));

        lblPesosREST.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblPesosREST.setForeground(new java.awt.Color(4, 153, 193));
        lblPesosREST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesosREST.setText("$");
        pnlRegisReserv.add(lblPesosREST, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 30, 30));

        sepResta.setForeground(new java.awt.Color(255, 255, 255));
        sepResta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegisReserv.add(sepResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 150, 10));

        lblAbona.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblAbona.setForeground(new java.awt.Color(4, 153, 193));
        lblAbona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbona.setText("ABONÓ :");
        pnlRegisReserv.add(lblAbona, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 70, -1));

        lblPesosABN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblPesosABN.setForeground(new java.awt.Color(4, 153, 193));
        lblPesosABN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesosABN.setText("$");
        pnlRegisReserv.add(lblPesosABN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 30, 30));

        txtValorAbono.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtValorAbono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorAbono.setText("0");
        txtValorAbono.setBorder(null);
        txtValorAbono.setPreferredSize(new java.awt.Dimension(150, 30));
        txtValorAbono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorAbonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorAbonoFocusLost(evt);
            }
        });
        txtValorAbono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorAbonoKeyReleased(evt);
            }
        });
        pnlRegisReserv.add(txtValorAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 120, -1));

        sepAbono.setForeground(new java.awt.Color(255, 255, 255));
        sepAbono.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegisReserv.add(sepAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 150, 10));

        lblFRg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblFRg.setForeground(new java.awt.Color(0, 153, 255));
        lblFRg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFRg.setText("lblFRg");
        pnlRegisReserv.add(lblFRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, -1));

        lblRegUser.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblRegUser.setForeground(new java.awt.Color(0, 153, 255));
        lblRegUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegUser.setText("lblRegUser");
        pnlRegisReserv.add(lblRegUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, -1));

        lblTipo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 153, 255));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("lblTipo");
        pnlRegisReserv.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 70, -1));

        pnlTablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "LISTADO DE RESERVAS PENDIENTES\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        pnlTablaDatos.setPreferredSize(new java.awt.Dimension(1290, 290));
        pnlTablaDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReservPend.setBackground(new java.awt.Color(4, 153, 193));
        tblReservPend.setForeground(new java.awt.Color(255, 255, 255));
        tblReservPend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblReservPend.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblReservPend.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblReservPend.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblReservPend.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblReservPend.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblReservPend.setFuenteFilas(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblReservPend.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblReservPend.setFuenteHead(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tblReservPend.setMultipleSeleccion(false);
        tblReservPend.setPreferredSize(new java.awt.Dimension(600, 300));
        tblReservPend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservPendMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservPend);

        pnlTablaDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1310, 200));

        javax.swing.GroupLayout pnlFondoReservasLayout = new javax.swing.GroupLayout(pnlFondoReservas);
        pnlFondoReservas.setLayout(pnlFondoReservasLayout);
        pnlFondoReservasLayout.setHorizontalGroup(
            pnlFondoReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRegisReserv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTablaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFondoReservasLayout.setVerticalGroup(
            pnlFondoReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegisReserv, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatosRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondoReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 1338, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlDatosRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFondoReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirPagPendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirPagPendMouseClicked
        FrmMenuAdmin_J frmAdm = new FrmMenuAdmin_J();
        frmAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirPagPendMouseClicked

    private void btnSalirPagPendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirPagPendMouseEntered
        RSScaleLabel.setScaleLabel(btnSalirPagPend, "src/img/cerrar.png");
    }//GEN-LAST:event_btnSalirPagPendMouseEntered

    private void btnSalirPagPendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirPagPendMouseExited
        RSScaleLabel.setScaleLabel(btnSalirPagPend, "src/img/x.png");
    }//GEN-LAST:event_btnSalirPagPendMouseExited

    private void btnGuardarReservMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarReservMouseExited
        btnGuardarReserv.setBackground(new Color(4, 153, 193));
        btnGuardarReserv.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarReservMouseExited

    private void btnGuardarReservMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarReservMouseEntered
        btnGuardarReserv.setBackground(new Color(0, 204, 204));
        btnGuardarReserv.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarReservMouseEntered

    private void btnLimpiarResv1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarResv1MouseExited
        btnLimpiarResv1.setBackground(new Color(4, 153, 193));
        btnLimpiarResv1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarResv1MouseExited

    private void btnLimpiarResv1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarResv1MouseEntered
        btnLimpiarResv1.setBackground(new Color(0, 204, 204));
        btnLimpiarResv1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarResv1MouseEntered

    private void btnEliminarResvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarResvMouseEntered
        btnEliminarResv.setBackground(new Color(0, 204, 204));
        btnEliminarResv.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarResvMouseEntered

    private void btnEliminarResvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarResvMouseExited
        btnEliminarResv.setBackground(new Color(4, 153, 193));
        btnEliminarResv.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarResvMouseExited

    private void tblReservPendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservPendMouseClicked
        cbxHabitDisponible.setVisible(false);
        txtHabitacion.setVisible(true);
        int seleccion = tblReservPend.getSelectedRow();
        txtID.setText(tblReservPend.getValueAt(seleccion, 0).toString());
        txtDocResp.setText(tblReservPend.getValueAt(seleccion, 1).toString());
        txtNombreResp.setText(tblReservPend.getValueAt(seleccion, 2).toString());
        txtApellidoResp.setText(tblReservPend.getValueAt(seleccion, 3).toString());
        txtTelefono.setText(tblReservPend.getValueAt(seleccion, 4).toString());
        txtHabitacion.setText(tblReservPend.getValueAt(seleccion, 5).toString());
        String fecha1 = tblReservPend.getValueAt(seleccion, 6).toString();
        Date f1 = setearFechas(fecha1);
        dcFecLlega.setDate(f1);
        String fecha2 = tblReservPend.getValueAt(seleccion, 7).toString();
        Date f2 = setearFechas(fecha2);
        dcFecSale.setDate(f2);
        cbxNumAcomp.setSelectedItem(tblReservPend.getValueAt(seleccion, 8).toString());
        cbxFormaPago.setSelectedItem(tblReservPend.getValueAt(seleccion, 9).toString());
        lblTipo.setText(tblReservPend.getValueAt(seleccion, 10).toString());
        cbxresPor.setSelectedItem(tblReservPend.getValueAt(seleccion, 11).toString());
        txtValorPagar.setText(tblReservPend.getValueAt(seleccion, 12).toString());
        cbxResvPendiente.setSelectedItem(tblReservPend.getValueAt(seleccion, 13).toString());
        lblRegUser.setText(tblReservPend.getValueAt(seleccion, 14).toString());
        lblFRg.setText(tblReservPend.getValueAt(seleccion, 15).toString());
        txtValorAbono.setText(tblReservPend.getValueAt(seleccion, 16).toString());
        txtValorResta.setText(tblReservPend.getValueAt(seleccion, 17).toString());

        filas = seleccion;

    mensajeALMODF = "<html><center>Para checar la reserva de click en 'OK',<p> pero si desea modificarla debe eliminarla y crear otra";
        new AlertaModificar(JInternalFrame, true).setVisible(true);

        if (resModif.equals("elim")) {

            txtHabitacion.setVisible(true);
            actvBtnElimAct();

        } else if (resModif.equals("ok")) {
            
            String numPu = txtHabitacion.getText();
            String fAc = lblFecAct.getText();
            
            int dfr = consResv.mostrarDiasParaReserva("RESERVA", numPu, fAc);

            if (dfr == 0) {

                cbxHabitDisponible.setVisible(false);
                txtHabitacion.setVisible(true);
                txtHabitacion.setEditable(false);
                cbxResvPendiente.setVisible(true);
                cbxResvPendiente.setSelectedItem("NO");
                lblResvPend.setVisible(true);
                actvBtnCheckIn();

            } else if (dfr > 0) {

                mensajeINF = "<html><center>No podemos registrar el chekin porque aún faltan <b>" + dfr + " dias para la reserva";
                new Inf(JInternalFrame, true).setVisible(true);
                limpiar();
            }

        }

    }//GEN-LAST:event_tblReservPendMouseClicked

    private void txtNombreRespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreRespKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo acepta letras.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            evt.consume();

        } else if (txtNombreResp.getText().length() >= 25) {

            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            txtNombreResp.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreRespKeyTyped

    private void txtApellidoRespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoRespKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo acepta letras.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            evt.consume();

        } else if (txtApellidoResp.getText().length() >= 25) {

            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            txtApellidoResp.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoRespKeyTyped

    private void txtDocRespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocRespKeyTyped
        if (txtDocResp.getText().length() >= 20) {

            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            txtDocResp.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtDocRespKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo acepta números.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            evt.consume();

        } else if (txtTelefono.getText().length() >= 11) {
            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido.";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            txtTelefono.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDocRespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocRespKeyReleased
        String res = BuscarIdentif(txtDocResp.getText());

        if (txtDocResp.getText().equals("")) {

            lblValidRESP.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "");
            btnRegResp.setVisible(false);

        } else if (res.equals("si")) {

            lblValidRESP.setText("<html><center>Cliente <p> registrado");
            lblValidRESP.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "src/img/ok.png");
            btnRegResp.setVisible(false);

            txtNombreResp.setText(cli.getNombre());
            txtApellidoResp.setText(cli.getApellido());
            txtTelefono.setText(cli.getContacto());

        } else {

            lblValidRESP.setText("<html><center>Cliente sin <p>registrar");
            RSScaleLabel.setScaleLabel(lblImgOkNoRESP, "src/img/alert.gif");
            lblValidRESP.setForeground(new Color(0, 0, 0));
            btnRegResp.setVisible(true);
            txtNombreResp.setText("");
            txtApellidoResp.setText("");
            txtTelefono.setText("");

        }
    }//GEN-LAST:event_txtDocRespKeyReleased

    private void btnChequearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChequearMouseEntered
        btnChequear.setBackground(new Color(0, 204, 204));
        btnChequear.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnChequearMouseEntered

    private void btnChequearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChequearMouseExited
        btnChequear.setBackground(new Color(4, 153, 193));
        btnChequear.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnChequearMouseExited

    private void txtValorPagarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusGained
        if (txtValorPagar.getText().equals("0")) {
            txtValorPagar.setText("");
        }
    }//GEN-LAST:event_txtValorPagarFocusGained

    private void txtValorPagarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagarFocusLost
        if (txtValorPagar.getText().equals("")) {
            txtValorPagar.setText("0");
        }

    }//GEN-LAST:event_txtValorPagarFocusLost

    private void txtHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHabitacionMouseClicked
        mensajeINF = "<html><center>Si desea cambiar de habitacion,<p> debe eliminar la reserva y crear una nueva.";
        new Inf(JInternalFrame, true).setVisible(true);
    }//GEN-LAST:event_txtHabitacionMouseClicked

    private void txtValorAbonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorAbonoFocusGained
        if (txtValorAbono.getText().equals("0")) {
            txtValorAbono.setText("");
        }
    }//GEN-LAST:event_txtValorAbonoFocusGained

    private void txtValorAbonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorAbonoFocusLost
        if (txtValorAbono.getText().equals("")) {
            txtValorAbono.setText("0");
        }

    }//GEN-LAST:event_txtValorAbonoFocusLost

    private void txtValorAbonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorAbonoKeyReleased
        int tot = Integer.parseInt(txtValorPagar.getText());
        int ab = Integer.parseInt(txtValorAbono.getText());
        int deb = tot - ab;
        txtValorResta.setText(String.valueOf(deb));
    }//GEN-LAST:event_txtValorAbonoKeyReleased

    //************************************VOID MAIN **************************************************************
    public static void main(String args[]) {

        reservas_J modResv = new reservas_J();
        consReservas_J consResv = new consReservas_J();
        FrmReservas_J frmResv = new FrmReservas_J();
        ctrlReservas_J ctrlResv = new ctrlReservas_J(modResv, consResv, frmResv);
        frmResv.setVisible(true);
    }

//******************************************************************** MÉTODOS ****************************************************************
//*******************************************************************************************************************************************
    //*************************************************************************************************************************************
    public void limpiar() {

        txtDocResp.setText("");
        txtNombreResp.setText("");
        txtApellidoResp.setText("");
        txtTelefono.setText("");
        cbxHabitDisponible.setVisible(true);
        cbxHabitDisponible.setSelectedIndex(0);
        dcFecLlega.setDate(null);
        dcFecSale.setDate(null);
        cbxNumAcomp.setSelectedIndex(0);
        cbxFormaPago.setSelectedIndex(0);
        cbxresPor.setSelectedIndex(0);
        txtValorPagar.setText("0");
        txtValorAbono.setText("0");
        txtValorResta.setText("0");
        cbxResvPendiente.setSelectedIndex(0);
        txtDocResp.requestFocus();
        txtID.setText("");
        lblValidRESP.setText("");
        lblImgOkNoRESP.setIcon(null);
        btnRegResp.setVisible(false);
        btnGrupPagoes.clearSelection();
        txtHabitacion.setText("");
        txtHabitacion.setVisible(false);
        actvBtnGuarda();

    }

//*********************************************************************************************************************************************
    public Date setearFechas(String fec) {

        Date fechaDate = null;

        try {
            fechaDate = formatFecha.parse(fec);

        } catch (ParseException ex) {

            Logger.getLogger(FrmReservas_J.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaDate;

    }

//**************************************************BUSCAR CLIENTE*****************************************************************************
    public String BuscarIdentif(String iden) {

        PreparedStatement ps;
        ResultSet rs;

        try {

            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT nombre,apellido,contacto,id_clientes FROM clientes WHERE num_doc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, iden);

            rs = ps.executeQuery();
            if (rs.next()) {

                cli.setId(rs.getInt("id_clientes"));
                cli.setNombre(rs.getString("nombre"));
                cli.setApellido(rs.getString("apellido"));
                cli.setContacto(rs.getString("contacto"));
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

//**************************************************** DATOS HOTEL *****************************************************************************
    public void mostrarDatosHot() {
        validarDisponibles();
        hotel_J ht = new hotel_J();
        consHotel_J cons = new consHotel_J();
        cons.nombreHot(ht);
        lblNomHotel.setText("HOTEL  " + ht.getNombre());
        lblLocalizacion.setText(ht.getMunicipio());
        lblFecha.setText(consHotel_J.fechaActual().toUpperCase());
        lblNomUser.setText(nom);
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        lblFecAct.setText(formato.format(sistFecha));
//        lblFecAct.setVisible(false);

        //******hasta aca son datos del hotel*************************
        txtID.setVisible(false);
        cbxResvPendiente.setVisible(false);
        lblResvPend.setVisible(false);
        consResv.listarReservas();
        btnRegResp.setVisible(false);
        cbxResvPendiente.addItem("SI");
        cbxHabitDisponible.setVisible(true);
        txtHabitacion.setVisible(false);
        lblTipo.setVisible(false);
        lblRegUser.setVisible(false);
        lblFRg.setVisible(false);
        actvBtnGuarda();
        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(btnSalirPagPend, "src/img/x.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");

    }

    //*************************************************************************************************************************************
    public void validarDisponibles() {

        int num = consEstHab.cantEstados("OCUPADO");

        if (num == 12) {
            lblValidDisponibles.setText("<html><center>No hay disponibilidad <p>de habitaciones");
            RSScaleLabel.setScaleLabel(lblImgOkNoDisponibles, "src/img/alert2.png");
        } else {
            lblValidDisponibles.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNoDisponibles, "");

        }
    }

//*************************************************************************************************************************************
    public void desactvBtns() {

        btnGuardarReserv.setVisible(false);
        btnEliminarResv.setVisible(false);
        btnChequear.setVisible(false);

    }
//*************************************************************************************************************************************

    public void actvBtnGuarda() {

        btnGuardarReserv.setVisible(true);
        btnEliminarResv.setVisible(false);
        btnChequear.setVisible(false);

    }

//*************************************************************************************************************************************
    public void actvBtnElimAct() {

        btnEliminarResv.setVisible(true);
        btnGuardarReserv.setVisible(false);
        btnChequear.setVisible(false);
    }

//*************************************************************************************************************************************
    public void actvBtnCheckIn() {

        btnChequear.setVisible(true);
        btnGuardarReserv.setVisible(false);
        btnEliminarResv.setVisible(false);
        cbxResvPendiente.removeItem("SI");
    }

//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    
    void cbxPers() {
        //Le damos las propiedadesCBX de la clase a los cbx
        cbxresPor.setUI(propiedadesCBX.createUI(rootPane));
        cbxHabitDisponible.setUI(propiedadesCBX.createUI(rootPane));
        cbxFormaPago.setUI(propiedadesCBX.createUI(rootPane));
        cbxNumAcomp.setUI(propiedadesCBX.createUI(rootPane));
        cbxResvPendiente.setUI(propiedadesCBX.createUI(rootPane));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnChequear;
    public java.awt.Label btnEliminarResv;
    public javax.swing.ButtonGroup btnGrupPagoes;
    public java.awt.Label btnGuardarReserv;
    public java.awt.Label btnLimpiarResv1;
    public java.awt.Label btnRegResp;
    public javax.swing.JLabel btnSalirPagPend;
    public javax.swing.JComboBox<String> cbxFormaPago;
    public javax.swing.JComboBox<String> cbxHabitDisponible;
    public javax.swing.JComboBox<String> cbxNumAcomp;
    public javax.swing.JComboBox<String> cbxResvPendiente;
    public javax.swing.JComboBox<String> cbxresPor;
    public com.toedter.calendar.JDateChooser dcFecLlega;
    public com.toedter.calendar.JDateChooser dcFecSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAbona;
    private javax.swing.JLabel lblCara;
    public javax.swing.JLabel lblDesarrr;
    public javax.swing.JLabel lblFRg;
    public javax.swing.JLabel lblFecAct;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHola;
    public javax.swing.JLabel lblImgOkNoDisponibles;
    public javax.swing.JLabel lblImgOkNoRESP;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomUser;
    private javax.swing.JLabel lblPesosABN;
    private javax.swing.JLabel lblPesosREST;
    public javax.swing.JLabel lblRegUser;
    private javax.swing.JLabel lblResta;
    private javax.swing.JLabel lblResvPend;
    public javax.swing.JLabel lblSoftMax;
    public javax.swing.JLabel lblSotMax;
    public javax.swing.JLabel lblTipo;
    public javax.swing.JLabel lblValidDisponibles;
    public javax.swing.JLabel lblValidRESP;
    private javax.swing.JPanel pnlDatosRes;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoReservas;
    public javax.swing.JPanel pnlRegisReserv;
    private javax.swing.JPanel pnlSoftMax;
    public javax.swing.JPanel pnlTablaDatos;
    private javax.swing.JSeparator sepAbono;
    private javax.swing.JSeparator sepResta;
    public static rojerusan.RSTableMetro tblReservPend;
    public javax.swing.JTextField txtApellidoResp;
    public javax.swing.JTextField txtDocResp;
    public javax.swing.JTextField txtHabitacion;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombreResp;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtValorAbono;
    public javax.swing.JTextField txtValorPagar;
    public javax.swing.JTextField txtValorResta;
    // End of variables declaration//GEN-END:variables
}
