package com.learn.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		/**
		 * �̳�������ת��
		 * 1.�����������ֱ��ָ��������󣬰������������������ã�Animal animal = new Bird()��
		 * 2.���������ֱ�ӵ�����������ã�
		 * 		Animal animal = new Animal();
		 * 		Bird bird = (Bird)animal;��������ͨ����������ʱ�쳣
		 * 		��������������󣬽������˸����Ƥ������ǿת��
		 * 		Animal animal = new Bird();
		 * 		Bird bird = (Bird)animal;
		 */
		Animal animal = new Animal();
		Bird bird = (Bird) animal;
		
		bird.setAge(10);
		bird.setName("������");
		bird.setState(0);
		bird.setLocation("����");
		
		System.out.println(bird);
		
		bird.run();
	}

}
