package vistas;

//@author Software_Max M_O
import clases.conectar;
import consultas.consHotel_J;
import java.awt.Color;
import java.awt.Frame;
import modelo.hotel_J;
import rsscalelabel.RSScaleLabel;
import static consultas.consUsuario_M.nom;
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

public final class FrmRepClientes extends javax.swing.JFrame {

    Frame JInternalFrame;
    DefaultTableModel modelo = new DefaultTableModel();

    public FrmRepClientes() {

        initComponents();
        mostrarDatosHot();

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupClientes = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
        pnlFondoRegIng = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnBuscar = new java.awt.Label();
        btnGenRepCliTodos = new java.awt.Label();
        txtNumDoc = new javax.swing.JTextField();
        lblNumDoc = new javax.swing.JLabel();
        btnLimpiar = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepClientes = new rojerusan.RSTableMetro();
        rbtPorDoc = new javax.swing.JRadioButton();
        rbtTodos = new javax.swing.JRadioButton();
        btnGenRepCliDoc = new java.awt.Label();
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "REPORTE CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(4, 153, 193))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setAlignment(java.awt.Label.CENTER);
        btnBuscar.setBackground(new java.awt.Color(4, 153, 193));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 110, -1));

        btnGenRepCliTodos.setAlignment(java.awt.Label.CENTER);
        btnGenRepCliTodos.setBackground(new java.awt.Color(4, 153, 193));
        btnGenRepCliTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenRepCliTodos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenRepCliTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnGenRepCliTodos.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGenRepCliTodos.setText("GENERAR REPORTE");
        btnGenRepCliTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenRepCliTodosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenRepCliTodosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenRepCliTodosMouseExited(evt);
            }
        });
        jPanel4.add(btnGenRepCliTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        txtNumDoc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNumDoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 150, 30));

        lblNumDoc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNumDoc.setForeground(new java.awt.Color(4, 153, 193));
        lblNumDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumDoc.setText("N° DOCUMENTO:");
        jPanel4.add(lblNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 140, 30));

        btnLimpiar.setAlignment(java.awt.Label.CENTER);
        btnLimpiar.setBackground(new java.awt.Color(4, 153, 193));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 110, -1));

        tblRepClientes.setBackground(new java.awt.Color(4, 153, 193));
        tblRepClientes.setForeground(new java.awt.Color(255, 255, 255));
        tblRepClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "TIPO-DOC", "NUM-DOC", "CONTACTO", "NACIONALIDAD", "RESPONSABLE"
            }
        ));
        tblRepClientes.setColorBackgoundHead(new java.awt.Color(4, 153, 193));
        tblRepClientes.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblRepClientes.setColorFilasForeground1(new java.awt.Color(0, 51, 255));
        tblRepClientes.setColorFilasForeground2(new java.awt.Color(0, 51, 255));
        tblRepClientes.setColorSelBackgound(new java.awt.Color(0, 0, 204));
        tblRepClientes.setFuenteFilas(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblRepClientes.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblRepClientes.setFuenteHead(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tblRepClientes.setMultipleSeleccion(false);
        tblRepClientes.setPreferredSize(new java.awt.Dimension(695, 271));
        tblRepClientes.setSelectionBackground(new java.awt.Color(13, 41, 66));
        jScrollPane1.setViewportView(tblRepClientes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, 1270, 320));

        rbtPorDoc.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupClientes.add(rbtPorDoc);
        rbtPorDoc.setForeground(new java.awt.Color(4, 153, 193));
        rbtPorDoc.setText("POR DOCUMENTO");
        rbtPorDoc.setPreferredSize(new java.awt.Dimension(120, 30));
        rbtPorDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPorDocActionPerformed(evt);
            }
        });
        jPanel4.add(rbtPorDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 150, -1));

        rbtTodos.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupClientes.add(rbtTodos);
        rbtTodos.setForeground(new java.awt.Color(4, 153, 193));
        rbtTodos.setText("TODOS");
        rbtTodos.setPreferredSize(new java.awt.Dimension(120, 30));
        rbtTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTodosActionPerformed(evt);
            }
        });
        jPanel4.add(rbtTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 150, -1));

        btnGenRepCliDoc.setAlignment(java.awt.Label.CENTER);
        btnGenRepCliDoc.setBackground(new java.awt.Color(4, 153, 193));
        btnGenRepCliDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenRepCliDoc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenRepCliDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnGenRepCliDoc.setPreferredSize(new java.awt.Dimension(250, 40));
        btnGenRepCliDoc.setText("GENERAR REPORTE");
        btnGenRepCliDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenRepCliDocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenRepCliDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenRepCliDocMouseExited(evt);
            }
        });
        jPanel4.add(btnGenRepCliDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

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

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(4, 153, 193));
        btnBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(0, 204, 204));
        btnBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnGenRepCliTodosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepCliTodosMouseEntered
        btnGenRepCliTodos.setBackground(new Color(0, 204, 204));
        btnGenRepCliTodos.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepCliTodosMouseEntered

    private void btnGenRepCliTodosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepCliTodosMouseExited
        btnGenRepCliTodos.setBackground(new Color(4, 153, 193));
        btnGenRepCliTodos.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepCliTodosMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        if (rbtTodos.isSelected()) {
            listarCliTodos();
        } else {
            String numDoc = txtNumDoc.getText();
            listarCliDoc(numDoc);
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0, 204, 204));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(4, 153, 193));
        btnLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnGenRepCliTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepCliTodosMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporte;
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/RClientesTodo.jasper"));
//            Map parametro = new HashMap();
//            parametro.put("variableDelJasperreport", txtNumDoc.getText());
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

//OJO FALTA CREAR EL REPORTE
    }//GEN-LAST:event_btnGenRepCliTodosMouseClicked

    private void rbtPorDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPorDocActionPerformed
        txtNumDoc.setVisible(true);
        lblNumDoc.setVisible(true);
        btnGenRepCliDoc.setVisible(true);
        btnGenRepCliTodos.setVisible(false);
    }//GEN-LAST:event_rbtPorDocActionPerformed

    private void rbtTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTodosActionPerformed
        txtNumDoc.setVisible(false);
        lblNumDoc.setVisible(false);
        btnGenRepCliDoc.setVisible(false);
        btnGenRepCliTodos.setVisible(true);
    }//GEN-LAST:event_rbtTodosActionPerformed

    private void btnGenRepCliDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepCliDocMouseClicked
        try {
            conectar conn = new conectar();
            Connection con = conn.getConnection();
            JasperReport reporteDoc;
            reporteDoc = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/RClientes.jasper"));
            Map parametro = new HashMap();
            parametro.put("cc", txtNumDoc.getText());
            JasperPrint imprimir = JasperFillManager.fillReport(reporteDoc, parametro, con);
            JasperViewer ver = new JasperViewer(imprimir, false);
            ver.setVisible(true);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnGenRepCliDocMouseClicked

    private void btnGenRepCliDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepCliDocMouseEntered
        btnGenRepCliDoc.setBackground(new Color(0, 204, 204));
        btnGenRepCliDoc.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepCliDocMouseEntered

    private void btnGenRepCliDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenRepCliDocMouseExited
        btnGenRepCliDoc.setBackground(new Color(4, 153, 193));
        btnGenRepCliDoc.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenRepCliDocMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FrmRepClientes ing = new FrmRepClientes();
        ing.setVisible(true);
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
        txtNumDoc.setVisible(false);
        lblNumDoc.setVisible(false);
        btnGenRepCliDoc.setVisible(false);
        btnGenRepCliTodos.setVisible(false);

    }

    //********************************************************BTN GUARDAR*****************************************************************************
    public void listarCliDoc(String val1) {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"NOMBRE", "APELLIDO", "TIPO-DOC", "NUM-DOC", "CONTACTO", "NACIONALIDAD", "RESPONSABLE"};

        modelo.setColumnIdentifiers(Titulos);
        tblRepClientes.setModel(modelo);

        try {

            String ConsultaSQL = "CALL VER_CLIENTES_DOC('" + val1 + "')";

            String[] registros = new String[7];

            Statement st = con.createStatement();
            rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombre");
                registros[1] = rs.getString("apellido");
                registros[2] = rs.getString("tipo_doc");
                registros[3] = rs.getString("num_doc");
                registros[4] = rs.getString("contacto");
                registros[5] = rs.getString("pais");
                registros[6] = rs.getString("registra");
                modelo.addRow(registros);

            }
            tblRepClientes.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //********************************************************BTN GUARDAR*****************************************************************************
    public void listarCliTodos() {
        ResultSet rs;
        conectar conn = new conectar();
        Connection con = conn.getConnection();

        String[] Titulos = {"NOMBRE", "APELLIDO", "TIPO-DOC", "NUM-DOC", "CONTACTO", "NACIONALIDAD", "RESPONSABLE"};

        modelo.setColumnIdentifiers(Titulos);
        tblRepClientes.setModel(modelo);

        try {

            String ConsultaSQL = "CALL VER_CLIENTES_TODOS()";

            String[] registros = new String[7];

            Statement st = con.createStatement();
            rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombre");
                registros[1] = rs.getString("apellido");
                registros[2] = rs.getString("tipo_doc");
                registros[3] = rs.getString("num_doc");
                registros[4] = rs.getString("contacto");
                registros[5] = rs.getString("pais");
                registros[6] = rs.getString("registra");
                modelo.addRow(registros);

            }
            tblRepClientes.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(FrmRepIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//************************************* LIMPIAR TABLA ************************************************************************
    private void limpiarTabla() {
        for (int i = 0; i < tblRepClientes.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

//************************************* LIMPIAR TODO ************************************************************************
    private void limpiar() {
        txtNumDoc.setText("");
        limpiarTabla();
        btnGrupClientes.clearSelection();
        txtNumDoc.setVisible(false);
        lblNumDoc.setVisible(false);
        btnGenRepCliDoc.setVisible(false);
        btnGenRepCliTodos.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Label btnBuscar;
    public java.awt.Label btnGenRepCliDoc;
    public java.awt.Label btnGenRepCliTodos;
    private javax.swing.ButtonGroup btnGrupClientes;
    public java.awt.Label btnLimpiar;
    public javax.swing.JLabel btnSalir;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCara;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHola;
    public javax.swing.JLabel lblLocalizacion;
    public javax.swing.JLabel lblNomHotel;
    public javax.swing.JLabel lblNomUser;
    private javax.swing.JLabel lblNumDoc;
    public javax.swing.JLabel lblSotMax;
    public javax.swing.JLabel lblsaludo6;
    public javax.swing.JLabel lblsaludo9;
    private javax.swing.JPanel pnlDatos2;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoRegIng;
    private javax.swing.JRadioButton rbtPorDoc;
    private javax.swing.JRadioButton rbtTodos;
    public static rojerusan.RSTableMetro tblRepClientes;
    private javax.swing.JTextField txtNumDoc;
    // End of variables declaration//GEN-END:variables
}
