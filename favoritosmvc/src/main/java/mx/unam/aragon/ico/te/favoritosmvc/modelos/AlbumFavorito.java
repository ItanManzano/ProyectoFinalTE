package mx.unam.aragon.ico.te.favoritosmvc.modelos;

import java.util.Objects;

public class AlbumFavorito {
    private int idAlbum;
    private String nombre;
    private String Artista;
    private String genero;
    private Integer anio;
    private String imagen;

    public AlbumFavorito() {
    }

    public AlbumFavorito(int idAlbum, String nombre, String artista, String genero, Integer anio, String imagen) {
        this.idAlbum = idAlbum;
        this.nombre = nombre;
        Artista = artista;
        this.genero = genero;
        this.anio = anio;
        this.imagen = imagen;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
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
        AlbumFavorito that = (AlbumFavorito) o;
        return idAlbum == that.idAlbum && Objects.equals(nombre, that.nombre) && Objects.equals(Artista, that.Artista) && Objects.equals(genero, that.genero) && Objects.equals(anio, that.anio) && Objects.equals(imagen, that.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlbum, nombre, Artista, genero, anio, imagen);
    }

    @Override
    public String toString() {
        return "AlbumFavorito{" +
                "idAlbum=" + idAlbum +
                ", nombre='" + nombre + '\'' +
                ", Artista='" + Artista + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
