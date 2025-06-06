package fes.aragon.mx.TE.favoritos.SelectorFavoritos.Servicios;

import fes.aragon.mx.TE.favoritos.SelectorFavoritos.modelo.Favorito;

import java.util.List;
import java.util.Optional;

public interface IFavoritoServicio {
    List<Favorito> listarTodos();
    Optional<Favorito> buscarPorId(Integer id);
    Favorito guardar(Favorito favorito);
    void eliminarPorId(Integer id);
}
