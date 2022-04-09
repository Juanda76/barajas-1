package vistas;

//@author Software_Max M_O
import static controlador.ctrlHotel_J.mensajeER;
import static consultas.consUsuario_M.nom;
import modelo.ingresos_M;
import consultas.consIngresos_M;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import consultas.consHotel_J;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;

public final class FrmGastos_M extends javax.swing.JFrame {

    Frame JInternalFrame;
    consIngresos_M conIngr = new consIngresos_M();
    ingresos_M ing = new ingresos_M();

    public FrmGastos_M() {
        initComponents();
        mostrarDatosHot();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlFondoRegIng = new javax.swing.JPanel();
        pnlFormularioHotel = new javax.swing.JPanel();
        btnLimpiarG = new java.awt.Label();
        btnAgregarG = new java.awt.Label();
        jSeparator6 = new javax.swing.JSeparator();
        txtFechaG = new javax.swing.JTextField();
        txtConceptoG = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblFechaa = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblConcepto = new javax.swing.JLabel();
        txtValorG = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnListarG = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaGastos = new rojerusan.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();
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

        pnlFormularioHotel.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormularioHotel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "LISTAR GASTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        pnlFormularioHotel.setLayout(null);

        btnLimpiarG.setAlignment(java.awt.Label.CENTER);
        btnLimpiarG.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiarG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiarG.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiarG.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarG.setPreferredSize(new java.awt.Dimension(130, 30));
        btnLimpiarG.setText("LIMPIAR");
        btnLimpiarG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarGMouseExited(evt);
            }
        });
        pnlFormularioHotel.add(btnLimpiarG);
        btnLimpiarG.setBounds(100, 540, 130, 30);

        btnAgregarG.setAlignment(java.awt.Label.CENTER);
        btnAgregarG.setBackground(new java.awt.Color(4, 153, 193));
        btnAgregarG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarG.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnAgregarG.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarG.setPreferredSize(new java.awt.Dimension(130, 30));
        btnAgregarG.setText("AGREGAR");
        btnAgregarG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarGMouseExited(evt);
            }
        });
        pnlFormularioHotel.add(btnAgregarG);
        btnAgregarG.setBounds(360, 540, 130, 30);

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormularioHotel.add(jSeparator6);
        jSeparator6.setBounds(190, 180, 220, 10);

        txtFechaG.setEditable(false);
        txtFechaG.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaG.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtFechaG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaG.setBorder(null);
        pnlFormularioHotel.add(txtFechaG);
        txtFechaG.setBounds(190, 150, 220, 30);

        txtConceptoG.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtConceptoG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConceptoG.setBorder(null);
        txtConceptoG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConceptoGKeyTyped(evt);
            }
        });
        pnlFormularioHotel.add(txtConceptoG);
        txtConceptoG.setBounds(190, 260, 220, 30);

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormularioHotel.add(jSeparator8);
        jSeparator8.setBounds(190, 290, 220, 10);

        lblFechaa.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblFechaa.setForeground(new java.awt.Color(4, 153, 193));
        lblFechaa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaa.setText("FECHA:");
        pnlFormularioHotel.add(lblFechaa);
        lblFechaa.setBounds(230, 110, 150, 30);

        lblValor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblValor.setForeground(new java.awt.Color(4, 153, 193));
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("VALOR");
        pnlFormularioHotel.add(lblValor);
        lblValor.setBounds(230, 340, 150, 30);

        lblConcepto.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblConcepto.setForeground(new java.awt.Color(4, 153, 193));
        lblConcepto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConcepto.setText("CONCEPTO");
        pnlFormularioHotel.add(lblConcepto);
        lblConcepto.setBounds(230, 220, 150, 30);

        txtValorG.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtValorG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorG.setText("0");
        txtValorG.setBorder(null);
        txtValorG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorGFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorGFocusLost(evt);
            }
        });
        txtValorG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorGKeyTyped(evt);
            }
        });
        pnlFormularioHotel.add(txtValorG);
        txtValorG.setBounds(190, 380, 220, 30);

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(4, 153, 193)));
        pnlFormularioHotel.add(jSeparator9);
        jSeparator9.setBounds(190, 410, 220, 10);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "LISTAR GASTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N

        btnListarG.setAlignment(java.awt.Label.CENTER);
        btnListarG.setBackground(new java.awt.Color(4, 153, 193));
        btnListarG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnListarG.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnListarG.setForeground(new java.awt.Color(255, 255, 255));
        btnListarG.setPreferredSize(new java.awt.Dimension(130, 30));
        btnListarG.setText("LISTAR");
        btnListarG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarGMouseExited(evt);
            }
        });

        tblListaGastos.setBackground(new java.awt.Color(4, 153, 193));
        tblListaGastos.setForeground(new java.awt.Color(255, 255, 255));
        tblListaGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "CONCEPTO", "VALOR", "REGISTRA"
            }
        ));
        tblListaGastos.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblListaGastos.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblListaGastos.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblListaGastos.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblListaGastos.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblListaGastos.setFuenteFilas(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblListaGastos.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblListaGastos.setFuenteHead(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tblListaGastos.setMultipleSeleccion(false);
        tblListaGastos.setPreferredSize(new java.awt.Dimension(695, 271));
        tblListaGastos.setSelectionBackground(new java.awt.Color(13, 41, 66));
        jScrollPane1.setViewportView(tblListaGastos);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 153, 193));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><center>EN LA TABLA SE MUESTRA LOS GASTOS REGISTRADOS EL DIA DE HOY,<p><br> SI DESEA EL REPORTE DE UNA FECHA EN ESPECIFICO <p><br> DIRIJASE AL 'PANEL DE REPORTES'");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(btnListarG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListarG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout pnlFondoRegIngLayout = new javax.swing.GroupLayout(pnlFondoRegIng);
        pnlFondoRegIng.setLayout(pnlFondoRegIngLayout);
        pnlFondoRegIngLayout.setHorizontalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormularioHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondoRegIngLayout.setVerticalGroup(
            pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoRegIngLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoRegIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFormularioHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(pnlDatos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondoRegIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnListarGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarGMouseExited
        btnListarG.setBackground(new Color(4, 153, 193));
        btnListarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnListarGMouseExited

    private void btnListarGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarGMouseEntered
        btnListarG.setBackground(new Color(0, 204, 204));
        btnListarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnListarGMouseEntered

    private void txtValorGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorGKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            mensajeER = "<html><center>Este campo solo acepta numeros ¡¡¡";
            new alertas.Error(JInternalFrame, true).setVisible(true);
            evt.consume();
        } else if (txtValorG.getText().length() >= 8) {
            mensajeER = "<html><center>Este campo solo acepta numeros ¡¡¡";
            new alertas.Error(JInternalFrame, true).setVisible(true);
        }
    }//GEN-LAST:event_txtValorGKeyTyped

    private void txtValorGFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorGFocusGained
        txtValorG.setText("");
    }//GEN-LAST:event_txtValorGFocusGained

    private void txtConceptoGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConceptoGKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtConceptoGKeyTyped

    private void btnAgregarGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarGMouseExited
        btnAgregarG.setBackground(new Color(4, 153, 193));
        btnAgregarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarGMouseExited

    private void btnAgregarGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarGMouseEntered
        btnAgregarG.setBackground(new Color(0, 204, 204));
        btnAgregarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarGMouseEntered

    private void btnLimpiarGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarGMouseExited
        btnLimpiarG.setBackground(new Color(4, 153, 193));
        btnLimpiarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarGMouseExited

    private void btnLimpiarGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarGMouseEntered
        btnLimpiarG.setBackground(new Color(0, 204, 204));
        btnLimpiarG.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarGMouseEntered

    private void txtValorGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorGFocusLost
        if (txtValorG.getText().equals("")) {
            txtValorG.setText("0");
        }
    }//GEN-LAST:event_txtValorGFocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmGastos_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGastos_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGastos_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGastos_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        ingresos ing = new ingresos();
//        consultasIngresos conIng = new consultasIngresos();
//        FrmIngresos frmIng = new FrmIngresos();
//        ctrlIngresos ctrlIng = new ctrlIngresos(ing, conIng, frmIng);
//        frmIng.setVisible(true);
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
        //hasta aca son datos del hotel
        //**************************************************************
        //FECHA DEL SISTEMA
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        txtFechaG.setText(formato.format(sistFecha));
        txtConceptoG.requestFocus();
        RSScaleLabel.setScaleLabel(lblCara, "src/img/hotel.png");
        RSScaleLabel.setScaleLabel(btnSalir, "src/img/x.png");
        RSScaleLabel.setScaleLabel(lblSotMax, "src/img/log.jpeg");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnAgregarG;
    public java.awt.Label btnLimpiarG;
    public java.awt.Label btnListarG;
    public javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCara;
    private javax.swing.JLabel lblConcepto;
    public javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaa;
    public javax.swing.JLabel lblHola;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomUser;
    public javax.swing.JLabel lblSotMax;
    private javax.swing.JLabel lblValor;
    public javax.swing.JLabel lblsaludo6;
    public javax.swing.JLabel lblsaludo9;
    private javax.swing.JPanel pnlDatos2;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoRegIng;
    private javax.swing.JPanel pnlFormularioHotel;
    public static rojerusan.RSTableMetro tblListaGastos;
    public javax.swing.JTextField txtConceptoG;
    public javax.swing.JTextField txtFechaG;
    public javax.swing.JTextField txtValorG;
    // End of variables declaration//GEN-END:variables
}
