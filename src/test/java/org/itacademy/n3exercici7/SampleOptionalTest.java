package org.itacademy.n3exercici7;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;



public class SampleOptionalTest {
	
	
	@Test
	public void testSampleOptionalTest() {
		SampleOptional sampleOptional = new SampleOptional();
		
		Optional<String> opt = Optional.empty();
		
		sampleOptional.setOptional(opt);
		
		assertThat(sampleOptional.getOptional()).isEmpty();
	}
	
	
}
