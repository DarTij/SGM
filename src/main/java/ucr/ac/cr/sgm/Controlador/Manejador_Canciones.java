/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sgm.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ucr.ac.cr.sgm.Modelo.Cancion;
import ucr.ac.cr.sgm.Modelo.RegistroCancion;
import ucr.ac.cr.sgm.Vista.FRM_Canciones;
import ucr.ac.cr.sgm.Vista.FRM_Reporte;
import ucr.ac.cr.sgm.Vista.PanelDatosCancion;

/**
 *
 * @author Estudiante
 */
public class Manejador_Canciones implements ActionListener, MouseListener {
    
    private RegistroCancion registroC;
    private FRM_Canciones frmCanciones;
    private PanelDatosCancion panelDatos;
    private Cancion cancion;
    private FRM_Reporte frm_Reporte;
//---------------------------------------------------------------------------------------------------------------------//
    
    public Manejador_Canciones(){
        this.frmCanciones=new FRM_Canciones();
        this.frmCanciones.escuchadorMain(this);
        this.registroC= new RegistroCancion();
        this.panelDatos=this.frmCanciones.getPanelDatosCancion();
        this.frmCanciones.setVisible(true);
        this.panelDatos.cargarCombo(this.registroC.getComboTitulo());
    }//Fin del constructor
//---------------------------------------------------------------------------------------------------------------------//
    
    
    
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()) {
            case "Agregar":
                this.cancion=this.panelDatos.getCancion();
                if(this.validarCampos(cancion)){
                    FRM_Canciones.getMensaje(this.registroC.agregarCancion(cancion));
                    this.panelDatos.cargarCombo(this.registroC.getComboTitulo());
                    panelDatos.limpiar();
                }
            break;
            
            case "Editar":
                this.cancion=this.panelDatos.getCancion();
                FRM_Canciones.getMensaje(this.registroC.editar(cancion));
                this.panelDatos.cargarCombo(this.registroC.getComboTitulo());
                panelDatos.limpiar();
            break;
            
            case "Eliminar":
                FRM_Canciones.getMensaje(this.registroC.borrarCancion(this.cancion));
                this.panelDatos.limpiar();
                this.panelDatos.cargarCombo(this.registroC.getComboTitulo());
            break;
            
            case "ComboTitulos":
                this.cancion=null;
                this.cancion=this.registroC.buscarCancion(this.panelDatos.devolverCombo());
                this.panelDatos.setCancion(cancion);
            break;
            
            case "Reporte":
                frm_Reporte=new FRM_Reporte();
                frm_Reporte.listenMouse(this);
                frm_Reporte.setDataTable(this.registroC.getMatrizCanciones(),Cancion.Titulos_CANCION);
                frm_Reporte.setVisible(true);
            break;
            
            case "Salir":
                this.frmCanciones.dispose();
            break;
        }//Fin del switch
        
    }//Fin actionPerformed
    
    public boolean validarCampos(Cancion cancion){
        if(cancion.getTitulo().isEmpty()){
            FRM_Canciones.getMensaje("El campo del título se encuentra vacío");
            return false;
        }else if(cancion.getGenero().isEmpty()) {
            FRM_Canciones.getMensaje("El campo del género se encuentra vacío");
            return false;
        } else if(cancion.getDuracion()==0){
            FRM_Canciones.getMensaje("El campo de la duración se encuentra vacío");
            return false;
        }else if(cancion.getAnnoLanzamiento()==0){
            FRM_Canciones.getMensaje("El campo del año de lanzamiento se encuentra vacío");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Cancion cancionSelected = new Cancion();
        cancion.setTitulo(this.frm_Reporte.getRow()[0]);
        cancion.setGenero(this.frm_Reporte.getRow()[1]);
        cancion.setDuracion(Integer.parseInt(this.frm_Reporte.getRow()[2]));
        cancion.setAnnoLanzamiento(Integer.parseInt(this.frm_Reporte.getRow()[3]));
        this.panelDatos.setCancion(cancion);
        this.frm_Reporte.dispose();
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
    
    
    
}//Fin de clase
