package com.learn.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		/**
		 * 继承与类型转化
		 * 1.父类变量可以直接指向子类对象，把子类对象当做父类对象用：Animal animal = new Bird()；
		 * 2.父类对象不能直接当做子类对象用：
		 * 		Animal animal = new Animal();
		 * 		Bird bird = (Bird)animal;——编译通过，但运行时异常
		 * 		但本质是子类对象，仅是披了父类的皮，可以强转：
		 * 		Animal animal = new Bird();
		 * 		Bird bird = (Bird)animal;
		 */
		Animal animal = new Animal();
		Bird bird = (Bird) animal;
		
		bird.setAge(10);
		bird.setName("火烈鸟");
		bird.setState(0);
		bird.setLocation("树上");
		
		System.out.println(bird);
		
		bird.run();
	}

}
