package com.learn.memento;

public class Client {
	public static void main(String[] args) {
		Emp emp_State1 = new Emp("уехЩ", 29, 8000);
		CareTaker.addMemento(emp_State1.createEmpMemento());
		System.out.println(emp_State1.getName() + "==" + emp_State1.getAge() + "==" + emp_State1.getSalary());
		
		emp_State1.setAge(30);
		emp_State1.setSalary(9000);
		System.out.println(emp_State1.getName() + "==" + emp_State1.getAge() + "==" + emp_State1.getSalary());
		
		emp_State1.recovery(CareTaker.getMemento(0));
		System.out.println(emp_State1.getName() + "==" + emp_State1.getAge() + "==" + emp_State1.getSalary());
	}
}
