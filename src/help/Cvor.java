/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihailo
 */
public class Cvor<Sadrzaj> {

    Sadrzaj sadrzaj;
    List<Cvor> deca;
    Cvor roditelj;

    public Cvor(Sadrzaj sadrzaj, Cvor roditelj) {
        this.sadrzaj = sadrzaj;
        deca = new ArrayList<>();
        this.roditelj = roditelj;
        if (roditelj != null) {
            roditelj.deca.add(this);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cvor)) {
            return false;
        }
        Cvor c = (Cvor) obj;
        return sadrzaj.equals(c.sadrzaj);
    }

    @Override
    public String toString() {
        return sadrzaj.toString();
    }

    public List<Cvor> getDeca() {
        return deca;
    }

    public Cvor getRoditelj() {
        return roditelj;
    }

    public int indexDeteta(Cvor dete) {
       
        for (int i = 0; i < deca.size(); i++) {
            if (deca.get(i).equals(dete)) {
                return i;
            }
        }
        return -1;
    }
}
