package org.itacademy.n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class Magatzem {

    private List<String> seccions = new ArrayList<String>();

    // This method throws an exception
    public void llistarSeccions () {
        for (int i = 0; i <= seccions.size(); i++) {
            seccions.get(i);
        }
    }

    public List<String> getSeccions() {
        return seccions;
    }

    public void setSeccions(List<String> seccions) {
        this.seccions = seccions;
    }
}
