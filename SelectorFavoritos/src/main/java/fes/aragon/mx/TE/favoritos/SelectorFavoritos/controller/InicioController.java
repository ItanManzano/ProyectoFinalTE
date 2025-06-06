package fes.aragon.mx.TE.favoritos.SelectorFavoritos.controller;

import fes.aragon.mx.TE.favoritos.SelectorFavoritos.Servicios.IFavoritoServicio;
import fes.aragon.mx.TE.favoritos.SelectorFavoritos.modelo.Favorito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/favoritos")
public class InicioController {
    @Autowired
    private IFavoritoServicio favoritoServicio;

    @GetMapping
    public String listarFavoritos(Model model) {
        List<Favorito> lista = favoritoServicio.listarTodos();
        model.addAttribute("favoritos", lista);
        model.addAttribute("totalFavoritos", lista.size());
        return "inicio";
    }

    @GetMapping("/nuevo")
    public String formularioAgregar(Model model) {
        Favorito favorito = new Favorito();
        favorito.setFechaCreacion(LocalDate.now());
        model.addAttribute("favorito", favorito);
        return "formularioAgregar";
    }

    @PostMapping("/guardar")
    public String guardarFavorito(
            @ModelAttribute("favorito") Favorito favorito
    ) {
        favoritoServicio.guardar(favorito);
        return "redirect:/favoritos";
    }

    @GetMapping("/{id}/editar")
    public String formularioEditar(
            @PathVariable Integer id, Model model
    ) {
        Optional<Favorito> optional = favoritoServicio.buscarPorId(id);
        if (optional.isPresent()) {
            Favorito favorito = optional.get();
            model.addAttribute("favorito", favorito);
            return "formularioEditar";
        }else {
            return "redirect:/favoritos";
        }
    }

    @PostMapping("/actualizar")
    public String actualizarFavorito(
            @ModelAttribute("favorito") Favorito favorito
    ){
        favoritoServicio.guardar(favorito);
        return "redirect:/favoritos";
    }

    @GetMapping("/{id}/eliminar")
    public String eliminarFavorito(
            @PathVariable("id") Integer id
    ){
        favoritoServicio.eliminarPorId(id);
        return "redirect:/favoritos";
    }
}
