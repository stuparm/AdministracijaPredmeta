/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package share;

/**
 *
 * @author Mihailo
 */
public class Share {
    
    private static Share instance = null;
    
    public Share getInstance () {
        if (instance == null)
            instance = new Share();
        return instance;
    }
    
    
    
}
