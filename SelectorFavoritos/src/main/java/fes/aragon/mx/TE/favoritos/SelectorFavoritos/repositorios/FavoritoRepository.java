package fes.aragon.mx.TE.favoritos.SelectorFavoritos.repositorios;

import fes.aragon.mx.TE.favoritos.SelectorFavoritos.modelo.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Integer> {

}
