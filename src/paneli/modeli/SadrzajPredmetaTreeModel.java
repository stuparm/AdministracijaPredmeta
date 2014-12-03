/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paneli.modeli;

import help.Stablo;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Mihailo
 */
public class SadrzajPredmetaTreeModel implements TreeModel{

    private Stablo stablo;

    public SadrzajPredmetaTreeModel(Stablo stablo) {
        this.stablo = stablo;
    }
    
    
    
    
    @Override
    public Object getRoot() {
        return stablo.dajKoren();
    }

    @Override
    public Object getChild(Object parent, int index) {
        return stablo.vratiDete(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        return stablo.brojDece(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        return stablo.daLiJeList(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return stablo.indexDeteta(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
     }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
     }
    
}
