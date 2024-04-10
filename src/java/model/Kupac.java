package model;

import java.util.ArrayList;
import javax.validation.constraints.Digits;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Kupac {
    
    @Digits(integer=10,fraction=4, message = "Pogresan unos")
    private int id;
    
    @NotEmpty(message = "Pogresan unos")
    private String ime;
    
    @NotEmpty(message = "Pogresan unos")
    private String prezime;
    
    @Digits(integer=10,fraction=4, message = "Pogresan unos")
    private int godine;
    
    @Digits(integer=10,fraction=4, message = "Pogresan unos")
    private int novac;
    
    @NotEmpty(message = "Pogresan unos")
    private String adresa;
    
    @NotEmpty(message = "Pogresan unos")
    @Email
    private String email;

    public static  ArrayList<Kupac> listaKupaca = new ArrayList<Kupac>();

    public int getNovac() {
        return novac;
    }

    public void setNovac(int novac) {
        this.novac = novac;
    }
        
    
    public String getAdresa() {
        return adresa;
    }

    public String getEmail() {
        return email;
    }

    public int getGodine() {
        return godine;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    

}
