package cn.edu.hqu.cst.javaee.performance.impl;

import org.springframework.stereotype.Component;

@Component
public class PerformanceManager {


	public void silenceCellPhones() {
		System.out.println("请将手机调为静音！");
	}
	

	public void takeSeats() {
		System.out.println("请坐在自己位置上，不要到处走动！");
	}

	public void orderlyRetreat() {
		System.out.println("请大家有序退场！");
	}
	public void refound() {
		System.out.println("到售票处退票！");
	}
}
