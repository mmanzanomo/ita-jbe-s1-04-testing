package org.itacademy.n3exercici2;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.itacademy.n3exercici1.Car;


public class CarSameReferenceTest {
    Car car1 = new Car("Toyota", "Corolla");
    Car car2 = car1;
    Car car3 = new Car("Toyota", "Corolla");

    @Test
    void carsHaveSameReference() {
        assertThat(car1).isEqualTo(car2);
    }
    
    @Test
    void carsNotHaveSameReference() {
        assertThat(car1).isNotEqualTo(car3);
    }

}
