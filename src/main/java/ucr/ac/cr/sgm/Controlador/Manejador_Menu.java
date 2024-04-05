/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sgm.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.sgm.Modelo.RegistroCancion;
import ucr.ac.cr.sgm.Vista.Album.FRM_Album;
import ucr.ac.cr.sgm.Vista.FRM_Menu;

/**
 *
 * @author daryl
 */
public class Manejador_Menu implements ActionListener{
    
    private RegistroCancion registroC;
    private Manejador_Canciones manejadorC;
    private Manejador_Albumes manejadorA;
    private FRM_Menu frmMenu;
    
    public Manejador_Menu(){
        this.registroC=new RegistroCancion();
        this.frmMenu=new FRM_Menu();
        this.frmMenu.escuchar(this);
        this.frmMenu.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Registrar Canciones":
                this.manejadorC = new Manejador_Canciones(this.registroC);
            break;
            case "Registrar Albumes":
                this.manejadorA = new Manejador_Albumes(this.registroC);
            break;
            case "Salir":
                System.exit(0);
            break;
            
        }
    }
    
}
