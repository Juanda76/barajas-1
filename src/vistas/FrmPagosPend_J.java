package vistas;

import clases.propiedadesCBX;
import consultas.consHotel_J;
import consultas.consPagPend_J;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.table.TableRowSorter;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;
import static consultas.consPagPend_J.fechaActualRegis;
import static consultas.consUsuario_M.nom;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;

// @author Software_Max(JDV)
public final class FrmPagosPend_J extends javax.swing.JFrame {

    int filas;
    public static boolean res;
    private TableRowSorter TRSFiltro;
    Frame JInternalFrame = null;
    consPagPend_J consPagPen = new consPagPend_J();

    public FrmPagosPend_J() {
        initComponents();
        consPagPen.listarPagos();
        mostrarDatosHot();
        cbxPers();
        btnActualiPago.setVisible(false);
        btnPagaYa.setVisible(false);
        btnRegistPago.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlDatosH = new javax.swing.JPanel();
        lblCara = new javax.swing.JLabel();
        btnSalirPagPend = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblsaludo5 = new javax.swing.JLabel();
        lblSotMax = new javax.swing.JLabel();
        lblsaludo4 = new javax.swing.JLabel();
        lblNomHotel = new javax.swing.JLabel();
        lblLocalizacion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHola = new javax.swing.JLabel();
        lblNomUser = new javax.swing.JLabel();
        pnlFondoRegIng = new javax.swing.JPanel();
        pnlFormPagos = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDocResp = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtNomResp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        cbxFormaPago = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtFecPago = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        cbxPago = new javax.swing.JComboBox<>();
        btnLimpiar = new java.awt.Label();
        btnActualiPago = new java.awt.Label();
        btnPagaYa = new java.awt.Label();
        btnRegistPago = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagosPendien = new rojerusan.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();
        pnlBuscar = new javax.swing.JPanel();
        txtDocBuscar = new javax.swing.JTextField();
        lblInfBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setExtendedState(6);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));

        pnlDatosH.setBackground(new java.awt.Color(4, 153, 193));
        pnlDatosH.setPreferredSize(new java.awt.Dimension(1350, 117));
        pnlDatosH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCara.setPreferredSize(new java.awt.Dimension(80, 80));
        pnlDatosH.add(lblCara, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 79));

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
        pnlDatosH.add(btnSalirPagPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

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

        pnlDatosH.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 100, -1));

        lblNomHotel.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lblNomHotel.setForeground(new java.awt.Color(255, 255, 255));
        lblNomHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomHotel.setText("NOMBRE HOTEL");
        pnlDatosH.add(lblNomHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 540, -1));

        lblLocalizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLocalizacion.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocalizacion.setText("LOCALIZADO EN");
        pnlDatosH.add(lblLocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 540, -1));

        lblFecha.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha.setText("FECHA COMPLETA");
        pnlDatosH.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 270, -1));

        lblHola.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblHola.setForeground(new java.awt.Color(255, 255, 255));
        lblHola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHola.setText("HOLA ");
        pnlDatosH.add(lblHola, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, -1));

        lblNomUser.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblNomUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNomUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomUser.setText("NU");
        pnlDatosH.add(lblNomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 160, -1));

        pnlFondoRegIng.setBackground(new java.awt.Color(4, 153, 193));
        pnlFondoRegIng.setPreferredSize(new java.awt.Dimension(1324, 632));

        pnlFormPagos.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "LISTADO DE PAGOS PENDIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        pnlFormPagos.setForeground(new java.awt.Color(255, 255, 255));
        pnlFormPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlFormPagos.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 100, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 153, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("N° - DOC.RESP:");
        pnlFormPagos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, -1));

        txtDocResp.setEditable(false);
        txtDocResp.setBackground(new java.awt.Color(255, 255, 255));
        txtDocResp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtDocResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocResp.setBorder(null);
        txtDocResp.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlFormPagos.add(txtDocResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormPagos.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 150, 10));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 153, 193));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NOMBRE:");
        pnlFormPagos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 150, -1));

        txtNomResp.setEditable(false);
        txtNomResp.setBackground(new java.awt.Color(255, 255, 255));
        txtNomResp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNomResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomResp.setBorder(null);
        txtNomResp.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlFormPagos.add(txtNomResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormPagos.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 150, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 153, 193));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VALOR:");
        pnlFormPagos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 150, -1));

        txtValorPago.setEditable(false);
        txtValorPago.setBackground(new java.awt.Color(255, 255, 255));
        txtValorPago.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtValorPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorPago.setText("0");
        txtValorPago.setBorder(null);
        txtValorPago.setPreferredSize(new java.awt.Dimension(150, 30));
        txtValorPago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorPagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorPagoFocusLost(evt);
            }
        });
        pnlFormPagos.add(txtValorPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormPagos.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 150, 10));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(4, 153, 193));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("FORMA DE PAGO:");
        pnlFormPagos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 140, -1));

        cbxFormaPago.setBackground(new java.awt.Color(4, 153, 193));
        cbxFormaPago.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxFormaPago.setForeground(new java.awt.Color(255, 255, 255));
        cbxFormaPago.setMaximumRowCount(5);
        cbxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Efectivo", "Tranferencia", "Consignacion" }));
        cbxFormaPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxFormaPago.setPreferredSize(new java.awt.Dimension(150, 28));
        pnlFormPagos.add(cbxFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 153, 193));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FECHA:");
        pnlFormPagos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 150, -1));

        txtFecPago.setEditable(false);
        txtFecPago.setBackground(new java.awt.Color(255, 255, 255));
        txtFecPago.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtFecPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecPago.setBorder(null);
        txtFecPago.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlFormPagos.add(txtFecPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 153, 255)));
        pnlFormPagos.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 150, 10));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(4, 153, 193));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(" PAGO:");
        pnlFormPagos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 140, -1));

        cbxPago.setBackground(new java.awt.Color(4, 153, 193));
        cbxPago.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxPago.setForeground(new java.awt.Color(255, 255, 255));
        cbxPago.setMaximumRowCount(5);
        cbxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "PAGA-YA", "LUEGO", "SALDAR" }));
        cbxPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxPago.setPreferredSize(new java.awt.Dimension(150, 28));
        cbxPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPagoActionPerformed(evt);
            }
        });
        pnlFormPagos.add(cbxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        btnLimpiar.setAlignment(java.awt.Label.CENTER);
        btnLimpiar.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        pnlFormPagos.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        btnActualiPago.setAlignment(java.awt.Label.CENTER);
        btnActualiPago.setBackground(new java.awt.Color(4, 153, 193));
        btnActualiPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualiPago.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnActualiPago.setForeground(new java.awt.Color(255, 255, 255));
        btnActualiPago.setPreferredSize(new java.awt.Dimension(130, 30));
        btnActualiPago.setText("SALDAR");
        btnActualiPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualiPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualiPagoMouseExited(evt);
            }
        });
        pnlFormPagos.add(btnActualiPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        btnPagaYa.setAlignment(java.awt.Label.CENTER);
        btnPagaYa.setBackground(new java.awt.Color(4, 153, 193));
        btnPagaYa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPagaYa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnPagaYa.setForeground(new java.awt.Color(255, 255, 255));
        btnPagaYa.setPreferredSize(new java.awt.Dimension(130, 30));
        btnPagaYa.setText("PAGA YA");
        btnPagaYa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPagaYaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPagaYaMouseExited(evt);
            }
        });
        pnlFormPagos.add(btnPagaYa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        btnRegistPago.setAlignment(java.awt.Label.CENTER);
        btnRegistPago.setBackground(new java.awt.Color(4, 153, 193));
        btnRegistPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistPago.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnRegistPago.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistPago.setPreferredSize(new java.awt.Dimension(130, 30));
        btnRegistPago.setText("REGISTRAR");
        btnRegistPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistPagoMouseExited(evt);
            }
        });
        pnlFormPagos.add(btnRegistPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "LISTADO DE PAGOS PENDIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPagosPendien.setBackground(new java.awt.Color(4, 153, 193));
        tblPagosPendien.setForeground(new java.awt.Color(255, 255, 255));
        tblPagosPendien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPagosPendien.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblPagosPendien.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblPagosPendien.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblPagosPendien.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblPagosPendien.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblPagosPendien.setFuenteFilas(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblPagosPendien.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblPagosPendien.setFuenteHead(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tblPagosPendien.setMultipleSeleccion(false);
        tblPagosPendien.setPreferredSize(new java.awt.Dimension(600, 300));
        tblPagosPendien.setSelectionBackground(new java.awt.Color(13, 41, 66));
        tblPagosPendien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPagosPendienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPagosPendien);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 664, 250));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 153, 193));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><center>EN LA TABLA SE MUESTRAN LOS HUESPEDES QUE TIENEN PAGO PENDIENTE,<p><br> PARA REALIZAR UN PAGO SOLO DEBE SELECCIONAR LA FILA,<p><br>  Y REALIZAR LOS CAMBIOS CORRESPONDIENTES EN<p><br> EL PANEL 'REGISTRO DE PAGOS'");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 664, 200));

        pnlBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pnlBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDocBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDocBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocBuscarKeyTyped(evt);
            }
        });
        pnlBuscar.add(txtDocBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 30));

        lblInfBuscar.setForeground(new java.awt.Color(4, 153, 193));
        lblInfBuscar.setText("N° DE DOCUMENTO");
        pnlBuscar.add(lblInfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 30));

        jPanel4.add(pnlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 630, 50));

        javax.swing.GroupLayout pnlFondoRegIngLayout = new javax.swing.GroupLayout(pnlFondoRegIng);
        pnlFondoRegIng.setLayout(pnlFondoRegIngLayout);
        pnlFondoRegIngLayout.setHorizontalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoRegIngLayout.setVerticalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addComponent(pnlFormPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatosH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlDatosH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPagosPendienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPagosPendienMouseClicked

        int seleccion = tblPagosPendien.getSelectedRow();
        txtID.setText(tblPagosPendien.getValueAt(seleccion, 0).toString());
        txtDocResp.setText(tblPagosPendien.getValueAt(seleccion, 1).toString());
        txtNomResp.setText(tblPagosPendien.getValueAt(seleccion, 2).toString());
        txtFecPago.setText(tblPagosPendien.getValueAt(seleccion, 3).toString());
        cbxFormaPago.setSelectedItem(tblPagosPendien.getValueAt(seleccion, 4).toString());
        txtValorPago.setText(tblPagosPendien.getValueAt(seleccion, 5).toString());
        cbxPago.setSelectedItem(tblPagosPendien.getValueAt(seleccion, 6).toString());

        filas = seleccion;

        btnPagaYa.setVisible(false);
        btnRegistPago.setVisible(false);
        btnActualiPago.setVisible(true);
        cbxPago.removeItem("LUEGO");
        cbxPago.removeItem("PAGA-YA");
        cbxPago.setSelectedItem("SALDAR");

    }//GEN-LAST:event_tblPagosPendienMouseClicked

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

    private void btnActualiPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiPagoMouseExited
        btnPagaYa.setBackground(new Color(4, 153, 193));
        btnPagaYa.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnActualiPagoMouseExited

    private void btnActualiPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiPagoMouseEntered
        btnPagaYa.setBackground(new Color(0, 204, 204));
        btnPagaYa.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnActualiPagoMouseEntered

    private void cbxPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPagoActionPerformed
        String select = cbxPago.getSelectedItem().toString();

        if (select.equals("LUEGO")) {

            cbxFormaPago.addItem("Sin pago");
            cbxFormaPago.setSelectedItem("Sin pago");
            cbxFormaPago.setEnabled(false);
            btnRegistPago.setVisible(true);
            btnActualiPago.setVisible(false);
            btnPagaYa.setVisible(false);

        } else if (select.equals("PAGA-YA")) {

            cbxFormaPago.removeItem("Sin pago");
            cbxFormaPago.setSelectedItem("Seleccione");
            cbxFormaPago.setEnabled(true);
            btnPagaYa.setVisible(true);
            btnRegistPago.setVisible(false);
            btnActualiPago.setVisible(false);

        } else if (select.equals("SALDAR")) {

            cbxFormaPago.removeItem("Sin pago");
            cbxFormaPago.setSelectedItem("Seleccione");
            cbxFormaPago.setEnabled(true);
            btnActualiPago.setVisible(true);
            btnRegistPago.setVisible(false);
            btnPagaYa.setVisible(false);

        } else {

        }
    }//GEN-LAST:event_cbxPagoActionPerformed

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(4, 153, 193));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0, 204, 204));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnPagaYaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagaYaMouseEntered
        btnActualiPago.setBackground(new Color(0, 204, 204));
        btnActualiPago.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnPagaYaMouseEntered

    private void btnPagaYaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagaYaMouseExited
        btnActualiPago.setBackground(new Color(4, 153, 193));
        btnActualiPago.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnPagaYaMouseExited

    private void txtDocBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocBuscarKeyTyped
        txtDocBuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {

                TRSFiltro.setRowFilter(RowFilter.regexFilter(txtDocBuscar.getText(), 1));
            }

        });

        TRSFiltro = new TableRowSorter(tblPagosPendien.getModel());
        tblPagosPendien.setRowSorter(TRSFiltro);

    }//GEN-LAST:event_txtDocBuscarKeyTyped

    private void txtDocBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocBuscarKeyReleased
        if (txtDocBuscar.getText().equals("")) {

            consPagPen.listarPagos();
        }
    }//GEN-LAST:event_txtDocBuscarKeyReleased

    private void txtValorPagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagoFocusGained
        txtValorPago.setText("");
    }//GEN-LAST:event_txtValorPagoFocusGained

    private void txtValorPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagoFocusLost
        if (txtValorPago.getText().equals("")) {
            txtValorPago.setText("0");
        }
    }//GEN-LAST:event_txtValorPagoFocusLost

    private void btnRegistPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistPagoMouseEntered
        btnRegistPago.setBackground(new Color(0, 204, 204));
        btnRegistPago.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRegistPagoMouseEntered

    private void btnRegistPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistPagoMouseExited
        btnRegistPago.setBackground(new Color(4, 153, 193));
        btnRegistPago.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRegistPagoMouseExited

    //************************************VOID MAIN **************************************************************
    public static void main(String args[]) {

//        pagosPend_J modPagPen = new pagosPend_J();
//        consPagPend_J consPagPen = new consPagPend_J();
//        FrmPagosPend_J frmPagPen = new FrmPagosPend_J();
//        ctrlPagosPend_J ctrlPagPen = new ctrlPagosPend_J(modPagPen, consPagPen, frmPagPen);
//        frmPagPen.setVisible(true);
    }

//************************************************** MÉTODOS ***********************************************************************************
//**********************************************************************************************************************************************
//**************************************************** DATOS HOTEL *****************************************************************************
    public void mostrarDatosHot() {

        hotel_J ht = new hotel_J();
        consHotel_J cons = new consHotel_J();
        cons.nombreHot(ht);
        lblNomHotel.setText("HOTEL  " + ht.getNombre());
        lblLocalizacion.setText(ht.getMunicipio());
        lblNomUser.setText(nom);
        lblFecha.setText(consHotel_J.fechaActual().toUpperCase());
        //*********************hasta aca son datos del hotel
        txtID.setVisible(false);
        txtFecPago.setText(fechaActualRegis());
        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(btnSalirPagPend, "src/img/x.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");

    }

//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    
    void cbxPers() {

        //Le damos las propiedadesCBX de la clase a los cbx
        cbxFormaPago.setUI(propiedadesCBX.createUI(rootPane));
        cbxPago.setUI(propiedadesCBX.createUI(rootPane));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnActualiPago;
    public java.awt.Label btnLimpiar;
    public java.awt.Label btnPagaYa;
    public java.awt.Label btnRegistPago;
    public javax.swing.JLabel btnSalirPagPend;
    public javax.swing.JComboBox<String> cbxFormaPago;
    public javax.swing.JComboBox<String> cbxPago;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCara;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHola;
    private javax.swing.JLabel lblInfBuscar;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomUser;
    public javax.swing.JLabel lblSotMax;
    public javax.swing.JLabel lblsaludo4;
    public javax.swing.JLabel lblsaludo5;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlDatosH;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoRegIng;
    public javax.swing.JPanel pnlFormPagos;
    public static rojerusan.RSTableMetro tblPagosPendien;
    private javax.swing.JTextField txtDocBuscar;
    public javax.swing.JTextField txtDocResp;
    public javax.swing.JTextField txtFecPago;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNomResp;
    public javax.swing.JTextField txtValorPago;
    // End of variables declaration//GEN-END:variables
}
