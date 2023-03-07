package org.itacademy.n3exercici4;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

public class ContainerListTest {
	SampleContainer container = new SampleContainer();
	
	Object person1 = container.getObject(0);
	Object person2 = container.getObject(1);
	Object car1 = container.getObject(2);
	Object car2 = container.getObject(3);
	
	
	@Test
	void contains_elements() { 
		assertThat(container.getList()).contains(person1, car2, person2, car1);
	}
	
	@Test
	void contains_elements_exactly_order() {
		assertThat(container.getList()).containsExactly(person1, person2, car1, car2);
	}

}
