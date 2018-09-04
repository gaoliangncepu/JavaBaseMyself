package com.learn.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类：备忘录管理类
 * 进行已创建备忘录的管理、操作
 * @author Administrator
 *
 */
public class CareTaker {
	// 此处容器可以使用Map、Stack等
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
