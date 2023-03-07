package org.itacademy.n1exercici2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numDni;
        char lletraDni;
        Scanner scanner = new Scanner(System.in);
        CalculoDni calculoDni = new CalculoDni();

        System.out.println("Introdueix un numero de dni: ");
        try {
        	numDni = scanner.nextInt();        	
        
        	// Return the letter of the DNI
        	lletraDni = calculoDni.calcularLletraDni(numDni);
        	System.out.println(lletraDni);
        } catch (InputMismatchException e) {
        	System.out.println("S'espera el numero de dni (sense lletra)");
        }
        scanner.close();
    }

}
