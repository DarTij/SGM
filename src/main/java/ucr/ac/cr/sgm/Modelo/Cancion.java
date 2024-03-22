/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sgm.Modelo;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private String titulo;
    private String genero;
    private String id;
    private int duracion;
    private int annoLanzamiento;

    public Cancion() {
    }

    public Cancion(String titulo, String genero, String id, int duracion, int annoLanzamiento) {
        this.titulo = titulo;
        this.genero = genero;
        this.id = id;
        this.duracion = duracion;
        this.annoLanzamiento = annoLanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnnoLanzamiento() {
        return annoLanzamiento;
    }

    public void setAnnoLanzamiento(int annoLanzamiento) {
        this.annoLanzamiento = annoLanzamiento;
    }

    @Override
    public String toString() {
        return "Cancion" + "\nTitulo=" + titulo + "\nGenero=" + genero + "\nId=" + id + "\nDuracion=" + duracion + "\nAnnoLanzamiento=" + annoLanzamiento;
    }
    
    
}
