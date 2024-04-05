/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sgm.Modelo;

import java.util.ArrayList;

/**
 *
 * @author daryl
 */
public class RegistroArtista {
    Artista artista;
    ArrayList<Artista> listaArtistas;
    String mensaje;
    
    public RegistroArtista(){
        this.listaArtistas= new ArrayList<>();
        this.mensaje="";
    }//Fin constructor
    
    public String agregarArtista(Artista artista){
        if(artista!=null){
            if(buscarArtista(artista.getNombre())==null){
                this.listaArtistas.add(artista);
                mensaje= "Se ha agregado el artista correctamente";
            }else{
                mensaje= "Ya existe el artista";
            }
        }
        return mensaje;
    }
    
    public Artista buscarArtista(String nombre){
        for (Artista miArtista : listaArtistas) {
            if(miArtista.getNombre().equalsIgnoreCase(nombre)){
                return miArtista;
            }
        }
        return null;
    }
    
    public String borrarArtista(Artista artista){
        if(buscarArtista(artista.getNombre())!=null){
            this.listaArtistas.remove(artista);
            mensaje="Se ha borrado el artista correctamente";
        }else{
            mensaje="No se ha encontrado al artista";
        }
        return mensaje;
    }
    
    public String editarArtista(Artista artista){
        if(buscarArtista(artista.getNombre())==null){
            for (int i = 0; i < listaArtistas.size(); i++) {
                if(this.listaArtistas.get(i).getNombre().equalsIgnoreCase(artista.getNombre())){
                    this.listaArtistas.set(i,artista);
                    mensaje="Se ha editado correctamente";
                }
            }
        }else{
            mensaje="No se ha encontrado al artista";
        }
        return mensaje;
    }
    
    public String[][] getMatrizArtistas(){
        String[][] matrizArtistas=new String[this.listaArtistas.size()][Artista.Nombres_ARTISTAS.length];
        for (int i = 0; i < matrizArtistas.length; i++) {
            for (int j = 0; j < matrizArtistas[0].length; j++) {
                matrizArtistas[i][j]=this.listaArtistas.get(i).getDatosArtista(j);
            }
        }
        return matrizArtistas;
    }
        
}
