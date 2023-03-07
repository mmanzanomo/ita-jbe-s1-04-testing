package org.itacademy.n3exercici4;

import java.util.ArrayList;
import java.util.List;

public class SampleContainer {
	Person person1 = new Person("Lucas");
	Person person2 = new Person("Sara");
	Car car1 = new Car("Suzuki");
	Car car2 = new Car("Seat");
	
	List<Object> list = new ArrayList<Object>();
	
	
	public SampleContainer() {
		list.add(person1);
		list.add(person2);
		list.add(car1);
		list.add(car2);
	}
	
	public Object getObject(int index) {
		return list.get(index);
	}
	
	public List<Object> getList() {
		return list;
	}
	
}
