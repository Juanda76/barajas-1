package vistas;

import alertas.Error;
import consultas.consHotel_J;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Frame;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;
import static controlador.ctrlHotel_J.mensajeER;
import static consultas.consUsuario_M.nom;
import controlador.ctrlHotel_J;

// @author Software_Max(JDV)
public class FrmDatosHotel_J extends javax.swing.JFrame {

    int filas;
    Frame JInternalFrame = null;
    consHotel_J ch = new consHotel_J();

    public FrmDatosHotel_J() {

        initComponents();
        ch.listar();
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
        lblFecha = new javax.swing.JLabel();
        lblHola = new javax.swing.JLabel();
        lblNomUser = new javax.swing.JLabel();
        pnlFondoRegIng = new javax.swing.JPanel();
        pnlFormularioHotel = new javax.swing.JPanel();
        btnGuardar = new java.awt.Label();
        btnActualizar = new java.awt.Label();
        btnEliminar = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        txtNombreHot = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtInstagramHot = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefonoHot = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtMunicipioHot = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        btnLimpiar = new java.awt.Label();
        lblID = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosHotel = new rojerusan.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();

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

        lblFecha.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha.setText("FECHA COMPLETA");
        pnlDatos1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 270, -1));

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

        pnlFondoRegIng.setBackground(new java.awt.Color(4, 153, 193));
        pnlFondoRegIng.setPreferredSize(new java.awt.Dimension(1324, 632));

        pnlFormularioHotel.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormularioHotel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "DATOS DEL HOTEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        pnlFormularioHotel.setForeground(new java.awt.Color(255, 255, 255));
        pnlFormularioHotel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setAlignment(java.awt.Label.CENTER);
        btnGuardar.setBackground(new java.awt.Color(4, 153, 193));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        pnlFormularioHotel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        btnActualizar.setAlignment(java.awt.Label.CENTER);
        btnActualizar.setBackground(new java.awt.Color(4, 153, 193));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        pnlFormularioHotel.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        btnEliminar.setAlignment(java.awt.Label.CENTER);
        btnEliminar.setBackground(new java.awt.Color(4, 153, 193));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        pnlFormularioHotel.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 153, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE:");
        pnlFormularioHotel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, -1));

        txtNombreHot.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNombreHot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreHot.setBorder(null);
        txtNombreHot.setPreferredSize(new java.awt.Dimension(180, 30));
        txtNombreHot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreHotFocusGained(evt);
            }
        });
        txtNombreHot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreHotKeyTyped(evt);
            }
        });
        pnlFormularioHotel.add(txtNombreHot, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormularioHotel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, 10));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 153, 193));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INSTAGRAM:");
        pnlFormularioHotel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 180, -1));

        txtInstagramHot.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtInstagramHot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInstagramHot.setBorder(null);
        txtInstagramHot.setPreferredSize(new java.awt.Dimension(180, 30));
        txtInstagramHot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInstagramHotKeyTyped(evt);
            }
        });
        pnlFormularioHotel.add(txtInstagramHot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormularioHotel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 180, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 153, 193));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MUNICIPIO:");
        pnlFormularioHotel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 180, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 153, 193));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTACTO:");
        pnlFormularioHotel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 180, -1));

        txtTelefonoHot.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTelefonoHot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoHot.setBorder(null);
        txtTelefonoHot.setPreferredSize(new java.awt.Dimension(180, 30));
        txtTelefonoHot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoHotKeyTyped(evt);
            }
        });
        pnlFormularioHotel.add(txtTelefonoHot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormularioHotel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 180, 10));

        txtMunicipioHot.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMunicipioHot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMunicipioHot.setBorder(null);
        txtMunicipioHot.setPreferredSize(new java.awt.Dimension(180, 30));
        txtMunicipioHot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMunicipioHotKeyTyped(evt);
            }
        });
        pnlFormularioHotel.add(txtMunicipioHot, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormularioHotel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 180, 10));

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
        pnlFormularioHotel.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        lblID.setText("jLabel1");
        pnlFormularioHotel.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INFORMACION DEL HOTEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatosHotel.setBackground(new java.awt.Color(4, 153, 193));
        tblDatosHotel.setForeground(new java.awt.Color(255, 255, 255));
        tblDatosHotel.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDatosHotel.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblDatosHotel.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblDatosHotel.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblDatosHotel.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblDatosHotel.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblDatosHotel.setFuenteFilas(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblDatosHotel.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblDatosHotel.setFuenteHead(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tblDatosHotel.setMultipleSeleccion(false);
        tblDatosHotel.setPreferredSize(new java.awt.Dimension(200, 200));
        tblDatosHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosHotelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosHotel);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 664, 250));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 153, 193));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><center>EN LA TABLA SE MUESTRA LA INFORMACION DEL HOTEL REGISTRADO<p><br> SI DESEA REALIZAR CABIOS O ELIMINARLA,<p><br> SELECCIONE LA FILA Y REALICE LA ACCION DESEADA<p><br> EN EL PANEL 'DATOS DEL HOTEL'");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 664, 200));

        javax.swing.GroupLayout pnlFondoRegIngLayout = new javax.swing.GroupLayout(pnlFondoRegIng);
        pnlFondoRegIng.setLayout(pnlFondoRegIngLayout);
        pnlFondoRegIngLayout.setHorizontalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormularioHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoRegIngLayout.setVerticalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFormularioHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDatosHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosHotelMouseClicked

        int seleccion = tblDatosHotel.getSelectedRow();

        lblID.setText(tblDatosHotel.getValueAt(seleccion, 0).toString());
        txtNombreHot.setText(tblDatosHotel.getValueAt(seleccion, 1).toString());
        txtInstagramHot.setText(tblDatosHotel.getValueAt(seleccion, 2).toString());
        txtTelefonoHot.setText(tblDatosHotel.getValueAt(seleccion, 3).toString());
        txtMunicipioHot.setText(tblDatosHotel.getValueAt(seleccion, 4).toString());
        filas = seleccion;
        desactBtnGuarda();

    }//GEN-LAST:event_tblDatosHotelMouseClicked

    private void txtInstagramHotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInstagramHotKeyTyped

        if (txtInstagramHot.getText().length() >= 60) {

            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            txtInstagramHot.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtInstagramHotKeyTyped

    private void txtNombreHotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreHotKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo acepta letras.";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();

        } else if (txtNombreHot.getText().length() >= 50) {

            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            txtNombreHot.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreHotKeyTyped

    private void txtTelefonoHotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoHotKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo acepta numeros.";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();

        } else if (txtTelefonoHot.getText().length() >= 11) {

            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            txtTelefonoHot.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoHotKeyTyped

    private void txtMunicipioHotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioHotKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_MINUS) {

            mensajeER = "<html><center>Este campo solo acepta letras.";
            new Error(JInternalFrame, true).setVisible(true);
            evt.consume();

        } else if (txtMunicipioHot.getText().length() >= 50) {

            mensajeER = "<html><center>Has exedido el número<p> de caracteres permitido.";
            new Error(JInternalFrame, true).setVisible(true);
            txtMunicipioHot.setText("");
            evt.consume();
        }
    }//GEN-LAST:event_txtMunicipioHotKeyTyped

    private void txtNombreHotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreHotFocusGained
        if (txtNombreHot.getText().length() == 0) {
            desactBtnActElim();
        }
    }//GEN-LAST:event_txtNombreHotFocusGained

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(0, 204, 204));
        btnGuardar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(4, 153, 193));
        btnGuardar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0, 204, 204));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(4, 153, 193));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setBackground(new Color(0, 204, 204));
        btnActualizar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setBackground(new Color(4, 153, 193));
        btnActualizar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(0, 204, 204));
        btnEliminar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(4, 153, 193));
        btnEliminar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarMouseExited

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
            java.util.logging.Logger.getLogger(FrmDatosHotel_J.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDatosHotel_J.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDatosHotel_J.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDatosHotel_J.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        hotel_J modHot = new hotel_J();
        consHotel_J modCons = new consHotel_J();
        FrmDatosHotel_J frmHot = new FrmDatosHotel_J();
        ctrlHotel_J ctrlHot = new ctrlHotel_J(modHot, modCons, frmHot);
        frmHot.setVisible(true);
    }

//******************************************************************** MÉTODOS ****************************************************************
//*********************************************************************************************************************************************
//*************************************************** DESACTIVAR Y ACTIVAR BTNS ***************************************************************
    void desactBtnGuarda() {

        btnGuardar.setVisible(false);
        btnEliminar.setVisible(true);
        btnActualizar.setVisible(true);
    }

    void desactBtnActElim() {

        btnEliminar.setVisible(false);
        btnActualizar.setVisible(false);
        btnGuardar.setVisible(true);
    }

//**************************************************** DATOS HOTEL *****************************************************************************
    public void mostrarDatosHot() {

        hotel_J ht = new hotel_J();
        consHotel_J cons = new consHotel_J();
        cons.nombreHot(ht);
        lblNomHotel.setText("HOTEL  " + ht.getNombre());
        lblLocalizacion.setText(ht.getMunicipio());
        lblFecha.setText(consHotel_J.fechaActual().toUpperCase());
        lblNomUser.setText(nom);

        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");
        lblID.setVisible(false);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnActualizar;
    public java.awt.Label btnEliminar;
    public java.awt.Label btnGuardar;
    public java.awt.Label btnLimpiar;
    public javax.swing.JLabel btnSalir;
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
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblCara;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHola;
    public javax.swing.JLabel lblID;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomUser;
    public javax.swing.JLabel lblSotMax;
    public javax.swing.JLabel lblsaludo4;
    public javax.swing.JLabel lblsaludo5;
    private javax.swing.JPanel pnlDatos1;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoRegIng;
    public javax.swing.JPanel pnlFormularioHotel;
    public static rojerusan.RSTableMetro tblDatosHotel;
    public javax.swing.JTextField txtInstagramHot;
    public javax.swing.JTextField txtMunicipioHot;
    public javax.swing.JTextField txtNombreHot;
    public javax.swing.JTextField txtTelefonoHot;
    // End of variables declaration//GEN-END:variables
}
