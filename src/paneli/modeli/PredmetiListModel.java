/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paneli.modeli;

import domen.Predmet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Mihailo
 */
public class PredmetiListModel extends AbstractListModel{

    private List<Predmet> predmeti;

    public PredmetiListModel(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    @Override
    public int getSize() {
        return predmeti.size();
    }

    @Override
    public Object getElementAt(int index) {
        return predmeti.get(index);
    }

   
    
    
   
}
