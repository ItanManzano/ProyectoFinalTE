package mx.unam.aragon.ico.te.favoritosmvc.servicios;

import mx.unam.aragon.ico.te.favoritosmvc.modelos.*;
import mx.unam.aragon.ico.te.favoritosmvc.repositorios.ItemFavoritoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritoServiceImpl implements FavoritoService {

    private final ItemFavoritoRepository repository;

    public FavoritoServiceImpl(ItemFavoritoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ItemFavorito> obtenerTodos() {
        return repository.findAll();
    }

    @Override
    public ItemFavorito guardar(ItemFavorito item) {
        return repository.save(item);
    }

    @Override
    public ItemFavorito obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
