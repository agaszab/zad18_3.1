package pl.javastart.zad18;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ProduktyController {

    public ListaProduktow produkty;

    public ProduktyController(ListaProduktow produkty) {
        this.produkty = produkty;
    }

    // @ResponseBody
    public static String main() {
        return "index";

    }

    @GetMapping("/list")
    public String Produkty(Model model){
        model.addAttribute("produkty", produkty.pobierzProdukty());
        return "produkty";
    }

    @GetMapping("/listk")
    public String Produkty(@RequestParam String kategorie, Model model){
        model.addAttribute("produkty", produkty.pobierzProduktyKat(kategorie));
        return "produkty";
    }

}
