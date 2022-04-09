package controlador;

// @author Software_Max M_O
import alertas.Exito;
import consultas.consCliente_J;
import consultas.consTours_J;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Frame;
import modelo.tours_J;
import vistas.FrmATours_J;
import static controlador.ctrlHotel_J.mensajeER;
import static controlador.ctrlHotel_J.mensajeExit;
import modelo.cliente_J;
import rsscalelabel.RSScaleLabel;
import vistas.FrmAClientes_J;

public class ctrlTours_J implements MouseListener {

    Frame JInternalFrame;
    private final tours_J modTrs;
    private final consTours_J consTrs;
    private final FrmATours_J frmTrs;

    public ctrlTours_J(tours_J modTrs, consTours_J consTrs, FrmATours_J frmTrs) {

        this.modTrs = modTrs;
        this.consTrs = consTrs;
        this.frmTrs = frmTrs;
        
        this.frmTrs.btnGuardarTours.addMouseListener(this);
        this.frmTrs.btnRegResp.addMouseListener(this);
        this.frmTrs.btnLimpiarTours.addMouseListener(this);
        this.frmTrs.btnSalir.addMouseListener(this);
        this.frmTrs.lblImgOkNoRESP.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == frmTrs.btnGuardarTours) {
        resBtnAg();

            modTrs.setNumdoc(frmTrs.txtNumIdent.getText());
            modTrs.setNombre(frmTrs.lblNomResponsable.getText());
            modTrs.setValor(Integer.parseInt(frmTrs.txtValor.getText()));
            
            if(frmTrs.chbxCascadas.isSelected()){
                modTrs.setCascadas("SI");
            }else{
                modTrs.setCascadas("NO");  
            }
            
            if(frmTrs.chbxLamiel.isSelected()){
                modTrs.setMiel("SI");
            }else{
                modTrs.setMiel("NO");  
            }
            
            if(frmTrs.chbxDelamor.isSelected()){
                modTrs.setAmor("SI");
            }else{
                modTrs.setAmor("NO");  
            }
            
            if(frmTrs.chbxDecafe.isSelected()){
                modTrs.setCafe("SI");
            }else{
                modTrs.setCafe("NO");  
            }
            
            if(frmTrs.chbxEsplandor.isSelected()){
                modTrs.setEsplandor("SI");
            }else{
                modTrs.setEsplandor("NO");  
            }
            
            if(frmTrs.chbxCabalgata.isSelected()){
                modTrs.setCabalgata("SI");
            }else{
                modTrs.setCabalgata("NO");  
            }
            
            if(frmTrs.chbxPanoramico.isSelected()){
                modTrs.setPanoramico("SI");
            }else{
                modTrs.setPanoramico("NO");  
            }
           
            modTrs.setFecha(frmTrs.txtFecha.getText());
            modTrs.setRegistra(frmTrs.txtRegistra.getText());

            if (frmTrs.txtNumIdent.getText().equals("") || frmTrs.txtValor.getText().equals("0")) {
                
                mensajeER = "<html><center>Todos los campos deben tener <p>informacion, verifique e intente de nuevo ¡¡¡";
                new alertas.Error(JInternalFrame, true).setVisible(true);
                
            } else if (consTrs.guardarTours(modTrs)) {
                
                limpiar();
                mensajeExit = "<html><center>El tours ha sido <p> guardado con exito ¡¡¡";
                new Exito(JInternalFrame, true).setVisible(true);
                frmTrs.dispose();
                
            } else {
                mensajeER = "<html><center>Hubo un error al <p> registrar el tours ¡¡¡";
                new alertas.Error(JInternalFrame, true).setVisible(true);
                limpiar();
            }

        }
        
//************************************************************************************************************************************
        if (e.getSource() == frmTrs.btnLimpiarTours) {
            resBtnLim();
            limpiar();
        }
        
//************************************************************************************************************************************
         if (e.getSource() == frmTrs.lblImgOkNoRESP) {
             
            modTrs.setNumdoc(frmTrs.txtNumIdent.getText());
            
            if (consTrs.BuscaCliNuevo(modTrs)) {
                
                frmTrs.lblNomResponsable.setText(modTrs.getNombre());
                frmTrs.lblImgOkNoRESP.setIcon(null);

            }
        }
//************************************************************************************************************************************
         if (e.getSource() == frmTrs.btnRegResp) {
             
            modTrs.setNumdoc(frmTrs.txtNumIdent.getText());
            modTrs.setRegistra(frmTrs.txtRegistra.getText());
            String docRe = modTrs.getNumdoc();
            String nomReg = modTrs.getRegistra();
            
            cliente_J modCli = new cliente_J();
            consCliente_J consCli = new consCliente_J();
            FrmAClientes_J frmCli = new FrmAClientes_J(JInternalFrame, true);
            ctrlCliente_J ctrCli = new ctrlCliente_J(modCli, consCli, frmCli);
            
            frmCli.txtNumDocHuesp.setText(docRe);
            frmCli.txtRegistra.setText(nomReg);
            frmCli.btnActualHuesp.setVisible(false);
            frmCli.btnElimHusped.setVisible(false);
            frmCli.setVisible(true);
            
            RSScaleLabel.setScaleLabel(frmTrs.lblImgOkNoRESP, "src/img/recarga.png");
            frmTrs.lblValidRESP.setText("");
            frmTrs.btnRegResp.setVisible(false);
        }

//************************************************************************************************************************************
        if (e.getSource() == frmTrs.btnSalir) {
            limpiar();
           frmTrs.dispose();
        }
    }

//************************************************************************************************************************************
    public void limpiar() {

        frmTrs.txtNumIdent.setText("");
        frmTrs.txtValor.setText("0");
        frmTrs.chbxCabalgata.setSelected(false);
        frmTrs.chbxCascadas.setSelected(false);
        frmTrs.chbxDecafe.setSelected(false);
        frmTrs.chbxDelamor.setSelected(false);
        frmTrs.chbxEsplandor.setSelected(false);
        frmTrs.chbxLamiel.setSelected(false);
        frmTrs.chbxPanoramico.setSelected(false);
        frmTrs.txtNumIdent.requestFocus();
    }

//************************************************************************************************************************************
    void resBtnAg() {
        frmTrs.btnGuardarTours.setBackground(new Color(4, 153, 193));
        frmTrs.btnGuardarTours.setForeground(new Color(255, 255, 255));
    }

//************************************************************************************************************************************
    void resBtnLim() {
        frmTrs.btnLimpiarTours.setBackground(new Color(4, 153, 193));
        frmTrs.btnLimpiarTours.setForeground(new Color(255, 255, 255));
    }

   

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
