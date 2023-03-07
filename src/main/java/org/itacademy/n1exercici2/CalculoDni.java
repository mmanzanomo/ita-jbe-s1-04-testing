package org.itacademy.n1exercici2;


public class CalculoDni {
    private char[] lletra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


    public char calcularLletraDni(int dni) {
        byte posicio = -1;

        if (dni > 0 && dni <= 99999999) {
            // Calculae letter
            posicio = (byte) (dni % 23);
            return lletra[posicio];
        }
        return ' ';
    }

}
