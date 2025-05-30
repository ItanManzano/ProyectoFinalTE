package mx.unam.aragon.ico.te.favoritosmvc.controladores;

import mx.unam.aragon.ico.te.favoritosmvc.modelos.AlbumFavorito;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/favoritos")
public class FavoritosController {

    @GetMapping("/home/")
    public String home() {
        return "home";
    }

    @GetMapping("/album/")
    public String AlbumFavorito(Model model) {
        AlbumFavorito album = new AlbumFavorito(1,"Love YourSelf", "BTS","Kpop", 2018, "https://upload.wikimedia.org/wikipedia/en/e/e2/BTS%2C_Love_Yourself_Answer%2C_album_cover.jpg");
        model.addAttribute("album",album);
        return "album";
    }
}
