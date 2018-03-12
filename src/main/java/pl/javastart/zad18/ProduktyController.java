package pl.javastart.zad18;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;


    @Controller
    public class ProduktyController {

  public  ListaProduktow produkty;

        public ProduktyController(ListaProduktow produkty) {
            this.produkty = produkty;
        }

       // @ResponseBody
        public static String main() {
            return "index";

        }



        @GetMapping("/list")
        public String Produkty(Model model){
         List<Produkt> produkty = this.produkty.pobierzProdukty();
         model.addAttribute("produkty", produkty);
         return "produkty";
        }






}
