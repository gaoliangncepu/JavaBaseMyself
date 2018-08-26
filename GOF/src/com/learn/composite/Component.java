package com.learn.composite;

/**
 * 抽象构件
 * @author Administrator
 * 目标接口，通用接口方法：operation()
 */
public interface Component {
	void operation();
}

/**
 * 叶子组件
 * @author Administrator
 *
 */
interface Leaf extends Component {
	
}

/**
 * 容器组件
 * @author Administrator
 *
 */
interface Composite extends Component {
	void add(Component component);
	void remove(Component component);
	Component getChild(int index);
}