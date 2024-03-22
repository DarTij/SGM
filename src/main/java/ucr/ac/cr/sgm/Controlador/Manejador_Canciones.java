/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sgm.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.sgm.Modelo.Cancion;
import ucr.ac.cr.sgm.Modelo.RegistroCancion;
import ucr.ac.cr.sgm.Vista.FRM_Canciones;
import ucr.ac.cr.sgm.Vista.PanelDatosCancion;

/**
 *
 * @author Estudiante
 */
public class Manejador_Canciones implements ActionListener {
    
    private RegistroCancion registroC;
    private FRM_Canciones frmCanciones;
    private PanelDatosCancion panelDatos;
    private Cancion cancion;
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
            
            case "Salir":
                System.exit(0);
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
    
}//Fin de clase
