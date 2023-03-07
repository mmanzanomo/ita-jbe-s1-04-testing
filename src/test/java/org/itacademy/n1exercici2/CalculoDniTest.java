package org.itacademy.n1exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class CalculoDniTest {

    /* This method verifies that the letter expected for a DNI is valid */
    @ParameterizedTest
    @ValueSource(strings = {"77286232E", "53287988R", "12960956L", "63693951M", "92437515D", "48308438C",
                              "30720000G", "07374909M", "87311941P", "75160415A", "62533078B"})
    void testCalcularLletraDni(String dni) {
        CalculoDni calculoDni = new CalculoDni();

        Assertions.assertEquals(
            // Get the letter of DNI
            dni.charAt(dni.length() - 1),
            // Pass number to the method as an Integer
            calculoDni.calcularLletraDni(Integer.parseInt(dni.substring(0, (dni.length() - 1)))),
            // Message if test fails
            "La lletra esperada no és vàlida."
        );
    }

}
