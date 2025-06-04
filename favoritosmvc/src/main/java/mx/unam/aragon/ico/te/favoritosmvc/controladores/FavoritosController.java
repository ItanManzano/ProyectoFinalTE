package mx.unam.aragon.ico.te.favoritosmvc.controladores;

import mx.unam.aragon.ico.te.favoritosmvc.modelos.*;
import mx.unam.aragon.ico.te.favoritosmvc.servicios.FavoritoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/favoritos")
public class FavoritosController {

    private final FavoritoService servicio;

    public FavoritosController(FavoritoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("favoritos", servicio.obtenerTodos());
        return "favoritos/lista";
    }

    @GetMapping("/formulario")
    public String formulario(
            @RequestParam(required = false) String tipo,
            @RequestParam(required = false) Long id,
            Model model) {

        ItemFavorito item;
        if (id != null) {
            item = servicio.obtenerPorId(id);
        } else {
            switch(tipo != null ? tipo : "") {
                case "album":
                    item = new AlbumFavorito();
                    break;
                case "juego":
                    item = new JuegoFavorito();
                    break;
                case "pelicula":
                    item = new PeliculaFavorita();
                    break;
                default:
                    item = null;
            }
        }

        model.addAttribute("item", item);
        return "favoritos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute ItemFavorito item) {
        servicio.guardar(item);
        return "redirect:/favoritos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
        return "redirect:/favoritos";
    }
}
