package com.technoelevate.encapsulationAssignament;

public abstract class Tester extends Employers {
	Tester(String ename,String designation, double sal) {
		super(ename,designation,sal);
		
	}
	public abstract void test();
    public abstract void experience();

}
