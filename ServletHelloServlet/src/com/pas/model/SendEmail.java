package com.pas.model;

public class SendEmail extends Thread{

	@Override
	public void run() {
		int i=0;
		try {
			while(true)
			{
			//ÿ����һ���ӣ�ɨ����鿴�ķ��ŷ���
			Thread.sleep(1000);
			System.out.println("������"+(++i)+"���ʼ�");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
