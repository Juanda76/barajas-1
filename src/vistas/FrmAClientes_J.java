package vistas;

import alertas.Error;
import alertas.Exito;
import clases.conectar;
import clases.propiedadesCBX;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.cliente_J;
import rojerusan.RSAnimation;
import rsscalelabel.RSScaleLabel;
import static controlador.ctrlHotel_J.mensajeER;

// @author Software_Max(JDV)
public final class FrmAClientes_J extends javax.swing.JDialog {

    PreparedStatement ps;
    ResultSet rs;
    String time;
    Frame JDialog = null;
    String mensaje;
    String mensaje1;
    cliente_J cli = new cliente_J();

    public FrmAClientes_J(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        RSAnimation.setBajar(-300, 80, 1, 3, this);
        setLocationRelativeTo(null);
        cbxPers();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistroVisitantes = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxTipoDcto = new javax.swing.JComboBox<>();
        txtNumDocHuesp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtApellHuesp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtContactHuesp = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnGuarHuesp = new java.awt.Label();
        cbxPaises = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtInstagHuesp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNomHusp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLimpHusped = new java.awt.Label();
        btnActualHuesp = new java.awt.Label();
        btnElimHusped = new java.awt.Label();
        lblValidCLI = new javax.swing.JLabel();
        lblImgOkNoCLI = new javax.swing.JLabel();
        pnlHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        txtRegistra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlRegistroVisitantes.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroVisitantes.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(4, 153, 193)));
        pnlRegistroVisitantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlRegistroVisitantes.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 40, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 153, 193));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TIPO DOCUMENTO:");
        pnlRegistroVisitantes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 150, -1));

        cbxTipoDcto.setBackground(new java.awt.Color(4, 153, 193));
        cbxTipoDcto.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxTipoDcto.setForeground(new java.awt.Color(255, 255, 255));
        cbxTipoDcto.setMaximumRowCount(6);
        cbxTipoDcto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cedula Ciudadania", "Reg. Civil", "Tarjeta Identidad", "Cedula Extrangeria", "Pasaporte" }));
        cbxTipoDcto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxTipoDcto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxTipoDcto.setPreferredSize(new java.awt.Dimension(150, 28));
        pnlRegistroVisitantes.add(cbxTipoDcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        txtNumDocHuesp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNumDocHuesp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumDocHuesp.setBorder(null);
        txtNumDocHuesp.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNumDocHuesp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumDocHuespKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDocHuespKeyTyped(evt);
            }
        });
        pnlRegistroVisitantes.add(txtNumDocHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 153, 193));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("N°  IDENTIFICACION:");
        pnlRegistroVisitantes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 150, -1));

        jSeparator2.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroVisitantes.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 150, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 153, 193));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APELLIDOS:");
        pnlRegistroVisitantes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 150, -1));

        txtApellHuesp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtApellHuesp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellHuesp.setBorder(null);
        txtApellHuesp.setPreferredSize(new java.awt.Dimension(150, 30));
        txtApellHuesp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellHuespKeyTyped(evt);
            }
        });
        pnlRegistroVisitantes.add(txtApellHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroVisitantes.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 150, 10));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(4, 153, 193));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CONTACTO:");
        pnlRegistroVisitantes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 150, -1));

        txtContactHuesp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtContactHuesp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContactHuesp.setBorder(null);
        txtContactHuesp.setPreferredSize(new java.awt.Dimension(150, 30));
        txtContactHuesp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactHuespKeyTyped(evt);
            }
        });
        pnlRegistroVisitantes.add(txtContactHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroVisitantes.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 150, 10));

        btnGuarHuesp.setAlignment(java.awt.Label.CENTER);
        btnGuarHuesp.setBackground(new java.awt.Color(4, 153, 193));
        btnGuarHuesp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuarHuesp.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnGuarHuesp.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarHuesp.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGuarHuesp.setText("GUARDAR");
        btnGuarHuesp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuarHuespMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuarHuespMouseExited(evt);
            }
        });
        pnlRegistroVisitantes.add(btnGuarHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        cbxPaises.setBackground(new java.awt.Color(4, 153, 193));
        cbxPaises.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cbxPaises.setForeground(new java.awt.Color(255, 255, 255));
        cbxPaises.setMaximumRowCount(10);
        cbxPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "COLOMBIA", "AFGANISTÁN", "ALBANIA", "ALEMANIA", "ANDORRA", "ANGOLA", "ANTIGUA Y BARBUDA", "ARABIA SAUDITA", "ARGELIA", "ARGENTINA", "ARMENIA", "AUSTRALIA", "AUSTRIA", "AZERBAIYÁN", "BAHAMAS", "BANGLADÉS", "BARBADOS", "BARÉIN", "BÉLGICA", "BELICE", "BENIN", "BIELORRUSIA", "BOLIVIA", "BOSNIA Y HERZEGOVINA", "BOTSUANA", "BRASIL", "BRUNEI", "BULGARIA", "BURKINA FASO", "BURUNDI", "BUTÁN", "CABO VERDE", "CAMBOYA", "CAMERÚN", "CANADÁ", "CATAR", "CHAD", "CHILE", "CHINA", "CHIPRE", "COMORAS", "COREA DEL NORTE", "COREA DEL SUR", "COSTA DE MARFIL", "COSTA RICA", "CROACIA", "CUBA", "DINAMARCA", "DOMINICA", "ECUADOR", "EGIPTO", "EL SALVADOR", "EMIRATOS ARABES UNIDOS", "ERITREA", "ESLOVAQUIA", "ESLOVENIA", "ESPAÑA", "ESTADOS UNIDOS", "ESTONIA", "ETIOPÍA", "FILIPINAS", "FINLANDIA", "FIYI", "FRANCIA", "GABÓN", "GAMBIA", "GEORGIA", "GHANA", "GRANADA", "GRECIA", "GUATEMALA", "GUINEA", "GUINEA ECUATORIAL", "GUINEA-BISSAU", "GUYANA", "HAITÍ", "HONDURAS", "HUNGRÍA", "INDIA", "INDONESIA", "IRÁN", "IRAQ", "IRLANDA", "ISLANDIA", "ISLAS MARSHALL", "ISLAS SALOMÓN", "ISRAEL", "ITALIA", "JAMAICA", "JAPÓN", "JORDANIA", "KAZAJISTÁN", "KENIA", "KIRGUISTÁN", "KIRIBATI", "KUWAIT", "LAOS", "LESOTO", "LETONIA", "LÍBANO", "LIBERIA", "LIBIA", "LIECHTENSTEIN", "LITUANIA", "LUXEMBURGO", "MADAGASCAR", "MALASIA", "MALAUI", "MALDIVAS", "MALI", "MALTA", "MARRUECOS", "MAURICIO", "MAURITANIA", "MÉXICO", "MICRONESIA", "MOLDAVIA", "MÓNACO", "MONGOLIA", "MONTENEGRO", "MOZAMBIQUE", "MYANMAR (BIRMANIA)", "NAMIBIA", "NAURU", "NEPAL", "NICARAGUA", "NÍGER", "NIGERIA", "NORUEGA", "NUEVA ZELANDA", "OMÁN", "PAÍSES BAJOS", "PAKISTÁN", "PALAOS", "PALESTINA", "PANAMÁ", "PAPÚA NUEVA GUINEA", "PARAGUAY", "PERÚ", "POLONIA", "PORTUGAL", "PUERTO RICO", "REINO UNIDO", "REPÚBLICA CENTROAFRICANA", "REPÚBLICA CHECA", "REPÚBLICA DE MACEDONIA", "REPÚBLICA DEL CONGO", "REPÚBLICA DEMOCRÁTICA DEL CONGO", "REPÚBLICA DOMINICANA", "RUANDA", "RUMANIA", "RUSIA", "SAMOA", "SAN CRISTÓBAL Y NIEVES", "SAN MARINO", "SAN VICENTE Y LAS GRANADINAS", "SANTA LUCÍA", "SANTO TOMÉ Y PRÍNCIPE", "SENEGAL", "SERBIA", "SEYCHELLES", "SIERRA LEONA", "SIRIA", "SOMALIA", "SRI LANKA", "SUAZILANDIA", "SUDÁFRICA", "SUDÁN", "SUDÁN DEL SUR", "SUECIA", "SUIZA", "SURINAM", "TAILANDIA", "TANZANIA", "TAYIKISTÁN", "TIMOR ORIENTAL", "TOGO", "TONGA", "TRINIDAD Y TOBAGO", "TÚNEZ", "TURKMENISTÁN", "TURQUÍA", "TUVALU", "UCRANIA", "UGANDA", "URUGUAY", "UZBEKISTÁN", "VANUATU", "VENEZUELA", "VIETNAM", "YEMEN", "YIBUTI", "ZAMBIA", "ZIMBABUE", " " }));
        cbxPaises.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        cbxPaises.setPreferredSize(new java.awt.Dimension(150, 28));
        pnlRegistroVisitantes.add(cbxPaises, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 153, 193));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NACIONALIDAD:");
        pnlRegistroVisitantes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 150, -1));

        jSeparator5.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroVisitantes.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 150, 10));

        txtInstagHuesp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtInstagHuesp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInstagHuesp.setBorder(null);
        txtInstagHuesp.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVisitantes.add(txtInstagHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(4, 153, 193));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INSTAGRAM:");
        pnlRegistroVisitantes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 150, -1));

        jSeparator3.setForeground(new java.awt.Color(4, 153, 193));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlRegistroVisitantes.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 150, 10));

        txtNomHusp.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNomHusp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomHusp.setBorder(null);
        txtNomHusp.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNomHusp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomHuspKeyTyped(evt);
            }
        });
        pnlRegistroVisitantes.add(txtNomHusp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 153, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE:");
        pnlRegistroVisitantes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 150, -1));

        btnLimpHusped.setAlignment(java.awt.Label.CENTER);
        btnLimpHusped.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpHusped.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpHusped.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpHusped.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpHusped.setPreferredSize(new java.awt.Dimension(130, 30));
        btnLimpHusped.setText("LIMPIAR");
        btnLimpHusped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpHuspedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpHuspedMouseExited(evt);
            }
        });
        pnlRegistroVisitantes.add(btnLimpHusped, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, -1, -1));

        btnActualHuesp.setAlignment(java.awt.Label.CENTER);
        btnActualHuesp.setBackground(new java.awt.Color(4, 153, 193));
        btnActualHuesp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualHuesp.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnActualHuesp.setForeground(new java.awt.Color(255, 255, 255));
        btnActualHuesp.setPreferredSize(new java.awt.Dimension(130, 30));
        btnActualHuesp.setText("ACTUALIZAR");
        btnActualHuesp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualHuespMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualHuespMouseExited(evt);
            }
        });
        pnlRegistroVisitantes.add(btnActualHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        btnElimHusped.setAlignment(java.awt.Label.CENTER);
        btnElimHusped.setBackground(new java.awt.Color(4, 153, 193));
        btnElimHusped.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElimHusped.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnElimHusped.setForeground(new java.awt.Color(255, 255, 255));
        btnElimHusped.setPreferredSize(new java.awt.Dimension(130, 30));
        btnElimHusped.setText("ELIMINAR");
        btnElimHusped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElimHuspedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElimHuspedMouseExited(evt);
            }
        });
        pnlRegistroVisitantes.add(btnElimHusped, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, -1, -1));

        lblValidCLI.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblValidCLI.setForeground(new java.awt.Color(0, 51, 255));
        lblValidCLI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlRegistroVisitantes.add(lblValidCLI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 60, 30));

        lblImgOkNoCLI.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlRegistroVisitantes.add(lblImgOkNoCLI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        pnlHead.setBackground(new java.awt.Color(4, 153, 193));
        pnlHead.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE HUESPEDES");

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

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlRegistroVisitantes.add(pnlHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));
        pnlRegistroVisitantes.add(txtRegistra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistroVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistroVisitantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumDocHuespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocHuespKeyReleased
      
        String res = BuscarDatosCli(txtNumDocHuesp.getText());

        if (txtNumDocHuesp.getText().equals("")) {

            lblValidCLI.setText("");
            RSScaleLabel.setScaleLabel(lblImgOkNoCLI, "");
            limpiarTodo();
            activarBtn();

        } else if (res.equals("si")) {

            lblValidCLI.setText("<html><center>Cliente <p> registrado");
            lblValidCLI.setForeground(Color.BLACK);
            RSScaleLabel.setScaleLabel(lblImgOkNoCLI, "src/img/ok.png");
            desactBtnGuar();

            txtID.setText(String.valueOf(cli.getId()));
            txtNomHusp.setText(cli.getNombre());
            txtApellHuesp.setText(cli.getApellido());
            cbxTipoDcto.setSelectedItem(cli.getTipo_doc());
            txtNumDocHuesp.setText(cli.getNum_doc());
            txtInstagHuesp.setText(cli.getInstagram());
            txtContactHuesp.setText(cli.getContacto());
            cbxPaises.setSelectedItem(cli.getPais());

        } else {

            lblValidCLI.setText("<html><center>Cliente sin <p>registrar");
            RSScaleLabel.setScaleLabel(lblImgOkNoCLI, "src/img/alert.gif");
            lblValidCLI.setForeground(new Color(0, 0, 0));
            limpiar();
            desactBtnActElim();
        }
    }//GEN-LAST:event_txtNumDocHuespKeyReleased

    private void txtNumDocHuespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocHuespKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (txtNumDocHuesp.getText().length() >= 16) {
            mensajeER = "<html><center>Has exedido el número<p> de caractéres permitido ¡¡¡";
            new Error(JDialog, true).setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_txtNumDocHuespKeyTyped

    private void txtApellHuespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellHuespKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE) {
            mensajeER = "<html><center>Este campo solo<p> acepta letras ¡¡¡";
            new Error(JDialog, true).setVisible(true);

            evt.consume();
        }
    }//GEN-LAST:event_txtApellHuespKeyTyped

    private void txtContactHuespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactHuespKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE) {
            mensajeER = "<html><center>Este campo solo<p> acepta números ¡¡¡";
            new Error(JDialog, true).setVisible(true);

            evt.consume();
        }
    }//GEN-LAST:event_txtContactHuespKeyTyped

    private void btnGuarHuespMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuarHuespMouseEntered
        btnGuarHuesp.setBackground(new Color(0, 204, 204));
        btnGuarHuesp.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGuarHuespMouseEntered

    private void btnGuarHuespMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuarHuespMouseExited
        btnGuarHuesp.setBackground(new Color(4, 153, 193));
        btnGuarHuesp.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuarHuespMouseExited

    private void txtNomHuspKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomHuspKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE) {

            mensajeER = "<html><center>Este campo solo<p> acepta letras ¡¡¡";
            new Error(JDialog, true).setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_txtNomHuspKeyTyped

    private void btnLimpHuspedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpHuspedMouseEntered
        btnLimpHusped.setBackground(new Color(0, 204, 204));
        btnLimpHusped.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLimpHuspedMouseEntered

    private void btnLimpHuspedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpHuspedMouseExited
        btnLimpHusped.setBackground(new Color(4, 153, 193));
        btnLimpHusped.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpHuspedMouseExited

    private void btnActualHuespMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualHuespMouseEntered
        btnActualHuesp.setBackground(new Color(0, 204, 204));
        btnActualHuesp.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnActualHuespMouseEntered

    private void btnActualHuespMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualHuespMouseExited
        btnActualHuesp.setBackground(new Color(4, 153, 193));
        btnActualHuesp.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnActualHuespMouseExited

    private void btnElimHuspedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimHuspedMouseEntered
        btnElimHusped.setBackground(new Color(0, 204, 204));
        btnElimHusped.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnElimHuspedMouseEntered

    private void btnElimHuspedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimHuspedMouseExited
        btnElimHusped.setBackground(new Color(4, 153, 193));
        btnElimHusped.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnElimHuspedMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/cerrar.png");
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
    }//GEN-LAST:event_btnSalirMouseExited

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
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmAClientes_J dialogI = new FrmAClientes_J(new javax.swing.JFrame(), true);
                dialogI.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialogI.setVisible(true);
            }
        });
    }

//******************************************************* TODOS LOS METODOS *******************************************************************
//*********************************************************************************************************************************************
//******************************************************* METODO MOSTRAR  *********************************************************************
    void mostrar() {
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
        txtRegistra.setVisible(false);
        txtID.setVisible(false);

    }

//*******************************************************************************************************************************************
    public void activarBtn() {

        btnGuarHuesp.setVisible(true);
        btnActualHuesp.setVisible(true);
        btnElimHusped.setVisible(true);
    }

//******************************************************* METODO LIMPIAR *********************************************************************
    public void limpiarTodo() {

        txtID.setText("");
        txtNomHusp.setText("");
        txtApellHuesp.setText("");
        cbxTipoDcto.setSelectedIndex(0);
        txtNumDocHuesp.setText("");
        txtInstagHuesp.setText("");
        txtContactHuesp.setText("");
        cbxPaises.setSelectedIndex(0);
        txtNumDocHuesp.requestFocus();

    }

//**************************************************** DATOS LIMPIAR*****************************************************************************
    public void limpiar() {

        txtID.setText("");
        txtNomHusp.setText("");
        txtApellHuesp.setText("");
        cbxTipoDcto.setSelectedIndex(0);
        txtInstagHuesp.setText("");
        txtContactHuesp.setText("");
        cbxPaises.setSelectedIndex(0);
        txtNumDocHuesp.requestFocus();

    }
   

//**************************************************BUSCAR CLIENTE*****************************************************************************
    public String BuscarDatosCli(String iden) {

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

//************************************************** BUSCAR IDENTIFICACION **********************************************************************
    public String BuscarIdentif(String iden) {

        try {

            conectar conn = new conectar();
            Connection con = conn.getConnection();

            String sql = "SELECT nombre,id FROM clientes WHERE num_doc = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, iden);

            rs = ps.executeQuery();
            if (rs.next()) {

                cli.setId(rs.getInt("id"));
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

//*****************************************************************************************************************************************
    public void desactBtnActElim() {

        btnActualHuesp.setVisible(false);
        btnElimHusped.setVisible(false);
        btnGuarHuesp.setVisible(true);
    }

//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    
    void cbxPers() {
        //Le damos las propiedadesCBX de la clase a los cbx

        cbxPaises.setUI(propiedadesCBX.createUI(rootPane));
        cbxTipoDcto.setUI(propiedadesCBX.createUI(rootPane));

    }

//************************************************************************************************************************************
    public void desactBtnGuar() {

        btnGuarHuesp.setVisible(false);
        btnActualHuesp.setVisible(true);
        btnElimHusped.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnActualHuesp;
    public java.awt.Label btnElimHusped;
    public java.awt.Label btnGuarHuesp;
    public java.awt.Label btnLimpHusped;
    public javax.swing.JLabel btnSalir;
    public javax.swing.JComboBox<String> cbxPaises;
    public javax.swing.JComboBox<String> cbxTipoDcto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel lblImgOkNoCLI;
    public javax.swing.JLabel lblValidCLI;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlRegistroVisitantes;
    public javax.swing.JTextField txtApellHuesp;
    public javax.swing.JTextField txtContactHuesp;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtInstagHuesp;
    public javax.swing.JTextField txtNomHusp;
    public javax.swing.JTextField txtNumDocHuesp;
    public javax.swing.JTextField txtRegistra;
    // End of variables declaration//GEN-END:variables
}
