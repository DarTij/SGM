/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sgm.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class RegistroCancion {
    Cancion cancion;
    ArrayList<Cancion> listaCanciones;
    String mensaje;
    
//----------------------------------------------------------------------------------------------------------------------//
    public RegistroCancion() {
        this.listaCanciones=new ArrayList<>();
        this.mensaje="";
    }//Fin constructor
//----------------------------------------------------------------------------------------------------------------------//
    public String agregarCancion(Cancion cancion){
        if(cancion!=null){
            if(buscarCancion(cancion.getTitulo())==null){
                this.listaCanciones.add(cancion);
                mensaje="Se ha agregado con éxito";
            }else{
                mensaje="Ya existe la canción dentro de la lista";
            }
        }
        return mensaje;
    }//Agrega la cancion deseada

    
//----------------------------------------------------------------------------------------------------------------------//    
    public Cancion buscarCancion(String titulo){
        
        /*for (int i = 0; listaCanciones.size() < 10; i++) {
            if(listaCanciones.get(i).getId().equalsIgnoreCase(id)){
                return listaCanciones.get(i);
            }
        }*/
        
        for (Cancion miCancion : listaCanciones) {
            if(miCancion.getTitulo().equalsIgnoreCase(titulo)){
                return miCancion;
            }
        }
        return null;
    }//busca la cancion deseada
//----------------------------------------------------------------------------------------------------------------------//
    public String borrarCancion(Cancion cancion){
        if(buscarCancion(cancion.getTitulo())!=null){
            this.listaCanciones.remove(cancion);
            mensaje="Cancion eliminada";
        }else{
            mensaje="No se encuentra la cancion";
        }
        return mensaje;
    }//Elimina la cancion deseada
    
//----------------------------------------------------------------------------------------------------------------------//
    public String editarCancion(Cancion cancion){
        if(buscarCancion(cancion.getTitulo())!=null){
            borrarCancion(cancion);
            agregarCancion(cancion);
            mensaje="Se ha editado con éxito";
        } else {
            mensaje="No existe la canción buscada";
        }
        return mensaje;
    }//Edita la cancion deseada
    
    public String editar(Cancion cancion){
        for (int i = 0; i < listaCanciones.size(); i++) {
            if(this.listaCanciones.get(i).getTitulo().equalsIgnoreCase(cancion.getTitulo())){
                this.listaCanciones.set(i, cancion);
                return "Se ha editado correctamente";
            }
        }
        return "No existe la canción buscada";
    }
    
//----------------------------------------------------------------------------------------------------------------------//
    public String[] getComboTitulo(){
        String[] titulos= new String[this.listaCanciones.size()];
        for (int i = 0;i < listaCanciones.size(); i++) {
            titulos[i]=listaCanciones.get(i).getTitulo();
        }
        return titulos;
    }
    
}
