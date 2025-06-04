package mx.unam.aragon.ico.te.favoritosmvc.servicios;

import mx.unam.aragon.ico.te.favoritosmvc.modelos.ItemFavorito;

import java.util.List;

public interface FavoritoService {
    List<ItemFavorito> obtenerTodos();
    ItemFavorito guardar(ItemFavorito item);
    ItemFavorito obtenerPorId(Long id);
    void eliminar(Long id);
}
