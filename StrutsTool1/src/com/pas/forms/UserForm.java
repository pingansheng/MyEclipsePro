package com.pas.forms;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
	//�������� ���淶 �������ֺ�jspҳ��ؼ�����һ����
		//��Ҫ��֤set get�������������������ɣ�set������������ĸ��Ҫ��д!!��
		private int userid;
		private String password;
		
		public int getUserid() {
			return userid;
		}
		public void setUserid(int username) {
			this.userid = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
