package org.itacademy.n3exercici6;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SampleArrayClassTest {

	@Test
	public void testSampleArray() {
		SampleArray sampleArray = new SampleArray();
		
		assertThatIndexOutOfBoundsException().isThrownBy(
				() -> sampleArray.getArrayException()
		);
	}
	
}
