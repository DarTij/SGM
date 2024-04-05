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
import ucr.ac.cr.sgm.Vista.Album.FRM_Album;

/**
 *
 * @author daryl
 */
public class Manejador_Albumes implements ActionListener, MouseListener{
    
    private FRM_Album frmAlbum;
    private RegistroCancion registroC;
    
    public Manejador_Albumes(RegistroCancion registroC){
        this.frmAlbum=new FRM_Album();
        this.registroC=registroC;
        this.frmAlbum.setTblCancionesRegistradas(this.registroC.getMatrizCanciones());
        this.frmAlbum.escucharMouse(this);
        this.frmAlbum.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Cancion cancionSelected = new Cancion();
        cancionSelected.setTitulo(this.frmAlbum.getRow()[0]);
        cancionSelected.setGenero(this.frmAlbum.getRow()[1]);
        cancionSelected.setDuracion(Integer.parseInt(this.frmAlbum.getRow()[2]));
        cancionSelected.setAnnoLanzamiento(Integer.parseInt(this.frmAlbum.getRow()[3]));
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
