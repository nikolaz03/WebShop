package controller;

import model.Kupac;
import model.Proizvod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KupovinaKontroler {

    @RequestMapping(value = "/kupovina", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView byParameter(@RequestParam("idk") String idk, @RequestParam("idp") String idp, @RequestParam("kol") String kol) {

        try {

            int idProizvod = Integer.valueOf(idp);
            int idKupac = Integer.valueOf(idk);
            int kolicina = Integer.valueOf(kol);
            int cena;

        } catch (Exception e) {
            System.out.println("Inquired");
        }
        int idProizvod = Integer.valueOf(idp);
        int idKupac = Integer.valueOf(idk);
        int kolicina = Integer.valueOf(kol);
        int cena;

        for (int i = 0; i < Proizvod.listaProizvodi.size(); i++) {

            if (Proizvod.listaProizvodi.get(i).getId() == idProizvod) {

                cena = Proizvod.listaProizvodi.get(i).getCena();

                if (Proizvod.listaProizvodi.get(i).getKolicina() >= kolicina) {

                    Proizvod.listaProizvodi.get(i).setKolicina((Proizvod.listaProizvodi.get(i).getKolicina()) - kolicina);

                    for (Kupac listaKupaca : Kupac.listaKupaca) {

                        if (listaKupaca.getId() == idKupac) {

                            if (listaKupaca.getNovac() >= (kolicina * cena)) {
                                listaKupaca.setNovac((listaKupaca.getNovac()) - (kolicina * cena));
                            } else {
                                return new ModelAndView("neuspela");
                            }
                            return new ModelAndView("hvala");

                        } else {
                            return new ModelAndView("neuspela");
                        }
                    }

                } else {
                    return new ModelAndView("neuspela");
                }

                return new ModelAndView("hvala");

            } else {

                return new ModelAndView("neuspela");

            }

        }

        return new ModelAndView("neuspela");

    }

    @RequestMapping(value = "/kupovina", method = GET)
    public String sus() {
        return "kupovina";
    }

}
