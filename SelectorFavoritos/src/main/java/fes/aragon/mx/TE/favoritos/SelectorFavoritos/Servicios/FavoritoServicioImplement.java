package fes.aragon.mx.TE.favoritos.SelectorFavoritos.Servicios;

import fes.aragon.mx.TE.favoritos.SelectorFavoritos.modelo.Favorito;
import fes.aragon.mx.TE.favoritos.SelectorFavoritos.repositorios.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoritoServicioImplement implements IFavoritoServicio{

    @Autowired
    private FavoritoRepository favoritoRepository;

    @Override
    public List<Favorito> listarTodos() {
        return favoritoRepository.findAll();
    }

    @Override
    public Optional<Favorito> buscarPorId(Integer id) {
        return favoritoRepository.findById(id);
    }

    @Override
    public Favorito guardar(Favorito favorito) {
        return favoritoRepository.save(favorito);
    }

    @Override
    public void eliminarPorId(Integer id) {
        favoritoRepository.deleteById(id);
    }
}
