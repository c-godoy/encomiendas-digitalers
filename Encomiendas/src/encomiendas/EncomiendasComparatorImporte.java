/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encomiendas;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class EncomiendasComparatorImporte implements Comparator<Encomienda> {
    
    @Override
    public int compare(Encomienda o1, Encomienda o2){
        Double importe2 = o2.getImporte();
        Double importe1 = o1.getImporte();
        return importe2.compareTo(importe1);
    }
    
}
