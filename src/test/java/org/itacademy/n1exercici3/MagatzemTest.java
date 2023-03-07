package org.itacademy.n1exercici3;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MagatzemTest {
	Magatzem magatzem = new Magatzem();

    @Test
    public void testLlistarSeccions() {
    	magatzem.setSeccions(Arrays.asList("Moda", "Electrodomèstics", "Informàtica", "Llibres", "Juguines"));
        
    	// This test should be throw an exception
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            magatzem.llistarSeccions();
        });
    }

}
