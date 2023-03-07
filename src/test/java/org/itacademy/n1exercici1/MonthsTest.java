package org.itacademy.n1exercici1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import java.util.List;

public class MonthsTest {
	Months months = new Months(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
			"Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"));

    @Test
    public void testSizeMonths() {
        List<String> result = months.getMonths();
        Assertions.assertTrue( result.size() == 12 );
    }
    
    @Test
    public void testNotNullMonthsList() {
        List<String> result = months.getMonths();
        Assertions.assertNotNull(result);
    }
    
    @Test
    public void testEqualsMonthsList() {
        List<String> result = months.getMonths();
        Assertions.assertEquals("Agost", result.get(7));
    }


}
