package com.learn.chainOfResp;

public class Client {
	public static void main(String[] args) {
		Leader leader1 = new Director("张三");
		Leader leader2 = new Manager("李四");
		Leader leader4 = new ViceGeneralManager("王五");
		Leader leader3 = new GeneralManager("赵六");
		
		leader1.pointNextLeader(leader2);
		leader2.pointNextLeader(leader4);
		leader4.pointNextLeader(leader3);
		
		leader1.response(new Request("Tom", 50, "go home"));
	}
}
