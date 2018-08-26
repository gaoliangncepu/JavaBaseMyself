package com.learn.composite;

/**
 * ���󹹼�
 * @author Administrator
 * Ŀ��ӿڣ�ͨ�ýӿڷ�����operation()
 */
public interface Component {
	void operation();
}

/**
 * Ҷ�����
 * @author Administrator
 *
 */
interface Leaf extends Component {
	
}

/**
 * �������
 * @author Administrator
 *
 */
interface Composite extends Component {
	void add(Component component);
	void remove(Component component);
	Component getChild(int index);
}