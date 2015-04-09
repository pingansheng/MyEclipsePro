/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.pas.struts.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.pas.struts.form.UserForm;

/** 
 * MyEclipse Struts
 * Creation date: 10-16-2013
 * 
 * XDoclet definition:
 * @struts.action path="/register" name="userForm" scope="request"
 */
public class RegisterAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm userForm = (UserForm) form;// TODO Auto-generated method stub
		String id=userForm.getName();
		FormFile file=userForm.getHeadimg();
		
		
		InputStream is=null;
		OutputStream os=null;
		try {
			is=file.getInputStream();
			
			//����·��
			String filepath=this.getServlet().getServletContext().getRealPath("/file");
			String imgname=file.getFileName();
			String imgpath=filepath+"\\"+UUID.randomUUID().toString()+imgname;
			os=new FileOutputStream(imgpath);
			
			byte[] bytes=new byte[256];
			while (is.read(bytes)!=-1) {
				os.write(bytes);
			}
			os.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			response.getWriter().write("<script>window.alert('fuck')</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}