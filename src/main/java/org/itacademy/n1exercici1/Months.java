package org.itacademy.n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Months {
    private List<String> months = new ArrayList<String>();
    
    
    public Months() {}
    
    public Months(List<String> months) {
    	this.months = months;
    }

    public String getMonth(int pos) {
        return months.get(pos);
    }

    public void addMonth(String month) {
        this.months.add(month);
    }

    public List<String> getMonths() {
        return months;
    }

    public void setMonths(List<String> months) {
        this.months = months;
    }
}
