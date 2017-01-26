/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.patterns.visualizadorfinanciero;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author 2110137
 */
public class IteratorEnumerationAdapter implements Iterator{

    Enumeration e;
    
    public IteratorEnumerationAdapter(Enumeration e) {
        this.e = e;
    }
    
    @Override
    public boolean hasNext() {
        return e.hasMoreElements();
    }

    @Override
    public Object next() {
        return e.nextElement();
    }
    
}
