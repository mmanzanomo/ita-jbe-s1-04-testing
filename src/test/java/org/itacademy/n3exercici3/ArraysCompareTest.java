package org.itacademy.n3exercici3;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArraysCompareTest {

    int[] array1 = {5, 4, 3, 2, 1};
    int[] array2 = {5, 4, 3, 2, 1};

    @Test
    void compareIntArrays() {
        assertThat(array1).containsExactly(array2);
    }
}
