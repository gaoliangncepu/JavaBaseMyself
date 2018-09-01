package com.learn.chainOfRep;

/**
 * 经理
 * @author Administrator
 *
 */
public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void response(Request request) {
		if(request.getLeaveDays()<10){
			System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
			System.out.println("经理："+this.name+",审批通过！");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.response(request);
			}
		}
	}

}