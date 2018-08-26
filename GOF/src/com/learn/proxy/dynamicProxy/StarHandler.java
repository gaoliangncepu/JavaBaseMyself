package com.learn.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��ʵ��������
 * �û�ͨ�������ɫ���ýӿڷ���ʱ������ִ����ڶ��Ǵ˴���invoke()������ͨ��������Ƶ��ô������ǽ�ɫ��ָ��������
 * @author Administrator
 *
 */
public class StarHandler implements InvocationHandler {
	private RealStar star;

	
	public StarHandler(RealStar star) {
		super();
		this.star = star;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		
		System.out.println("�����ķ���ִ��ǰ��");
		System.out.println("��̸��ǩ��ͬ��Ԥ�������Ʊ");//�������ĸ���ҵ���߼�
		
		if(method.getName().equals("sing")){
			// ���ص㡿�˴����뼤��������ķ���
			object = method.invoke(star, args);
		}
		System.out.println("�����ķ���ִ�к�");
		System.out.println("��β��");
		
		return object;
	}

}
