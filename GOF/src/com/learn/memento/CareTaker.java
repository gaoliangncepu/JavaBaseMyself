package com.learn.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * �������ࣺ����¼������
 * �����Ѵ�������¼�Ĺ�������
 * @author Administrator
 *
 */
public class CareTaker {
	// �˴���������ʹ��Map��Stack��
	private static List<EmpMemento> mementos = new ArrayList<>();
	
	public static void addMemento(EmpMemento memento) {
		mementos.add(memento);
	}
	
	public static void removeMemento(EmpMemento memento) {
		mementos.remove(memento);
	}
	
	public static EmpMemento getMemento(int index) {
		return mementos.get(index);
	}
}
