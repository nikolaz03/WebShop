package controller;

import javax.validation.Valid;
import model.Proizvod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProizvodKontroler {

    @RequestMapping(value = "/novi_proizvod", method = RequestMethod.GET)
    public String newForm(Model model) {
        model.addAttribute("proizvod", new Proizvod());

        return "novi_proizvod";
    }

    @RequestMapping(value = "/novi_proizvod", method = RequestMethod.POST)
    public String sum(@ModelAttribute("proizvod") @Valid Proizvod proizvod, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "novi_proizvod";
        }

        model.addAttribute("naziv", proizvod.getNaziv());
        model.addAttribute("kolicina", proizvod.getKolicina());
        model.addAttribute("cena", proizvod.getCena());
        model.addAttribute("id", proizvod.getId());

        Proizvod.listaProizvodi.add(proizvod);

        return "proizvodi";

    }

    @RequestMapping(value = "/proizvodi")
    public String sus() {
        return "proizvodi";
    }

    @RequestMapping(value = "/obrisi_proizvod", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView byParameter(@RequestParam("idp") String idp) {

        int id = Integer.valueOf(idp);

        for (int i = 0; i < Proizvod.listaProizvodi.size(); i++) {

            if (Proizvod.listaProizvodi.get(i).getId() == id) {

                Proizvod.listaProizvodi.remove(i);

            }

        }

        return new ModelAndView("proizvodi");
    }

    @RequestMapping(value = "/obrisi_proizvod")
    public String suus() {
        return "obrisi_proizvod";
    }

    @RequestMapping(value = "/izmeni_proizvod", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView byParameter(@RequestParam("idp") String idp, @RequestParam("naziv") String naziv, @RequestParam("kol") String kol, @RequestParam("cen") String cen) {

        String nNaziv = naziv;

        int id = Integer.valueOf(idp);
        int kolicina = Integer.valueOf(kol);
        int cena = Integer.valueOf(cen);

        for (int i = 0; i < Proizvod.listaProizvodi.size(); i++) {

            if (Proizvod.listaProizvodi.get(i).getId() == id) {

                Proizvod.listaProizvodi.get(i).setCena(cena);
                Proizvod.listaProizvodi.get(i).setKolicina(kolicina);
                Proizvod.listaProizvodi.get(i).setNaziv(nNaziv);

            }

        }

        return new ModelAndView("proizvodi");

    }
    
    @RequestMapping(value = "/izmeni_proizvod")
    public String susus() {
        return "izmeni_proizvod";
    }

}
