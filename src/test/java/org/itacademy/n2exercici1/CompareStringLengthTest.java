package org.itacademy.n2exercici1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.itacademy.n2exercici1.CompareStringLengthMatcher.hasLength;

public class CompareStringLengthTest {

    @Test
    public void compareStringLength() {
        Country country = new Country("Mordor");
        assertThat( country.getName(), hasLength(is(8)) );
    }

}
