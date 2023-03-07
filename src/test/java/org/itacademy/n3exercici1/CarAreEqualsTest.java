package org.itacademy.n3exercici1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;



public class CarAreEqualsTest {
    Car car1 = new Car("Toyota", "Corolla");
    Car car2 = new Car("Toyota", "Corolla");
    Car car3 = new Car("Mazda", "Cx-3");


    @Test
    void testCarsAreEquals() {
        assertThat(car1).usingRecursiveComparison().isEqualTo(car2);
    }
    
    @Test
    void carsNotEquals() {
        assertThat(car1).usingRecursiveComparison().isNotEqualTo(car3);
    }


}
