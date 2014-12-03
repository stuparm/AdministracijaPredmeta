/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import domen.fondcasova.FondCasova;
import domen.literatura.Literatura;
import domen.osoblje.Osoblje;
import domen.sadrzajpredmeta.SadrzajPredmeta;
import help.Konstante;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mihailo
 */
public class Predmet {

    private String naziv;
    private Osoblje osoblje;
    private int brojESPB;
    private String ciljPredmeta;
    private String ishodPredmeta;
    private SadrzajPredmeta sadrzajPredmeta;
    private Literatura literatura;
    private FondCasova fondCasova;
    private List<String> metodeNastave;

    private List<InfoPredmet> informacije;

    public Predmet() {
        informacije = new ArrayList<>();
    }

    public Predmet(String naziv) {
        this.naziv = naziv;
        informacije = new ArrayList<>();
        informacije.add(new InfoPredmet("Naziv", naziv, Konstante.NAZIV));
        Collections.sort(informacije);

    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
        informacije.add(new InfoPredmet("Naziv", naziv, Konstante.NAZIV));
        Collections.sort(informacije);
    }

    public void setOsoblje(Osoblje osoblje) {
        this.osoblje = osoblje;
        informacije.add(new InfoPredmet("Osoblje", null, Konstante.OSOBLJE));
        Collections.sort(informacije);
    }

    public void setBrojESPB(int brojESPB) {
        this.brojESPB = brojESPB;
        informacije.add(new InfoPredmet("Broj ESPB", brojESPB + "", Konstante.ESPB));
        Collections.sort(informacije);
    }

    public void setCiljPredmeta(String ciljPredmeta) {
        this.ciljPredmeta = ciljPredmeta;
        informacije.add(new InfoPredmet("Cilj predmeta", null, Konstante.CIL_PREDMETA));
        Collections.sort(informacije);
    }

    public void setFondCasova(FondCasova fondCasova) {
        this.fondCasova = fondCasova;
        informacije.add(new InfoPredmet("FondCasova", null, Konstante.FOND_CASOVA));
        Collections.sort(informacije);
    }

    public void setIshodPredmeta(String ishodPredmeta) {
        this.ishodPredmeta = ishodPredmeta;
        informacije.add(new InfoPredmet("Ishod predmeta", null, Konstante.ISHOD_PREDMETA));
        Collections.sort(informacije);
    }

    public void setLiteratura(Literatura literatura) {
        this.literatura = literatura;
        informacije.add(new InfoPredmet("Literatura", null, Konstante.LITERATURA));
        Collections.sort(informacije);
    }

    public void setMetodeNastave(List<String> metodeNastave) {
        this.metodeNastave = metodeNastave;
        informacije.add(new InfoPredmet("Metode nastave", null, Konstante.METODE_NASTAVE));
        Collections.sort(informacije);
    }

    public void setSadrzajPredmeta(SadrzajPredmeta sadrzajPredmeta) {
        this.sadrzajPredmeta = sadrzajPredmeta;
        informacije.add(new InfoPredmet("Sadrzaj predmeta", null, Konstante.SADRZAJ_PREDMETA));
        Collections.sort(informacije);
    }

    @Override
    public String toString() {
        return naziv;
    }

    public int brojInformacija () {
        return informacije.size();
    }
    
    public InfoPredmet informacijaNaPoziciji(int index) {
        return informacije.get(index);
    }
    
    
}
