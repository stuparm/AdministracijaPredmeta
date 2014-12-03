/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneli.modeli;

import domen.Predmet;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mihailo
 */
public class PodaciTableModel extends AbstractTableModel {

    private Predmet predmet;

    public PodaciTableModel(Predmet predmet) {
        this.predmet = predmet;
    }

    @Override
    public int getRowCount() {
        return predmet.brojInformacija();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return predmet.informacijaNaPoziciji(rowIndex).elementNaPoziciji(columnIndex);
    }
    
    

}
