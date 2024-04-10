package model;

import java.util.ArrayList;
import javax.validation.constraints.Digits;
import org.hibernate.validator.constraints.NotEmpty;

public class Proizvod {
    
    @Digits(integer=10,fraction=4, message = "Pogresan unos") 
    private int id;
    
    @NotEmpty(message = "Pogresan unos")
    private String naziv;
    
    @Digits(integer=10,fraction=4, message = "Pogresan unos")
    private int kolicina;
    
    @Digits(integer=10,fraction=4, message = "Pogresan unos")
    private int cena;
    
    public static  ArrayList<Proizvod> listaProizvodi = new ArrayList<Proizvod>();

    public int getCena() {
        return cena;
    }

    public int getId() {
        return id;
    }

    public int getKolicina() {
        return kolicina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    

}
