package com.learn.memento;

/**
 * Դ�����ࣺĿ�����
 * �����侵��������ݾ�����лָ�
 * @author Administrator
 *
 */
public class Emp {
	private String name;
	private int age;
	private double salary;
	
	public EmpMemento createEmpMemento() {
		return new EmpMemento(this);
	}
	
	public void recovery(EmpMemento memento) {
		this.name = memento.getName();
		this.age = memento.getAge();
		this.salary = memento.getSalary();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
