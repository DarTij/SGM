/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sgm.Modelo;

/**
 *
 * @author daryl
 */
public class Artista {
    private String nombre;
    private String pais;
    private String genero;
    
    public static final String[] Nombres_ARTISTAS={"Nombre", "País", "Género"};
    
    public Artista() {
    }

    public Artista(String nombre, String pais, String genero) {
        this.nombre = nombre;
        this.pais = pais;
        this.genero = genero;
    }
    
    public String getDatosArtista(int columna){
        switch (columna) {
            case 0:
                return this.nombre;
            case 1:
                return this.pais;
            case 2:
                return this.genero;
        }
        return "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista\nNombre=" + nombre + "\nPais=" + pais + "\nGenero=" + genero;
    }
    
    
}
