package org.itacademy.n3exercici4;

public class Car {
	private String branch;
	
	
	public Car(String branch) {
		this.branch = branch;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Car [branch=" + branch + "]";
	}
	
	
	
}
