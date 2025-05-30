package mx.unam.aragon.ico.te.favoritosmvc.modelos;

import java.util.Objects;

public class JuegoFavorito {
    private int idJuego;
    private String nombre;
    private String Desarrollador;
    private String genero;
    private Integer anio;
    private String imagen;

    public JuegoFavorito() {
    }

    public JuegoFavorito(int idJuego, String nombre, String desarrollador, String genero, Integer anio, String imagen) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        Desarrollador = desarrollador;
        this.genero = genero;
        this.anio = anio;
        this.imagen = imagen;
    }



    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return Desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        Desarrollador = desarrollador;
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
        JuegoFavorito that = (JuegoFavorito) o;
        return idJuego == that.idJuego && Objects.equals(nombre, that.nombre) && Objects.equals(Desarrollador, that.Desarrollador) && Objects.equals(genero, that.genero) && Objects.equals(anio, that.anio) && Objects.equals(imagen, that.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJuego, nombre, Desarrollador, genero, anio, imagen);
    }
    @Override
    public String toString() {
        return "JuegoFavorito{" +
                "idJuego=" + idJuego +
                ", nombre='" + nombre + '\'' +
                ", Desarrollador='" + Desarrollador + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
