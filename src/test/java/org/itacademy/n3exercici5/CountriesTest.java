package org.itacademy.n3exercici5;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountriesTest {
	Countries countries = new Countries();

	@Test
	public void testCountries() {		
		countries.add("France", "Paris");
		countries.add("Germany", "Berlin");
		countries.add("Spain", "Madrid");
		
		assertThat(countries.getCountries()).containsKeys("France", "Germany", "Spain");
	}
	
}
