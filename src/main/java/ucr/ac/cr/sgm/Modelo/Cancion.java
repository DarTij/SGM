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
    private int duracion;
    private int annoLanzamiento;
    
    public static final String[] Titulos_CANCION={"Título", "Género", "Duración", "Año Lanzamiento"};
    
    

    public Cancion() {
    }

    public Cancion(String titulo, String genero, int duracion, int annoLanzamiento) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.annoLanzamiento = annoLanzamiento;
    }
    
    public String getDatosCancion(int columna){
        switch (columna) {
            case 0:
                return this.titulo;
            case 1:
                return this.genero;
            case 2:
                return String.valueOf(this.duracion);
            case 3:
                return String.valueOf(this.annoLanzamiento);
        }
        return "";
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
        return "Cancion" + "\nTítulo=" + titulo + "\nGénero=" + genero + "\nDuración=" + duracion + "\nAñoLanzamiento=" + annoLanzamiento;
    }
    
    
}
