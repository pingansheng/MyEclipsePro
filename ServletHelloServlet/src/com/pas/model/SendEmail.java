package com.pas.model;

public class SendEmail extends Thread{

	@Override
	public void run() {
		int i=0;
		try {
			while(true)
			{
			//每休眠一分钟，扫描表，查看哪封信发出
			Thread.sleep(1000);
			System.out.println("发出第"+(++i)+"封邮件");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
