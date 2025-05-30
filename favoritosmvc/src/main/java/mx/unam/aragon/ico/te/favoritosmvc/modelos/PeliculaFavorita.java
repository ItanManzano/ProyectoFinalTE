package mx.unam.aragon.ico.te.favoritosmvc.modelos;

import java.util.Objects;

public class PeliculaFavorita {
    private int idPelicula;
    private String nombre;
    private String Director;
    private String genero;
    private Integer anio;
    private String imagen;

    public PeliculaFavorita() {
    }

    public PeliculaFavorita(int idPelicula, String nombre, String director, String genero, Integer anio, String imagen) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        Director = director;
        this.genero = genero;
        this.anio = anio;
        this.imagen = imagen;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PeliculaFavorita that = (PeliculaFavorita) o;
        return idPelicula == that.idPelicula && Objects.equals(nombre, that.nombre) && Objects.equals(Director, that.Director) && Objects.equals(genero, that.genero) && Objects.equals(anio, that.anio) && Objects.equals(imagen, that.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPelicula, nombre, Director, genero, anio, imagen);
    }

    @Override
    public String toString() {
        return "PeliculaFavorita{" +
                "idPelicula=" + idPelicula +
                ", nombre='" + nombre + '\'' +
                ", Director='" + Director + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
