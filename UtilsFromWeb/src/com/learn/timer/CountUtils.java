package com.learn.timer;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class CountUtils {
	private int limitSec;
	
	private int curSec;
	
	public CountUtils(int limitSec) {
		this.limitSec = limitSec;
		this.curSec = limitSec;
	}
	
	public void countDown() {
		System.out.println("Count down from " + limitSec + "s");
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Time remains " + --curSec + "s");
			}
		}, 0, 1000);
		try {
			TimeUnit.SECONDS.sleep(limitSec - 5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();
		System.out.println("Time is out!");
	}
	
	public static void main(String[] args) {
		new CountUtils(10).countDown();
	}
}
