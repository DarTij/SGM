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
        this.panelDatos.cargarCombo(this.registroC.getComboId());
    }//Fin del constructor
//---------------------------------------------------------------------------------------------------------------------//
    
    
    
    public void actionPerformed(ActionEvent e) {
        
    }//Fin actionPerformed
    
}//Fin de clase
