package controller;

import javax.validation.Valid;
import model.Kupac;
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
public class KupacKontroler {

    @RequestMapping(value = "/novi_kupac", method = RequestMethod.GET)
    public String newForm(Model model) {
        model.addAttribute("kupac", new Kupac());

        return "novi_kupac";
    }

    @RequestMapping(value = "/novi_kupac", method = RequestMethod.POST)
    public String sum(@ModelAttribute("kupac") @Valid Kupac kupac, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "novi_kupac";
        }

        model.addAttribute("ime", kupac.getIme());
        model.addAttribute("prezime", kupac.getPrezime());
        model.addAttribute("godine", kupac.getGodine());
        model.addAttribute("adresa", kupac.getAdresa());
        model.addAttribute("email", kupac.getEmail());
        model.addAttribute("id", kupac.getId());
        model.addAttribute("novac", kupac.getNovac());

        Kupac.listaKupaca.add(kupac);

        return "kupci";

    }

    @RequestMapping(value = "/kupci")
    public String sus() {
        return "kupci";
    }

    @RequestMapping(value = "/obrisi_kupca", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView byParameter(@RequestParam("idk") String idk) {

        int id = Integer.valueOf(idk);

        for (int i = 0; i < Kupac.listaKupaca.size(); i++) {

            if (Kupac.listaKupaca.get(i).getId() == id) {

                Kupac.listaKupaca.remove(i);

            }

        }

        return new ModelAndView("kupci");
    }
    
    @RequestMapping(value = "/obrisi_kupca")
    public String suus() {
        return "obrisi_kupca";
    }
    
    
    @RequestMapping(value = "/izmeni_kupca", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView byParameter(@RequestParam("ime") String ime, @RequestParam("prez") String prez, @RequestParam("id") String id, @RequestParam("adr") String adr, @RequestParam("rsd") String rsd, @RequestParam("mail") String mail, @RequestParam("god") String god){
        
        String nIme = ime;
        String prezime = prez;
        String adresa = adr;
        String email = mail;
        int novac = Integer.valueOf(rsd);
        int nID = Integer.valueOf(id);
        int godine = Integer.valueOf(god);
        
        for (int i = 0; i < Kupac.listaKupaca.size(); i++) {

            if (Kupac.listaKupaca.get(i).getId() == nID) {

                Kupac.listaKupaca.get(i).setAdresa(adresa);
                Kupac.listaKupaca.get(i).setEmail(email);
                Kupac.listaKupaca.get(i).setIme(nIme);
                Kupac.listaKupaca.get(i).setPrezime(prezime);
                Kupac.listaKupaca.get(i).setNovac(novac);
                Kupac.listaKupaca.get(i).setGodine(godine);

            }

        }
        
        return new ModelAndView("kupci");
        
    }
    
    @RequestMapping(value = "/izmeni_kupca")
    public String susus() {
        return "izmeni_kupca";
    }

}
