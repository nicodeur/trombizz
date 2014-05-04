/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.unis.trombizz.shared.convert;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cyril
 */
public abstract class AbstractConverter<A, B>{
    
    public abstract B convert(A a);
    
    public List<B> convert(List<A> as){
        List<B> res = new ArrayList<B>();
        if(as != null){
            for(A a : as){
                res.add(convert(a));
            }
        }
        return res;
    }
}
